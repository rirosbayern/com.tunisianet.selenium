/**
 * 
 */
package com.tunisianet.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tunisianet.base.BaseClass;

/**
 * 
 */
public class LoginPage  extends BaseClass{
	
	@FindBy (xpath ="//*[@id=\"_mobile_user_info\"]/ul/li/a")
	WebElement connexionButton ;
	
	
	public void LoginPage() {
		PageFactory.initElements(driver, this);
	}
	

}
