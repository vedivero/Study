package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.ProductVO;

	//Redirect를 해야 하는 경우
	//특정 Controller logic을 처리할 때 다른 경로를 호출해야 하는 경우
	// = redirect:를 이용  ' : '의 사용을 주의

	//RedirectAttributes = URI에 보이지 않게 Data를 전달

@Controller
public class SampleController4 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr) {
						
		logger.info("doE called but redirect to /doF");
		
		rttr.addFlashAttribute("msg", "This is ths Message, with redirected");
		
		return "redirect:/doF";
	}
		
	@RequestMapping("/doF")
	public void doF(@ModelAttribute String msg) {
		logger.info("doF called"+msg);
	}
	
}
