package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

	//return type이 'String'인 경우 

@Controller		//이 클래스를 Controller로 설정하게 하는 Annotation
public class SampleController2 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("doC")		//URI가 '/doC'인 경우, 해당 method를 동작한다는 것을 의미
	public String doC(@ModelAttribute("msg") String msg) {
						//request(요청)시, 'msg'이름의 parameter를 문자열로 처리하고 View에 전달되도록 한다.
		logger.info("doC called");
		
		return "result";	//결과적으로 /WEB-INF/views/result.jsp file을 찾아서 실행한다.
	}
}
