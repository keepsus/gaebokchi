package order.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import goods.bean.GoodsDTO;
import member.bean.MemberDTO;
import order.bean.OrderDTO;
import order.service.OrderService;


@Controller
@RequestMapping(value="order")
public class OrderController{
	
	@Autowired
	private OrderService orderService;
	
	//[Controller1] 상품 상세 페이지에서 한 개의 상품을 주문하는 경우 주문페이지 표시
	@RequestMapping(value="/orderOneGoodsForm", method=RequestMethod.POST)
	public ModelAndView orderOneGoodsForm(@RequestParam Map map, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(map);
		//로그인 시 session에 담은 회원아이디를 가지고 로그아웃상태인지 로그인 상태인지 확인
		//로그아웃 상태면 제품 정보를 담아 로그인 화면으로 이동
		//로그인이 되면 결제하기 폼으로 이동
		request.setCharacterEncoding("UTF-8"); //request에 담아있는 정보를 UTF-8형식으로 받음
		HttpSession session = request.getSession(); //Session 생성
		String memId = (String)session.getAttribute("memId"); //세션에 담겨있는 회원아이디를 지역변수에 저장
		
		String action = (String) session.getAttribute("action"); //세션에서 action값 받아옴(저장한 것이 없기 때문에 null이 찍힐듯)
		System.out.println("OrderController.java orderOneGoodsForm action : " + action);
		
		
		
//		if(memId == null | memId == "") {//로그인 되어있지 않은 경우
//			session.setAttribute("goodsOrderInfo", goodsDTO);//제품 상세페이지에서 구매하려한 제품의 정보를 담음
//			session.setAttribute("action", "/order/orderOneGoodsForm");//로그인 후 다시 결제하기 페이지로 갈 수 있도록 함
//			return new ModelAndView("redirect:/member/memberLoginForm"); //로그인 할 수 있게 로그인폼으로 연결
//		}else { //로그인 되어있는 경우
//			if(action != null && action.equals("/order/orderOneGoodsForm")) { //로그인 페이지로 갔다가 다시 돌아온 경우 여기로 이동
//				session.removeAttribute("action"); //본 컨트롤러로 다시 오지 못하도록 해당 세션 삭제
//				goodsDTO = (GoodsDTO) session.getAttribute("goodsOrderInfo"); //로그인 화면으로 가기전에 session에 담아두었던 제품 정보를 다시 DTO에 저장(ArrayList에 담아주기 위해)
//
//				
//			}	
//			
//			//결제하기 폼으로 상품상세정보와 회원정보를 담을 그릇
////			Map<String, Object> map = new HashMap<String, Object>();
////			map.put("goodsDTO", goodsDTO);
////			map.put("memberDTO", memberDTO);
////			mav.addObject(map);
//			
//			
//			//로그인한 회원정보를 담을 그릇 ★★★★★ 그냥 session에 담긴 내용 사용할지?
//			MemberDTO memberDTO = (MemberDTO) session.getAttribute("memDTO"); //★★★★★이 부분 Login담당자와 협의 후 담아달라고 해야함, Session에 있는 내용을 사용하는게 좋을지 MemberDTO에 담아 Map을 사용할지?
//			ModelAndView mav = new ModelAndView();
//			OrderDTO orderDTO = new OrderDTO();
//			orderDTO.setDetail_or_cart(1);
//			mav.addObject(orderDTO);
//			mav.addObject(goodsDTO);
//			mav.addObject(memberDTO);
//			mav.setViewName("/order/order"); //"/order/order.jsp?"
//			return mav;
//		}
		
		return null;

		//로그인 기능과 조합 후 하기(로그아웃 상태일때 로그인 화면으로 이동, 로그인 상태면 폼으로 이동)
		//1. GoodsDTO 매개변수 추가 및 @ModelAttribute 선언 - 주문하는 상품 정보 받기
		//2. 주문자 정보(로그인한 회원정보) session으로 받아오기
		//3. 매개변수에 HttpSession 추가
		//HttpSession session = request.getSession();
		
	}//[Controller1]orderOneGoodsForm
	 
	
	
