package member.bean;

import lombok.Data;

@Data
public class MemberDTO {
	
	//field
	private String member_id;
	private String member_name;
	private String member_pw;	
	private String tel1;
	private String tel2;
	private String tel3;
	private String email1;
	private String email2;
	private String email_key;
	private String zipcode;
	private String addr1;
	private String addr2;
	private int admin_yn;
	
}//end of MemberDTO class


