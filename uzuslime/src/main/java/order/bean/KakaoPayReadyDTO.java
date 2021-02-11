package order.bean;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("kakaoPayReadyDTO")
public class KakaoPayReadyDTO {
	
	//결제 요청이 성공적이 이루어진 경우 카카오페이에서 response로 데이터 받음
	private String tid;
	private String next_redirect_pc_url;
	private Date created_at;
	
}
