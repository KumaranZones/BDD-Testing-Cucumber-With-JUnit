package org.pageObjectModel;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testUtilities.DriverHelper;

public class WebTableModule {

public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Posts (Atom)']")
	private WebElement getThePostAdomText;
	@FindBy(xpath="//button[text()='Upload Single File']")
	private WebElement uploadFiles1;
	@FindBy(xpath="//button[text()='Upload Multiple Files']")
	private WebElement uploadFiles2;
	@FindBy(xpath="//table[@name='BookTable']//tbody//tr[1]//th")
	private List<WebElement> tableHeadersData;
	@FindBy(xpath="//table[@name='BookTable']//tbody//tr//td")
	private List<WebElement> tableEntireData;
	@FindBy(xpath="//table[@name='BookTable']//tbody//tr[2]//td[3]")
	private WebElement tableSingleData;
	@FindBy(xpath="//table[@name='BookTable']//tbody//tr[1]//th")
	private List<WebElement> tableColumnCount;
	@FindBy(xpath="//table[@name='BookTable']//tbody//tr")
	private List<WebElement> tableRowCount;
	@FindBy(xpath="//table[@name='BookTable']//tbody//tr//td")
	private List<WebElement> tableEntireDataCount;
	@FindBy(xpath="//table[@name='BookTable']//tbody//tr[3]//td")
	private List<WebElement> tableParticularRowData;
	@FindBy(css="table[name='BookTable']>tbody>tr>td:nth-child(2)")
	private List<WebElement> tableParticularColumnData;
	@FindBy(xpath="//table[@id='taskTable']//thead//th")
	private List<WebElement> tableHeadersData2;
	@FindBy(xpath="//table[@id='taskTable']//tbody//tr//td")
	private List<WebElement> tableEntireData2;
	@FindBy(xpath="//table[@id='taskTable']//tbody//tr[1]//td[1]")
	private WebElement tableSingleData2;
	@FindBy(xpath="//table[@id='taskTable']//thead//th")
	private List<WebElement> tableColumnCount2;
	@FindBy(xpath="//table[@id='taskTable']//tbody//tr")
	private List<WebElement> tableRowCount2;
	@FindBy(xpath="//table[@id='taskTable']//tbody//tr//td")
	private List<WebElement> tableEntireDataCount2;
	@FindBy(xpath="//table[@id='taskTable']//tbody//tr[2]//td")
	private List<WebElement> tableParticularRowData2;
	@FindBy(css="table#taskTable>tbody>tr>td:nth-child(2)")
	private List<WebElement> tableParticularColumnData2;
	
	
	
	
	public WebTableModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getThePostAdomText() {
		return getThePostAdomText;
	}
	public WebElement getMoveToElement1() {
		return uploadFiles1;
	}
	public WebElement getClickTheElement1() {
		return uploadFiles1;
	}
	public WebElement getMoveToElement2() {
		return uploadFiles2;
	}
	public WebElement getClickTheElement2() {
		return uploadFiles2;
	}
	public List<WebElement> getTableHeadersData() {
		return tableHeadersData;
	}
	public List<WebElement> getTableEntireData() {
		return tableEntireData;
	}
	public WebElement getTableSingleData() {
		return tableSingleData;
	}
	public List<WebElement> getTableColumnCount() {
		return tableColumnCount;
	}
	public List<WebElement> getTableRowCount() {
		return tableRowCount;
	}
	public List<WebElement> getTableEntireDataCount() {
		return tableEntireDataCount;
	}
	public List<WebElement> getTableParticularRowData() {
		return tableParticularRowData;
	}
	public List<WebElement> getTableParticularColumnData() {
		return tableParticularColumnData;
	}
	public List<WebElement> getTableHeadersData2() {
		return tableHeadersData2;
	}
	public List<WebElement> getTableEntireData2() {
		return tableEntireData2;
	}
	public WebElement getTableSingleData2() {
		return tableSingleData2;
	}
	public List<WebElement> getTableColumnCount2() {
		return tableColumnCount2;
	}
	public List<WebElement> getTableRowCount2() {
		return tableRowCount2;
	}
	public List<WebElement> getTableEntireDataCount2() {
		return tableEntireDataCount2;
	}
	public List<WebElement> getTableParticularRowData2() {
		return tableParticularRowData2;
	}
	public List<WebElement> getTableParticularColumnData2() {
		return tableParticularColumnData2;
	}
	
}
