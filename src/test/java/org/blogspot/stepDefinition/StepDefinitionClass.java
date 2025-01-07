package org.blogspot.stepDefinition;

import org.blogspot.mainTestRunnerClass.MainTestRunnerClass;
import org.objectFactory.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.testBase.BaseClass;
import org.testBase.Constants;
import org.testUtilities.DriverHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass extends BaseClass {
	public static WebDriver driver = MainTestRunnerClass.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^the User Launch The Blogspot Url$")
	public void the_User_Launch_The_Blogspot_Url() throws Throwable {
		DriverHelper.getUrl(Constants.getUrl());
	}

	@When("^the User Collects The Count Of ATags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_ATags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getATags());
	}

	@When("^the User Collects The Count Of InputTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_InputTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getInputTags());
	}

	@When("^the User Collects The Count Of ButtonTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_ButtonTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getButtonTags());
	}

	@When("^the User Collects The Count Of OptionTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_OptionTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getOptionTags());
	}

	@When("^the User Collects The Count Of LiTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_LiTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getLiTags());
	}

	@When("^the User Collects The Count Of The UlTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_The_UlTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getUlTags());
	}

	@When("^the User Collects The Count Of TheDivTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_TheDivTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getDivTags());
	}

	@When("^the User Collects The Count Of HtmlTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_HtmlTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getHtmlTags());
	}

	@When("^the User Collects The Count Of BodyTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_BodyTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getBodyTags());
	}

	@When("^the User Collects The Count Of SelectTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_SelectTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getSelectTags());
	}

	@When("^the User Collects The Count Of TbodyTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_TbodyTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getTbodyTags());
	}

	@When("^the User Collects The Count Of TheadTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_TheadTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getTheadTags());
	}

	@When("^the User Collects The Count Of TrTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_TrTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getTrTags());
	}

	@When("^the User Collects The Count Of TdTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_TdTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getTdTags());
	}

	@When("^the User Collects The Count Of FrameTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_FrameTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getFrameTags());
	}

	@When("^the User Collects The Count Of IFrameTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_IFrameTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getiFrameTags());
	}

	@When("^the User Collects The Count Of TableTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_TableTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getTableTags());
	}

	@When("^the User Collects The Count Of SvgTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_SvgTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getSvgTags());
	}

	@When("^the User Collects The Count Of H(\\d+)Tags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_H_Tags_From_The_DOM_Structure(int arg1) throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getH1Tags());
	}

	@When("^the User Collects The Count Of SpanTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_SpanTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getSpanTags());
	}

	@When("^the User Collects The Count Of FormTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_FormTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getFormTags());
	}

	@When("^the User Collects The Count Of ScriptTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_ScriptTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getScriptTags());
	}

	@When("^the User Collects The Count Of MainTags  From The DOM Structure$")
	public void the_User_Collects_The_Count_Of_MainTags_From_The_DOM_Structure() throws Throwable {
		DriverHelper.getTheDomTagSize(pom.getAllDomTagsCountModule().getMainTags());
	}

	@Then("^the User Collect The All Text Of The Link From Webpage And Navigate To TesxtFields Module$")
	public void the_User_Collect_The_All_Text_Of_The_Link_From_Webpage_And_Navigate_To_TesxtFields_Module()
			throws Throwable {
		DriverHelper.getAllTextOfTheLinkOnTheWebPage(pom.getAllDomTagsCountModule().getATagsCount());
	}

	@When("^the User Enters  A Name In The Name Field$")
	public void the_User_Enters_A_Name_In_The_Name_Field() throws Throwable {
		DriverHelper.sendTheValue(pom.getTextFieldModule().getNameField1(), Constants.getNameField1());
	}

	@When("^the User Enters  An Email In The Email Field$")
	public void the_User_Enters_An_Email_In_The_Email_Field() throws Throwable {
		DriverHelper.sendTheValue(pom.getTextFieldModule().getEMailField1(), Constants.getEMailField1());
	}

	@When("^the User Enters  A Phone Number In The Phone Number Field$")
	public void the_User_Enters_A_Phone_Number_In_The_Phone_Number_Field() throws Throwable {
		DriverHelper.sendTheValue(pom.getTextFieldModule().getPhoneNumberField1(), Constants.getPhoneNumberField1());
	}

	@When("^the User Enters  An Address In The Address Field$")
	public void the_User_Enters_An_Address_In_The_Address_Field() throws Throwable {
		DriverHelper.sendTheValue(pom.getTextFieldModule().getAddressField1(), Constants.getAddressField1());
	}

	@When("^the User Click The Male Radio Button$")
	public void the_User_Click_The_Male_Radio_Button() throws Throwable {
		DriverHelper.clickOnElement(pom.getTextFieldModule().getGenderClick());
	}

	@When("^the User Click The Day Check Box$")
	public void the_User_Click_The_Day_Check_Box() throws Throwable {
		DriverHelper.clickOnElement(pom.getTextFieldModule().getDayClick());
	}

	@When("^the User Retrive The Name Field Attribute Value$")
	public void the_User_Retrive_The_Name_Field_Attribute_Value() throws Throwable {
		DriverHelper.getTheAttribute(pom.getTextFieldModule().getNameField1());
	}

	@When("^the User Retrive The Email Field Attribute Value$")
	public void the_User_Retrive_The_Email_Field_Attribute_Value() throws Throwable {
		DriverHelper.getTheAttribute(pom.getTextFieldModule().getEMailField1());
	}

	@When("^the User Retrive The Phone Number Field Attribute Value$")
	public void the_User_Retrive_The_Phone_Number_Field_Attribute_Value() throws Throwable {
		DriverHelper.getTheAttribute(pom.getTextFieldModule().getPhoneNumberField1());
	}

	@When("^the User Retrive The Address Field Attribute Value$")
	public void the_User_Retrive_The_Address_Field_Attribute_Value() throws Throwable {
		DriverHelper.getTheAttribute(pom.getTextFieldModule().getAddressField1());
	}

	@When("^the User Verify The Male Radiobutton Is Displayed Or Not$")
	public void the_User_Verify_The_Male_Radiobutton_Is_Displayed_Or_Not() throws Throwable {
		DriverHelper.elementIsDisPlayedOrNot(pom.getTextFieldModule().getRadioButtonIsDisplayOrNot());
	}

	@When("^the User Verify The Male Radiobutton Is Enabled Or Not$")
	public void the_User_Verify_The_Male_Radiobutton_Is_Enabled_Or_Not() throws Throwable {
		DriverHelper.elementIsEnabledOrNot(pom.getTextFieldModule().getRadioButtonIsEnableOrNot());
	}

	@When("^the User Verify The Male Radiobutton Is Selected Or Not$")
	public void the_User_Verify_The_Male_Radiobutton_Is_Selected_Or_Not() throws Throwable {
		DriverHelper.elementIsSelectedOrNot(pom.getTextFieldModule().getRadioButtonIsSelectedOrNot());
	}

	@When("^the User Verify The Friday Check Box Is Displayed Or Not$")
	public void the_User_Verify_The_Friday_Check_Box_Is_Displayed_Or_Not() throws Throwable {
		DriverHelper.elementIsDisPlayedOrNot(pom.getTextFieldModule().getCheckBoxIsDisplayOrNot());
	}

	@When("^the User Verify The Friday Check Box Is Enabled Or Not$")
	public void the_User_Verify_The_Friday_Check_Box_Is_Enabled_Or_Not() throws Throwable {
		DriverHelper.elementIsEnabledOrNot(pom.getTextFieldModule().getCheckBoxIsEnableOrNot());
	}

	@When("^the User Verify The Friday Check Box Is Selected Or Not and User Navigate To The Dropdown Module$")
	public void the_User_Verify_The_Friday_Check_Box_Is_Selected_Or_Not_and_User_Navigate_To_The_Dropdown_Module()
			throws Throwable {
		DriverHelper.elementIsSelectedOrNot(pom.getTextFieldModule().getCheckBoxIsSelectedOrNot());
	}

	@When("^the User Select The Australia Country From The Countries Dropdown$")
	public void the_User_Select_The_Australia_Country_From_The_Countries_Dropdown() throws Throwable {
		DriverHelper.selectTheSingleDropDownUsingSelectClassValue(pom.getDropdownModule().getSelectTheCountry1(),
				Constants.getSelectTheCountry1());
	}

	@When("^the User Click The Countries Dropdown$")
	public void the_User_Click_The_Countries_Dropdown() throws Throwable {
		DriverHelper.clickOnElement(pom.getDropdownModule().getClickTheCountryDropDown());
	}

	@When("^the User Select The China Country From The Countries Dropdown$")
	public void the_User_Select_The_China_Country_From_The_Countries_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getDropdownModule().getSelectTheCountry2(),
				Constants.getSelectTheCountry2());
	}

	@When("^the User get The All Options From The Country Dropdown$")
	public void the_User_get_The_All_Options_From_The_Country_Dropdown() throws Throwable {
		DriverHelper.getTheAllOptionsFromDropDownWithoutUsingGetOptions(pom.getDropdownModule().getAllCountryText());
	}

	@When("^the User Select The Green Colour From The Colours Dropdown$")
	public void the_User_Select_The_Green_Colour_From_The_Colours_Dropdown() throws Throwable {
		DriverHelper.selectTheSingleDropDownUsingSelectClassVisibleText(pom.getDropdownModule().getSelectTheColour1(),
				Constants.getSelectTheColour1());
	}

	@When("^the User Select The White Colour From The Colours Dropdown$")
	public void the_User_Select_The_White_Colour_From_The_Colours_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getDropdownModule().getSelectTheColour2(),
				Constants.getSelectTheColour2());
	}

	@When("^the User get The All Options From The Colours Dropdown$")
	public void the_User_get_The_All_Options_From_The_Colours_Dropdown() throws Throwable {
		DriverHelper.getTheAllOptionsFromDropDownWithoutUsingGetOptions(pom.getDropdownModule().getAllColourText());
	}

	@When("^the User Select The Cat  From The Animals Dropdown$")
	public void the_User_Select_The_Cat_From_The_Animals_Dropdown() throws Throwable {
		DriverHelper.selectTheSingleDropDownUsingSelectClassVisibleText(pom.getDropdownModule().getSelectTheAnimal1(),
				Constants.getSelectTheAnimal1());
	}

	@When("^the User Select The Elephant  From The Animals Dropdown$")
	public void the_User_Select_The_Elephant_From_The_Animals_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getDropdownModule().getSelectTheAnimal2(),
				Constants.getSelectTheAnimal2());
	}

	@Then("^the User perform Scrolldown On The Webpage And User Want To Navigate The Datepicker Module$")
	public void the_User_perform_Scrolldown_On_The_Webpage_And_User_Want_To_Navigate_The_Datepicker_Module()
			throws Throwable {
		DriverHelper.getTheAllOptionsFromDropDownWithoutUsingGetOptions(pom.getDropdownModule().getAllAnimalText());
		DriverHelper.scrollDownTheWebPageUsingJavaScriptExecutor(0, 300);
	}

	@When("^the User First Click The Datepicker Field$")
	public void the_User_First_Click_The_Datepicker_Field() throws Throwable {
		DriverHelper.clickOnElement(pom.getDatePickerModule().getDatePickerClick1());
	}

	@When("^the User Select The Month and Year From The First Datepicker Table$")
	public void the_User_Select_The_Month_and_Year_From_The_First_Datepicker_Table() throws Throwable {
		while (true) {
			String augustMonth = pom.getDatePickerModule().getMonths().getText();
			String yearss = pom.getDatePickerModule().getYears().getText();
			if (augustMonth.equalsIgnoreCase(Constants.getDatePickerMonth1())
					&& yearss.equalsIgnoreCase(Constants.getDatePickerYear1())) {
				break;
			} else {
				DriverHelper.clickOnElement(pom.getDatePickerModule().getNextButtonClick());
			}
		}

	}

	@When("^the User Select The Date From The  Datepicker Table$")
	public void the_User_Select_The_Date_From_The_Datepicker_Table() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getDatePickerModule().getSelectTheDate(),
				Constants.getDatePickerDate1());
	}

	@When("^the User Click The Second Datepicker Field$")
	public void the_User_Click_The_Second_Datepicker_Field() throws Throwable {
		DriverHelper.clickOnElement(pom.getDatePickerModule().getDatePickerClick2());
	}

	@When("^the User Select The Month  From The Second Datepicker Table$")
	public void the_User_Select_The_Month_From_The_Second_Datepicker_Table() throws Throwable {
		DriverHelper.selectTheSingleDropDownUsingSelectClassVisibleText(pom.getDatePickerModule().getMonthDropdown(),
				Constants.getDatePickerMonth2());
	}

	@When("^the User Select The Year  From The Second Datepicker Table$")
	public void the_User_Select_The_Year_From_The_Second_Datepicker_Table() throws Throwable {
		DriverHelper.selectTheSingleDropDownUsingSelectClassVisibleText(pom.getDatePickerModule().getYearDropdown(),
				Constants.getDatePickerYear2());
	}

	@When("^the User Select The Date  From The Second Datepicker Table$")
	public void the_User_Select_The_Date_From_The_Second_Datepicker_Table() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getDatePickerModule().getSelectDate(),
				Constants.getDatePickerDate2());
	}

	@When("^the User Clicks The Post Adom Link For The First Time Opening a New Window$")
	public void the_User_Clicks_The_Post_Adom_Link_For_The_First_Time_Opening_a_New_Window() throws Throwable {
		DriverHelper.clickOnElement(pom.getDatePickerModule().getPostAtomClick1());
	}

	@When("^the User Handle The New Window$")
	public void the_User_Handle_The_New_Window() throws Throwable {
		DriverHelper.handleTheWindow(1);
	}

	@When("^the User Scroll Into Webpage Bottom$")
	public void the_User_Scroll_Into_Webpage_Bottom() throws Throwable {
		DriverHelper.goToWebPageBottomUsingJavaScriptExecutor();
		DriverHelper.waits(1000);
	}

	@When("^the User Close The Child Window$")
	public void the_User_Close_The_Child_Window() throws Throwable {
		DriverHelper.driverClose();
	}

	@When("^the User Returns To The Parent Window and Clicks The Post Adom Link again$")
	public void the_User_Returns_To_The_Parent_Window_and_Clicks_The_Post_Adom_Link_again() throws Throwable {
		DriverHelper.handleTheWindow(0);
		DriverHelper.clickOnElement(pom.getDatePickerModule().getPostAtomClick2());
	}

	@When("^the User Handles The New Window Again$")
	public void the_User_Handles_The_New_Window_Again() throws Throwable {
		DriverHelper.handleTheWindow(1);
	}

	@When("^the User Scrolls To The Webpage Bottom Again$")
	public void the_User_Scrolls_To_The_Webpage_Bottom_Again() throws Throwable {
		DriverHelper.goToWebPageBottomUsingJavaScriptExecutor();
		DriverHelper.waits(1000);
	}

	@When("^the User Closes The Child Window Again$")
	public void the_User_Closes_The_Child_Window_Again() throws Throwable {
		DriverHelper.driverClose();
	}

	@When("^the User Returns To The Parent Window Again$")
	public void the_User_Returns_To_The_Parent_Window_Again() throws Throwable {
		DriverHelper.handleTheWindow(0);
	}

	@Then("^the User Get The Post Adom Text and Navigates To The Webtable Module$")
	public void the_User_Get_The_Post_Adom_Text_and_Navigates_To_The_Webtable_Module() throws Throwable {
		DriverHelper.getTheSingleText(pom.getWebTableModule().getThePostAdomText());
	}

	@When("^the User Mouse Hover  Over The First  Upload File button$")
	public void the_User_Mouse_Hover_Over_The_First_Upload_File_button() throws Throwable {
		DriverHelper.moveToElementUsingActionsClass(pom.getWebTableModule().getMoveToElement1());
	}

	@When("^the User Click The First  Upload File button$")
	public void the_User_Click_The_First_Upload_File_button() throws Throwable {
		DriverHelper.clickOnElement(pom.getWebTableModule().getClickTheElement1());
	}

	@When("^the User Mouse Hover Over The Second  Upload File button$")
	public void the_User_Mouse_Hover_Over_The_Second_Upload_File_button() throws Throwable {
		DriverHelper.moveToElementUsingActionsClass(pom.getWebTableModule().getClickTheElement2());
	}

	@When("^the User Click The Second  Upload File button$")
	public void the_User_Click_The_Second_Upload_File_button() throws Throwable {
		DriverHelper.clickOnElement(pom.getWebTableModule().getClickTheElement2());
	}

	@When("^the User Scroll Down On The Webpage Using Javascript Executor$")
	public void the_User_Scroll_Down_On_The_Webpage_Using_Javascript_Executor() throws Throwable {
		DriverHelper.scrollDownTheWebPageUsingJavaScriptExecutor(0, 500);
	}

	@When("^the User Retrieve The First Webtable Headers Data$")
	public void the_User_Retrieve_The_First_Webtable_Headers_Data() throws Throwable {
		DriverHelper.getTheTableHeaders(pom.getWebTableModule().getTableHeadersData());
	}

	@When("^the User Retrieve The First Webtable Entire Data$")
	public void the_User_Retrieve_The_First_Webtable_Entire_Data() throws Throwable {
		DriverHelper.getTheTableAllData(pom.getWebTableModule().getTableEntireData());
	}

	@When("^the User Retrieve A Single Data From  First webtable$")
	public void the_User_Retrieve_A_Single_Data_From_First_webtable() throws Throwable {
		DriverHelper.getTheTableSingleData(pom.getWebTableModule().getTableSingleData());
	}

	@When("^the User Retrieve The Entire Column Count Of The First webtable$")
	public void the_User_Retrieve_The_Entire_Column_Count_Of_The_First_webtable() throws Throwable {
		DriverHelper.getTheTableColumnCount(pom.getWebTableModule().getTableColumnCount());
	}

	@When("^the User Retrieve The Entire Row Count Of The First webtable$")
	public void the_User_Retrieve_The_Entire_Row_Count_Of_The_First_webtable() throws Throwable {
		DriverHelper.getTheTableRowCount(pom.getWebTableModule().getTableRowCount());
	}

	@When("^the User Retrieve The Entire Data Count Of The First webtable$")
	public void the_User_Retrieve_The_Entire_Data_Count_Of_The_First_webtable() throws Throwable {
		DriverHelper.getTheTableAllDataCount(pom.getWebTableModule().getTableEntireDataCount());
	}

	@When("^the User Retrieve The Specific Row Count Of The First webtable$")
	public void the_User_Retrieve_The_Specific_Row_Count_Of_The_First_webtable() throws Throwable {
		DriverHelper.getTheTableParticularRowData(pom.getWebTableModule().getTableParticularRowData());
	}

	@When("^the User Retrieve The Specific Column Count Of The First webtable$")
	public void the_User_Retrieve_The_Specific_Column_Count_Of_The_First_webtable() throws Throwable {
		DriverHelper.getTheTableParticularColumnData1(pom.getWebTableModule().getTableParticularColumnData());
	}

	@When("^the User Second Time Scolldown On The Webpage$")
	public void the_User_Second_Time_Scolldown_On_The_Webpage() throws Throwable {
		DriverHelper.scrollDownTheWebPageUsingJavaScriptExecutor(0, 500);
	}

	@When("^the User Retrieve The Second Webtable Headers Data$")
	public void the_User_Retrieve_The_Second_Webtable_Headers_Data() throws Throwable {
		DriverHelper.getTheTableHeaders(pom.getWebTableModule().getTableHeadersData2());
	}

	@When("^the User Retrieve The Second Webtable Entire Data$")
	public void the_User_Retrieve_The_Second_Webtable_Entire_Data() throws Throwable {
		DriverHelper.getTheTableAllData(pom.getWebTableModule().getTableEntireData2());
	}

	@When("^the User Retrieve A Single Data From  Second webtable$")
	public void the_User_Retrieve_A_Single_Data_From_Second_webtable() throws Throwable {
		DriverHelper.getTheTableSingleData(pom.getWebTableModule().getTableSingleData2());
	}

	@When("^the User Retrieve The Entire Column Count Of The Second webtable$")
	public void the_User_Retrieve_The_Entire_Column_Count_Of_The_Second_webtable() throws Throwable {
		DriverHelper.getTheTableColumnCount(pom.getWebTableModule().getTableColumnCount2());
	}

	@When("^the User Retrieve The Entire Row Count Of The Second webtable$")
	public void the_User_Retrieve_The_Entire_Row_Count_Of_The_Second_webtable() throws Throwable {
		DriverHelper.getTheTableRowCount(pom.getWebTableModule().getTableRowCount2());
	}

	@When("^the User Retrieve The Entire Data Count Of The Second webtable$")
	public void the_User_Retrieve_The_Entire_Data_Count_Of_The_Second_webtable() throws Throwable {
		DriverHelper.getTheTableAllDataCount(pom.getWebTableModule().getTableColumnCount2());
	}

	@When("^the User Retrieve The Specific Row Count Of The Second webtable$")
	public void the_User_Retrieve_The_Specific_Row_Count_Of_The_Second_webtable() throws Throwable {
		DriverHelper.getTheTableParticularRowData(pom.getWebTableModule().getTableParticularRowData2());
	}

	@Then("^the User Retrieve The Specific Column Count Of The Second webtable  and the User Navigates To The  Module$")
	public void the_User_Retrieve_The_Specific_Column_Count_Of_The_Second_webtable_and_the_User_Navigates_To_The_Module()
			throws Throwable {
		DriverHelper.getTheTableParticularColumnData1(pom.getWebTableModule().getTableParticularColumnData2());
	}

	@When("^the User Enter The Text In The First Form Field$")
	public void the_User_Enter_The_Text_In_The_First_Form_Field() throws Throwable {
		DriverHelper.sendTheValue(pom.getFormModule().getFormText1(), Constants.getFormField1());
	}

	@When("^the User Enter The Text In The Second Form Field$")
	public void the_User_Enter_The_Text_In_The_Second_Form_Field() throws Throwable {
		DriverHelper.sendTheValue(pom.getFormModule().getFormText2(), Constants.getFormField2());
	}

	@When("^the User Enter The Text In The Third Form Field$")
	public void the_User_Enter_The_Text_In_The_Third_Form_Field() throws Throwable {
		DriverHelper.sendTheValue(pom.getFormModule().getFormText3(), Constants.getFormField3());
	}

	@When("^the User Click The Hidden Element Link$")
	public void the_User_Click_The_Hidden_Element_Link() throws Throwable {
		DriverHelper.clickOnElement(pom.getFormModule().getHiddenElementClick());
	}

	@When("^the User Enter The First Hidden Element Value In The First Hidden Element Field$")
	public void the_User_Enter_The_First_Hidden_Element_Value_In_The_First_Hidden_Element_Field() throws Throwable {
		DriverHelper.sendTheValue(pom.getFormModule().getHiddenElementValue1(), Constants.getHiddenElementValue1());
	}

	@When("^the User Click The First Hidden Element Check Box$")
	public void the_User_Click_The_First_Hidden_Element_Check_Box() throws Throwable {
		DriverHelper.clickOnElement(pom.getFormModule().getHiddenElementCheckbox1());
	}

	@When("^the User Click The Toggle Input Box Of The First Time$")
	public void the_User_Click_The_Toggle_Input_Box_Of_The_First_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getFormModule().getClickToggleInputBox2());
	}

	@When("^the User Enter The Toggle Input Value In The Second Hidden Element Field$")
	public void the_User_Enter_The_Toggle_Input_Value_In_The_Second_Hidden_Element_Field() throws Throwable {
		DriverHelper.sendTheValue(pom.getFormModule().getHiddenElementValue2(), Constants.getHiddenElementValue1());
	}

	@When("^the User Click The Toggle Check Box Of The First Time$")
	public void the_User_Click_The_Toggle_Check_Box_Of_The_First_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getFormModule().getClickToggleCheckBox2());
	}

	@When("^the User Click The Second Hidden Element Check Box$")
	public void the_User_Click_The_Second_Hidden_Element_Check_Box() throws Throwable {
		DriverHelper.clickOnElement(pom.getFormModule().getHiddenElementCheckbox2());
	}

	@When("^the User Click The Toggle Input Box Of The Second Time$")
	public void the_User_Click_The_Toggle_Input_Box_Of_The_Second_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getFormModule().getClickToggleInputBox2());
	}

	@When("^the User Click The Toggle Check Box Of The Second Time$")
	public void the_User_Click_The_Toggle_Check_Box_Of_The_Second_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getFormModule().getClickToggleCheckBox2());
	}

	@When("^the User Scroll Into Webpage Bottom oOf The Second Time$")
	public void the_User_Scroll_Into_Webpage_Bottom_oOf_The_Second_Time() throws Throwable {
		DriverHelper.goToWebPageBottomUsingJavaScriptExecutor();
	}

	@When("^the User Click The Download File Link$")
	public void the_User_Click_The_Download_File_Link() throws Throwable {
		DriverHelper.clickOnElement(pom.getFormModule().getDownloadFileClick());
	}

	@When("^the User Enter The Text In The Download Text Field$")
	public void the_User_Enter_The_Text_In_The_Download_Text_Field() throws Throwable {
		DriverHelper.sendTheValue(pom.getFormModule().getEnterTextField(), Constants.getHiddenElementValue2());
	}

	@When("^the User Scroll Into Webpage Bottom oOf The Third Time$")
	public void the_User_Scroll_Into_Webpage_Bottom_oOf_The_Third_Time() throws Throwable {
		DriverHelper.goToWebPageBottomUsingJavaScriptExecutor();
	}

	@When("^the User Click The Home Link$")
	public void the_User_Click_The_Home_Link() throws Throwable {
		DriverHelper.clickOnElement(pom.getFormModule().getClickTheHomeLink());
	}

	@When("^the User Enters  A Name In The Name Field Of The Second Time$")
	public void the_User_Enters_A_Name_In_The_Name_Field_Of_The_Second_Time() throws Throwable {
		DriverHelper.sendTheValue(pom.getFormModule().getNameField2(), Constants.getNameField2());
	}

	@When("^the User Enters  An Email In The Email Field Of The Second Time$")
	public void the_User_Enters_An_Email_In_The_Email_Field_Of_The_Second_Time() throws Throwable {
		DriverHelper.sendTheValue(pom.getFormModule().getEMailField2(), Constants.getEMailField2());
	}

	@When("^the User Enters  A Phone Number In The Phone Number Field Of The Second Time$")
	public void the_User_Enters_A_Phone_Number_In_The_Phone_Number_Field_Of_The_Second_Time() throws Throwable {
		DriverHelper.sendTheValue(pom.getFormModule().getPhoneNumberField2(), Constants.getPhoneNumberField2());
	}

	@Then("^the User Enters  An Address In The Address Field Of The Second Time and The User Navigate to Window Handling Module$")
	public void the_User_Enters_An_Address_In_The_Address_Field_Of_The_Second_Time_and_The_User_Navigate_to_Window_Handling_Module()
			throws Throwable {
		DriverHelper.sendTheValue(pom.getFormModule().getAddressField2(), Constants.getAddressField2());
	}

	@When("^the User Enter The Text In The New Tab Text Field$")
	public void the_User_Enter_The_Text_In_The_New_Tab_Text_Field() throws Throwable {
		DriverHelper.sendTheValue(pom.getMultipleWindowHandlingModule().getNewTabTextField(),
				Constants.getNewTabTextField());
	}

	@When("^the User Click The New Tab search Box$")
	public void the_User_Click_The_New_Tab_search_Box() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getClickTheSearchButton());
	}

	@When("^the User Click The TestNG Text Of The Link$")
	public void the_User_Click_The_TestNG_Text_Of_The_Link() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getTestNGClick());
	}

	@When("^the User Handle The Child Window For TextNG$")
	public void the_User_Handle_The_Child_Window_For_TextNG() throws Throwable {
		DriverHelper.handleTheWindow(1);
	}

	@When("^the User Scroll Into The TestNG Webpage Bottom$")
	public void the_User_Scroll_Into_The_TestNG_Webpage_Bottom() throws Throwable {
		DriverHelper.goToWebPageBottomUsingJavaScriptExecutor();
	}

	@When("^the User Click The Wikimedia Foundation Link and Close The Wikimedia Foundation Window$")
	public void the_User_Click_The_Wikimedia_Foundation_Link_and_Close_The_Wikimedia_Foundation_Window()
			throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getclickWikimediaFoundation());
		DriverHelper.driverClose();
	}

	@When("^the User Returns To Parent Window For Window Handling$")
	public void the_User_Returns_To_Parent_Window_For_Window_Handling() throws Throwable {
		DriverHelper.handleTheWindow(0);
	}

	@When("^the User Click The New Tab button Of The First Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_First_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Second Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Second_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Third Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Third_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Fourth Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Fourth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Fifth Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Fifth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Sixth Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Sixth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Seventh Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Seventh_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Eighth Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Eighth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Nineth Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Nineth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Tenth Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Tenth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Eleventh Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Eleventh_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Twelth Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Twelth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Thirteenth Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Thirteenth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Fourteenth Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Fourteenth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Click The New Tab button Of The Fifteenth Time$")
	public void the_User_Click_The_New_Tab_button_Of_The_Fifteenth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewTabClick1());

	}

	@When("^the User Wants Switch To The Sixteenth Window and Close The Sixteenth Window$")
	public void the_User_Wants_Switch_To_The_Sixteenth_Window_and_Close_The_Sixteenth_Window() throws Throwable {
		DriverHelper.handleTheWindow(15);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Fifteenth Window and Close The Fifteenth Window$")
	public void the_User_Wants_Switch_To_The_Fifteenth_Window_and_Close_The_Fifteenth_Window() throws Throwable {
		DriverHelper.handleTheWindow(14);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Fourteenth Window and Close The Fourteenth Window$")
	public void the_User_Wants_Switch_To_The_Fourteenth_Window_and_Close_The_Fourteenth_Window() throws Throwable {
		DriverHelper.handleTheWindow(13);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Thirteenth Window and Close The Thirteenth Window$")
	public void the_User_Wants_Switch_To_The_Thirteenth_Window_and_Close_The_Thirteenth_Window() throws Throwable {
		DriverHelper.handleTheWindow(12);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Twelth Window and Close The Twelth Window$")
	public void the_User_Wants_Switch_To_The_Twelth_Window_and_Close_The_Twelth_Window() throws Throwable {
		DriverHelper.handleTheWindow(11);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Eleventh Window and Close The Eleventh Window$")
	public void the_User_Wants_Switch_To_The_Eleventh_Window_and_Close_The_Eleventh_Window() throws Throwable {
		DriverHelper.handleTheWindow(10);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Tenth Window and Close The Tenth Window$")
	public void the_User_Wants_Switch_To_The_Tenth_Window_and_Close_The_Tenth_Window() throws Throwable {
		DriverHelper.handleTheWindow(9);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Nineth Window and Close The Nineth Window$")
	public void the_User_Wants_Switch_To_The_Nineth_Window_and_Close_The_Nineth_Window() throws Throwable {
		DriverHelper.handleTheWindow(8);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Eighth Window and Close The Eighth Window$")
	public void the_User_Wants_Switch_To_The_Eighth_Window_and_Close_The_Eighth_Window() throws Throwable {
		DriverHelper.handleTheWindow(7);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Seventh Window and Close The Seventh Window$")
	public void the_User_Wants_Switch_To_The_Seventh_Window_and_Close_The_Seventh_Window() throws Throwable {
		DriverHelper.handleTheWindow(6);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Sixth Window and Close The Sixth Window$")
	public void the_User_Wants_Switch_To_The_Sixth_Window_and_Close_The_Sixth_Window() throws Throwable {
		DriverHelper.handleTheWindow(5);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Fifth Window and Close The Fifth Window$")
	public void the_User_Wants_Switch_To_The_Fifth_Window_and_Close_The_Fifth_Window() throws Throwable {
		DriverHelper.handleTheWindow(4);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Fourth Window and Close The Fourth Window$")
	public void the_User_Wants_Switch_To_The_Fourth_Window_and_Close_The_Fourth_Window() throws Throwable {
		DriverHelper.handleTheWindow(3);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Third Window and Close The Third Window$")
	public void the_User_Wants_Switch_To_The_Third_Window_and_Close_The_Third_Window() throws Throwable {
		DriverHelper.handleTheWindow(2);
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Second Window and Close The Second Window$")
	public void the_User_Wants_Switch_To_The_Second_Window_and_Close_The_Second_Window() throws Throwable {
		DriverHelper.handleTheWindow(1);
	}

	@When("^the User Wants Switch To The First Window and Close The First Window$")
	public void the_User_Wants_Switch_To_The_First_Window_and_Close_The_First_Window() throws Throwable {
		DriverHelper.driverClose();
	}

	@When("^the User Wants Switch To The Current Parent Window$")
	public void the_User_Wants_Switch_To_The_Current_Parent_Window() throws Throwable {
		DriverHelper.handleTheWindow(0);
	}

	@When("^the User Click The Multiple Window button$")
	public void the_User_Click_The_Multiple_Window_button() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getNewPopupWindowClick());
	}

	@When("^the User Switch To First Child Window and Maximize The First Child Window$")
	public void the_User_Switch_To_First_Child_Window_and_Maximize_The_First_Child_Window() throws Throwable {
		DriverHelper.handleTheWindow(2);
		DriverHelper.maximizeTheWindow();
	}

	@When("^the User Close The First Child Window Browser$")
	public void the_User_Close_The_First_Child_Window_Browser() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getMaximizeTheWindowModule1());
		DriverHelper.driverClose();
	}

	@When("^the User Switch To Second  Child Window and Maximize The Second Child Window$")
	public void the_User_Switch_To_Second_Child_Window_and_Maximize_The_Second_Child_Window() throws Throwable {
		DriverHelper.handleTheWindow(1);
		DriverHelper.maximizeTheWindow();
	}

	@When("^the User Click The About Dropdown button and Close The Second Child Window$")
	public void the_User_Click_The_About_Dropdown_button_and_Close_The_Second_Child_Window() throws Throwable {
		DriverHelper.clickOnElement(pom.getMultipleWindowHandlingModule().getAboutClick());
		DriverHelper.driverClose();
	}

	@Then("^the User Returns The Current Parent Window and The User Navigate To Alert Module$")
	public void the_User_Returns_The_Current_Parent_Window_and_The_User_Navigate_To_Alert_Module() throws Throwable {
		DriverHelper.handleTheWindow(0);
	}

	@When("^the User Click The Simple Alert Box button$")
	public void the_User_Click_The_Simple_Alert_Box_button() throws Throwable {
		DriverHelper.clickOnElement(pom.getAlertModule().getSimpleAlertBoxClick());
	}

	@When("^the User Handle The Simple Alert Using Accept Method$")
	public void the_User_Handle_The_Simple_Alert_Using_Accept_Method() throws Throwable {
		DriverHelper.handleTheSimpleAlert();
	}

	@When("^the User Click The Confirm Alert Box button$")
	public void the_User_Click_The_Confirm_Alert_Box_button() throws Throwable {
		DriverHelper.clickOnElement(pom.getAlertModule().getConfirmAlertBoxClick());
	}

	@When("^the User Handle The Confirm Alert Using Accept Method$")
	public void the_User_Handle_The_Confirm_Alert_Using_Accept_Method() throws Throwable {
		DriverHelper.acceptTheConfirmAlert();
	}

	@When("^the User Click The Prompt Alert Box button$")
	public void the_User_Click_The_Prompt_Alert_Box_button() throws Throwable {
		DriverHelper.clickOnElement(pom.getAlertModule().getPromptAlertBoxClick());
	}

	@When("^the User Handle The Prompt Alert Using Accept Method$")
	public void the_User_Handle_The_Prompt_Alert_Using_Accept_Method() throws Throwable {
		DriverHelper.acceptThePromptAlertAlert(Constants.getAlertBoxMessage());
	}

	@When("^the User Click The Simple Alert Box button Of The Second Time$")
	public void the_User_Click_The_Simple_Alert_Box_button_Of_The_Second_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getAlertModule().getSimpleAlertBoxClick());
	}

	@When("^the User Handle The Simple Alert Using Accept Method Of The Second Time$")
	public void the_User_Handle_The_Simple_Alert_Using_Accept_Method_Of_The_Second_Time() throws Throwable {
		DriverHelper.handleTheSimpleAlert();
	}

	@When("^the User Click The Confirm Alert Box button Of The Second Time$")
	public void the_User_Click_The_Confirm_Alert_Box_button_Of_The_Second_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getAlertModule().getConfirmAlertBoxClick());
	}

	@When("^the User Handle The Confirm Alert Using Dismiss Method$")
	public void the_User_Handle_The_Confirm_Alert_Using_Dismiss_Method() throws Throwable {
		DriverHelper.acceptTheConfirmAlert();
	}

	@When("^the User Click The Prompt Alert Box button Of The Second Time$")
	public void the_User_Click_The_Prompt_Alert_Box_button_Of_The_Second_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getAlertModule().getPromptAlertBoxClick());
	}

	@When("^the User Handle The Prompt Alert Using Dismiss Method Of The Second Time$")
	public void the_User_Handle_The_Prompt_Alert_Using_Dismiss_Method_Of_The_Second_Time() throws Throwable {
		DriverHelper.acceptThePromptAlertAlert(Constants.getAlertBoxMessage());
	}

	@When("^the User Click The Simple Alert Box button Of The Third Time$")
	public void the_User_Click_The_Simple_Alert_Box_button_Of_The_Third_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getAlertModule().getSimpleAlertBoxClick());
	}

	@When("^the User Handle The Simple Alert Using Accept Method Of The Third Time$")
	public void the_User_Handle_The_Simple_Alert_Using_Accept_Method_Of_The_Third_Time() throws Throwable {
		DriverHelper.handleTheSimpleAlert();
	}

	@When("^the User Click The Confirm Alert Box button Of The Third Time$")
	public void the_User_Click_The_Confirm_Alert_Box_button_Of_The_Third_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getAlertModule().getConfirmAlertBoxClick());
	}

	@When("^the User Handle The Confirm Alert Using Dissmiss Method Of The Third Time$")
	public void the_User_Handle_The_Confirm_Alert_Using_Dissmiss_Method_Of_The_Third_Time() throws Throwable {
		DriverHelper.acceptTheConfirmAlert();
	}

	@When("^the User Click The Prompt Alert Box button Of The Third Time$")
	public void the_User_Click_The_Prompt_Alert_Box_button_Of_The_Third_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getAlertModule().getPromptAlertBoxClick());
	}

	@When("^the User Handle The Prompt Alert Using Dismiss Method Of The Third Time$")
	public void the_User_Handle_The_Prompt_Alert_Using_Dismiss_Method_Of_The_Third_Time() throws Throwable {
		DriverHelper.acceptThePromptAlertAlert(Constants.getAlertBoxMessage());
	}

	@When("^the User Perform The Mouse Hover Over The Point Me button$")
	public void the_User_Perform_The_Mouse_Hover_Over_The_Point_Me_button() throws Throwable {
		DriverHelper.moveToElementUsingActionsClass(pom.getActionsModule().getMouseHoverTheElement());
	}

	@When("^the User Right Click The Laptop button$")
	public void the_User_Right_Click_The_Laptop_button() throws Throwable {
		DriverHelper.contextClickUsingActionsClass(pom.getActionsModule().getContextClick());
	}

	@When("^the User Click The Open New Tab button Using Robot Class$")
	public void the_User_Click_The_Open_New_Tab_button_Using_Robot_Class() throws Throwable {
		DriverHelper.clickTheNewTabWithKeyBoardActiosUsingRobotClass();
	}

	@When("^the User Handle The New Tab For Enter The Text Fields$")
	public void the_User_Handle_The_New_Tab_For_Enter_The_Text_Fields() throws Throwable {
		DriverHelper.handleTheWindow(1);
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(0);
	}

	@When("^the User Enter The Name In The Name Field Of The New Tab$")
	public void the_User_Enter_The_Name_In_The_Name_Field_Of_The_New_Tab() throws Throwable {
		DriverHelper.sendTheValue(pom.getActionsModule().getNameField1(), Constants.getNameField1());
	}

	@When("^the User Enter The Email In The Email Field Of The New Tab$")
	public void the_User_Enter_The_Email_In_The_Email_Field_Of_The_New_Tab() throws Throwable {
		DriverHelper.sendTheValue(pom.getActionsModule().getEMailField1(), Constants.getEMailField1());
	}

	@When("^the User Enter The Phone Number In The Phone Number Field Of The New Tab$")
	public void the_User_Enter_The_Phone_Number_In_The_Phone_Number_Field_Of_The_New_Tab() throws Throwable {
		DriverHelper.sendTheValue(pom.getActionsModule().getPhoneNumberField1(), Constants.getPhoneNumberField1());
	}

	@When("^the User Enter The Address In The Address Field Of The New Tab$")
	public void the_User_Enter_The_Address_In_The_Address_Field_Of_The_New_Tab() throws Throwable {
		DriverHelper.sendTheValue(pom.getActionsModule().getAddressField1(), Constants.getAddressField1());
	}

	@When("^the User Click The Male Radio button Of The New Tab$")
	public void the_User_Click_The_Male_Radio_button_Of_The_New_Tab() throws Throwable {
		DriverHelper.clickOnElement(pom.getActionsModule().getGenderClick());
	}

	@When("^the User Click The Friday Check Box Of The New Tab$")
	public void the_User_Click_The_Friday_Check_Box_Of_The_New_Tab() throws Throwable {
		DriverHelper.clickOnElement(pom.getActionsModule().getDayClick());
	}

	@When("^the User Close The New Tab and Switch To Parrent Window$")
	public void the_User_Close_The_New_Tab_and_Switch_To_Parrent_Window() throws Throwable {
		DriverHelper.driverClose();
		DriverHelper.handleTheWindow(0);
	}

	@When("^the User Double Click The Second Field Using Actions Class$")
	public void the_User_Double_Click_The_Second_Field_Using_Actions_Class() throws Throwable {
		DriverHelper.doubleClickUsingActionsClass(pom.getActionsModule().getDoubleClickTheElement());
	}

	@Then("^the User Perform The Drag and Drop Using Actions Class and The User Navigate To Scrolling Dropdown Module$")
	public void the_User_Perform_The_Drag_and_Drop_Using_Actions_Class_and_The_User_Navigate_To_Scrolling_Dropdown_Module()
			throws Throwable {
		DriverHelper.dragAndDropUsingActionsClass(pom.getActionsModule().getDragMethod(),
				pom.getActionsModule().getDropMethod());
	}

	@When("^the User Double Click The First Svg Element Using Actions Class$")
	public void the_User_Double_Click_The_First_Svg_Element_Using_Actions_Class() throws Throwable {
		DriverHelper.doubleClickUsingActionsClass(pom.getScrollingDropdownModule().getSvgElement1());
	}

	@When("^the User Double Click The Second Svg Element Using Actions Class$")
	public void the_User_Double_Click_The_Second_Svg_Element_Using_Actions_Class() throws Throwable {
		DriverHelper.doubleClickUsingActionsClass(pom.getScrollingDropdownModule().getSvgElement2());
	}

	@When("^the User Double Click The Third Svg Element Using Actions Class$")
	public void the_User_Double_Click_The_Third_Svg_Element_Using_Actions_Class() throws Throwable {
		DriverHelper.doubleClickUsingActionsClass(pom.getScrollingDropdownModule().getSvgElement3());
	}

	@When("^the User Scroll On The WebPage For Scrolling Dropdown$")
	public void the_User_Scroll_On_The_WebPage_For_Scrolling_Dropdown() throws Throwable {
		DriverHelper.scrollDownTheWebPageUsingJavaScriptExecutor(0, 400);
	}

	@When("^the User Click The Scrolling Dropdown Of The First Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_First_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The First Item From The Dropdown$")
	public void the_User_Select_The_First_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios1());
	}

	@When("^the User Click The Scrolling Dropdown Of The Second Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Second_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Fifth Item From The Dropdown$")
	public void the_User_Select_The_Fifth_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios5());
	}

	@When("^the User Click The Scrolling Dropdown Of The Third Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Third_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Tenth Item From The Dropdown$")
	public void the_User_Select_The_Tenth_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios10());
	}

	@When("^the User Click The Scrolling Dropdown Of The Fourth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Fourth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Fifteenth Item From The Dropdown$")
	public void the_User_Select_The_Fifteenth_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios15());
	}

	@When("^the User Click The Scrolling Dropdown Of The Fifth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Fifth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Twentyth Item From The Dropdown$")
	public void the_User_Select_The_Twentyth_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios20());
	}

	@When("^the User Click The Scrolling Dropdown Of The Sixth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Sixth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Twenty Fifth Item From The Dropdown$")
	public void the_User_Select_The_Twenty_Fifth_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios25());
	}

	@When("^the User Click The Scrolling Dropdown Of The Seventh Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Seventh_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Thirty  Item From The Dropdown$")
	public void the_User_Select_The_Thirty_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios30());
	}

	@When("^the User Click The Scrolling Dropdown Of The Eighth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Eighth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Thirty Fifth Item From The Dropdown$")
	public void the_User_Select_The_Thirty_Fifth_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios35());
	}

	@When("^the User Click The Scrolling Dropdown Of The Nineth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Nineth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Fourty Item From The Dropdown$")
	public void the_User_Select_The_Fourty_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios40());
	}

	@When("^the User Click The Scrolling Dropdown Of The Tenth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Tenth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Fourty Five Item From The Dropdown$")
	public void the_User_Select_The_Fourty_Five_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios45());
	}

	@When("^the User Click The Scrolling Dropdown Of The Eleventh Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Eleventh_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Fifty Item From The Dropdown$")
	public void the_User_Select_The_Fifty_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios50());
	}

	@When("^the User Click The Scrolling Dropdown Of The Twelth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Twelth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Fifty Five Item From The Dropdown$")
	public void the_User_Select_The_Fifty_Five_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios55());
	}

	@When("^the User Click The Scrolling Dropdown Of The Thirteenth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Thirteenth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Sixty Item From The Dropdown$")
	public void the_User_Select_The_Sixty_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios60());
	}

	@When("^the User Click The Scrolling Dropdown Of The Fourteenth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Fourteenth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());

	}

	@When("^The User Select The Sixty Six Item From The Dropdown$")
	public void the_User_Select_The_Sixty_Six_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios66());
	}

	@When("^the User Click The Scrolling Dropdown Of The Fifteenth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Fifteenth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Seventy Item From The Dropdown$")
	public void the_User_Select_The_Seventy_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios70());
	}

	@When("^the User Click The Scrolling Dropdown Of The Sixteenth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Sixteenth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Seventy Five Item From The Dropdown$")
	public void the_User_Select_The_Seventy_Five_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios75());
	}

	@When("^the User Click The Scrolling Dropdown Of The Seventeenth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Seventeenth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Eighty Item From The Dropdown$")
	public void the_User_Select_The_Eighty_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios80());
	}

	@When("^the User Click The Scrolling Dropdown Of The Eighteenth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Eighteenth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Eighty Five Item From The Dropdown$")
	public void the_User_Select_The_Eighty_Five_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios85());
	}

	@When("^the User Click The Scrolling Dropdown Of The Nineteenth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Nineteenth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Ninety Item From The Dropdown$")
	public void the_User_Select_The_Ninety_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios90());
	}

	@When("^the User Click The Scrolling Dropdown Of The Twenteeth Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Twenteeth_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Ninety Five Item From The Dropdown$")
	public void the_User_Select_The_Ninety_Five_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios95());
	}

	@When("^the User Click The Scrolling Dropdown Of The Twenty First Time$")
	public void the_User_Click_The_Scrolling_Dropdown_Of_The_Twenty_First_Time() throws Throwable {
		DriverHelper.clickOnElement(pom.getScrollingDropdownModule().getScrollDropdownClick());
	}

	@When("^The User Select The Hundred Item From The Dropdown$")
	public void the_User_Select_The_Hundred_Item_From_The_Dropdown() throws Throwable {
		DriverHelper.selectTheDropDownWithoutUsingSelectClass(pom.getScrollingDropdownModule().getClickTheItem(),
				Constants.getScrollingDropDownOptios100());
	}
}
