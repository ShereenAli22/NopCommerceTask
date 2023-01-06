package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
 
	@FindBy(id="add-to-wishlist-button-19")
	public WebElement AddToWishList1;
	@FindBy(id="add-to-wishlist-button-7")
	public WebElement AddToWishList2;
	
	@FindBy(css="span.wishlist-label")
	public WebElement OpenWishlist;
	
	@FindBy(name="addtocart")
	public WebElement AddTocardBSelector;
	@FindBy(css="button.remove-btn")
	public WebElement RemoveButton;
	
	@FindBy(css="button.button-2.wishlist-add-to-cart-button")
	public WebElement AddToCart;
	
	
	public void AddToWishlist() {

		ClickButton(AddToWishList1);
	}
	public void AddToWishlist2() {

		ClickButton(AddToWishList2);
	}
	public void OpenWishlists() {

		ClickButton(OpenWishlist);	
	}
	public void RemoveFromWishList() {

		ClickButton(RemoveButton);	
	}
	
	public void SelectAddToCart() {

		ClickButton(AddTocardBSelector);	
	}
	public void AddCartButton() {

		ClickButton(AddToCart);	
	}
	
	
}
