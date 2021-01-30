package imageboard.bean;

import lombok.Data;

@Data
public class ImageboardDTO {
	private int goods_id;
	private String goods_title;
	private String goods_country_of_origin;
	private int goods_price;
	private int goods_sales_price;
	private int goods_point;
	private String goods_status;
	private int goods_delivery_price;
	private int goods_delivery_date;
	private int goods_delivery_extra_charge;
	private int goods_delivery_free_condition;
	private String goods_filename;
	private String goods_filename_detail;
	private String goods_context;
}
