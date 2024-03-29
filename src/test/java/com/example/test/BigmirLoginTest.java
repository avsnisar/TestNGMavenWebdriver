package com.example.test;

import static org.testng.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BigmirLoginTest {
	private WebDriver driver;
	
	@SuppressWarnings("unused")
	private Map<String, Object> vars;
	
	JavascriptExecutor js;

	@BeforeTest
	public void setUp() {
		System.out.println("Within @BeforeTest - outputted to console before each test method in BigmirLoginTest class.");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Within @AfterTest - outputted to console after each test method in BigmirLoginTest class.");
        System.out.println(System.getProperty("user.dir"));
        driver.quit();
	}

	@Test
	public void bigmirLogin() throws InterruptedException {
		driver.get("https://www.bigmir.net/");
		// 2 | setWindowSize | 1278x742 | |
		driver.manage().window().setSize(new Dimension(1278, 742));
		// 3 | click | xpath=//a[@id='user-icon']/i | |
		driver.findElement(By.xpath("//a[@id=\'user-icon\']/i")).click();
		assertEquals(driver.getCurrentUrl(), "http://profile.bigmir.net/notregistered");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/a")).click();
		assertEquals(driver.getCurrentUrl(), "https://id.bigmir.net/");
		// 4 | click | id=bmid_login | |
		driver.findElement(By.id("bmid_login")).click();
		driver.findElement(By.id("bmid_login")).clear();
		// 5 | type | id=bmid_login | avsnisar@bigmir.net |
		driver.findElement(By.id("bmid_login")).sendKeys("avsnisar@bigmir.net");
		// 6 | type | id=bmid_password | barakuda |
		driver.findElement(By.id("bmid_password")).sendKeys("barakuda");
		// 7 | click | id=bmid_remember | |
		driver.findElement(By.id("bmid_remember")).click();;
		// 8 | click | css=tr:nth-child(9) input | |
		driver.findElement(By.cssSelector("tr:nth-child(9) input")).submit();
		Thread.sleep(5000);
		assertEquals(driver.getCurrentUrl(), "https://www.bigmir.net/");
		// 9 | click | xpath=//a[@id='user-icon']/i | |
		driver.findElement(By.xpath("//a[@id=\'user-icon\']/i")).click();
		assertEquals(driver.findElement(By.cssSelector(".right_prof > .mrt_small")).getText(), "Александр");
		// 10 | verifyText | css=.right_prof > .mrt_small | Александр |
		//		assertThat(driver.findElement(By.cssSelector(".right_prof > .mrt_small")).getText(), is("Александр"));
		// 11 | assertText | css=.right_prof > .mrt_small | Александр |
		//		assertThat(driver.findElement(By.cssSelector(".right_prof > .mrt_small")).getText(), is("Александр"));
	}
}
