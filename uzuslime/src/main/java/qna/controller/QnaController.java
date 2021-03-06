package qna.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import qna.bean.BoardPaging;
import qna.bean.QnaDTO;
import qna.bean.ReplyDTO;
import qna.service.QnaService;

@Controller
@RequestMapping(value="qna")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@RequestMapping(value="qnaWrite", method=RequestMethod.GET)
	@ResponseBody
	public void qnaWrite(@RequestParam Map<String, String> map) {
		qnaService.qnaWrite(map);
	}
	
	@RequestMapping(value="qnaBoardList", method=RequestMethod.GET)
	public String qnaBoardList(@RequestParam(required=false, defaultValue="1") String pg, Model model) {//기본값 1페이지로 인식해라
		model.addAttribute("pg", pg);
		return "/qna/qnaBoardList";
	}
	
	@RequestMapping(value="qnaView", method=RequestMethod.GET)
	public String qnaView(@RequestParam String seq, @RequestParam(required=false, defaultValue="1") String pg, Model model) {
		model.addAttribute("seq", seq);
		model.addAttribute("pg", pg);
		
		//댓글
		List<ReplyDTO> replyList = qnaService.readReply(Integer.parseInt(seq));
		model.addAttribute("replyList", replyList);
		return "/qna/qnaView";
	}
	
	@RequestMapping(value="getBoardList", method=RequestMethod.POST)
	public ModelAndView getBoardList(@RequestParam(required=false, defaultValue="1") String pg,
									 HttpSession session,
									 HttpServletResponse response) {
		
		List<QnaDTO> list = qnaService.getQnaList(pg);
		//System.out.println("Controller의 getBoardList="+list);
		String memId = (String)session.getAttribute("memId");//세션연결되면 이걸로 하기
		
		//애는 조회수 클릭했을때 같은사람이 클릭하면 한번 증가하도록		
		//조회수 - 새로고침 방지
		if(session.getAttribute("memId") != null) {
    		Cookie cookie = new Cookie("memHit", "0");//쿠키생성
    		cookie.setMaxAge(30*60);//초 단위 생존기간
    		cookie.setPath("/"); //모든 경로에서 접근 가능 하도록 설정
    		response.addCookie(cookie);//클라이언트에게 보내기
    	}
		
		//페이징처리
		BoardPaging boardPaging = qnaService.boardPaging(pg);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("pg", pg);
		mav.addObject("list", list);
		mav.addObject("memId", memId);
		mav.addObject("boardPaging", boardPaging);
		mav.setViewName("jsonView");
		return mav;		
	}
	
	@RequestMapping(value="getBoardSearch", method=RequestMethod.POST)
	public ModelAndView getBoardSearch(@RequestParam Map<String,String> map) {
		List<QnaDTO> list = qnaService.getBoardSearch(map); //pg, searchType, keyword
		
		//페이징 처리
		BoardPaging boardPaging = qnaService.boardPaging(map);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("pg", map.get("pg"));
		mav.addObject("list", list);
		mav.addObject("boardPaging", boardPaging);
		mav.setViewName("jsonView");
		return mav;
	}
	
	@RequestMapping(value="getBoard", method=RequestMethod.POST)
	public ModelAndView getBoard(@RequestParam String seq,
								 @CookieValue(value="memHit", required=false) Cookie cookie,
								 HttpServletResponse response,
								 HttpSession session) {
		//조회수 - 새로고침 방지
		if(cookie != null) {//이 쿠키는 위에 있는 getBoardList 속 쿠키에서 가져오는건가?
			qnaService.hitUpdate(seq); //조회수 증가
			cookie.setMaxAge(0); //쿠키 삭제
			cookie.setPath("/"); //모든 경로에서 삭제 되었음을 알림//이게 왜 필요하지????
			response.addCookie(cookie); //쿠키 삭제된걸 클라이언트에게 보내주기.//내컴퓨터
		}
		
		QnaDTO qnaDTO = qnaService.getBoard(seq);
		String memId = (String)session.getAttribute("memId");
		ModelAndView mav = new ModelAndView();
		mav.addObject("qnaDTO", qnaDTO);
		mav.addObject("memId", memId);
		mav.setViewName("jsonView");
		return mav;
	}
	
	@RequestMapping(value="qnaModify", method=RequestMethod.POST)
	@ResponseBody
	public void qnaModify(@RequestParam Map<String, String> map) {
		qnaService.qnaModify(map);		
	}
	
	@RequestMapping(value="qnaModifyForm", method=RequestMethod.POST)
	public String qnaModifyForm(@RequestParam String seq,
								  @RequestParam String pg,
								  Model model) {
		model.addAttribute("seq", seq);
		model.addAttribute("pg", pg);
		return "/qna/qnaModifyForm";
	}
	
	@RequestMapping(value="qnaDeleteForm", method=RequestMethod.POST)
	public String qnaDeleteForm(@RequestParam String seq, Model model) {
		qnaService.qnaDelete(seq);
		model.addAttribute("seq", seq);
		return "/qna/qnaBoardList";
	}
	
	//답글
	@RequestMapping(value="qnaReplyForm", method=RequestMethod.POST)//얘는 replyForm.jsp부르기
	public String qnaReplyForm(@RequestParam String seq, 
							   @RequestParam String pg, 
								Model model) {
		model.addAttribute("pseq", seq); //원글번호
		model.addAttribute("pg", pg);
		return "/qna/qnaReplyForm";
	}
	
	
	//답글
	@RequestMapping(value="qnaReply", method=RequestMethod.POST)
	@ResponseBody
	public void qnaReply(@RequestParam Map<String, String> map) {
		qnaService.qnaReply(map);
	}
	
	//댓글작성
	@RequestMapping(value="/replyWrite", method = RequestMethod.POST)
	public String replyWrite(ReplyDTO replyDTO,RedirectAttributes rttr) throws Exception {
		
		qnaService.writeReply(replyDTO);
		
		//System.out.println("replyDTO="+replyDTO);
		rttr.addAttribute("seq", replyDTO.getSeq());

		return "redirect: /slime/qna/qnaView";
	}
	


}
