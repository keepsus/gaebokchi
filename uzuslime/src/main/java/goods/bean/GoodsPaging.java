package goods.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class GoodsPaging {

	private int currentPage;			//현재 페이지
	private int pageBlock;				//[이전][1][2][3][다음]
	private int pageSize;				//1페이지당 글 갯수	
	private int totalA;					//총 글수
	private StringBuffer pagingHTML;	//StringBuffer : 편집가능(선호), (대안_String: 편집불가)
	
	
	public void makePagingHTML() {
		pagingHTML = new StringBuffer();
		
		//totalp
		int totalP = (totalA + pageSize-1) / pageSize;	//총 페이지 수
		
		//startPage
		int startPage = (currentPage-1) / pageBlock * pageBlock +1;	//ex)[1][2][3] 에서 [1] 자리 변수! 
		
		//endPage 1/2
		int endPage = startPage + pageBlock -1;
		if(endPage > totalP) endPage = totalP;	//[1][2][3] -> [4][5][6] -> [7][8] 처럼 2페이지만 남을 경우!
				
		if(startPage > pageBlock)	//or(startPage > pageBlock(=3))
			pagingHTML.append("[<span id='paging' onclick='goodsPaging("+(startPage-1)+")'>이전</span>]");
		
		for(int i = startPage; i <= endPage; i++) {
			if(i == currentPage) {
				pagingHTML.append("[<span id='currentPaging' onclick='goodsPaging("+i+")'>"+i+"</span>]");
			}else {
				pagingHTML.append("[<span id='paging' onclick='goodsPaging("+i+")'>"+i+"</span>]");
			}
		}//for
		
		//endPage 2/2
		if(endPage < totalP) {
			pagingHTML.append("[<span id='paging' onclick='goodsPaging("+(endPage+1)+")'>다음</span>]");
		}		
		
	}//end of makePaingHTML() method
		
}//end of goodsPaing class
