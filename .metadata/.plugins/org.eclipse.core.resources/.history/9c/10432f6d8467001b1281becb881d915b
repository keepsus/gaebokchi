package imageboard.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

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

import imageboard.bean.ImageboardDTO;
import imageboard.bean.ImageboardPaging;
import imageboard.service.ImageboardService;

@Controller
@RequestMapping(value="imageboard")
public class ImageboardController {
	@Autowired
	private ImageboardService imageboardService;
	
	@RequestMapping(value="imageboardWriteForm", method=RequestMethod.GET)
	public String imageboardWriteForm() {
		return "/imageboard/imageboardWriteForm.jsp";
		}
		
/*	
	//name="img" 1개일 경우
	@RequestMapping(value="imageboardWrite", method=RequestMethod.POST)
	@ResponseBody
	public void imageboardWrite(@ModelAttribute ImageboardDTO imageboardDTO,
								@RequestParam MultipartFile img) {
		
		String filePath = "C:\\Study\\Project\\workspace\\SpringMVC\\src\\main\\webapp\\storage";
		String fileName = img.getOriginalFilename();
		File file = new File(filePath, fileName);
		
		//파일 복사
		try {
			FileCopyUtils.copy(img.getInputStream(), new FileOutputStream(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		imageboardDTO.setGoods_filename(fileName);
	}
	
	*/
//---------------------------------------------	
	
//	name="img" 2개일 경우 - 배열로 받는다
	@RequestMapping(value="imageboardWrite", method=RequestMethod.POST)
	@ResponseBody
	public void imageboardWrite(@ModelAttribute ImageboardDTO imageboardDTO,
								@RequestParam MultipartFile[] img) {
		
		String filePath = "C:\\projectworkspace\\uzuslime\\src\\main\\webapp\\storage";
		String fileName;
		File file;
		
		//파일 복사
		if(img[0] != null) {
			fileName = img[0].getOriginalFilename();
			file = new File(filePath, fileName);
			
			try {
				FileCopyUtils.copy(img[0].getInputStream(), new FileOutputStream(file));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			imageboardDTO.setGoods_filename(fileName);
		}else {
			imageboardDTO.setGoods_filename("");
		}
		//----------
		if(img[1] != null) {
			fileName = img[1].getOriginalFilename();
			file = new File(filePath, fileName);
			
			try {
				FileCopyUtils.copy(img[1].getInputStream(), new FileOutputStream(file));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			imageboardDTO.setGoods_filename_detail(fileName);
		}else {
			imageboardDTO.setGoods_filename_detail("");
		}
		imageboardService.imageboardWrite(imageboardDTO);
	}
//---------------------------------------------	
	
//	드래그해서 한번에 여러개의 파일을 선택 

	/*	@RequestMapping(value="imageboardWrite", method=RequestMethod.POST)
	@ResponseBody
	public void imageboardWrite(@ModelAttribute ImageboardDTO imageboardDTO,
								@RequestParam("img[]") List<MultipartFile> list) {
		
		String filePath = "C:\\Study\\Project\\workspace\\SpringMVC\\src\\main\\webapp\\storage";
		
		for(MultipartFile img : list) {
			String fileName = img.getOriginalFilename();
			File file = new File(filePath, fileName);

			//파일 복사
			try {
				FileCopyUtils.copy(img.getInputStream(), new FileOutputStream(file));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			imageboardDTO.setGoods_filename(fileName);
			//imageboardDTO.setImage2("");
			
			//DB
			imageboardService.imageboardWrite(imageboardDTO);
		}//for
	}
	*/
	
	@RequestMapping(value="imageboardList", method=RequestMethod.GET)
	public String imageboardList(@RequestParam(required=false, defaultValue="1") String pg,
								 Model model) {
		
		model.addAttribute("pg", pg);
		model.addAttribute("display", "/imageboard/imageboardList.jsp");
		return "/index";
	}
	
	@RequestMapping(value="getImageboardList", method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView getImageboardList(@RequestParam String pg) {
		//1페이지당 5개씩
		List<ImageboardDTO> list = imageboardService.getImageboardList(pg);
		
		//페이징 처리
		ImageboardPaging imageboardPaging = imageboardService.imageboardPaging(pg);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("pg", pg);
		mav.addObject("list", list);
		mav.addObject("imageboardPaging", imageboardPaging);
		mav.setViewName("jsonView");
		return mav;
	}
	
	@RequestMapping(value="imageboardView", method=RequestMethod.GET)
	public String imageboardView(@RequestParam String goods_id,
								 Model model) {
		model.addAttribute("goods_id", goods_id);
		model.addAttribute("display", "/imageboard/imageboardView.jsp");
		return "/index";
	}
	
	@RequestMapping(value="getImageboardView", method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView getImageboardView(@RequestParam String goods_id) {
		ImageboardDTO imageboardDTO = imageboardService.getImageboardView(goods_id);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("imageboardDTO", imageboardDTO);
		mav.setViewName("jsonView");
		return mav;
	}
	
//	@RequestMapping(value="imageboardDelete", method=RequestMethod.GET)
//	public String imageboardDelete(@RequestParam String[] check, Model model) {
//		imageboardService.imageboardDelete(check);
//		
//		model.addAttribute("display", "/imageboard/imageboardDelete.jsp");
//		return "/index";
//	}
	
	@RequestMapping(value="imageboardDelete", method=RequestMethod.GET)
	public ModelAndView imageboardDelete(String[] check) {
		imageboardService.imageboardDelete(check);
		
		return new ModelAndView("redirect:/imageboard/imageboardList");
	}
}








