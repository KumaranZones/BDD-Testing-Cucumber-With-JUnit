package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testBase.Constants;
import org.testUtilities.DriverHelper;

public class AlertModule {

public static WebDriver driver;
	
	@FindBy(xpath = "//button[text()='Simple Alert']")
	private WebElement simpleAlertBoxClick;
	@FindBy(xpath = "//button[text()='Confirmation Alert']")
	private WebElement confirmAlertBoxClick;
	@FindBy(xpath = "//button[text()='Prompt Alert']")
	private WebElement promptAlertBoxClick;
	
	
	
	
	public AlertModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSimpleAlertBoxClick() {
		return simpleAlertBoxClick;
	}
	public WebElement getConfirmAlertBoxClick() {
		return confirmAlertBoxClick;
	}
	public WebElement getPromptAlertBoxClick() {
		return promptAlertBoxClick;
	}
}
