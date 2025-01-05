package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testBase.Constants;
import org.testUtilities.DriverHelper;

public class MultipleWindowHandlingModule {

	public static WebDriver driver;

	@FindBy(xpath="//input[@id='Wikipedia1_wikipedia-search-input']")
	private WebElement newTabTextField;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement clickTheSearchButton;
	@FindBy(xpath="//a[text()='TestNG']")
	private WebElement testNGClick;
	@FindBy(xpath="//a[text()='Wikimedia Foundation, Inc.']")
	private WebElement clickWikimediaFoundation;
	@FindBy(xpath="//button[text()='New Tab']")
	private WebElement newTabClick1;
	@FindBy(xpath = "//button[text()='Popup Windows']")
	private WebElement newPopupWindowClick;
	@FindBy(xpath = "//a[text()='About']")
	private WebElement aboutClick;
	@FindBy(xpath = "//a[text()='Get started']")
	private WebElement getStartClick;
	
	
	
	
	public MultipleWindowHandlingModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	public WebElement getNewTabTextField() {
		return newTabTextField;
	}
	public WebElement getClickTheSearchButton() {
		return clickTheSearchButton;
	}
	public WebElement getTestNGClick() {
		return testNGClick;
	}
	public WebElement getclickWikimediaFoundation() {
		return clickWikimediaFoundation;
	}
	public WebElement getNewTabClick1() {
		return newTabClick1;
	}
	public WebElement getNewPopupWindowClick() {
		return newPopupWindowClick;
	}
	public WebElement getMaximizeTheWindowModule1() {
		return aboutClick;
	}
	public WebElement getAboutClick() {
		return getStartClick;
	}
	
	
}
