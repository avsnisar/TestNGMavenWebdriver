package com.example.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Sample page
 */
public class HomePage extends Page {

//	@FindBy(xpath = "")
	@FindBy(how = How.TAG_NAME, using = "h1")
	@CacheLookup
	public WebElement header;
	// в даному випадку публічне.
	// можна було приватними полями без @FindBy

	public HomePage(WebDriver webDriver) {
		super(webDriver);
		// PageFactory.initElements(driver, this);
		// можна тут, але можна й в іншому класі але вже таким чином:
		// PageFactory.initElements(driver, HomePage.class);
	}
}
