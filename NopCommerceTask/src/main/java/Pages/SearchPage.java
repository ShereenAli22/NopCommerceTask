package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(id="small-searchterms")
	public WebElement SearchTextBox;
	@FindBy(css="input.button-1.search-box-button")
	public WebElement SearchButton;
	@FindBy(id="ui-id-3")
	public WebElement Theproduct;

	@FindBy(css="div.product-name")
	public WebElement ProductHTC;
	



	public void ProductSearch(String Products) {

		setTextElementText ( SearchTextBox , Products );
		ClickButton(Theproduct);
		


	}

}
