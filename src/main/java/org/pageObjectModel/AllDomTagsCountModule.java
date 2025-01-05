package org.pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testUtilities.DriverHelper;

public class AllDomTagsCountModule {

	public static WebDriver driver;
	
	@FindBy(tagName = "a")
	private List<WebElement> aTags;
	@FindBy(tagName = "input")
	private List<WebElement> inputTags;
	@FindBy(tagName = "button")
	private List<WebElement> buttonTags;
	@FindBy(tagName = "option")
	private List<WebElement> optionTags;
	@FindBy(tagName = "li")
	private List<WebElement> liTags;
	@FindBy(tagName = "ul")
	private List<WebElement> ulTags;
	@FindBy(tagName = "div")
	private List<WebElement> divTags;
	@FindBy(tagName = "html")
	private List<WebElement> htmlTags;
	@FindBy(tagName = "body")
	private List<WebElement> bodyTags;
	@FindBy(tagName = "select")
	private List<WebElement> selectTags;
	@FindBy(tagName = "tbody")
	private List<WebElement> tbodyTags;
	@FindBy(tagName = "thead")
	private List<WebElement> theadTags;
	@FindBy(tagName = "tr")
	private List<WebElement> trTags;
	@FindBy(tagName = "td")
	private List<WebElement> tdTags;
	@FindBy(tagName = "frame")
	private List<WebElement> frameTags;
	@FindBy(tagName = "iframe")
	private List<WebElement> iframeTags;
	@FindBy(tagName = "table")
	private List<WebElement> tableTags;
	@FindBy(tagName = "svg")
	private List<WebElement> svgTags;
	@FindBy(tagName = "h1")
	private List<WebElement> h1Tags;
	@FindBy(tagName = "span")
	private List<WebElement> spanTags;
	@FindBy(tagName = "form")
	private List<WebElement> formTags;
	@FindBy(tagName = "script")
	private List<WebElement> scriptTags;
	@FindBy(tagName = "main")
	private List<WebElement> mainTags;
	@FindBy(tagName = "a")
	private List<WebElement> aTagsCount;
	
	
	
	
	public AllDomTagsCountModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public List<WebElement> getATags() {
		return aTags;
	}
	public List<WebElement> getInputTags() {
		return inputTags;
	}
	public List<WebElement> getButtonTags() {
		return buttonTags;
	}
	public List<WebElement> getOptionTags() {
		return optionTags;
	}
	public List<WebElement> getLiTags() {
		return liTags;
	}
	public List<WebElement> getUlTags() {
		return ulTags;
	}
	public List<WebElement> getDivTags() {
		return divTags;
	}
	public List<WebElement> getHtmlTags() {
		return htmlTags;
	}
	public List<WebElement> getBodyTags() {
		return bodyTags;
	}
	public List<WebElement> getSelectTags() {
		return selectTags;
	}
	public List<WebElement> getTbodyTags() {
		return tbodyTags;
	}
	public List<WebElement> getTheadTags() {
		return theadTags;
	}
	public List<WebElement> getTrTags() {
		return trTags;
	}
	public List<WebElement> getTdTags() {
		return tdTags;
	}
	public List<WebElement> getFrameTags() {
		return frameTags;
	}
	public List<WebElement> getiFrameTags() {
		return iframeTags;
	}
	public List<WebElement> getTableTags() {
		return tableTags;
	}
	public List<WebElement> getSvgTags() {
		return svgTags;
	}
	public List<WebElement> getH1Tags() {
		return h1Tags;
	}
	public List<WebElement> getSpanTags() {
		return spanTags;
	}
	public List<WebElement> getFormTags() {
		return formTags;
	}
	public List<WebElement> getScriptTags() {
		return scriptTags;
	}
	public List<WebElement> getMainTags() {
		return mainTags;
	}
	public List<WebElement> getATagsCount() {
		return aTagsCount;
	}
	
}
