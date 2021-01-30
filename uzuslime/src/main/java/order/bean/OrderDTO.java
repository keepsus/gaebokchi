package order.bean;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component("orderDTO")
public class OrderDTO {
	
	private int order_seq_num;
	private int order_id;
	private String member_id;
	private int goods_id;
	private String goods_title;
	private int order_goods_qty; //최종 주문  제품 수
	private String goods_filename;
	private String orderer_name;
	private String orderer_hp;
	private String orderer_email;
	private String receiver_name;
	private String receiver_hp;
	private String delivery_zipcode;
	private String delivery_addr1;
	private String delivery_addr2;
	private String delivery_message;
	private int order_goods_price;
	private int order_delivery_price;
	private int goods_sales_price;
	private int total_order_price;
	private int cart_goods_qty;  //장바구니에 담긴 제품 수(DB에는 입력 안하지만 그냥 두기로...)
	private int order_agreement_info;
	private int order_agreement_order;
	private String pay_method;
	private String delivery_method;
	private String gift_wrapping;
	private String card_com_name;
	private String card_pay_month;
	private String pay_orderer_hp_num;  //휴대폰 결제 전화번호
	private String pay_order_time;
	private String delivery_state;  //현재 주문 상품 배송 상태
	
}
