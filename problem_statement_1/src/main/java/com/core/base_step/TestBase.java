package com.core.base_step;

import com.core.utility.CommonActionUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	static boolean flag=false;
	public static WebDriver driver=null;
	public static Properties prop=null;
	static String currentdir=null;
	
	public static void initiateDriver() throws IOException {
		InitiateDriver ini=new InitiateDriver();
		driver=ini.getDriver();
		Logger log=Logger.getLogger("TestBase");
		log.info("driver initialized started");
		currentdir=System.getProperty("user.dir");
		File log4j=new File(currentdir + "//src//main//resources//configuration//log4j.properties");
		PropertyConfigurator.configure(log4j.getAbsolutePath());

		if(!flag) {
		   System.out.println("initializing driver");
		   prop=new Properties();

		   try {
			   FileInputStream fis = new FileInputStream(currentdir + "//src//main//resources//configuration//config.properties");
			   prop.load(fis);

			   if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				   WebDriverManager.chromedriver().setup();
				   driver = new ChromeDriver();
				   driver.manage().window().maximize();

			   } else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				   WebDriverManager.firefoxdriver().setup();
				   driver = new FirefoxDriver();
				   driver.manage().window().maximize();
			   } else {
				   WebDriverManager.iedriver().setup();
				   driver = new InternetExplorerDriver();
				   driver.manage().window().maximize();
			   }
		   } catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		   System.out.println("initilization done");
		}
	}
	@Parameters({ "Browser", "appURL" })	//enable when want to do crossbrowser testing
	@BeforeMethod(enabled = false)
	public void launchbrowser(String Browser,String appURL) throws IOException, InterruptedException//enable when u want to do crossbrowser testing
	{
		   launchbrowserForparalle(Browser,appURL);  //enable when u want to do crossbrowser testing
	}
	@BeforeMethod(enabled=true)
		public void launchBrowser() throws IOException {
		initiateDriver();
	}

	@AfterMethod(alwaysRun=true)
	public void quitBrowsers() {
		CommonActionUtils actionUtils = new CommonActionUtils();
		actionUtils.quitBrowser(driver);
	}
	private void launchbrowserForparalle(String Browser, String appURL) {

		switch (Browser) {
			case "chrome":
				driver = initChromeDriver(appURL);
				break;
			case "firefox":
				driver = initFirefoxDriver(appURL);
				break;
			case "safari":
				driver = initSafariDriver(appURL);
				break;
			default:
				System.out.println("browser : " + Browser + " is invalid, Launching Firefox as browser of choice..");
				driver = initFirefoxDriver(appURL);
		}
	}

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		//String p=obj.getProperty("chromepath");
		//	System.out.println(p);
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\biswabhusan.m\\Downloads\\demo\\Practice 4\\Practice 2\\Driver\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--start-maximized");
		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	private static WebDriver initSafariDriver(String appURL) {
		System.out.println("Launching safari browser..");
		driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}


}
