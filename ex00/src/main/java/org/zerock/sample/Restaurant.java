package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

/* 자동 생성하는 어노테이션
 * @Controller, @Service, @Repository(저장소), @Component, @restController, @Advice(예외처리시)
 * /WEB-INF/spring/root-context.xml 설정이 되어 있어야 한다. component-scan
 */

@Component 
@Data
public class Restaurant {

	// @Setter = lombok 라이브러리 중 @Autowired(Spring 라이브러리 사용)
	// 대신 사용 가능한 어노테이션 = @Autowired(Spring에서 사용), @inject(java에서 사용)
	@Setter(onMethod_ = @Autowired)		
	private Chef chef;
	
	
}
