package qna.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import qna.bean.QnaDTO;

@Repository
@Transactional
public class QnaDAOMybatis implements QnaDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void qnaWrite(Map<String, String> map) {
		sqlSession.insert("qnaSQL.qnaWrite", map);
	}

	@Override
	public List<QnaDTO> getQnaList(Map<String, Integer> map) {
		return sqlSession.selectList("qnaSQL.getQnaList", map);
	}

	@Override
	public int getTotalA() {
		return sqlSession.selectOne("qnaSQL.getTotalA");
	}

	@Override
	public List<QnaDTO> getBoardSearch(Map<String, String> map) {
		return sqlSession.selectList("qnaSQL.getBoardSearch", map);
	}

	@Override
	public int getBoardSearchTotalA(Map<String, String> map) {
		return sqlSession.selectOne("qnaSQL.getBoardSearchTotalA", map);
	}

	@Override
	public void hitUpdate(String seq) {
		sqlSession.update("qnaSQL.hitUpdate", Integer.parseInt(seq));
		
	}

	@Override
	public QnaDTO getBoard(String seq) {
		return sqlSession.selectOne("qnaSQL.getBoard", Integer.parseInt(seq));
	}

	@Override
	public void qnaModify(Map<String, String> map) {
		sqlSession.update("qnaSQL.qnaModify", map);
	}

	@Override
	public void qnaDelete(String seq) {
		sqlSession.delete("qnaSQL.qnaDelete", Integer.parseInt(seq));
		
	}

}
