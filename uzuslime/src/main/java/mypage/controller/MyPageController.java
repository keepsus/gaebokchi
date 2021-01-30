package mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="mypage")
public class MyPageController {
	
	//로그인 창
	@RequestMapping(value="myPage", method=RequestMethod.GET)
	public String myPage() {
		return "/mypage/myPage";
	}
	
}












