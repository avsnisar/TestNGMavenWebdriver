package com.example.test;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.test.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeMethod
  public void initPageObjects() {
	System.out.println("Within @BeforeMethod - outputted to console before each test method in SampleTestNgTest and super class.");
    homepage = PageFactory.initElements(driver, HomePage.class);
    // можна тут, а можна було безпосередньо в класі сторінки таким чином: PageFactory.initElements(driver, this);
  }
  
  @AfterMethod
  public void logInfo() {
	System.out.println("Within @AfterMethod - outputted to console after each test method in SampleTestNgTest and super class.");
  }

  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    Assert.assertFalse("".equals(homepage.header.getText()));
  }
}
