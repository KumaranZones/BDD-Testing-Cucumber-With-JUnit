package org.pageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testBase.Constants;
import org.testUtilities.DriverHelper;

public class FormModule {
	public static WebDriver driver;

	@FindBy(xpath="//input[@id='input1']")
	private WebElement formText1;
	@FindBy(xpath="//input[@id='input2']")
	private WebElement formText2;
	@FindBy(xpath="//input[@id='input3']")
	private WebElement formText3;
	@FindBy(xpath="//a[text()='Hidden Elements & AJAX']")
	private WebElement hiddenElementClick;
	@FindBy(xpath="(//input[@id='input1'])[1]")
	private WebElement hiddenElementValue1;
	@FindBy(xpath="//input[@id='checkbox1']")
	private WebElement hiddenElementCheckbox1;
	
	@FindBy(xpath="//button[text()='Toggle Input Box 2']")
	private WebElement clickToggleInputBox2;
	@FindBy(xpath="(//input[@id='input2'])[1]")
	private WebElement hiddenElementValue2;
	
	@FindBy(xpath="//button[text()='Toggle Checkbox 2']")
	private WebElement clickToggleCheckBox2;
	@FindBy(xpath="//input[@id='checkbox2']")
	private WebElement hiddenElementCheckbox2;
	
	@FindBy(xpath="//a[text()='Download Files']")
	private WebElement downloadFileClick;
	@FindBy(xpath="//textarea[@id='inputText']")
	private WebElement enterTextField;
	@FindBy(xpath="(//a[text()='Home'])[2]")
	private WebElement clickTheHomeLink;
	@FindBy(xpath="//input[starts-with(@id,'name')]")
	private WebElement nameField2;
	@FindBy(xpath="//input[starts-with(@id,'email')]")
	private WebElement eMailField2;
	@FindBy(xpath="//input[starts-with(@id,'phone')]")
	private WebElement phoneNumberField2;
	@FindBy(xpath="//textarea[starts-with(@id,'textarea')]")
	private WebElement addressField2;
	
	
	
	
	public FormModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getFormText1() {
		return formText1;
	}
	public WebElement getFormText2() {
		return formText2;
	}
	public WebElement getFormText3() {
		return formText3;
	}
	public WebElement getHiddenElementClick() {
		return hiddenElementClick;
	}
	public WebElement getHiddenElementValue1() {
		return hiddenElementValue1;
	}
	public WebElement getHiddenElementCheckbox1() {
		return hiddenElementCheckbox1;
	}
	public WebElement getClickToggleInputBox2() {
		return clickToggleInputBox2;
	}
	public WebElement getHiddenElementValue2() {
		return hiddenElementValue2;
	}
	public WebElement getClickToggleCheckBox2() {
		return clickToggleCheckBox2;
	}
	public WebElement getHiddenElementCheckbox2() {
		return hiddenElementCheckbox2;
	}
	
	
	public WebElement getDownloadFileClick() {
		return downloadFileClick;
	}
	public WebElement getEnterTextField() {
		return enterTextField;
	}
	public WebElement getClickTheHomeLink() {
		return clickTheHomeLink;
	}
	public WebElement getNameField2() {
		return nameField2;
	}
	public WebElement getEMailField2() {
		return eMailField2;
	}
	public WebElement getPhoneNumberField2() {
		return phoneNumberField2;
	}
	public WebElement getAddressField2() {
		return addressField2;
	}
}
