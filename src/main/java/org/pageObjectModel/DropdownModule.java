package org.pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testBase.Constants;
import org.testUtilities.DriverHelper;

public class DropdownModule {

public static WebDriver driver;
	
	@FindBy(xpath="//select[@id='country']")
	private WebElement selectTheCountry1;
	@FindBy(xpath="//select[@id='country']")
	private WebElement clickTheCountryDropDown;
	@FindBy(xpath="//select[@id='country']//option")
	private List<WebElement> selectTheCountry2;
	@FindBy(xpath="//select[@id='country']//option")
	private List<WebElement> getAllCountryText;
	@FindBy(xpath="//select[@id='colors']")
	private WebElement selectTheColour1;
	@FindBy(xpath="//select[@id='colors']//option")
	private List<WebElement> selectTheColour2;
	@FindBy(xpath="//select[@id='colors']//option")
	private List<WebElement> getAllColourText;
	@FindBy(xpath="//select[@id='animals']")
	private WebElement selectTheAnimal1;
	@FindBy(xpath="//select[@id='animals']//option")
	private List<WebElement> selectTheAnimal2;
	@FindBy(xpath="//select[@id='animals']//option")
	private List<WebElement> getAllAnimalText;
	
	
	
	
	
	
	public DropdownModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getSelectTheCountry1() {
		return selectTheCountry1;
	}
	public WebElement getClickTheCountryDropDown() {
		return clickTheCountryDropDown;
	}
	public List<WebElement> getSelectTheCountry2() {
		return selectTheCountry2;
	}
	public List<WebElement> getAllCountryText() {
		return getAllCountryText;
	}
	public WebElement getSelectTheColour1() {
		return selectTheColour1;
	}
	public List<WebElement> getSelectTheColour2() {
		return selectTheColour2;
	}
	public List<WebElement> getAllColourText() {
		return getAllColourText;
	}
	public WebElement getSelectTheAnimal1() {
		return selectTheAnimal1;
	}
	public List<WebElement> getSelectTheAnimal2() {
		return selectTheAnimal2;
	}
	public List<WebElement> getAllAnimalText() {
		return getAllAnimalText;
	}
}
