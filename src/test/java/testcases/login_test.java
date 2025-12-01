package testcases;


import projectobjects.Login_page;

import org.testng.Assert;
import org.testng.annotations.Test;

public class login_test extends BaseTest {
    @Test(priority = 1)
    public void loginWithValidCredentials() {
        Login_page loginpage = new Login_page(driver);

        loginpage.enterUsername(prop.getProperty("username"));
        loginpage.enterPassword(prop.getProperty("password"));
        loginpage.clickLogin();
        

        Assert.assertTrue(loginpage.getErrorMessage(),
                "User was NOT redirected to inventory page after login");
    }
    @Test(priority = 2)
    public void loginWithInvalidUsername(){
        Login_page loginpage = new Login_page(driver);
        loginpage.enterUsername("Wronguser");
        loginpage.enterPassword(prop.getProperty("password"));
        loginpage.clickLogin();
    }
    @Test(priority = 2)
    public void loginWithInvalidPassword(){
        Login_page loginpage = new Login_page(driver);
        loginpage.enterUsername(prop.getProperty("username"));
        loginpage.enterPassword("Admin@123");
        loginpage.clickLogin();
    }
    @Test(priority = 4)
    public void loginwithblankUsernameandPassword(){
        Login_page loginpage = new Login_page(driver);
        loginpage.enterUsername(" ");
        loginpage.enterPassword(" ");
        loginpage.clickLogin();
    }

    @Test(priority =3)
    public void verifyUserRedirectedToCorrectURLAfterLogin(){
        Login_page loginpage = new Login_page(driver);
        loginpage.enterUsername(prop.getProperty("username"));
        loginpage.enterPassword(prop.getProperty("password"));
        loginpage.clickLogin();

        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL,"User is not redirected to Products Page ");

    }

    @Test(priority = 5)
    public void verifyLockedOUtUserLogin(){
        Login_page loginpage = new Login_page(driver);

        loginpage.enterUsername("locked_out_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickLogin();


    }


}
