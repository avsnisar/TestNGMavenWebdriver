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
	// � ������ ������� �������.
	// ����� ���� ���������� ������ ��� @FindBy

	public HomePage(WebDriver webDriver) {
		super(webDriver);
		// PageFactory.initElements(driver, this);
		// ����� ���, ��� ����� � � ������ ���� ��� ��� ����� �����:
		// PageFactory.initElements(driver, HomePage.class);
	}
}
