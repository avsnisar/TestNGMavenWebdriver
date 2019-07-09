package com.example.test;

// Generated by Selenium IDE
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
//import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;

public class BigmirLoginTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@org.testng.annotations.Test
	public void bigmirLogin() {
		// Test name: bigmirLogin
		// Step # | name | target | value | comment
		// 1 | open | / | |
		driver.get("https://www.bigmir.net/");
		// 2 | setWindowSize | 1278x742 | |
		driver.manage().window().setSize(new Dimension(1278, 742));
		// 3 | click | xpath=//a[@id='user-icon']/i | |
		driver.findElement(By.xpath("//a[@id=\'user-icon\']/i")).click();
		// 4 | click | id=bmid_login | |
		driver.findElement(By.id("bmid_login")).click();
		// 5 | type | id=bmid_login | avsnisar@bigmir.net |
		driver.findElement(By.id("bmid_login")).sendKeys("avsnisar@bigmir.net");
		// 6 | type | id=bmid_password | barakuda |
		driver.findElement(By.id("bmid_password")).sendKeys("barakuda");
		// 7 | click | id=bmid_remember | |
		driver.findElement(By.id("bmid_remember")).click();
		// 8 | click | css=tr:nth-child(9) input | |
		driver.findElement(By.cssSelector("tr:nth-child(9) input")).click();
		// 9 | click | xpath=//a[@id='user-icon']/i | |
		driver.findElement(By.xpath("//a[@id=\'user-icon\']/i")).click();
		assertEquals(driver.findElement(By.cssSelector(".right_prof > .mrt_small")).getText(), "Александр");
		// 10 | verifyText | css=.right_prof > .mrt_small | Александр |
		//		assertThat(driver.findElement(By.cssSelector(".right_prof > .mrt_small")).getText(), is("Александр"));
		// 11 | assertText | css=.right_prof > .mrt_small | Александр |
		//		assertThat(driver.findElement(By.cssSelector(".right_prof > .mrt_small")).getText(), is("Александр"));
	}
}
