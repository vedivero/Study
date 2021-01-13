package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVO;

	//만들어진 결과 Data를 전달해야 하는 경우

@Controller		//이 클래스를 Controller로 설정하게 하는 Annotation
public class SampleController3 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("/doD")		//URI가 '/doD'인 경우, 해당 method를 동작한다는 것을 의미
	public String doD(Model model){	
					//Model이라는 Class를 Parameter로 사용(Spring에서 기본적으로 제공하는 Class)
					//용도 = View에 원하는 Data를 전달하는 일종의 Container or 상자의 역할(전달하는 가방)
		
		//make sample data
		ProductVO product = new ProductVO("Sample Product",10000);
		//doD객체 내부에서 ProducVO객체를 생성
		//이 객체를 Model이라는 객체를 이용해서 필요한 Data를 담아 View(.jsp)로 전달
		
		logger.info("doD");
		
		//ProductVO 객체를 보관
		model.addAttribute(product);
		//addAttibute method를 이용한 두 가지 형태
		//1.addAttribute("name",object) :객체에 이름을 부여, View에서 이름값으로 객체를 처리
		//2.addAttribute(object) : 객체의 Class명 앞 글자를 소문자로 처리한 Class명을 "name"으로 간주
		//		ex) ProductVO → productVO
		
		
		return "productDetail";
	}
}
