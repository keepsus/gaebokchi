package order.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("amountDTO")
public class AmountDTO {
	private Integer total;
	private Integer tax_free;
	private Integer vat;
	private Integer point;
	private Integer discount;
}
