package cart.dao;

import java.util.List;
import java.util.Map;

import cart.bean.CartDTO;
import goods.bean.GoodsDTO;

public interface CartDAO {

	public boolean checkGoodsInCart(CartDTO cartDTO);

	public void addGoodsInCart(CartDTO cartDTO);

	public List<CartDTO> getListFromCart(String memId);

	public List<GoodsDTO> getListFromGoods(List<CartDTO> cartList);

	

	

}
