package cart.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cart.bean.CartDTO;

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

}
