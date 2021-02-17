package goods.dao;

import java.util.List;
import java.util.Map;

import goods.bean.GoodsDTO;

public interface GoodsDAO {

	public void goodsWrite(GoodsDTO goodsDTO);

	public List<GoodsDTO> getGoodsList(Map<String, Integer> map);

	public GoodsDTO getGoodsView(String seq);
	
	public void goodsCheckDelete(Map<String, String[]> map);
	public void goodsViewDelete(String seq);

	public int getGoodsTotalA();

	public List<GoodsDTO> getGoodsIndexList();

	public GoodsDTO getGoods(String seq);

<<<<<<< HEAD
	public GoodsDTO getOrderImageView(String goods_idSpan);
=======
	public void goodsModify(Map<String, String> map);
>>>>>>> chobranch

	
	/* goodsIndexView.jsp 에서 goodsDTO 값들을 객체형으로 받는 것
	public GoodsDTO getGdsView(String seq);
	*/



}//end of goodsWrite class
