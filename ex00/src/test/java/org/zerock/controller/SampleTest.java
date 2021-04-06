package org.zerock.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.sample.Restaurant;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")	// 객체 생성이나 DI 적용이 안되기 때문
@Log4j	// 로그 객체를 사용하기 위한 지정
public class SampleTest {

	// 자동 DI : 생성된 같은 클래스를 자동으로 넣어준다.
	@Setter(onMethod_ = { @Autowired })
	private Restaurant restaurant;
	
	@Test
	public void testExist() {		// 실제적인 테스트 method 작성
		
		assertNotNull(restaurant);	// Not Null 확인 : null이면 예외 발생
		
		log.info(restaurant);
		
		log.info("-------------------------------------------------");
		
		log.info(restaurant.getChef());
		
	}
	
}
