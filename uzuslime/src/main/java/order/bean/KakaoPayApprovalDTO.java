package order.bean;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component("kakaoPayApprovalDTO")
public class KakaoPayApprovalDTO {

	//결제승인에 대한 응답정보를 response로 받음
	private String aid;
	private String tid; //Transaction ID, 거래일련번호
	private String cid; //가맹점 코드
	private String sid;
	private String partner_order_id; //가맹점 주문번호, order_id 사용예장
	private String partner_user_id; //가맹점 주문번호, member_id 사용예정
	private String payment_method_type; 
	private AmountDTO amount;
	private CardDTO cart_info;
	private String item_name; //상풍명, goods_title
	private String item_code; //상품코드, goods_id
	private String payload;
	private Integer quantity; //상품수량, order_goods_qty
	private Integer total_amount;
	private Integer tax_free_amount;
	private Integer vat_amount;
	private Date created_at;
	private Date approved_at;
	
}
