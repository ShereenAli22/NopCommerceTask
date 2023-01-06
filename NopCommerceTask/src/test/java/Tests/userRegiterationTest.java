package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.UserRegisteration;

public class userRegiterationTest extends TestBase {
 HomePage homeObject;
 UserRegisteration RegistObject;
	@Test(priority =1)
	public void UserRegisterSuccessfully() {
		 homeObject = new HomePage(driver);
		 homeObject.OpenRegisterPage();
		 
		 RegistObject= new UserRegisteration(driver);
		 RegistObject.userRegisteration("Shereen", "Ali", "Testtt2222222222@gmail.com", "123456");
		 
		 Assert.assertTrue(RegistObject.successMessage.getText().contains("Your registration completed"));
	}
	@Test(priority =2)
	public void UserNotRegisterSuccessfully() {
		 homeObject = new HomePage(driver);
		 homeObject.OpenRegisterPage();
		 
		 RegistObject= new UserRegisteration(driver);
		 RegistObject.userRegisteration("Shereen", "Ali", "BlaBla", "123456");
		 
		 Assert.assertTrue(RegistObject.UnsuccessMessage.getText().contains("Wrong email"));
	}
	@Test(priority =3)
	public void UserNotRegisterInvalidPass() {
		 homeObject = new HomePage(driver);
		 homeObject.OpenRegisterPage();
		 
		 RegistObject= new UserRegisteration(driver);
		 RegistObject.userRegisteration("Shereen", "Ali", "sherena@gmail.com", "12");
		 
		 Assert.assertTrue(RegistObject.InvalidPass.getText().contains("must have at least 6 characters"));
	}
	@Test(priority =4)

	public void EmptyFields() {
		 homeObject = new HomePage(driver);
		 homeObject.OpenRegisterPage();
		 
		 RegistObject= new UserRegisteration(driver);
		 RegistObject.userRegisteration("", "", "", "");
		 
		 Assert.assertTrue(RegistObject.RequiredName.getText().contains("First name is required"));
		 Assert.assertTrue(RegistObject.RequiredEmail.getText().contains("Email is required"));
		 Assert.assertTrue(RegistObject.RequiredPassword.getText().contains("Password is required"));

	}
}