	//[Controller2]장바구니에 담긴 상품 주문하기
	public ModelAndView orderFromCartGoods(String[] cart_goods_qty, HttpServletRequest request,  HttpServletResponse response) throws Exception {
		//장바구니 연결 후 처리할 내용
		//1.파라미터
		//  @RequestParam String[] cart_goods_qty(132번줄)
		//2. for문 안 split수정(147번줄)
		//3. 로그인한 회원정보 한번 MemberDTO객체에 저장하고 다시 session에 넣을 필요 있는 지 확인(140, 164, 174번줄)  
		
		//[1]DB에 저장된 내용(미리 Session에 담아둔 내용) 가져오기
		HttpSession session = request.getSession();
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("memDTO");
		Map<String, List> cartMap = (Map<String, List>) session.getAttribute("cartMap"); //장바구니에서 저장한 cartList와 goodsList가 담겨있음
		List<GoodsDTO> goodsList = cartMap.get("goodsList");
		
		//[2] [1]의 goodsList와 cart.jsp에서 가져온 내용(체크박스가 선택된 내용)을 비교하여 일치하는 goods_id를 orderDTO에 저장(주문)
		int countOrderQty = 0; //전체 주문 상품 갯수용(결체창에서 ~외 X개)
		List<OrderDTO> orderList = new ArrayList<OrderDTO>();
		for(int i = 0; i < cart_goods_qty.length; i++) {
			//★★★★★★★★★★jsp에서 전달되는 값 형태 확인 후, 수정
			String[] cart_goods = cart_goods_qty[i].split(":");
			
			for(int j = 0; j < goodsList.size(); j++) {
				GoodsDTO goodsDTO = goodsList.get(j); //goodsList에서 상품별로 꺼내와서 DTO객체에 저장
				String goods_id = goodsDTO.getGoods_id();
				
				if(goods_id.equals(cart_goods[0])) { //DB에 저장된 상품번호와 jsp에서 넘어온 상품번호 비교하여 일치하면
					++countOrderQty;
					OrderDTO orderDTO = new OrderDTO();
					orderDTO.setGoods_id(goods_id);
					orderDTO.setGoods_title(goodsDTO.getGoods_title());
					orderDTO.setGoods_sales_price(goodsDTO.getGoods_sales_price()); //실제 적용할 상품단가
					orderDTO.setGoods_image0(goodsDTO.getGoods_image0());
					orderDTO.setOrder_goods_qty(Integer.parseInt(cart_goods[1]));
					orderDTO.setMember_id(memberDTO.getMember_id());
					orderDTO.setPlural_num(countOrderQty - 1); //대표상품을 제외한 상품 종류 수 
					orderDTO.setDetail_or_cart(2);
					orderList.add(orderDTO);
					break;
				}//if
				
			}//for j
			
		}//for i
		ModelAndView mav = new ModelAndView();
		Map<String, List> orderMap = new HashMap<String, List>();
		orderMap.put("orderList", orderList);
		session.setAttribute("orderMap",orderMap);
		//session.setAttribute("orderList", orderList); //세션에 orderList추가
		//session.setAttribute("orderer", memberDTO); //이미 memDTO 저장되어있어 세션에 저장할 필요 없을 것 같음
		mav.addObject(orderMap);
		mav.setViewName("/order/order");	
		return mav;
	}

	
	//[Controller3] 결제창에서 결제하기 버튼을 누르면 해당 컨트롤이 호출되어 DB에 주문내역이 저장됨
	@RequestMapping(value="/orderGoods", method=RequestMethod.POST)
	public ModelAndView orderGoods(@ModelAttribute OrderDTO orderDTO) {
		
		//로그인 기능과 조합 후 하기
		//1. 매개변수에 OrderDTO _orderDTO, HttpServletRequest request, HttpServletResponse response로그인 화면에서 로그인 후, 다시 주문페이지로 돌아오기
		//request.setCharacterEncoding("UTF-8");
		//HttpSession session = request.getSession(); //세션생성
		
		//결제 방법에 따라 다른 곳으로 이동
		//1. 176~182번줄 jQuery에서 if문으로 처리, 안되는 경우 주석지우기
		
		//데이터 값 정상 입력 확인용(나중에 삭제)
		//System.out.println(_orderDTO.getGoods_id());
		orderService.orderOneGoods(orderDTO); //결체창에서 넘어온 값들이 담긴 orderDTO객체
		System.out.println("orderController - orderDTO" + orderDTO.getOrderer_name());
		ModelAndView mav = new ModelAndView();
		mav.addObject(orderDTO);
		
		
//		if(orderDTO.getPay_method().equals("kakao")) { //결제수단으로 카카오페이가 선택되어있으면 카카오페이로 연결
//			mav.setViewName("/order/kakao");
//			
//		}else{ //결제수단으로 무통장입금이 선택되어 있으면 주문확인 화면으로 이동
//			//★★★★★★★추후, 계좌이체/신용카드는 별도 구현예정
//			mav.setViewName("/order/payToOrderGoods");
//		}
		
		return mav;
	}
		
	
	//----------------------------------------------카카오 페이----------------------------------------------------
	//[Controller4] 결제방법으로 카카오페이를 선택한 경우 카카오페이 API로 연결
	@RequestMapping(value="/kakaoPayReady", method=RequestMethod.POST)
	public void kakaoPayReady(Map<String,String> map, HttpServletRequest request, HttpServletResponse response) {
		
		//확인사항
		//1. 파라미터
		//결제버튼 클릭 후 DB에 저장된 내용을 orderDTO로 받아오기
		//2. 반환값
		//mav.setViewName 확인하기
//		ModelAndView mav = new ModelAndView();
//		mav.addObject(orderDTO);
//		mav.setViewName("/order/kakaopay.jsp");
//		return mav;
		
		orderService.kakaoPayReady(map);
		
	}
	
	
	//----------------------------------------------카카오 페이 끝----------------------------------------------------
	
	//[Controller5] 결제 완료 후 주문결과 표시
	@RequestMapping(value="/payToOrderGoods", method=RequestMethod.POST)
	public ModelAndView payToOrderGoods(@RequestParam Map<String, String> payMap, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/order/orderPayResult");
		return mav;
	}


	

	

	





}
