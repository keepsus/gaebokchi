package cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cart.bean.CartDTO;
import cart.dao.CartDAO;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartDAO cartDAO;
	

	@Override
	public boolean checkGoodsInCart(CartDTO cartDTO) { //cartDTO : member_id, goods_id가 담겨있음
		return cartDAO.checkGoodsInCart(cartDTO);
	}

	@Override
	public void addGoodsInCart(CartDTO cartDTO) {
		cartDAO.addGoodsInCart(cartDTO);
		
	}

}
