package qna.bean;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyDTO {

	private int seq;
	private int rno;
	private String content;
	private String writer;
	private Date regdate;
}
