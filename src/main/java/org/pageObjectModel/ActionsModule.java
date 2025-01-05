package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testBase.Constants;
import org.testUtilities.DriverHelper;

public class ActionsModule {

public static WebDriver driver;
	
	@FindBy(xpath = "//button[text()='Point Me']")
	private WebElement mouseHoverTheElement;
	@FindBy(xpath = "//button[text()='Copy Text']")
	private WebElement doubleClickTheElement;
	@FindBy(xpath = "//div[@id='draggable']")
	private WebElement drag;
	@FindBy(xpath = "//div[@id='droppable']")
	private WebElement drop;
	@FindBy(xpath = "//a[text()='Laptops']")
	private WebElement contextClick;
	@FindBy(xpath="//input[starts-with(@id,'name')]")
	private WebElement nameField1;
	@FindBy(xpath="//input[starts-with(@id,'email')]")
	private WebElement eMailField1;
	@FindBy(xpath="//input[starts-with(@id,'phone')]")
	private WebElement phoneNumberField1;
	@FindBy(xpath="//textarea[starts-with(@id,'textarea')]")
	private WebElement addressField1;
	@FindBy(xpath="//input[@id='male']")
	private WebElement genderClick;
	@FindBy(xpath="//input[@id='friday']")
	private WebElement dayClick;
	
	

	
	
	public ActionsModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public WebElement getMouseHoverTheElement() {
		return mouseHoverTheElement;
	}
	public WebElement getDoubleClickTheElement() {
		return doubleClickTheElement;
	}
	public WebElement getDragMethod() {
		return drag;
	}
	public WebElement getDropMethod() {
		return drop;
	}
	public WebElement getContextClick() {
		return contextClick;
	}
	public WebElement getNameField1() {
		return nameField1;
	}
	public WebElement getEMailField1() {
		return eMailField1;
	}
	public WebElement getPhoneNumberField1() {
		return phoneNumberField1;
	}
	public WebElement getAddressField1() {
		return addressField1;
	}
	public WebElement getGenderClick() {
		return genderClick;
	}
	public WebElement getDayClick() {
		return dayClick;
	}
}
