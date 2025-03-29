package com.tunisianet.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;

import com.tunisianet.action.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static Properties prop ;
	public static WebDriver driver ;
	public static Action action = new Action();
    private static Logger logger = LoggerFactory.getLogger(BaseClass.class);

	
	
@BeforeTest
	public void loadConfig() {
		//ExtentManager.setExtent();
		//DOMConfigurator.configure("log4j.xml");
	

		try {
			prop = new Properties();
			 FileInputStream ip = new FileInputStream("C:\\Users\\mejri\\OneDrive\\Bureau\\Ahmed\\Formation\\Selenium java\\com.tunisianet.selenium\\Configuration\\Config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void launchApp() {
		
	     WebDriverManager.chromedriver().setup();
		 String browserName = prop.getProperty("browser");
		 //System.out.println(browserName);
	     //String browserName = "Chrome" ;
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			// Set Browser to ThreadLocalMap
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=  new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
		}
		action.implicitWait(driver, 10);
		action.pageLoadTimeOut(driver, 30);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
}
	
	
	
}
