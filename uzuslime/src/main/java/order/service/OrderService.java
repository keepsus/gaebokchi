package order.service;

import java.util.Map;

import order.bean.OrderDTO;

public interface OrderService {

	public int orderOneGoods(OrderDTO orderDTO);


	
	
	//-----------카카오 페이-------------
	
	public String kakaoPayReady(Map<String, String> map);
	

}
