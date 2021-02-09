package goods.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import goods.bean.GoodsDTO;
import goods.bean.GoodsPaging;
import goods.service.GoodsService;


@Controller
@RequestMapping(value="goods")
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	
	
	
	//(myPage 전용)제품등록화면 폼을 display 뿌려주는 메소드
	@RequestMapping(value="goodsWriteForm", method=RequestMethod.GET)
	public String goodsWriteForm(Model model) {
		model.addAttribute("display", "/goods/goodsWriteForm.jsp");
		return "../mypage/myPageOrder";
	}//end of goodsWitreForm method
	

	
	
	
	
	//(myPage 전용)실제 제품등록화면	//name="img" 2개 이상일 경우, 배열로 받는다.
	@RequestMapping(value="goodsWrite", method=RequestMethod.POST)
	@ResponseBody
	public void goodsWrite(@ModelAttribute GoodsDTO goodsDTO,
						   @RequestParam MultipartFile[] img) {
		
		//storage : 가상폴더
		String filePath = "D:\\workproject\\main\\uzuslime\\src\\main\\webapp\\storage";	//가상폴더 위치 가져온다.
		String fileName;	//원래 이름으로 바꾸어줌!
		File file;			//파일 생성!
		
		//파일복사
		//메인 이미지
		if(img[0] != null) {
			fileName = img[0].getOriginalFilename();
			file = new File(filePath, fileName);
			try {
				FileCopyUtils.copy(img[0].getInputStream(), new FileOutputStream(file));
			} catch (IOException e) {			
				e.printStackTrace();
			}
		
			goodsDTO.setGoods_image0(fileName);			
		}else {
			goodsDTO.setGoods_image0("");	
		}
		//서브 이미지
		if(img[1] != null) {
			fileName = img[1].getOriginalFilename();
			file = new File(filePath, fileName);
			try {
				FileCopyUtils.copy(img[1].getInputStream(), new FileOutputStream(file));
			} catch (IOException e) {			
				e.printStackTrace();
			}	
			
			goodsDTO.setGoods_image1(fileName);			
		}else {
			goodsDTO.setGoods_image1("");
		}
		//설명
		if(img[2] != null) {
			fileName = img[2].getOriginalFilename();
			file = new File(filePath, fileName);
			try {
				FileCopyUtils.copy(img[1].getInputStream(), new FileOutputStream(file));
			} catch (IOException e) {			
				e.printStackTrace();
			}	
			
			goodsDTO.setGoods_image1(fileName);			
		}else {
			goodsDTO.setGoods_image1("");
		}
		System.out.println(goodsDTO);
		//DB
		goodsService.goodsWrite(goodsDTO);
	
	}//end of imageboardWrite method
	
	
	
	
	
	
	
	//(myPage 용)제품 리스트를 display 뿌려주는 메소드
	@RequestMapping(value="goodsList", method=RequestMethod.GET)
	public String goodsList(@RequestParam(required=false, defaultValue="1") String pg, Model model) {
		//페이지 처리할때 startNum, endNum 안하고
		//jQuery 로 사용할꺼임, 바로 jsp 로 가야함 -> ???? 이게 뭔말이여???
		model.addAttribute("pg",pg);		
		model.addAttribute("display", "/goods/goodsList.jsp");
		
		return "../mypage/myPageOrder";		
	}//end of goodsList method	
	
	//(index 용)제품 리스트를 display 뿌려주는 메소드
	@RequestMapping(value="goodsIndexList", method=RequestMethod.GET)
	public String goodsIndexList(@RequestParam(required=false, defaultValue="1") String pg,	Model model) {
		//페이지 처리할때 startNum, endNum 안하고
		//jQuery 로 사용할꺼임, 바로 jsp 로 가야함 -> ???? 이게 뭔말이여???
		model.addAttribute("pg",pg);		
				
		return "/index";		
	}//end of goodsIndexList method
	
		
	
	
	
	
	
	//(myPage 용) pg들고 DB에 가서 DTO를 가져오는 메소드-----
	@RequestMapping(value="getGoodsList", method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView getGoodsList(@RequestParam String pg) {
		//Service 가서 data 를 가져와야함
		//1페이지당 5개씩
		List<GoodsDTO> list = goodsService.getGoodsList(pg);
		//System.out.println("(Controller)getGoodsList"+list);	//정상작동 확인
		
		//페이징 처리
		GoodsPaging goodsPaging = goodsService.goodsPaging(pg);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("pg", pg);
		mav.addObject("list", list);
		mav.addObject("goodsPaging", goodsPaging);
		mav.setViewName("jsonView");
		
		return mav;		//이거 하면 위에 3개에 대한 정보가 imageboardList.jsp 에 ajax 부분에 success 의 data 로 들어간다.
	}//end of getGoodsList  method	
	
	//(index 용) index에는 DB등록된 전체 자료를 뿌려주기 때문에 DB에 가져가는 건 없고 DTO를 가져오는 메서드-----
	@RequestMapping(value="getGoodsIndexList", method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView getGoodsIndexList() {
		List<GoodsDTO> list = goodsService.getGoodsIndexList();
		System.out.println("getGoodsIndexList - (cont) list 작동여부 체크!!"+list);
				
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);		
		mav.setViewName("jsonView");
		
		System.out.println("getGoodsIndexList - (cont) mav 작동여부 체크!!"+mav);
		
		return mav;		//이거 하면 위에 list에 대한 정보가 imageboardList.jsp 에 ajax 부분에 success 의 data 로 들어간다.
	}//end of getGoodsIndexList method
	
	
	
	
	
	
		
	//(myPage 용)제품상세 화면-----
	@RequestMapping(value="goodsView", method=RequestMethod.GET)
	public String goodsView(@RequestParam String seq,
							@RequestParam String pg,
							Model model) {
		model.addAttribute("seq", seq);
		model.addAttribute("pg", pg);
		model.addAttribute("display", "/goods/goodsView.jsp");
		return "../mypage/myPageOrder";
	}//end of goodsView method	
	
	//(index 용)제품상세 화면(DB에 있는 전체 자료를 뿌려야 하기 때문에 pg값 불필요)-----
	@RequestMapping(value="goodsIndexView", method=RequestMethod.GET)
	public String goodsIndexView(@RequestParam String seq,								
								 Model model) {	
		model.addAttribute("seq", seq);		
		return "../goods/goodsIndexView";		
	}//end of goodsIndexView method
		

	
	
	
	
	
	
	//(myPage, index 공용)제품상세화면에 뿌려 정보 가져오는 메소드, seq 들고가서 goodsDTO 들고 나옴-----
	@RequestMapping(value="getGoodsView", method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView getGoodsView(@RequestParam String seq) {
		GoodsDTO goodsDTO = goodsService.getGoodsView(seq);
		System.out.println("getGoodsView - (cont) : goodsDTO 작동여부 확인!!"+goodsDTO);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsDTO", goodsDTO);
		mav.setViewName("jsonView");		
		return mav;		
	}//end of getGoodsView method
	
	
	
	
	
	
	
	//(myPage 전용)goodsDelete-----
	//myPage에서 제품상세보기에서 checkBox 선택하고 삭제하면 작동됨
	@RequestMapping(value="goodsCheckDelete", method=RequestMethod.GET)
	public ModelAndView goodsCheckDelete(@RequestParam String[] check) {
		//imageboardList.jsp 에서 name:'check' 로 해놔서 여기에서도 check 이름으로 들어온다.
		goodsService.goodsCheckDelete(check);
				
		return new ModelAndView("redirect:/goods/goodsList");	//이러면 alert 창이 안뜬다.	//delete.jsp 거치지 않는다.
		//dispatcher 갔다가 controller 로 바로 넘어오라
		//jsp 를 거치지 않아서 메시지는 못 뿌린다.
	}//end of goodsDelete method
	
	
	//myPage에서 제품상세보기에서 제품상세 페이지에서 삭제 클릭 했을경우 작동됨
	@RequestMapping(value="goodsViewDeleteForm", method=RequestMethod.POST)
	public String goodsViewDeleteForm(@RequestParam String seq, Model model) {
		//boardService.boardDelete(seq);	//jQuery 안써서 alert 창 떳을때 화면이동 된다. jQuery 사용해 보자.
		
		model.addAttribute("seq", seq);
		model.addAttribute("display", "/goods/goodsViewDelete.jsp");
		return "../mypage/myPageOrder";
	}
	
	@RequestMapping(value="goodsViewDelete", method=RequestMethod.POST)
	@ResponseBody
	public void goodsViewDelete(@RequestParam String seq, Model model) {
		goodsService.goodsViewDelete(seq);
	}
	
	
	
	
	//(myPage 전용)등록제품 수정 폼을 display 에 뿌려주는 메서드
	@RequestMapping(value="goodsModifyForm", method=RequestMethod.POST)
	public String goodsModifyForm(@RequestParam String seq,
								  @RequestParam String pg,
								  Model model) {
		model.addAttribute("seq", seq);
		model.addAttribute("pg", pg);
		model.addAttribute("display", "/goods/goodsModifyForm.jsp");
		return "../mypage/myPageOrder";
	}//end of goodsModifyForm method
	
	
	//
	@RequestMapping(value="getGoods", method=RequestMethod.POST)
	public ModelAndView getGoods(@RequestParam String seq) {
		GoodsDTO goodsDTO = goodsService.getGoods(seq);	//순서가 중요하다, 조회수 방지하고나서 가져와야 한다.
		System.out.println("getGoods - (cont) : seq 가져가서 DTO 가져오는지 확인!"+goodsDTO);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsDTO", goodsDTO);
		mav.setViewName("jsonView");
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
}//end of imageboardController class
	
	
	
	
	
	
	
	

