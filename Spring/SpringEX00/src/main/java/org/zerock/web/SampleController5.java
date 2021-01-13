package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

	//JSON Data를 생성하는 경우
	//Spring MVC장점 : JSON Data에 대한 처리를 굉장히 간단하게 처리

@Controller
public class SampleController5 {

	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {
			//return type = @ResponseBody	= 일반객체를 return = JSON처리 끝
		
		ProductVO vo = new ProductVO("Sample Product",30000);
		
		return vo;
		
	}
	
		
}
