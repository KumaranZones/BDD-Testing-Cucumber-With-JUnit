package org.testUtilities;


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testBase.BaseClass;

	public class DriverHelper extends BaseClass {

		public static void getUrl(String url) {
			driver.get(url);
		}

		public static void getThePageTitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}

		public static void getTheCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}

		public static void getThePageSource() {
			driver.getPageSource();
		}

		public static void getTheSingleWindowId() {
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
		}

		public static void getTheMultipleWindowId() {
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
		}

		public static void navigateTheUrl(String url) {
			driver.navigate().to(url);
		}

		public static void navigateBack() {
			driver.navigate().back();
		}

		public static void navigateForward() {
			driver.navigate().forward();
		}

		public static void navigateRefresh() {
			driver.navigate().refresh();
		}

		public static void driverClose() {
			driver.close();
		}

		public static void driverQuit() {
			driver.quit();
		}

		public static void clickOnElement(WebElement element) {
			element.click();
		}

		public static void sendTheValue(WebElement element, String value) {
			element.sendKeys(value);
		}

		public static void clearTheElement(WebElement element) {
			element.clear();
		}

		public static void getTheSingleText(WebElement element) {
			String textValue = element.getText();
			System.out.println(textValue);
		}

		public static void getTheMultipleText(List<WebElement> elements) {
			for (WebElement allText : elements) {
				System.out.println(allText.getText());
			}
		}

		public static void getTheAttribute(WebElement element) {
			String attributeValue = element.getAttribute("value");
			System.out.println(attributeValue);
		}

		public static void getTheDomAttributeValue(WebElement element) {
			String attributeValue = element.getAttribute("href");
			System.out.println(attributeValue);
		}
		public static void getTheDomTagSize(List<WebElement> element) {
			System.out.println(element.size());
		}
		

		public static void elementIsDisPlayedOrNot(WebElement element) {
			boolean isDisplay = element.isDisplayed();
			System.out.println(isDisplay);
		}

		public static void elementIsEnabledOrNot(WebElement element) {
			boolean isEnable = element.isEnabled();
			System.out.println(isEnable);
		}

		public static void elementIsSelectedOrNot(WebElement element) {
			boolean isSelect = element.isSelected();
			System.out.println(isSelect);
		}

		public static void getTheDomTagCount(List<WebElement> element) {
			int tagCount = element.size();
			System.out.println(tagCount);
		}

		public static void getAllTextOfTheLinkOnTheWebPage(List<WebElement> element) {
			for (WebElement allLinks : element) {
				System.out.println(allLinks.getText() + "<----->" + allLinks.getAttribute("href"));
			}
		}

		public static void maximizeTheWindow() {
			driver.manage().window().maximize();
		}

		public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		}

		public static void implicitWait(int seconds) {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		}

		public static void explicitWaitForElementToBeVisibilityOf(WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, 25);
			wait.until(ExpectedConditions.visibilityOf(element));
		}

		public static void explicitWaitForElementToBeClickable(WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}

		public static void explicitWaitForElementToBeSelected(WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, 25);
			wait.until(ExpectedConditions.elementToBeSelected(element));
		}

		public static void explicitWaitForElementToBeVisibilityOf(WebElement element, int seconds) {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOf(element));
		}

		public static void explicitWaitForElementToBeClickable(WebElement element, int seconds) {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}

		public static void explicitWaitForElementToBeSelected(WebElement element, int seconds) {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.elementToBeSelected(element));
		}

		public static void usingFluentWait(WebElement element, int seconds) {
			FluentWait wait = new FluentWait(driver);
			wait.withTimeout(25, TimeUnit.SECONDS);
			wait.pollingEvery(5, TimeUnit.SECONDS);
			wait.ignoring(Exception.class);
		}

//		public static void takeTheScreenshotUsingFileUtils(String fileName) {
//			try {
//				TakesScreenshot ts = (TakesScreenshot) driver;
//				File source = ts.getScreenshotAs(OutputType.FILE);
//				File destination = new File(
//						Constants.getScreenshotFilePath() + "\\" + fileName + System.currentTimeMillis() + ".png");
//				FileUtils.copyFile(source, destination);
//			} catch (IOException e) {
//				System.out.println("Throw the screenshot file path problem");
//			}
//		}

//		public static void takeTheScreenshotUsingFileHandler(String fileName) {
//			try {
//				TakesScreenshot ts = (TakesScreenshot) driver;
//				File source = ts.getScreenshotAs(OutputType.FILE);
//				File destination = new File(
//						Constants.getScreenshotFilePath() + "\\" + fileName + System.currentTimeMillis() + ".png");
//				FileHandler.copy(source, destination);
//			} catch (IOException e) {
//				System.out.println("Throw the screenshot file path problem");
//			}
//		}

