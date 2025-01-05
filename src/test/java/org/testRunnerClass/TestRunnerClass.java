package org.testRunnerClass;

import org.objectFactory.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.testBase.BaseClass;
import org.testBase.Constants;
import org.testUtilities.DriverHelper;

public class TestRunnerClass extends BaseClass{
	public static WebDriver driver = BaseClass.browserLaunch(Constants.getBrowser());
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	


	public static void main(String[] args) throws InterruptedException {
		
		DriverHelper.getUrl(Constants.getUrl());

		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getATags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getInputTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getButtonTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getOptionTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getLiTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getUlTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getDivTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getHtmlTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getBodyTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getSelectTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getTbodyTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getTheadTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getTrTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getTdTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getFrameTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getiFrameTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getTableTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getSvgTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getH1Tags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getSpanTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getFormTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getScriptTags());
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getMainTags());

		DriverHelper.getAllTextOfTheLinkOnTheWebPage(pom.getAllDomTagsCountModule().getATagsCount());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		DriverHelper.sendTheValue(pom.getTextFieldModule().getNameField1(), Constants.getNameField1());
		DriverHelper.sendTheValue(pom.getTextFieldModule().getEMailField1(), Constants.getEMailField1());
		DriverHelper.sendTheValue(pom.getTextFieldModule().getPhoneNumberField1(), Constants.getPhoneNumberField1());
		DriverHelper.sendTheValue(pom.getTextFieldModule().getAddressField1(), Constants.getAddressField1());
		DriverHelper.clickOnElement(pom.getTextFieldModule().getGenderClick());
		DriverHelper.clickOnElement(pom.getTextFieldModule().getDayClick());
		DriverHelper.getTheAttribute(pom.getTextFieldModule().getNameField1());
		DriverHelper.getTheAttribute(pom.getTextFieldModule().getEMailField1());
		DriverHelper.getTheAttribute(pom.getTextFieldModule().getPhoneNumberField1());
		DriverHelper.getTheAttribute(pom.getTextFieldModule().getAddressField1());
		DriverHelper.elementIsDisPlayedOrNot(pom.getTextFieldModule().getRadioButtonIsDisplayOrNot());
		DriverHelper.elementIsEnabledOrNot(pom.getTextFieldModule().getRadioButtonIsEnableOrNot());
		DriverHelper.elementIsSelectedOrNot(pom.getTextFieldModule().getRadioButtonIsSelectedOrNot());
		DriverHelper.elementIsDisPlayedOrNot(pom.getTextFieldModule().getCheckBoxIsDisplayOrNot());
		DriverHelper.elementIsEnabledOrNot(pom.getTextFieldModule().getCheckBoxIsEnableOrNot());
		DriverHelper.elementIsSelectedOrNot(pom.getTextFieldModule().getCheckBoxIsSelectedOrNot());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		DriverHelper.selectTheSingleDropDownUsingSelectClassValue(pom.getDropdownModule().getSelectTheCountry1(), Constants.getSelectTheCountry1());
		DriverHelper.clickOnElement(pom.getDropdownModule().getClickTheCountryDropDown());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getDropdownModule().getSelectTheCountry2(), Constants.getSelectTheCountry2());
		DriverHelper.getTheAllOptionsFromDropDownWithoutUsingGetOptions(pom.getDropdownModule().getAllCountryText());
		DriverHelper.selectTheSingleDropDownUsingSelectClassVisibleText(pom.getDropdownModule().getSelectTheColour1(), Constants.getSelectTheColour1());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getDropdownModule().getSelectTheColour2(), Constants.getSelectTheColour2());
		DriverHelper.getTheAllOptionsFromDropDownWithoutUsingGetOptions(pom.getDropdownModule().getAllColourText());
		DriverHelper.selectTheSingleDropDownUsingSelectClassVisibleText(pom.getDropdownModule().getSelectTheAnimal1(), Constants.getSelectTheAnimal1());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getDropdownModule().getSelectTheAnimal2(), Constants.getSelectTheAnimal2());
		DriverHelper.getTheAllOptionsFromDropDownWithoutUsingGetOptions(pom.getDropdownModule().getAllAnimalText());
		DriverHelper.scrollDownTheWebPageUsingJavaScriptExecutor(0, 300);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		DriverHelper.clickOnElement(pom.getDatePickerModule().getDatePickerClick1());
		while (true) {
			String augustMonth = pom.getDatePickerModule().getMonths().getText();
			String yearss = pom.getDatePickerModule().getYears().getText();
			if (augustMonth.equalsIgnoreCase(Constants.getDatePickerMonth1()) && yearss.equalsIgnoreCase(Constants.getDatePickerYear1())) {
				break;
			} else {
				DriverHelper.clickOnElement(pom.getDatePickerModule().getNextButtonClick());
			}
		}
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getDatePickerModule().getSelectTheDate(), Constants.getDatePickerDate1());
		DriverHelper.clickOnElement(pom.getDatePickerModule().getDatePickerClick2());
		DriverHelper.selectTheSingleDropDownUsingSelectClassVisibleText(pom.getDatePickerModule().getMonthDropdown(), Constants.getDatePickerMonth2());
		DriverHelper.selectTheSingleDropDownUsingSelectClassVisibleText(pom.getDatePickerModule().getYearDropdown(), Constants.getDatePickerYear2());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getDatePickerModule().getSelectDate(), Constants.getDatePickerDate2());
		DriverHelper.clickOnElement(pom.getDatePickerModule().getPostAtomClick1());
		DriverHelper.handleTheWindow(1);
		DriverHelper.goToWebPageBottomUsingJavaScriptExecutor();
		DriverHelper.waits(1000);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(0);
		DriverHelper.clickOnElement(pom.getDatePickerModule().getPostAtomClick2());
		DriverHelper.handleTheWindow(1);
		DriverHelper.goToWebPageBottomUsingJavaScriptExecutor();
		DriverHelper.waits(1000);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		DriverHelper.getTheSingleText(pom.getWebTableModule().getThePostAdomText());
		DriverHelper.moveToElementUsingActionsClass(pom.getWebTableModule().getMoveToElement1());
		DriverHelper.clickOnElement(pom.getWebTableModule().getClickTheElement1());
		DriverHelper.moveToElementUsingActionsClass(pom.getWebTableModule().getClickTheElement2());
		DriverHelper.clickOnElement(pom.getWebTableModule().getClickTheElement2());
		DriverHelper.scrollDownTheWebPageUsingJavaScriptExecutor(0, 500);
		DriverHelper.getTheTableHeaders(pom.getWebTableModule().getTableHeadersData());
		DriverHelper.getTheTableAllData(pom.getWebTableModule().getTableEntireData());
		DriverHelper.getTheTableSingleData(pom.getWebTableModule().getTableSingleData());
		DriverHelper.getTheTableColumnCount(pom.getWebTableModule().getTableColumnCount());
		DriverHelper.getTheTableRowCount(pom.getWebTableModule().getTableRowCount());
		DriverHelper.getTheTableAllDataCount(pom.getWebTableModule().getTableEntireDataCount());
		DriverHelper.getTheTableParticularRowData(pom.getWebTableModule().getTableParticularRowData());
		DriverHelper.getTheTableParticularColumnData1(pom.getWebTableModule().getTableParticularColumnData());
		DriverHelper.scrollDownTheWebPageUsingJavaScriptExecutor(0, 500);
		DriverHelper.getTheTableHeaders(pom.getWebTableModule().getTableHeadersData2());
		DriverHelper.getTheTableAllData(pom.getWebTableModule().getTableEntireData2());
		DriverHelper.getTheTableSingleData(pom.getWebTableModule().getTableSingleData2());
		DriverHelper.getTheTableColumnCount(pom.getWebTableModule().getTableColumnCount2());
		DriverHelper.getTheTableRowCount(pom.getWebTableModule().getTableRowCount2());
		DriverHelper.getTheTableAllDataCount(pom.getWebTableModule().getTableColumnCount2());
		DriverHelper.getTheTableParticularRowData(pom.getWebTableModule().getTableParticularRowData2());
		DriverHelper.getTheTableParticularColumnData1(pom.getWebTableModule().getTableParticularColumnData2());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		DriverHelper.sendTheValue(pom.getFormModule().getFormText1(), Constants.getFormField1());
		DriverHelper.sendTheValue(pom.getFormModule().getFormText2(), Constants.getFormField2());
		DriverHelper.sendTheValue(pom.getFormModule().getFormText3(), Constants.getFormField3());
		DriverHelper.clickOnElement(pom.getFormModule().getHiddenElementClick());
		DriverHelper.sendTheValue(pom.getFormModule().getHiddenElementValue1(), Constants.getHiddenElementValue1());
		DriverHelper.clickOnElement(pom.getFormModule().getHiddenElementCheckbox1());
		DriverHelper.clickOnElement(pom.getFormModule().getClickToggleInputBox2());
		DriverHelper.sendTheValue(pom.getFormModule().getHiddenElementValue2(), Constants.getHiddenElementValue1());
		DriverHelper.clickOnElement(pom.getFormModule().getClickToggleCheckBox2());
		DriverHelper.clickOnElement(pom.getFormModule().getHiddenElementCheckbox2());
		DriverHelper.clickOnElement(pom.getFormModule().getClickToggleInputBox2());
		DriverHelper.clickOnElement(pom.getFormModule().getClickToggleCheckBox2());
		DriverHelper.goToWebPageBottomUsingJavaScriptExecutor();
		DriverHelper.clickOnElement(pom.getFormModule().getDownloadFileClick());
		DriverHelper.sendTheValue(pom.getFormModule().getEnterTextField(), Constants.getHiddenElementValue2());
		DriverHelper.goToWebPageBottomUsingJavaScriptExecutor();
		DriverHelper.clickOnElement(pom.getFormModule().getClickTheHomeLink());
		DriverHelper.sendTheValue(pom.getFormModule().getNameField2(), Constants.getNameField2());
		DriverHelper.sendTheValue(pom.getFormModule().getEMailField2(), Constants.getEMailField2());
		DriverHelper.sendTheValue(pom.getFormModule().getPhoneNumberField2(), Constants.getPhoneNumberField2());
		DriverHelper.sendTheValue(pom.getFormModule().getAddressField2(), Constants.getAddressField2());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		DriverHelper.sendTheValue(pom.getMultipleWindowHandlingModule().getNewTabTextField(), Constants.getNewTabTextField());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getClickTheSearchButton());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getTestNGClick());
		DriverHelper.handleTheWindow(1);
		DriverHelper.goToWebPageBottomUsingJavaScriptExecutor();
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getclickWikimediaFoundation());
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(0);
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

		DriverHelper.handleTheWindow(15);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(14);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(13);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(12);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(11);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(10);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(9);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(8);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(7);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(6);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(5);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(4);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(3);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(2);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(1);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(0);	
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewPopupWindowClick());
		DriverHelper.handleTheWindow(2);	
		DriverHelper.maximizeTheWindow();
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getMaximizeTheWindowModule1());
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(1);	
		DriverHelper.maximizeTheWindow();
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getAboutClick());
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(0);	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		DriverHelper.clickOnElement(pom.getAlertModule().getSimpleAlertBoxClick());
		DriverHelper.handleTheSimpleAlert();
		DriverHelper.clickOnElement(pom.getAlertModule().getConfirmAlertBoxClick());
		DriverHelper.acceptTheConfirmAlert();
		DriverHelper.clickOnElement(pom.getAlertModule().getPromptAlertBoxClick());
		DriverHelper.acceptThePromptAlertAlert(Constants.getAlertBoxMessage());
		DriverHelper.clickOnElement(pom.getAlertModule().getSimpleAlertBoxClick());
		DriverHelper.handleTheSimpleAlert();
		DriverHelper.clickOnElement(pom.getAlertModule().getConfirmAlertBoxClick());
		DriverHelper.acceptTheConfirmAlert();
		DriverHelper.clickOnElement(pom.getAlertModule().getPromptAlertBoxClick());
		DriverHelper.acceptThePromptAlertAlert(Constants.getAlertBoxMessage());
		DriverHelper.clickOnElement(pom.getAlertModule().getSimpleAlertBoxClick());
		DriverHelper.handleTheSimpleAlert();
		DriverHelper.clickOnElement(pom.getAlertModule().getConfirmAlertBoxClick());
		DriverHelper.acceptTheConfirmAlert();
		DriverHelper.clickOnElement(pom.getAlertModule().getPromptAlertBoxClick());
		DriverHelper.acceptThePromptAlertAlert(Constants.getAlertBoxMessage());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		DriverHelper.moveToElementUsingActionsClass(pom.getActionsModule().getMouseHoverTheElement());
		DriverHelper.contextClickUsingActionsClass(pom.getActionsModule().getContextClick());
		DriverHelper.clickTheNewTabWithKeyBoardActiosUsingRobotClass();
		DriverHelper.handleTheWindow(1);
		DriverHelper.sendTheValue(pom.getActionsModule().getNameField1(), Constants.getNameField1());
		DriverHelper.sendTheValue(pom.getActionsModule().getEMailField1(), Constants.getEMailField1());
		DriverHelper.sendTheValue(pom.getActionsModule().getPhoneNumberField1(), Constants.getPhoneNumberField1());
		DriverHelper.sendTheValue(pom.getActionsModule().getAddressField1(), Constants.getAddressField1());
		DriverHelper.clickOnElement(pom.getActionsModule().getGenderClick());
		DriverHelper.clickOnElement(pom.getActionsModule().getDayClick());
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(0);
		DriverHelper.doubleClickUsingActionsClass(pom.getActionsModule().getDoubleClickTheElement());
		DriverHelper.dragAndDropUsingActionsClass(pom.getActionsModule().getDragMethod(), pom.getActionsModule().getDropMethod());
		
		
		
		
		
		
		
		
		
		
		

		DriverHelper.doubleClickUsingActionsClass(pom.getScrollingDropdownModule().getSvgElement1());
		DriverHelper.doubleClickUsingActionsClass(pom.getScrollingDropdownModule().getSvgElement2());
		DriverHelper.doubleClickUsingActionsClass(pom.getScrollingDropdownModule().getSvgElement3());
		DriverHelper.scrollDownTheWebPageUsingJavaScriptExecutor(0, 400);
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios1());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios5());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios10());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios15());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios20());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios25());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios30());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios35());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios40());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios45());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios50());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios55());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios60());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios66());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios70());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios75());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios80());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios85());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios90());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios95());
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),Constants.getScrollingDropDownOptios100());
		
 }
		
	
}
