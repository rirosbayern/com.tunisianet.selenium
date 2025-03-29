/**
 * 
 */
package com.tunisianet.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tunisianet.base.BaseClass;

/**
 * 
 */
public class loginPageTest extends BaseClass {
	

	@BeforeMethod
	public void setUp(){
		
		launchApp();

	}
	
	@AfterMethod 
	public void tearDown(){
		
		driver.close();
		
	}
	
	@Test
	public void connexion() {
		
		
	}
	
}
