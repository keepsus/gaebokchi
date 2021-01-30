package order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import order.bean.OrderDTO;
import order.dao.OrderDAO;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;
	
	@Override
	public int orderOneGoods(OrderDTO orderDTO) {
		return orderDAO.orderOneGoods(orderDTO);
	}

}
