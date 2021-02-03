package mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="mypage")
public class MyPageController {
	
	@RequestMapping(value="myPageOrder", method=RequestMethod.GET)
	public String myPage() {
		return "/mypage/myPageOrder";
	}
	
}












