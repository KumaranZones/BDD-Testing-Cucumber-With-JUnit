package org.objectFactory;

import org.openqa.selenium.WebDriver;
import org.pageObjectModel.ActionsModule;
import org.pageObjectModel.AlertModule;
import org.pageObjectModel.AllDomTagsCountModule;
import org.pageObjectModel.DatePickerModule;
import org.pageObjectModel.DropdownModule;
import org.pageObjectModel.FormModule;
import org.pageObjectModel.MultipleWindowHandlingModule;
import org.pageObjectModel.ScrollingDropdownModule;
import org.pageObjectModel.TextFieldModule;
import org.pageObjectModel.WebTableModule;

public class PageObjectManager {
	public static WebDriver driver;

	private AllDomTagsCountModule adm;
	private TextFieldModule tfm;
	private DropdownModule dm;
	private DatePickerModule dpm;
	private WebTableModule wm;
	private FormModule fm;
	private MultipleWindowHandlingModule mwhm;
	private AlertModule am;
	private ActionsModule asm;
	private ScrollingDropdownModule sdm;

	

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	

	public AllDomTagsCountModule getAllDomTagsCountModule() {
		adm = new AllDomTagsCountModule(driver);
		return adm;
	}

	public TextFieldModule getTextFieldModule() {
		tfm = new TextFieldModule(driver);
		return tfm;
	}

	public DropdownModule getDropdownModule() {
		dm = new DropdownModule(driver);
		return dm;
	}

	public DatePickerModule getDatePickerModule() {
		dpm = new DatePickerModule(driver);
		return dpm;
	}
	
	public WebTableModule getWebTableModule() {
		wm = new WebTableModule(driver);
		return wm;
	}

	public FormModule getFormModule() {
		fm = new FormModule(driver);
		return fm;
	}

	public MultipleWindowHandlingModule getMultipleWindowHandlingModule() {
		mwhm = new MultipleWindowHandlingModule(driver);
		return mwhm;
	}

	public AlertModule getAlertModule() {
		am = new AlertModule(driver);
		return am;
	}

	public ActionsModule getActionsModule() {
		asm = new ActionsModule(driver);
		return asm;
	}

	public ScrollingDropdownModule getScrollingDropdownModule() {
		sdm = new ScrollingDropdownModule(driver);
		return sdm;
	}
}