//		public static void oneTimeTakeTheScreenshotUsingFileUtils(String fileName) {
//			try {
//				TakesScreenshot ts = (TakesScreenshot) driver;
//				File source = ts.getScreenshotAs(OutputType.FILE);
//				File destination = new File(Constants.getScreenshotFilePath() + "\\" + fileName + ".png");
//				FileUtils.copyFile(source, destination);
//			} catch (IOException e) {
//				System.out.println("Throw the screenshot file path problem");
//			}
//		}

//		public static void takeTheScreenshotOnParticularElement(WebElement element, String fileName) {
//			try {
//				File source = element.getScreenshotAs(OutputType.FILE);
//				File destination = new File(
//						Constants.getScreenshotFilePath() + "\\" + fileName + System.currentTimeMillis() + ".png");
//				FileUtils.copyFile(source, destination);
//			} catch (IOException e) {
//				System.out.println("Throw the screenshot file path problem");
//			}
//		}

//		public static void takeTheScreenshotOnListOfElements(List<WebElement> element, String fileName) {
//			try {
//				for (WebElement allElements : element) {
//					File source = allElements.getScreenshotAs(OutputType.FILE);
//					File destination = new File(
//							Constants.getScreenshotFilePath() + "\\" + fileName + System.currentTimeMillis() + ".png");
//					FileUtils.copyFile(source, destination);
//				}
//			} catch (IOException e) {
//				System.out.println("Throw the screenshot file path problem");
//			}
//		}
		public static void handleTheSimpleAlert() {
			driver.switchTo().alert().accept();
		}
		public static void acceptTheConfirmAlert() {
			driver.switchTo().alert().accept();
		}
		public static void dismissTheConfirmAlert() {
			driver.switchTo().alert().dismiss();
		}
		public static void acceptThePromptAlertAlert(String alertMessage) {
			driver.switchTo().alert().sendKeys(alertMessage);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		}
		public static void dismissThePromptAlertAlert(String alertMessage) {
			driver.switchTo().alert().sendKeys(alertMessage);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();
		}
		public static void handleTheAuthenticationPopup(String authenticationUrl) {
			driver.get(authenticationUrl);
		}
		public static void handleThePermissionBasedPopup(String authenticationUrl) {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
		}
		public static void handleTheRadioButtonUsingIfStatements(WebElement element) {
			if(element.isDisplayed()) {
				System.out.println(element.isDisplayed());
				if(element.isEnabled()) {
					System.out.println(element.isEnabled());
					if(!element.isSelected()) {
						System.out.println(element.isSelected());
						element.click();
						if(element.isSelected()) {
							System.out.println(element.isSelected());
						}else {
							System.out.println("Element to be Not Selected");
						}
					}else {
						System.out.println("Element to be selected");
					}
				}else {
					System.out.println("Element to be not Enabled");
				}
			}else {
				System.out.println("Element to be not displayed");
			}
		}
