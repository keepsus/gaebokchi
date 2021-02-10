package member.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import member.bean.MemberDTO;
import member.bean.ZipcodeDTO;

public interface MemberService {

	public String login(Map<String, String> map);

	public String checkId(String member_id);

	public List<ZipcodeDTO> checkPostSearch(Map<String, String> map);

	public int write(MemberDTO memberDTO);

	public MemberDTO getMember(String member_id);

	public void modify(MemberDTO memberDTO);

	public List<MemberDTO> memberList();
	
}
