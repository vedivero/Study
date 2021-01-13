package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

	//return type이 'void'인 경우 = Spring MVC는 현재 경로에 해당하는 JSP file을 실행한다.

@Controller		//이 클래스를 Controller로 설정하게 하는 Annotation
public class SampleController {

	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("doA")		//특정 URI경로에 해당하면 method가 실행
	public void doA() {
		logger.info("doA called");
	}
	@RequestMapping("doB")
	public void doB() {
		logger.info("doB called");
	}
}
