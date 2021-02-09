package goods.dao;

import java.util.List;
import java.util.Map;

import goods.bean.GoodsDTO;

public interface GoodsDAO {

	public void goodsWrite(GoodsDTO goodsDTO);

	public List<GoodsDTO> getGoodsList(Map<String, Integer> map);

	public GoodsDTO getGoodsView(String seq);
	
	public void goodsDelete(Map<String, String[]> map);

	public int getGoodsTotalA();

	public List<GoodsDTO> getGoodsIndexList();

	public GoodsDTO getGoods(String seq);



}
