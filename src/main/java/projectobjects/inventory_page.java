package projectobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class inventory_page {
     WebDriver driver;
     
     @FindBy(className = "title")
     public WebElement productsTitle;
     
     @FindBy(className = "inventory_item")
     public List<WebElement> allProducts;
     
     @FindBy(css =".inventory_item_name ")
     public List<WebElement> productNames;
     
     @FindBy(css = ".inventory_item_img")
     public List<WebElement> productImages;

     @FindBy(css = ".inventory_item_desc")
     public List<WebElement> productDescriptions;
     
     @FindBy(css = ".inventory_item_price")
     public List<WebElement> productPrices;

     @FindBy(css = ".btn_inventory")
     public List<WebElement> addToCartButtons;

     @FindBy(className = "shopping_cart_badge")
     public WebElement cartBadge;

     @FindBy(className = "shopping_cart_link")
     public WebElement cartIcon;

     @FindBy(className = "product_sort_container")
     public WebElement sortDropdown;

     @FindBy(id = "react-burger-menu-btn")
     public WebElement menuButton;

     @FindBy(id = "logout_sidebar_link")
     public WebElement logoutButton;

     @FindBy(id = "reset_sidebar_link")
     public WebElement resetAppStateButton;

     @FindBy(css = "footer")
     public WebElement footer;

     @FindBy(css = "a.social_twitter")
     public WebElement twitterLink;

     @FindBy(css = "a.social_facebook")
     public WebElement facebookLink;

     @FindBy(css = "a.social_linkedin")
     public WebElement linkedinLink;
     
     public inventory_page(WebDriver driver) {
    	    this.driver = driver;
    	    PageFactory.initElements(driver, this);
    	}


 }
      

