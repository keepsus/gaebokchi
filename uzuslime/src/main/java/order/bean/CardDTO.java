package order.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("cardDTO")
public class CardDTO {
	private String puchase_corp;
	private String purchase_corp_code;
	private String issuer_corp;
	private String issuer_corp_code;
	private String bin;
	private String cart_type;
	private String install_month;
	private String approved_id;
	private String card_mid;
	private String interest_free_install;
	private String card_item_code;
}
