package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ProductDetailsPage;
import Pages.SearchPage;

public class SearchTest extends TestBase {

	String ProductName="htc";
	String ProductName2="ultrabook";

	SearchPage searchObject;
	ProductDetailsPage ProductDetails;
	
	@Test
	public void SearchForProduct() throws InterruptedException {
		searchObject= new SearchPage(driver);
		searchObject.ProductSearch(ProductName);
		Assert.assertTrue(searchObject.ProductHTC.getText().contains("HTC One Mini Blue"));
		ProductDetails =new ProductDetailsPage(driver);
		ProductDetails.AddToWishlist();
		Thread.sleep(2000);
		searchObject= new SearchPage(driver);
		searchObject.ProductSearch(ProductName2);
		ProductDetails =new ProductDetailsPage(driver);
		ProductDetails.AddToWishlist2();
		//Open wishList page
		ProductDetails =new ProductDetailsPage(driver);
		ProductDetails.OpenWishlists();
		//Delete One from them
		ProductDetails =new ProductDetailsPage(driver);
		ProductDetails.RemoveFromWishList();
		//Selecting and adding cart
		ProductDetails =new ProductDetailsPage(driver);
		ProductDetails.SelectAddToCart();
		ProductDetails =new ProductDetailsPage(driver);
		ProductDetails.AddCartButton();
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://demo.nopcommerce.com/cart" );	
		System.out.println("URL is matching and Checkout page opens");
		

		
	}
	
	
}
