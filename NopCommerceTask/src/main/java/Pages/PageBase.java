package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver driver;
	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//just only on this page , no new objects
	protected static void ClickButton(WebElement button) {
		button.click();
	}
	protected static void setTextElementText (WebElement textElemenet , String Value) {
		textElemenet.sendKeys(Value);
	}
}