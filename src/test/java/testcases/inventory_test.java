package testcases;

import org.testng.annotations.BeforeMethod;

import projectobjects.Login_page;
import projectobjects.inventory_page;

public class inventory_test extends BaseTest {
 
	inventory_page inventoryPage;
	
	@BeforeMethod
	public void setupLogin() {
		Login_page loginPage = new Login_page(driver);
		  loginPage.enterUsername("standard_user");
	      loginPage.enterPassword("secret_sauce");
	      loginPage.clickLogin();

	        inventoryPage = new inventory_page(driver);	
	}
	
	
}
