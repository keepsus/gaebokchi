package goods.bean;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class GoodsDTO {
	
	private int 	seq;
	private String 	goods_id;
	private String 	goods_title;
	private String 	goods_country;
	private int 	goods_price;
	private int 	goods_sales_price;
	private int		goods_qty;
	private int 	goods_point;
	private int 	goods_deli_price;
	private int 	goods_deli_extra;
	private int 	goods_deli_free;	
	private	String	goods_image0;
	private	String	goods_image1;
	private	String	goods_image2;
	private String	goods_content;
	private int 	goods_sales_yn;
	private int 	goods_md_yn;
	private int 	goods_hot_yn;
	private int 	goods_soldout_yn;	
	private Date	logtime;
	
}
