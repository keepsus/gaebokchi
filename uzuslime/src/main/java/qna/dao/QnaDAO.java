package qna.dao;

import java.util.List;
import java.util.Map;

import qna.bean.QnaDTO;

public interface QnaDAO {

	public void qnaWrite(Map<String, String> map);

	public List<QnaDTO> getQnaList(Map<String, Integer> map);

	public int getTotalA();

	public List<QnaDTO> getBoardSearch(Map<String, String> map);

	public int getBoardSearchTotalA(Map<String, String> map);

}
