package test;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.QuotePage;


public class HomePage {
	WebDriver driver;
	QuotePage objQuotePage;

	

	
	@BeforeTest
	public void setup(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.otcmarkets.com/stock/OTCM/quote");
        driver.manage().window().maximize();
	}
	

	@AfterTest
	public void shutdown() {
		driver.close();
		System.out.println("Webdriver is closing");
		//driver.quit();
	}

	
	@Test(priority=0)
	public void test_quote_page(){
		
		objQuotePage = new QuotePage(driver);
		
		System.out.println("test is starting");
		System.out.println("Last Price Change: "+objQuotePage.getLastPriceChg());
		System.out.println("Current Price: "+objQuotePage.getCurPrice());
		System.out.println("BBO Price: "+objQuotePage.getbboPrice());
		System.out.println("BBO Size: "+objQuotePage.getbboSize());
		System.out.println("Prev Close: "+objQuotePage.getPrevClose());
		System.out.println("Open: "+objQuotePage.getCurOpen());
		System.out.println("Daily Range: "+objQuotePage.getDailyRange());
		System.out.println("Year Range: "+objQuotePage.getYearRange());
		System.out.println("Volume: "+objQuotePage.getVolume());
		System.out.println("Dividend: "+objQuotePage.getDividend());		
		System.out.println("Average Volume: "+objQuotePage.getAverageVolume());
		System.out.println("Net Dividend: "+objQuotePage.getNetDividend());
		System.out.println("last part of test");
		
		
	}
	


	
	
}
