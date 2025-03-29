/**
 * 
 */
package com.tunisianet.pageObject;

/**
 * 
 */

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tunisianet.base.BaseClass;

public class HomePage extends BaseClass {
	
	
	
	@FindBy(xpath ="//div[@class='nav-link']")
	WebElement signInBtn ;
	
	@FindBy(id ="search_query_top")
	WebElement searchQueryBox ;
	
	//*[@id="sp-btn-search"]/button
	@FindBy(xpath ="//*[@id=\"sp-btn-search\"]/button")
	WebElement buttonSearch ;
	
	@FindBy(xpath ="//img[@class=\"logo img-responsive\"]")
	WebElement logoTunisianet ;
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	//Throwable est la superclasse de toutes les exceptions et erreurs en Java.
	public LoginPage clickSignIn() throws NoSuchElementException{
		
		action.click(driver, signInBtn);
		return new LoginPage();
	}
	
	public boolean validateLogo() throws Throwable
	
	{
		return action.isDisplayed(driver, logoTunisianet) ;
	}
	
	public String getTitle() throws Throwable
	
	{
		String	tittle = action.getTitle(driver) ;
		return tittle; 
	}
	public SearchResultPage searchProduct(String productName) throws NoSuchElementException {
		action.type(searchQueryBox, productName);
		action.click(driver, buttonSearch); 
		return new SearchResultPage();
	}
	
}
