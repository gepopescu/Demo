package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Driver {

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"organic-div\"]/form/div[3]/button")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"artdeco-global-alert-container\"]/div/section/div/div[2]/button[1]")
    public WebElement acceptBtn;

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    // Set user name in textbox
    public void enterUsername(String strUserName) {

        waitForThePageToBeLoaded();
        acceptBtn.click();
        username.sendKeys(strUserName);
    }

    public void setPassword(String strPassword) {
        password.sendKeys(strPassword);
    }

    public void openLinkedinPage()  {
        signInButton.click();
        waitForThePageToBeLoaded();
    }
}
