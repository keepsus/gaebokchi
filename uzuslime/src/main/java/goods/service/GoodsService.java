package goods.service;

import java.util.List;
import java.util.Map;

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

	public void goodsModify(Map<String, String> map);

	
	
	
	/* goodsIndexView.jsp 에서 goodsDTO 값들을 객체형으로 받는 것
	public GoodsDTO getGdsView(String seq);
	*/

}
