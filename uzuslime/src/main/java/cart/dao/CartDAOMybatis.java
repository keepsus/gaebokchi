package cart.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cart.bean.CartDTO;
import goods.bean.GoodsDTO;

@Transactional
@Repository
public class CartDAOMybatis implements CartDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public boolean checkGoodsInCart(CartDTO cartDTO) {
		boolean result =  sqlSession.selectOne("cartSQL.checkGoodsInCart", cartDTO); //반환값 String?
		return result;
	}

	@Override
	public void addGoodsInCart(CartDTO cartDTO) {
		sqlSession.insert("cartSQL.addGoodsInCart", cartDTO);
		
	}

	@Override
	public List<CartDTO> getListFromCart(String memId) {
		List<CartDTO> cartList = sqlSession.selectList("cartSQL.getListFromCart", memId);
		return cartList;
	}

	@Override
	public List<GoodsDTO> getListFromGoods(List<CartDTO> cartList) {
		List<GoodsDTO> goodsList = sqlSession.selectList("cartSQL.getListFromGoods", cartList);
		return goodsList;
	}

	
}
