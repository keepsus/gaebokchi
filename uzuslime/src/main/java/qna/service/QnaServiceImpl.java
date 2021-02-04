package qna.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qna.bean.BoardPaging;
import qna.bean.QnaDTO;
import qna.dao.QnaDAO;

@Service
public class QnaServiceImpl implements QnaService{
	@Autowired
	private QnaDAO qnaDAO;
	@Autowired
	private HttpSession session;
	@Autowired
	private BoardPaging boardPaging;
	
	@Override
	public void qnaWrite(Map<String, String> map) {
		map.put("member_id",(String)session.getAttribute("memId"));
		qnaDAO.qnaWrite(map);		
	}

	@Override
	public List<QnaDTO> getQnaList(String pg) {
		//1페이지당 5개씩
				int endNum = Integer.parseInt(pg)*5;
				int startNum = endNum-4;
				
				Map<String, Integer> map = new HashMap<String, Integer>();
				map.put("startNum", startNum);
				map.put("endNum", endNum);
				
				List<QnaDTO> list = qnaDAO.getQnaList(map);
				return list;
	}

	@Override
	public BoardPaging boardPaging(String pg) {
		int totalA = qnaDAO.getTotalA();//총글수
		
		boardPaging.setCurrentPage(Integer.parseInt(pg));
		boardPaging.setPageBlock(3);
		boardPaging.setPageSize(5);
		boardPaging.setTotalA(totalA);
		boardPaging.makePagingHTML();
		return boardPaging;
	}

	@Override
	public List<QnaDTO> getBoardSearch(Map<String, String> map) {
		//1페이지당 5개씩
		int endNum = Integer.parseInt(map.get("pg"))*5;
		int startNum = endNum-4;
		
		//map에는 pg, searchType, keyword, startNum, endNum
		map.put("startNum", startNum+"");
		map.put("endNum", endNum+"");
		
		return qnaDAO.getBoardSearch(map);
	}

	@Override
	public BoardPaging boardPaging(Map<String, String> map) {
		int totalA = qnaDAO.getBoardSearchTotalA(map);//총글수 - searchType, keyword 가지고 가야 한다
		
		boardPaging.setCurrentPage(Integer.parseInt(map.get("pg")));
		boardPaging.setPageBlock(3);
		boardPaging.setPageSize(5);
		boardPaging.setTotalA(totalA);
		boardPaging.makePagingHTML();
		return boardPaging;
	}

	@Override
	public void hitUpdate(String seq) {
		qnaDAO.hitUpdate(seq);
		
	}

	@Override
	public QnaDTO getBoard(String seq) {
//		System.out.println("여기는 서비스seq :" +seq);
		return qnaDAO.getBoard(seq);
	}

	@Override
	public void qnaModify(Map<String, String> map) {
		qnaDAO.qnaModify(map);
	}

	@Override
	public void qnaDelete(String seq) {
		qnaDAO.qnaDelete(seq);
	}

}
