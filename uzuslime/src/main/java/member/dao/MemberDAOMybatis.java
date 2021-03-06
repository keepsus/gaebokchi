package member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import member.bean.MemberDTO;
import member.bean.ZipcodeDTO;

@Transactional
@Repository
public class MemberDAOMybatis implements MemberDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public MemberDTO login(Map<String, String> map) {
		return sqlSession.selectOne("memberSQL.login", map);
	}

	@Override
	public MemberDTO checkId(String member_id) {
		return sqlSession.selectOne("memberSQL.checkId", member_id);
	}

	@Override
	public List<ZipcodeDTO> checkPostSearch(Map<String, String> map) {
		return sqlSession.selectList("memberSQL.checkPostSearch", map);
	}

	@Override
	public int write(MemberDTO memberDTO) {
		return sqlSession.insert("memberSQL.write", memberDTO);
	}

	@Override
	public MemberDTO getMember(String member_id) {
		return sqlSession.selectOne("memberSQL.getMember", member_id);
	}

	@Override
	public void modify(MemberDTO memberDTO) {
		sqlSession.update("memberSQL.modify", memberDTO);
	}

	@Override
	public List<MemberDTO> memberList() {
		return sqlSession.selectList("memberSQL.memberList");
	}
	
	@Override
	public MemberDTO getId(Map<String, String> map) {
		return sqlSession.selectOne("memberSQL.getId", map);
	}

}









