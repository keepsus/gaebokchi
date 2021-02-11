package qna.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class QnaDTO {
	private int seq;
	private String member_id;
	private String subject;
	private String content;
	private int ref;
	private int lev;
	private int step;
	private int pseq;
	private int reply;
	private int hit;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy.MM.dd")
	private Date logtime;
}
