package cart.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	@RequestMapping(value="/addGoodsInCart", method=RequestMethod.GET)
	@ResponseBody
	public String addGoodsInCart(@RequestParam Map<String, String> map, HttpServletRequest request, HttpServletResponse response) {
		//★★★★★★상세페이지 될때까지 여기서 값 받아오기
		//1.@RequestMapping의 method를 POST로 변경
		//2.@RequestParam GoodsDTO goodsDTO 파라미터에 추가하기
		//3.아래 내용 삭제(임시값 입력)
		//4.주석해제(원래 값 받는 코드) 41~43
		System.out.println("addGoodsInCart : " + map);
		HttpSession session =  request.getSession();
		String memId = (String) session.getAttribute("memId");
		String goods_id = map.get("goods_id");
		cartDTO.setMember_id(memId);
		cartDTO.setGoods_id(goods_id);
		cartDTO.setGoods_id("333");
		
		
		//장바구니DB에 담기전 해당 상품이 이미 장바구니DB에 들어있는지 확인
//		String member_id = (String) request.getAttribute("memId");
//		cartDTO.setMember_id(member_id); //로그인 시 세션에 저장된 회원아이디
//		cartDTO.setGoods_id(goodsDTO.getGoods_id()); //본 컨트롤러 매개변수인 제품번호(제품 상세정보에서 넘어온 값)
		//★★★★★cartDTO.setCart_goods_qty(); //★★★★★그냥 폼에서 넘어오는 경우 : @ReequestParam String goods_qty 같은 거 매개변수 추가? |DB에 담겨서 나오는 경우 : goodsDTO.getOrder_goods_qty, 주문할 제품 개수(제품 상세정보에서 넘어온 값)
		
		boolean checkGoodsInCart = cartService.checkGoodsInCart(cartDTO);
		System.out.println("CartController.java checkGoodInCart : " + checkGoodsInCart);
		if(checkGoodsInCart == true) {
			System.out.println("CartController.java : already_existed");
			//return "already_existed,"+goods_id;
			return "already_existed";
		}else{
			cartService.addGoodsInCart(cartDTO); //장바구니DB에 회원아이디와 상품정보 추가
			System.out.println("CartController.java : add_success");
			//return "add_success,"+goods_id;
			return "add_success";
		}
		
	}//addGoodsInCart
	
	
	//[Controller2] 장바구니 DB에 담긴 내용을 화면에 표시
	@RequestMapping(value="/getListFromCartAndGoods", method=RequestMethod.GET)
	//@ResponseBody
	public String getListFromCartAndGoods(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		String memId = (String) session.getAttribute("memId"); //로그인 시 세션에 저장한 회원아이디를 가져옴
		Map<String, List> cartMap = cartService.getListFromCartAndGoods(memId); //회원아이디를 가지고 DB에 저장되어있는 장바구니 리스트(상품 정보)를 가져옴
		session.setAttribute("cartMap", cartMap);
		//List<GoodsDTO> goodsList = cartMap.get("goodsList");
		//GoodsDTO sampleGoodsDTO = goodsList.get(3);
		//System.out.println("goodsList.get(3)" + goodsList.get(3));
		//session.setAttribute("sampleGoodsDTO", sampleGoodsDTO);
		System.out.println("CartController.java cartMap : " + cartMap);
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("/cart/cart");
		return "/cart/cart";
	}
	
	
}
