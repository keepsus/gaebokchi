package order.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import lombok.extern.java.Log;
import order.bean.KakaoPayApprovalDTO;
import order.bean.KakaoPayReadyDTO;
import order.bean.OrderDTO;
import order.dao.OrderDAO;

@Log
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;
	
	private static final String HOST = "https://kapi.kakao.com";
	private KakaoPayReadyDTO kakaoPayReadyDTO;
	private KakaoPayApprovalDTO kakaoPayApprovalDTO;
	
	
	
	@Override
	public int orderOneGoods(OrderDTO orderDTO) {
		return orderDAO.orderOneGoods(orderDTO);
	}

	
	
	//-----------------------------------------------카카오 페이-------------------------------------------------
	//카카오페이 결제 준비&요청 단계(https://developers.kakao.com/docs/latest/ko/kakaopay/single-payment)
	//결제를 시작하기 위해 상세 정보를 카카오페이 서버에 전달하고 결제 고유 번호(TID)를 받는 처리
	//[1]Admin키를 헤더에 담아 파라미터 값들과 함께 POST로 요청
	//[2]요청이 성공하면 응답 바디에 JSON객체로 다음 단계 진행을 위한 값들을 수신
	//[3]서버에는 tid를 저장하고, 클라이언트는 사용자 환경에 맞는 URL로 리다이렉트
	@Override
	public String kakaoPayReady(Map<String, String> map) {
		
		RestTemplate restTemplate = new RestTemplate(); //Http서버와 통신
		
		//[1]서버로 요청할 Header
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK a7f90245eef319bdb8e47a3d70e365ee"); //★★★★★space키 나중에 안되면 지워보기, admin키 삭제하기
		headers.add("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
		headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE + ";charset=UTF-8");
		
		//[2]서버로 요청할 Body
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("cid", "TC0ONETIME"); //테스트 결제용 가맹점 코드
		
		//이 이후부터 order.jsp에서 넘겨주는지 확인해야 함
		params.add("partner_order_id", map.get("order_id"));
        params.add("partner_user_id", map.get("member_id"));
        params.add("item_name", map.get("goods_title"));
        params.add("quantity", map.get("order_goods_qty"));
        params.add("total_amount", map.get("total_order_price"));
        params.add("tax_free_amount", "0");
        params.add("approval_url", "http://localhost:8080/order/kakaoPaySuccess");
        params.add("cancel_url", "http://localhost:8080/order/kakaoPayCancel");
        params.add("fail_url", "http://localhost:8080/order/kakaoPayFail");
        
        //값 확인
        System.out.println("OrderServiceImpl.java kakaoPayReady() partner_order_id : " + map.get("order_id"));
        System.out.println("OrderServiceImpl.java kakaoPayReady() partner_user_id : " + map.get("member_id"));
        System.out.println("OrderServiceImpl.java kakaoPayReady() item_name : " + map.get("goods_title"));
        System.out.println("OrderServiceImpl.java kakaoPayReady() quantity : " + map.get("order_goods_qty"));
        System.out.println("OrderServiceImpl.java kakaoPayReady() total_amount : " + map.get("total_order_price"));
        
		
        HttpEntity<MultiValueMap<String, String>> body = new HttpEntity<MultiValueMap<String, String>>(params, headers);
        
        
        
        try {
        
        kakaoPayReadyDTO = restTemplate.postForObject(new URI(HOST + "/v1/payment/ready"), body, KakaoPayReadyDTO.class);
        
        System.out.println("OrderServiceImpl.java kakaoPayReady() kakaoPayReadyDTO.getNext_redirect_pc_url() : " + kakaoPayReadyDTO.getNext_redirect_pc_url());
		return kakaoPayReadyDTO.getNext_redirect_pc_url();
		
        }catch (RestClientException e) {
        	System.out.println("RestClientException OrderServiceImpl 요청.java");
             e.printStackTrace();
        } catch (URISyntaxException e) {
        	System.out.println("RURISyntaxException OrderServiceImpl 요청.java");
            e.printStackTrace();
        }
        
        //return "/order/kakaoPayFail"; 
        return "/pay";
	}
	
	
	//카카오 페이 결제 승인
	public KakaoPayApprovalDTO kakaoPayInfo(String pg_token) {
		RestTemplate restTemplate = new RestTemplate();//Http서버와 통신
		
		//서버로 요청할 Header
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK a7f90245eef319bdb8e47a3d70e365ee"); //★★★★★space키 나중에 안되면 지워보기, admin키 삭제하기
		headers.add("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
		headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE + ";charset=UTF-8");

		//서버로 요청할 Body
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("cid", "TC0ONETIME"); //테스트 결제용 가맹점 코드
		params.add("tid", kakaoPayReadyDTO.getTid()); //거래일련번호
//		params.add("partner_order_id", map.get("order_id"));
//        params.add("partner_user_id", map.get("member_id"));
//        params.add("pg_token", pg_token);
//        params.add("total_amount", map.get("total_order_price"));
		params.add("partner_order_id", "0");
        params.add("partner_user_id", "0");
        params.add("pg_token", pg_token);
        params.add("total_amount", "0");
        
        //값 확인
//        System.out.println("OrderServiceImpl.java kakaoPayInfo() partner_order_id : " + map.get("order_id"));
//        System.out.println("OrderServiceImpl.java kakaoPayInfo() partner_user_id : " + map.get("member_id"));
//        System.out.println("OrderServiceImpl.java kakaoPayInfo() pg_token : " + map.get("pg_token"));
//        System.out.println("OrderServiceImpl.java kakaoPayInfo() total_amount : " + map.get("total_order_price"));

        HttpEntity<MultiValueMap<String, String>> body = new HttpEntity<MultiValueMap<String, String>>(params, headers);
	
        try {
            kakaoPayApprovalDTO = restTemplate.postForObject(new URI(HOST + "/v1/payment/approve"), body, KakaoPayApprovalDTO.class);
            System.out.println("OrderServiceImpl.java kakaoPayInfo() kakaoPayApprovalDTO : " + kakaoPayApprovalDTO);
          
            return kakaoPayApprovalDTO;
        
        } catch (RestClientException e) {
        	System.out.println("RestClientException OrderServiceImple.java 승인");
            e.printStackTrace();
       } catch (URISyntaxException e) {
       	System.out.println("RURISyntaxException OrderServiceImple.java 승인");
           e.printStackTrace();
       }
        
        return null;
	}

}
