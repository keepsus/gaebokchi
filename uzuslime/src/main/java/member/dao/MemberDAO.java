package member.dao;

import java.util.List;
import java.util.Map;

import member.bean.MemberDTO;
import member.bean.ZipcodeDTO;

public interface MemberDAO {

	public MemberDTO login(Map<String, String> map);

	public MemberDTO checkId(String member_id);

	public List<ZipcodeDTO> checkPostSearch(Map<String, String> map);

	public int write(MemberDTO memberDTO);

	public MemberDTO getMember(String member_id);

	public void modify(MemberDTO memberDTO);

	public List<MemberDTO> memberList();

	public MemberDTO getId(Map<String, String> map);





}
