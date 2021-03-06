//package order.controller;
//
//
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import order.bean.OrderDTO;
//import order.service.OrderService;
//
//
//@Controller
//@RequestMapping(value="/order")
//public class ExOrderController{
//	
//	@Autowired
//	private OrderService orderService;
//	
//	@Autowired
//	private OrderDTO orderDTO;
//
//	
////	//[Controller1] 상품 상세 페이지나 장바구니에서 한 개의 상품을 주문하는 경우 주문페이지 표시
////	@RequestMapping(value="orderOneGoodsForm", method=RequestMethod.GET)
////	public String orderOneGoodsForm() {
////		
////		return "/order/order";
////
////		//로그인 기능과 조합 후 하기(로그아웃 상태일때 로그인 화면으로 이동, 로그인 상태면 폼으로 이동)
////		//1. GoodsDTO 매개변수 추가 및 @ModelAttribute 선언 - 주문하는 상품 정보 받기
////		//2. 주문자 정보(로그인한 회원정보) session으로 받아오기
////		//3. 매개변수에 HttpSession 추가
////		//HttpSession session = request.getSession();
////		
////	}
//	
//	//[Controller1] 상품 상세 페이지나 장바구니에서 한 개의 상품을 주문하는 경우 주문페이지 표시
//	@RequestMapping(value="orderOneGoodsForm", method=RequestMethod.POST)
//	public String orderOneGoodsForm(HttpSession session) {
//		
//		
//		String memId = (String)session.getAttribute("memId");
//		
//		if(memId == null | memId == "") {
//			return "/order/member/memberLoginForm";
//		}else {
//			return "/order/order";
//		}
//		
//		
//
//		//로그인 기능과 조합 후 하기(로그아웃 상태일때 로그인 화면으로 이동, 로그인 상태면 폼으로 이동)
//		//1. GoodsDTO 매개변수 추가 및 @ModelAttribute 선언 - 주문하는 상품 정보 받기
//		//2. 주문자 정보(로그인한 회원정보) session으로 받아오기
//		//3. 매개변수에 HttpSession 추가
//		//HttpSession session = request.getSession();
//		
//	}
//	 
//	
//	
//	//상품 상세 페이지에셔 주문한 경우 orderOneGoods가 요청됨
//	@RequestMapping(value="orderOneGoods", method=RequestMethod.POST)
//	public String orderOneGoods(@ModelAttribute OrderDTO orderDTO) {
//		
//		int su = orderService.orderOneGoods(orderDTO);
//		System.out.println("orderController - orderDTO" + orderDTO.getOrderer_name());
//		
//		return "/index";
//		
//		//로그인 기능과 조합 후 하기
//		//1. 매개변수에 OrderDTO _orderDTO, HttpServletRequest request, HttpServletResponse response로그인 화면에서 로그인 후, 다시 주문페이지로 돌아오기
//		//request.setCharacterEncoding("UTF-8");
//		//HttpSession session = request.getSession(); //세션생성
//		
//		
//		//데이터 값 정상 입력 확인용(나중에 삭제)
//		//System.out.println(_orderDTO.getGoods_id());
//		
//	}
//	
//
//	
//	//★★★★★ 중간 발표 이후 구현 ★★★★★
//	//장바구니에 담긴 상품 주문하기
//
//	public ModelAndView orderFromCartGoods(String[] cart_goods_qty, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//	//주문결과 표시
//	@RequestMapping(value="payToOrderGoods", method=RequestMethod.POST)
//	public ModelAndView payToOrderGoods(@RequestParam Map<String, String> payMap, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		//List<OrderDTO> myOrderList = 세션값 받아오기
//		return null;
//	}
//
//
//	
//
//	
//
//	
//
//
//
//
//
//}
