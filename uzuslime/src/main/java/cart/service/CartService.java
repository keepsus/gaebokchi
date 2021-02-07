package cart.service;

import cart.bean.CartDTO;

public interface CartService {

	public boolean checkGoodsInCart(CartDTO cartDTO);

	public void addGoodsInCart(CartDTO cartDTO);

}
