package goods.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import goods.bean.GoodsDTO;
import goods.bean.GoodsPaging;
import goods.dao.GoodsDAO;

@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsDAO goodsDAO;
	@Autowired
	private GoodsPaging goodsPaging;

	
	@Override
	public void goodsWrite(GoodsDTO goodsDTO) {
		goodsDAO.goodsWrite(goodsDTO);
	}

	
	//goodsListd에 table 형식으로 DB에 등록된 모든 제품 뿌림.
	@Override
	public List<GoodsDTO> getGoodsList(String pg) {
		//3개씩 뿌려줌 
		int endNum = Integer.parseInt(pg)*4;
		int startNum = endNum-3;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startNum", startNum);
		map.put("endNum", endNum);
		return goodsDAO.getGoodsList(map);
	}

	
	//index.jsp 에 DB에 등록된 모든 제품 뿌림.
	@Override
	public List<GoodsDTO> getGoodsIndexList() {
		System.out.println("getGoodsIndexList - (Impl) return 전!");
		List<GoodsDTO> goodsList = goodsDAO.getGoodsIndexList();
		System.out.println("GoodsServiceImpl goodsList : " + goodsList);
		return goodsList;
	}
	
	
	@Override
	public GoodsDTO getGoodsView(String seq) {
		return goodsDAO.getGoodsView(seq);
	}

	
	@Override
	public GoodsPaging goodsPaging(String pg) {		
		int totalA = goodsDAO.getGoodsTotalA();	//총글수 가져올꺼임
		
		goodsPaging.setCurrentPage(Integer.parseInt(pg));
		goodsPaging.setPageBlock(5);
		goodsPaging.setPageSize(5);
		goodsPaging.setTotalA(totalA);
		goodsPaging.makePagingHTML();
		
		return goodsPaging;
				
		
	}

	
	@Override
	public void goodsCheckDelete(String[] check) {
		Map<String, String[]> map = new HashMap<String, String[]>();
		map.put("array", check);	//mapper 파일에 delete 보면 collection="array"라고 적어놓았다.
		
		goodsDAO.goodsCheckDelete(map);
	}

	@Override
	public void goodsViewDelete(String seq) {
		goodsDAO.goodsViewDelete(seq);
		
	}

	

	@Override
	public GoodsDTO getGoods(String seq) {
		return goodsDAO.getGoods(seq);
	}


	@Override
	public void goodsModify(Map<String, String> map) {
		goodsDAO.goodsModify(map);
		
	}


	


	
	
	/* goodsIndexView.jsp 에서 goodsDTO 값들을 객체형으로 받는 것
	@Override
	public GoodsDTO getGdsView(String seq) {
		return goodsDAO.getGdsView(seq);
	}
	*/


	
	
	
	
}//end of GoodsServiceImpl class
