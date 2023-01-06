package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisteration extends PageBase {

	public UserRegisteration(WebDriver driver) {
		super(driver);
		
	}
	
  @FindBy(id="gender-male")
  WebElement GenderRadiobutton;
  
  @FindBy(id="FirstName")
  WebElement FirstNameBox;

  @FindBy(id="LastName")
  WebElement LastNameBox;
  
  @FindBy(id="Email")
  WebElement EmailAddress;
  
  @FindBy(id="Password")
  WebElement Password;
  @FindBy(id="ConfirmPassword")
  WebElement ConfirmPassword;
  
  @FindBy(id="register-button")
  WebElement RegisterButton;

  @FindBy(css="div.result")
  public WebElement successMessage;
  @FindBy(css="span.field-validation-error")
  public WebElement UnsuccessMessage;
  
  @FindBy(id="Password-error")
  public WebElement InvalidPass;
  @FindBy(id="FirstName-error")
  public WebElement RequiredName;
  @FindBy(id="Password-error")
  public WebElement RequiredPassword;
  @FindBy(id="Email-error")
  public WebElement RequiredEmail;
  
  public void userRegisteration(String FirstN, String LastN, String Email, String password ) {

	  ClickButton(GenderRadiobutton);
	  setTextElementText ( FirstNameBox ,  FirstN);
	  setTextElementText ( LastNameBox ,  LastN);
	  setTextElementText ( EmailAddress ,  Email);
	  setTextElementText ( Password ,  password);
	  setTextElementText ( ConfirmPassword ,  password);
	  

	  ClickButton(RegisterButton);
	  
	  
	  
  }
	
	
	
}
