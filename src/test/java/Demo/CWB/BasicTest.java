package Demo.CWB;

import org.testng.annotations.*;
import pages.CbaLoginClass;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class BasicTest extends TestBaseClass {
	// WebDriver driver;
    static CbaLoginClass lp;
	public BasicTest() throws Exception {
	super();
	setUP();
		}
	
 	/*@Test
	public void commSecTest() throws Exception {
    lp=new CbaLoginClass(driver);
	lp.testCommSecLogin();
    assertTrue(driver.getCurrentUrl().endsWith("LoginFailed"));

	}*/
	@Test
	public void netBankTest() throws Exception {
	lp=new CbaLoginClass(driver);
	lp.testNetbankLogin();
    assertTrue(driver.getCurrentUrl().endsWith("CommBankVersion2"));

	}
	@Test
	public void testNextChapter() throws Exception {
	lp=new CbaLoginClass(driver);
	lp.nextChapterTest();
	assertTrue(driver.getCurrentUrl().endsWith("financialabuse"));
	}
 
@AfterTest
  public void afterTest() {
	 driver.quit();
	 assertTrue( true );
  }

}

