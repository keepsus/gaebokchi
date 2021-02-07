package cart.dao;

import cart.bean.CartDTO;

public interface CartDAO {

	public boolean checkGoodsInCart(CartDTO cartDTO);

	public void addGoodsInCart(CartDTO cartDTO);

	

}
