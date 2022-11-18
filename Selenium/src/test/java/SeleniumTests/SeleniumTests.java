package SeleniumTests;

import Selenium.Driver;
import Selenium.LinkedinPage;
import Selenium.LoginPage;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SeleniumTests {

    public Driver driver = new Driver();
    public LoginPage loginPage;

    public LinkedinPage linkedinPage;

    WebDriver webDriver;


    @BeforeTest
    public void openBrowser() {
        driver.setUp();
        webDriver = driver.launchBrowser();
    }

    @Test(priority = 1)
    public void printTitleTest() {
        System.out.println(driver.printTitle());

    }

    @Test(priority = 2)
    public void login() {
        loginPage = new LoginPage(webDriver);
        loginPage.enterUsername("seleniumautotest2019@gmail.com");
        loginPage.setPassword("Selenium2019");
        loginPage.openLinkedinPage();
    }

    @Test(priority = 3)
    public void jobsList() {
        linkedinPage = new LinkedinPage(webDriver);
        linkedinPage.getJobsList();
    }

    @AfterTest
    public void close() {
        driver.closeBrowser();
    }

}
