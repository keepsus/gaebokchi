package cart.service;

import java.util.List;
import java.util.Map;

import cart.bean.CartDTO;

public interface CartService {

	public boolean checkGoodsInCart(CartDTO cartDTO);

	public void addGoodsInCart(CartDTO cartDTO);

	public Map<String, List> getListFromCartAndGoods(String memId);

}
