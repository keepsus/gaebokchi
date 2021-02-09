package member.controller;

import java.util.HashMap;
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
import member.service.MemberSha256;

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
	public String login(@RequestParam Map<String, String> map) {
<<<<<<< HEAD
		System.out.println(map);
=======
		//String encryPassword = MemberSha256.encrypt(map.);
		String encryPassword = MemberSha256.encrypt(map.get("pwpwpw"));
		//System.out.println("MemberController 첫번째 암호 : "+ map.get("pwpwpw"));
		map.put("pwpwpw", encryPassword);
		//System.out.println("MemberController 두번째 암호 : "+ map.get("pwpwpw"));
>>>>>>> B2
		return memberService.login(map);
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
		
		//암호 확인
		//System.out.println("첫번째 : " + memberDTO.getMember_pw());
		
		//비밀번호 암호화(sha256)
		String encryPassword = MemberSha256.encrypt(memberDTO.getMember_pw());
		memberDTO.setMember_pw(encryPassword);
		//System.out.println("두번째 : " + memberDTO.getMember_pw());
		
		//회원가입
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
	
	
	//회원정보 수정 창 -> DB 에서 데이터 가지고 옴
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
		String encryPassword = MemberSha256.encrypt(memberDTO.getMember_pw());
		memberDTO.setMember_pw(encryPassword);
		memberService.modify(memberDTO);
	}
	
	
	//회원정보 조회
	@RequestMapping(value="memberList",  method=RequestMethod.GET)
	public String memberList(Model model) {
		List<MemberDTO> list = memberService.memberList();
		model.addAttribute("list", list);
		return "/member/memberList";
	}
	
	//아이디, 비밀번호 찾기
	@RequestMapping(value="memberSearch", method=RequestMethod.GET)
	public String memberSearch() {
		return "/member/memberSearch";
	}
	
	//아이디, 비밀번호 찾기
	@RequestMapping(value="memberIdSearch", method=RequestMethod.POST)
	@ResponseBody
	public String memberIdSearch(@RequestParam String member_name,@RequestParam String tel1,
								@RequestParam String tel2, @RequestParam String tel3) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("member_name", member_name);
		map.put("tel1", tel1);
		map.put("tel2", tel2);
		map.put("tel3", tel3);
		MemberDTO memberDTO = memberService.getId(map);
	
		String id = memberDTO.getMember_id();
		return id;
		
	}
	
	/*
	 * @RequestMapping(value="userIdSearch", method=RequestMethod.POST)
	 * 
	 * @ResponseBody public String userIdSearch(HttpServletRequest request,
	 * HttpServletResponse response, Model model) { String member_name =
	 * request.getParameter("member_name"); String tel1 =
	 * request.getParameter("tel1"); System.out.println(member_name);
	 * System.out.println(tel1); return "/member/memberSearch"; }
	 */
	
	
	
}//end of MemberController












