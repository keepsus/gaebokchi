package cart.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cart.bean.CartDTO;
import cart.dao.CartDAO;
import goods.bean.GoodsDTO;

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

	@Override
	public Map<String, List> getListFromCartAndGoods(String memId) {
		Map<String, List> cartMap = new HashMap<String, List>();
		List<CartDTO> cartList = cartDAO.getListFromCart(memId); //goods_id가 cartList안에 있음
		List<GoodsDTO> goodsList = cartDAO.getListFromGoods(cartList); //cartList안의 goods_id를 통해 해당 상품 상세정보 조회가능
		cartMap.put("cartList", cartList);
		cartMap.put("goodsList", goodsList);
		return cartMap;
	}

}
