package goods.service;

import java.util.List;

import goods.bean.GoodsDTO;
import goods.bean.GoodsPaging;

public interface GoodsService {

	public void goodsWrite(GoodsDTO goodsDTO);

	public List<GoodsDTO> getGoodsList(String pg);
	public List<GoodsDTO> getGoodsIndexList();
	
	public GoodsDTO getGoodsView(String seq);

	public GoodsPaging goodsPaging(String pg);

	public void goodsCheckDelete(String[] check);
	public void goodsViewDelete(String seq);

	public GoodsDTO getGoods(String seq);


}
