package mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="mypage")
public class MyPageController {
	
	//濡쒓렇�씤 李�
	@RequestMapping(value="myPageOrder", method=RequestMethod.GET)
	public String myPage() {
		return "/mypage/myPageOrder";
	}
	
}












