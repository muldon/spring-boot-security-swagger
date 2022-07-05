package com.javainuse.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

import com.javainuse.service.HomeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CRUDTest {
	
	@Autowired
	HomeService homeService;

	@Test	
	@Order(1)
	public void createTest() {
		homeService.homePage(1);
		assertTrue(true);
	}
	
	@Test
	@Order(2)
	public void readTest() {
		homeService.page1();
		assertTrue(true);
	}  	
	

	@Test	
	@Order(3)
	public void updateTest() {
		assertTrue(true);		
	}
	
 
	
	@Test	
	@Order(4)
	public void deleteTest()  {
		assertTrue(true);		
	}
	
	@Test	
	@Order(5)
	public void findByIdTest()  {
		assertTrue(true);		
	}
	
	@Test	
	@Order(6)
	public void findByCriteriaTest()  {
		assertTrue(true);		
	}
	
	@Test	
	@Order(7)
	public void findByCriteria2Test()  {
		assertTrue(true);		
	}
	

}
