package order.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import order.bean.OrderDTO;



@Transactional//commit&close 를 자동으로 해주는 기능이 있음
@Repository //DB와 연결된 Bean이라는 의미
public class OrderDAOMybatis implements OrderDAO {

	@Autowired
	private SqlSession sqlSession;


	@Override
	public int orderOneGoods(OrderDTO orderDTO) {
		return sqlSession.insert("orderSQL.orderOneGoods", orderDTO);
	}
	
}
