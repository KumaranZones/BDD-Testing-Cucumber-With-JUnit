package org.pageObjectModel;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testBase.Constants;
import org.testUtilities.DriverHelper;

public class DatePickerModule {

public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='datepicker']")
	private WebElement datePickerClick1;
	@FindBy(xpath="(//div[@class='ui-datepicker-title']//span)[1]")
	private WebElement months;
	@FindBy(xpath="(//div[@class='ui-datepicker-title']//span)[2]")
	private WebElement years;
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextButtonClick;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody//tr//td")
	private List<WebElement> selectTheDate;
	@FindBy(xpath="//input[@id='txtDate']")
	private WebElement datePickerClick2;
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement monthDropdown;
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement yearDropdown;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody//tr//td")
	private List<WebElement> selectDate;
	@FindBy(xpath="//a[text()='Posts (Atom)']")
	private WebElement postAtomClick1;
	@FindBy(xpath="//a[text()='Posts (Atom)']")
	private WebElement postAtomClick2;
	
	
	
	
	public DatePickerModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDatePickerClick1() {
		return datePickerClick1;
	}
	public WebElement getMonths() {
		return months;
	}
	public WebElement getYears() {
		return years;
	}
	public WebElement getNextButtonClick() {
		return nextButtonClick;
	}
	public List<WebElement> getSelectTheDate() {
		return selectTheDate;
	}
	public WebElement getDatePickerClick2() {
		return datePickerClick2;
	}
	public WebElement getMonthDropdown() {
		return monthDropdown;
	}
	public WebElement getYearDropdown() {
		return yearDropdown;
	}
	public List<WebElement> getSelectDate() {
		return selectDate;
	}
	public WebElement getPostAtomClick1() {
		return postAtomClick1;
	}
	public WebElement getPostAtomClick2() {
		return postAtomClick2;
	}
	
//	public void getDatePickerClick1() {
//		DriverHelper.clickOnElement(datePickerClick1);
//	}
//	public void getClickTheCountryDropDown() {
//		DriverHelper.clickTheDatePicker(months, years, nextButtonClick);
//	}
//	public void getSelectTheDate() {
//		DriverHelper.selectTheDropDownWithoutUsingSelectClass(selectTheDate, Constants.getDatePickerDate1());
//	}
}