//		public static void handleTheRadioButtonUsingAssertion(WebElement element) {
//			boolean isDisplay = element.isDisplayed();
//			Assert.assertTrue(isDisplay);
//			System.out.println(isDisplay);
//			
//			boolean isEnable = element.isEnabled();
//			Assert.assertTrue(isEnable);
//			System.out.println(isEnable);
//			
//			boolean isSelect = element.isSelected();
//			Assert.assertFalse(isSelect);
//			System.out.println(isSelect);
//			element.click();
//			
//			boolean isSelect1 = element.isSelected();
//			Assert.assertTrue(isSelect1);
//			System.out.println(isSelect1);
//		}
		public static void scrollIntoViewTheElementUsingJavaScriptExecutor(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView()",element);
		}
		public static void scrollDownTheWebPageUsingJavaScriptExecutor(int xaxis,int yaxis) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		}
		public static void scrollUpTheWebPageUsingJavaScriptExecutor(int xaxis,int yaxis) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+xaxis+",-"+yaxis+")");
		}
		public static void goToWebPageBottomUsingJavaScriptExecutor() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}
		public static void goToWebPageTopUsingJavaScriptExecutor() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		}
		public static void sendTheValueUsingJavaScriptExecutor(WebElement element,String values) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].value='"+values+"'",element);
		}
		public static void clickTheElementUsingJavaScriptExecutor(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",element);
		}
		public static void clearTheElementUsingJavaScriptExecutor(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].clear()",element);
		}
		public static void refreshTheWebPageUsingJavaScriptExecutor() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("history.go(0)");
		}
		public static void selectTheSingleDropDownUsingSelectClassIndex(WebElement element,int index) {
			Select s = new Select(element);
			s.selectByIndex(index);
		}
		public static void selectTheSingleDropDownUsingSelectClassValue(WebElement element,String value) {
			Select s = new Select(element);
			s.selectByValue(value);
		}
		public static void selectTheSingleDropDownUsingSelectClassVisibleText(WebElement element,String value) {
			Select s = new Select(element);
			s.selectByVisibleText(value);
		}
		public static void selectTheMultipleDropDownUsingSelectClassIndex(WebElement element,int index) {
			Select s = new Select(element);
			s.selectByIndex(index);
		}
		public static void selectTheMultipleDropDownUsingSelectClassValue(WebElement element,String value) {
			Select s = new Select(element);
			s.selectByValue(value);
		}
		public static void selectTheMultipleDropDownUsingSelectClassVisibleText(WebElement element,String value) {
			Select s = new Select(element);
			s.selectByVisibleText(value);
		}
		public static void selectTheDropDownUsingGetOptions(WebElement element,String value) {
			Select s = new Select(element);
			List<WebElement> allOptions = s.getOptions();
			for(WebElement allOption : allOptions) {
				if(allOption.getText().equals(value)) {
					allOption.click();
					break;
				}
			}
		}
		public static void selectTheDropDownWithoutUsingSelectClass(List<WebElement> element,String values) {
			for(WebElement allOptions : element) {
				if(allOptions.getText().equals(values)) {
					allOptions.click();
					break;
				}
			}
		}
		public static void getTheAllOptionsFromDropDownWithoutUsingGetOptions(List<WebElement> element) {
			for(WebElement allOptions : element) {
				System.out.println(allOptions.getText());
			}
		}
		public static void getTheAllOptionsFromDropDownWithUsingGetOptions(WebElement element1,List<WebElement> element,String values) {
			Select s = new Select(element1);
			List<WebElement> allOptions = s.getOptions();
			for(WebElement all : allOptions) {
				System.out.println(all.getText());
			}
		}
		public static void contextClickUsingActionsClass(WebElement element) {
			Actions as = new Actions(driver);
			as.contextClick(element).build().perform();
		}
		public static void doubleClickUsingActionsClass(WebElement element) {
			Actions as = new Actions(driver);
			as.doubleClick(element).build().perform();
		}
		public static void sendTheValueUsingActionsClass(WebElement element,String value) {
			Actions as = new Actions(driver);
			as.sendKeys(element,value).build().perform();
		}
		public static void clickTheElementUsingActionsClass(WebElement element) {
			Actions as = new Actions(driver);
			as.click(element).build().perform();
		}
		public static void dragAndDropUsingActionsClass(WebElement element1,WebElement element2) {
			Actions as = new Actions(driver);
			as.dragAndDrop(element1, element2).build().perform();
		}
		public static void sliderHandlingUsingActionsClass(WebElement element,int xaxis,int yaxis) {
			Actions as = new Actions(driver);
			as.dragAndDropBy(element,xaxis,yaxis).build().perform();
		}
		public static void moveToElementUsingActionsClass(WebElement element) {
			Actions as = new Actions(driver);
			as.moveToElement(element).build().perform();
		}
		public static void sendTheValueWithKeyBoardActiosUsingRobotClass() {
			try {
			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_S);
			r.keyPress(KeyEvent.VK_E);
			r.keyRelease(KeyEvent.VK_E);
			r.keyPress(KeyEvent.VK_L);
			r.keyRelease(KeyEvent.VK_L);
			r.keyPress(KeyEvent.VK_E);
			r.keyRelease(KeyEvent.VK_E);
			r.keyPress(KeyEvent.VK_N);
			r.keyRelease(KeyEvent.VK_N);
			r.keyPress(KeyEvent.VK_I);
			r.keyRelease(KeyEvent.VK_I);
			r.keyPress(KeyEvent.VK_U);
			r.keyRelease(KeyEvent.VK_U);
			r.keyPress(KeyEvent.VK_M);
			r.keyRelease(KeyEvent.VK_M);
			
			
			}catch(AWTException e) {
				System.out.println("Throw the AWTException");
			}
		}
		public static void clickTheNewTabWithKeyBoardActiosUsingRobotClass() {
			try {
			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
			}catch(AWTException e) {
				System.out.println("Throw the AWTException");
			}
		}

		public static void frameHandlingUsingIndex(int index) {
			driver.switchTo().frame(index);
		}
		public static void frameHandlingUsingId(String id) {
			driver.switchTo().frame(id);
		}
		public static void frameHandlingUsingName(String name) {
			driver.switchTo().frame(name);
		}
		public static void frameHandlingUsingWebElement(WebElement element) {
			driver.switchTo().frame(element);
		}
		public static void switchFromFrameToWebPage() {
			driver.switchTo().defaultContent();
		}
		public static void switchFromChildFrameToParentFrame() {
			driver.switchTo().parentFrame();
		}
		public static void handleTheWindow(int index) {
			Set<String> allWindows = driver.getWindowHandles();
			List list = new ArrayList(allWindows);
			driver.switchTo().window((String)list.get(index));
		}
		public static void getTheAllDataFromWebTable(List<WebElement> element1,List<WebElement> element2,WebElement element3) {
			int tableHeaderRowsSize = element1.size();
			for(int i=0; i<tableHeaderRowsSize; i++) {
				int tableColumnRowSize = element2.size();
				for(int j=0; j<tableColumnRowSize; j++) {
					String value = element3.getText();
					System.out.println(value+"|");
				}
				System.out.println();
			}
		}
		public static void getTheTableHeaders(List<WebElement> element) {
			for(WebElement headers : element) {
				System.out.println(headers.getText());
			}
		}
		public static void getTheTableAllData(List<WebElement> element) {
			for(WebElement tableAllData : element) {
				System.out.println(tableAllData.getText());
			}
		}
		public static void getTheTableSingleData(WebElement element) {
				System.out.println(element.getText());
		}
		public static void getTheTableColumnCount(List<WebElement> element) {
			System.out.println("Table Column Count : "+element.size());
		}
		public static void getTheTableRowCount(List<WebElement> element) {
			System.out.println("Table Row Count : "+element.size());
		}
		public static void getTheTableAllDataCount(List<WebElement> element) {
			System.out.println("Table All Data Count : "+element.size());
		}
		public static void getTheTableParticularRowData(List<WebElement> element) {
			for(WebElement particularRowData : element) {
				System.out.println(particularRowData.getText());
			}
	}
		
		//If id : tagName.idName>tbody>tr>td:nth-child(2)
		public static void getTheTableParticularColumnData1(List<WebElement> element) {
			for(WebElement tableParticularColumn : element) {
				System.out.println(tableParticularColumn.getText());
			}
		}
		//If className    :      tagName#className>tbody>tr>td:nth-child(2)
			public static void getTheTableParticularColumnData2(List<WebElement> element,int index) {
				for(WebElement particulerData : element) {
					List<WebElement> tableColumn = particulerData.findElements(By.tagName("td"));
					WebElement tableParticularColumn = tableColumn.get(index);
					System.out.println(tableParticularColumn.getText());
				}
			}
			public static void datePickerHandling1(String month,String year,String date,WebElement element1,WebElement element2,List<WebElement> element3) {
				String s1 = month;
				String s2 = year;
				String s3 = date;
				
				while(true) {
					String monthAndYear = element1.getText();
					String[] split = monthAndYear.split(" ");
					String month1 = split[0];
					String year1 = split[1];
					if(s1.equalsIgnoreCase(month1) && (s2.equalsIgnoreCase(year1))) {
						break;
					}else {
						element2.click();
					}
				}
				for(WebElement allDates : element3) {
					if(allDates.getText().equals(s3)) {
						allDates.click();
						break;
					}
				}
			}
			public static void datePickerHandling2(String month,String year,String date,WebElement monthElement,WebElement yearElement,WebElement nextButtonElement,List<WebElement> allDateElements) {
				String s1 = month;
				String s2 = year;
				String s3 = date;
				
				while(true) {
					String month1 = monthElement.getText();
					String year1 = yearElement.getText();
					if(s1.equalsIgnoreCase(month1) && (s2.equalsIgnoreCase(year1))) {
						break;
					}else {
						nextButtonElement.click();
					}
				}
				for(WebElement allDates : allDateElements) {
					if(allDates.getText().equals(s3)) {
						allDates.click();
						break;
					}
				}
			}
		public static void waits(int seconds) {
			try {
				Thread.sleep(seconds);
			}catch(InterruptedException e) {
				System.out.println("Throw the NoSuchElementException");
			}
		}
//		public static void clickTheDatePicker(WebElement months,WebElement years,WebElement nextButtonClick) {
//			while(true) {
//				String augustMonth = months.getText();
//				String yearss = years.getText();
//				if (augustMonth.equalsIgnoreCase(Constants.getDatePickerMonth1()) && yearss.equalsIgnoreCase(Constants.getDatePickerYear1())) {
//					break;
//				} else {
//					nextButtonClick.click();
//				}
//			}
//			}
		
		
		
		
		
	

}
