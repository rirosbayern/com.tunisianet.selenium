/**
 * 
 */
package com.tunisianet.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tunisianet.base.BaseClass;
import com.tunisianet.pageObject.*;

/**
 * 
 */
public class TestHomePage  extends BaseClass{
	
    
	HomePage homePage ;

	@BeforeMethod
	public void setUp(){
		
		launchApp();

	}
	
	@AfterMethod 
	public void tearDown(){
		
		driver.close();
		
	}
	@Test
	public void tunisiaNetLogoTest() throws Throwable
	{
		homePage = new HomePage();
		boolean bool = homePage.validateLogo();
		Assert.assertTrue(bool);
		//String url = prop.getProperty("url");
		//driver.get(url);
			
		
	}
	@Test
	public void verifTittle() throws Throwable {
		
		homePage = new HomePage();
		String tittlePage = homePage.getTitle();
		Assert.assertEquals(tittlePage, prop.getProperty("tittle"));
	}

}
