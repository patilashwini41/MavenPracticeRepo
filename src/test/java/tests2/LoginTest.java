package tests2;


import org.testng.annotations.Test;

import pages2.LoginPage;


public class LoginTest extends BaseTestClass
{
 @Test
 public void login() 
 {
 LoginPage lp=new LoginPage(driver);
 lp.Credential();
 lp.loginclick();
 }
}
