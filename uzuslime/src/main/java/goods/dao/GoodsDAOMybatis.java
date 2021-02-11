package goods.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import goods.bean.GoodsDTO;

@Repository
@Transactional
public class GoodsDAOMybatis implements GoodsDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void goodsWrite(GoodsDTO goodsDTO) {
		sqlSession.insert("goodsSQL.goodsWrite", goodsDTO);		
	}

	@Override
	public List<GoodsDTO> getGoodsList(Map<String, Integer> map) {
		return sqlSession.selectList("goodsSQL.getGoodsList", map);
	}

	@Override
	public List<GoodsDTO> getGoodsIndexList() {
		
		List<GoodsDTO> goodsList = sqlSession.selectList("goodsSQL.getGoodsIndexList");
		System.out.println("GoodsDAOMybatis goodsList : " + goodsList);
		return goodsList;
				
	}
	
	@Override
	public GoodsDTO getGoodsView(String seq) {
		return sqlSession.selectOne("goodsSQL.getGoodsView", Integer.parseInt(seq));
	}
	
	@Override
	public void goodsCheckDelete(Map<String, String[]> map) {
		sqlSession.delete("goodsSQL.goodsCheckDelete", map);		
	}

	@Override
	public void goodsViewDelete(String seq) {
		sqlSession.delete("goodsSQL.goodsViewDelete", Integer.parseInt(seq));		
		
	}
	
	@Override
	public int getGoodsTotalA() {
		return sqlSession.selectOne("goodsSQL.getGoodsTotalA");
	}

	@Override
	public GoodsDTO getGoods(String seq) {
		return sqlSession.selectOne("goodsSQL.getGoods", Integer.parseInt(seq));
	}


	
	
}//end of GoodsDAOMybatis class
