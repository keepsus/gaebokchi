package member.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import member.bean.MemberDTO;
import member.bean.ZipcodeDTO;
import member.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;
	@Autowired
	private HttpSession session;

	@Override
	public String login(Map<String, String> map) {
		MemberDTO memberDTO = memberDAO.login(map);
		
		System.out.println(memberDTO);
		
		if(memberDTO == null) {
			return "fail";
			
		}else {
			//세션
			session.setAttribute("memName", memberDTO.getMember_name());
			session.setAttribute("memId", memberDTO.getMember_id());
			session.setAttribute("memAdmin", memberDTO.getAdmin_yn());
			session.setAttribute("memEmail", memberDTO.getEmail1()+"@"+memberDTO.getEmail2());
			session.setAttribute("memDTO", memberDTO); //장바구니, 결제부분에서 해당 내용 사용(회원의 주소 등을 가져옴)
			return "success";
		}
	}

	@Override
	public String checkId(String member_id) {
		MemberDTO memberDTO = memberDAO.checkId(member_id);
		
		if(memberDTO == null)
			return "non_exist";
		else
			return "exist";
	}

	@Override
	public List<ZipcodeDTO> checkPostSearch(Map<String, String> map) {
		return memberDAO.checkPostSearch(map);
	}

	@Override
	public int write(MemberDTO memberDTO) {
		return memberDAO.write(memberDTO);
	}

	@Override
	public MemberDTO getMember(String member_id) {
		return memberDAO.getMember(member_id);
	}

	@Override
	public void modify(MemberDTO memberDTO) {
		memberDAO.modify(memberDTO);
	}

	@Override
	public List<MemberDTO> memberList() {
		return memberDAO.memberList();
	}
	
	
}

















