package qna.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import qna.bean.BoardPaging;
import qna.bean.QnaDTO;
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
	public String boardList(@RequestParam(required=false, defaultValue="1") String pg, Model model) {//기본값 1페이지로 인식해라
		model.addAttribute("pg", pg);
		return "/qna/qnaBoardList";
	}
	
	@RequestMapping(value="getBoardList", method=RequestMethod.POST)
	public ModelAndView getBoardList(@RequestParam(required=false, defaultValue="1") String pg,
									 HttpSession session,
									 HttpServletResponse response) {
		
		List<QnaDTO> list = qnaService.getQnaList(pg);
		System.out.println(list);
		//String member_Id = (String)session.getAttribute("member_Id");//세션연결되면 이걸로 하기
		//String member_Id ="mk";//애는 조회수 클릭했을때 같은사람이 클릭하면 한번 증가하도록
		
		//조회수 - 새로고침 방지
//		if(session.getAttribute("member_Id") != null) {
//    		Cookie cookie = new Cookie("memHit", "0");//생성
//    		cookie.setMaxAge(30*60);//초 단위 생존기간
//    		cookie.setPath("/"); //모든 경로에서 접근 가능 하도록 설정
//    		response.addCookie(cookie);//클라이언트에게 보내기
//    	}
		
		//페이징처리
		BoardPaging boardPaging = qnaService.boardPaging(pg);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("pg", pg);
		mav.addObject("list", list);
//		mav.addObject("member_Id", member_Id);
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
	
	
}
