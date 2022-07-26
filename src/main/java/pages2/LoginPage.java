package pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  @FindBy(id="txtUsername")
  private WebElement username;
  @FindBy(id="txtPassword")
  private WebElement password;
  @FindBy(id="btnLogin")
  private WebElement button1;
  
  public LoginPage(WebDriver driver)
  {
 
  PageFactory.initElements(driver, this);
  }
  
  public void Credential()
  {
  username.sendKeys("Admin");
  password.sendKeys("admin123");
  
  }
  public void loginclick()
  {
  button1.click();
  }

	

 }


