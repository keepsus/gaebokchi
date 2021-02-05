package order.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	@RequestMapping(value="orderOneGoodsForm", method=RequestMethod.POST)
	public ModelAndView orderOneGoodsForm(@ModelAttribute GoodsDTO goodsDTO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//로그인 시 session에 담은 회원아이디를 가지고 로그아웃상태인지 로그인 상태인지 확인
		//로그아웃 상태면 제품 정보를 담아 로그인 화면으로 이동
		//로그인이 되면 결제하기 폼으로 이동
		request.setCharacterEncoding("UTF-8"); //request에 담아있는 정보를 UTF-8형식으로 받음
		HttpSession session = request.getSession(); //Session 생성
		String memId = (String)session.getAttribute("memId"); //세션에 담겨있는 회원아이디를 지역변수에 저장
		
		String action = (String) session.getAttribute("action"); //세션에서 action값 받아옴(저장한 것이 없기 때문에 null이 찍힐듯)
		System.out.println("OrderController.java orderOneGoodsForm action : " + action);
		
		
		
		if(memId == null | memId == "") {//로그인 되어있지 않은 경우
			session.setAttribute("goodsOrderInfo", goodsDTO);//제품 상세페이지에서 구매하려한 제품의 정보를 담음
			session.setAttribute("action", "/order/orderOneGoodsForm");//로그인 후 다시 결제하기 페이지로 갈 수 있도록 함
			return new ModelAndView("redirect:/member/memberLoginForm"); //로그인 할 수 있게 로그인폼으로 연결
		}else { //로그인 되어있는 경우
			if(action != null && action.equals("/order/orderOneGoodsForm")) { //로그인 페이지로 갔다가 다시 돌아온 경우 여기로 이동
				session.removeAttribute("action"); //본 컨트롤러로 다시 오지 못하도록 해당 세션 삭제
				goodsDTO = (GoodsDTO) session.getAttribute("goodsOrderInfo"); //로그인 화면으로 가기전에 session에 담아두었던 제품 정보를 다시 DTO에 저장(ArrayList에 담아주기 위해)

				//강사님께 질문
//				OrderDTO orderDTO = new OrderDTO();
//				orderDTO.setMember_id(memberDTO.getMember_id());
//				orderDTO.setGoods_id(goodsDTO.getGoods_id()); //★★★★★Goods | getter명 확인
//				orderDTO.setGoods_title(goodsDTO.getGoods_title()); //★★★★★Goods | getter명 확인
//				orderDTO.setOrder_goods_qty(goodsDTO.getOrder_goods_qty); //★★★★★Goods | getter명 확인
//				orderDTO.setGoods_filename(goodsDTO.getGoods_filename); //★★★★★Goods | getter명 확인
//				orderDTO.set
			}	
			
			//결제하기 폼으로 상품상세정보와 회원정보를 담을 그릇
//			Map<String, Object> map = new HashMap<String, Object>();
//			map.put("goodsDTO", goodsDTO);
//			map.put("memberDTO", memberDTO);
//			mav.addObject(map);
			
			
			//로그인한 회원정보를 담을 그릇 ★★★★★ 그냥 session에 담긴 내용 사용할지?
			MemberDTO memberDTO = (MemberDTO) session.getAttribute("memDTO"); //★★★★★이 부분 Login담당자와 협의 후 담아달라고 해야함, Session에 있는 내용을 사용하는게 좋을지 MemberDTO에 담아 Map을 사용할지?
			ModelAndView mav = new ModelAndView();
			mav.addObject(goodsDTO);
			mav.addObject(memberDTO);
			mav.setViewName("/order/order"); //"/order/order.jsp?"
			return mav;
		}
		
		

		//로그인 기능과 조합 후 하기(로그아웃 상태일때 로그인 화면으로 이동, 로그인 상태면 폼으로 이동)
		//1. GoodsDTO 매개변수 추가 및 @ModelAttribute 선언 - 주문하는 상품 정보 받기
		//2. 주문자 정보(로그인한 회원정보) session으로 받아오기
		//3. 매개변수에 HttpSession 추가
		//HttpSession session = request.getSession();
		
	}
	 
	
	
	//[Controller2] 결제창에서 결제하기 버튼을 누르면 해당 컨트롤이 호출되어 DB에 주문내역이 저장됨
	@RequestMapping(value="orderOneGoods", method=RequestMethod.POST)
	public ModelAndView orderOneGoods(@ModelAttribute OrderDTO orderDTO) {
		
		orderService.orderOneGoods(orderDTO); //결체창에서 넘어온 값들이 담긴 orderDTO객체
		System.out.println("orderController - orderDTO" + orderDTO.getOrderer_name());
		ModelAndView mav = new ModelAndView();
		
		if(orderDTO.getPay_method().equals("kakao")) {
			mav.addObject(orderDTO);
			mav.setViewName("/order/kakao");
			
		}else if(orderDTO.getPay_method().equals("iche")){
			
			
		}
		
		return mav;
		
		//로그인 기능과 조합 후 하기
		//1. 매개변수에 OrderDTO _orderDTO, HttpServletRequest request, HttpServletResponse response로그인 화면에서 로그인 후, 다시 주문페이지로 돌아오기
		//request.setCharacterEncoding("UTF-8");
		//HttpSession session = request.getSession(); //세션생성
		
		
		//데이터 값 정상 입력 확인용(나중에 삭제)
		//System.out.println(_orderDTO.getGoods_id());
		
		if(su == 1) {
			return "입력성공";
		}else{
			return "입력실패";
		}
		
	}
	


	//장바구니에 담긴 상품 주문하기
	public ModelAndView orderFromCartGoods(String[] cart_goods_qty, HttpServletRequest request,  HttpServletResponse response) throws Exception {
			
		return null;
	}

	
	//주문결과 표시

	public ModelAndView payToOrderGoods(Map<String, String> orderMap, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	

	

	





}
