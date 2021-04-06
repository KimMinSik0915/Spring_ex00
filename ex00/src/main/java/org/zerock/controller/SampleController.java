package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

/* 자동 생성하는 어노테이션
 * @Controller(웹과의 연결), @Service, @Repository(저장소), @Component(구성요소), @restController(ajax), @Advice(예외처리시)
 * /WEB-INF/spring/root-context.xml 설정이 되어 있어야 한다. component-scan
 */

@Controller
@RequestMapping("/sample")
@Log4j
public class SampleController {

	// 실행할 method
	@RequestMapping("")
	public void basic() {
		
		log.info("basic-----------------------------------");
		
	}
	
}
