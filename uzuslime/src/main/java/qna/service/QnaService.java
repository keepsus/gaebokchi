package qna.service;

import java.util.List;
import java.util.Map;

import qna.bean.BoardPaging;
import qna.bean.QnaDTO;

public interface QnaService {

	public void qnaWrite(Map<String, String> map);

	public List<QnaDTO> getQnaList(String pg);

	public BoardPaging boardPaging(String pg);

	public List<QnaDTO> getBoardSearch(Map<String, String> map);

	public BoardPaging boardPaging(Map<String, String> map);

	public void hitUpdate(String seq);//조회수증가

	public QnaDTO getBoard(String seq);//글상세보기

	public void qnaModify(Map<String, String> map);

	public void qnaDelete(String seq);

	public void qnaReply(Map<String, String> map);

}
