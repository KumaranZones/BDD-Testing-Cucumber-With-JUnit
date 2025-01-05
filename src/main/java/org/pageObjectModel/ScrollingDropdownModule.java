package org.pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testUtilities.DriverHelper;

public class ScrollingDropdownModule {

public static WebDriver driver;
	
	@FindBy(xpath = "(//*[local-name()='svg'])[1]")
	private WebElement svgElement1;
	@FindBy(xpath = "(//*[local-name()='svg'])[2]")
	private WebElement svgElement2;
	@FindBy(xpath = "(//*[local-name()='svg'])[3]")
	private WebElement svgElement3;
	@FindBy(xpath = "//input[@id='comboBox']")
	private WebElement scrollDropdownClick;
	@FindBy(xpath = "//div[@id='dropdown']//div")
	private List<WebElement> clickTheItem;
	
	
	
	
	
	public ScrollingDropdownModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSvgElement1() {
		return svgElement1;
	}
	public WebElement getSvgElement2() {
		return svgElement2;
	}
	public WebElement getSvgElement3() {
		return svgElement3;
	}
	public WebElement getScrollDropdownClick() {
		return scrollDropdownClick;
	}
	public List<WebElement> getClickTheItem() {
		return clickTheItem;
	}
//	public List<WebElement> getClickTheItem5() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem10() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem15() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem20() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem25() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem30() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem35() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem40() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem45() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem50() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem55() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem60() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem66() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem70() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem75() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem80() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem85() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem90() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem95() {
//		return clickTheItem;
//	}
//	public List<WebElement> getClickTheItem100() {
//		return clickTheItem;
//	}
}
