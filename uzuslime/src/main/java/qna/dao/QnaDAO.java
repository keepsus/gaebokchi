package qna.dao;

import java.util.List;
import java.util.Map;

import qna.bean.QnaDTO;
import qna.bean.ReplyDTO;

public interface QnaDAO {

	public void qnaWrite(Map<String, String> map);

	public List<QnaDTO> getQnaList(Map<String, Integer> map);

	public int getTotalA();

	public List<QnaDTO> getBoardSearch(Map<String, String> map);

	public int getBoardSearchTotalA(Map<String, String> map);

	public void hitUpdate(String seq);

	public QnaDTO getBoard(String seq);

	public void qnaModify(Map<String, String> map);

	public void qnaDelete(String seq);

	public void qnaReply(Map<String, String> map);
	
	//댓글 조회
	public List<ReplyDTO> readReply(int seq);
	
	//댓글 작성
	public void writeReply(ReplyDTO replyDTO);

}
