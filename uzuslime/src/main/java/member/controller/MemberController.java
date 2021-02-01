package member.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import member.bean.MemberDTO;
import member.bean.ZipcodeDTO;
import member.service.MemberService;

@Controller
@RequestMapping(value="member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//로그인 창
	@RequestMapping(value="memberLoginForm", method=RequestMethod.GET)
	public String loginForm() {
		return "/member/memberLoginForm";
	}
	
	//로그인 기능
	@RequestMapping(value="login", method=RequestMethod.POST)
	@ResponseBody
	public String login(@RequestParam Map<String, String> map, HttpSession session) {
		return memberService.login(map, session);
	}
	
	//로그아웃
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "/index";
	}
	
	//회원가입 창
	@RequestMapping(value="memberWriteForm", method=RequestMethod.GET)
	public String memberWriteForm() {		
		return "/member/memberWriteForm";
	}
	
	//회원가입
	@RequestMapping(value="write", method=RequestMethod.POST)
	public String write(@ModelAttribute MemberDTO memberDTO, Model model) {
		int su = memberService.write(memberDTO);		
		model.addAttribute("su", su);				
		return "/index";
	}
	
	
	//회원가입 -> 아이디 중복체크
	@RequestMapping(value="checkId", method=RequestMethod.POST)
	@ResponseBody
	public String checkId(@RequestParam String member_id) {
		return memberService.checkId(member_id);
	}
	
	
	//우편번호
	@RequestMapping(value="memberCheckPost", method=RequestMethod.GET)
	public String memberCheckPost() {
		return "/member/memberCheckPost";
	}
	
	
	//우편번호 검색
	@RequestMapping(value="checkPostSearch", method=RequestMethod.POST)
	public ModelAndView checkPostSearch(@RequestParam Map<String, String> map) {
		List<ZipcodeDTO> list = memberService.checkPostSearch(map);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("jsonView");
		return mav;
	}
	
	
	//회원정보 수정 창 -> BD 에서 데이터 가지고 옴
	@RequestMapping(value="memberModifyForm", method=RequestMethod.GET)
	public String memberModifyForm(HttpSession session, Model model) {
		String member_id = (String) session.getAttribute("memId");
		MemberDTO memberDTO = memberService.getMember(member_id);
		
		model.addAttribute("memberDTO", memberDTO);
		return "/member/memberModifyForm";
	}

	
	//회원정보 수정기능
	@RequestMapping(value="modify", method=RequestMethod.POST)
	@ResponseBody
	public void modify(@ModelAttribute MemberDTO memberDTO) {
		memberService.modify(memberDTO);
	}
	
}//end of MemberController












