package cart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cart.bean.CartDTO;
import cart.service.CartService;
import goods.bean.GoodsDTO;

@Controller
@RequestMapping(value="/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@Autowired
	CartDTO cartDTO;
	
	//[Controller1] 상세페이지에서 장바구니담기 버튼을 누르면 장바구니DB에 상품이 추가
	@RequestMapping(value="/addGoodsInCart", method=RequestMethod.POST)
	@ResponseBody
	public String addGoodsInCart(@RequestParam GoodsDTO goodsDTO, HttpServletRequest request, HttpServletResponse response) {
		
		//장바구니DB에 담기전 해당 상품이 이미 장바구니DB에 들어있는지 확인
		String member_id = (String) request.getAttribute("memId");
		cartDTO.setMember_id(member_id); //로그인 시 세션에 저장된 회원아이디
		cartDTO.setGoods_id(goodsDTO.getGoods_id()); //본 컨트롤러 매개변수인 제품번호(제품 상세정보에서 넘어온 값)
		//★★★★★cartDTO.setCart_goods_qty(); //★★★★★그냥 폼에서 넘어오는 경우 : @ReequestParam String goods_qty 같은 거 매개변수 추가? |DB에 담겨서 나오는 경우 : goodsDTO.getOrder_goods_qty, 주문할 제품 개수(제품 상세정보에서 넘어온 값)
		
		boolean checkGoodsInCart = cartService.checkGoodsInCart(cartDTO);
		System.out.println("CartController.java checkGoodInCart : " + checkGoodsInCart);
		if(checkGoodsInCart == true) {
			return "already_existed";
		}else{
			cartService.addGoodsInCart(cartDTO); //장바구니DB에 회원아이디와 상품정보 추가
			return "add_success";
		}
		
		
	}
	
	
}
