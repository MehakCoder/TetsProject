package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    public WebDriver driver;
    public static Properties prop;

    @BeforeMethod
    public void setup() throws IOException {
        driver = new ChromeDriver();

        FileInputStream fs = new FileInputStream("D:\\seleniumwebdriver\\Automation\\src\\main\\java\\configration\\config.properties");
        prop = new Properties();
        prop.load(fs);

        driver.get(prop.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

