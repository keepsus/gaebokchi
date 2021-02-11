package member.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.inject.Inject;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
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
	
	@Inject
	JavaMailSender mailSender;
	
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
		//String encryPassword = MemberSha256.encrypt(map.);
		String encryPassword = MemberSha256.encrypt(map.get("pwpwpw"));
		//System.out.println("MemberController 첫번째 암호 : "+ map.get("pwpwpw"));
		map.put("pwpwpw", encryPassword);
		//System.out.println("MemberController 두번째 암호 : "+ map.get("pwpwpw"));
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

	
	
	
	/* -------------- */
	/* ---이메일인증---- */
	/* -------------- */
	
	 // mailSending 코드
    @RequestMapping( value = "sendEmail" , method=RequestMethod.POST )
    @ResponseBody
    public ModelAndView mailSending(HttpServletRequest request, 
    		@RequestParam String e_mail, HttpServletResponse response_email) throws IOException  {

        Random r = new Random();
        int dice = r.nextInt(4589362) + 49311; //이메일로 받는 인증코드 부분 (난수)
        
        String setfrom = "jmkk0316@gamil.com";
        String tomail = e_mail; // 받는 사람 이메일
        String title = "회원가입 인증 이메일 입니다."; // 제목
        String content =
        
        System.getProperty("line.separator")+ //한줄씩 줄간격을 두기위해 작성
        
        System.getProperty("line.separator")+
                
        "안녕하세요 회원님 저희 우주슬라임 홈페이지를 찾아주셔서 감사합니다"
        
        +System.getProperty("line.separator")+
        
        System.getProperty("line.separator")+

        " 인증번호는 " +dice+ " 입니다. "
        
        +System.getProperty("line.separator")+
        
        System.getProperty("line.separator")+
        
        "받으신 인증번호를 홈페이지에 입력해 주시면 다음으로 넘어갑니다."; // 내용
        
        
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper messageHelper = new MimeMessageHelper(message,
                    true, "UTF-8");

            messageHelper.setFrom(setfrom); // 보내는사람 생략하면 정상작동을 안함
            messageHelper.setTo(tomail); // 받는사람 이메일
            messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
            messageHelper.setText(content); // 메일 내용
            
            mailSender.send(message);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        ModelAndView mv = new ModelAndView();    //ModelAndView로 보낼 페이지를 지정하고, 보낼 값을 지정한다.
        //mv.setViewName("/member/memberWriteForm"); //뷰의이름을 2개를 설정하면 안됌
        mv.addObject("dice", dice);
        mv.setViewName("jsonView");
        
        return mv;//인증번호를 보냄
        
    }

	
}//end of MemberController












