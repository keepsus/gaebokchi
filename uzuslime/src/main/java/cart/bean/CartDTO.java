package cart.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("cartDTO")
public class CartDTO {
	private String cart_id; //장바구니 번호(primary key)
	private String goods_id; //상품번호(foreign key)
	private String member_id; //회원아이디(foreign key)
	private int cart_goods_qty; //상품 개수
	private String creData; //해당 장바구니 생성 일자
}
