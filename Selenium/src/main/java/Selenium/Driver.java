package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Driver {
    public WebDriver webDriver;

    public void setUp(){
        String driverExecutablePath = "C:\\Dev\\Selenium\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverExecutablePath);
    }
    public WebDriver launchBrowser() {

        // Create a new instance of the Chrome driver
        this.webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        // Storing the Application Url in the String variable
        String url = "https://www.linkedin.com/login";

        //Launch the ToolsQA WebSite
        webDriver.get(url);

        return webDriver;

    }

    public String printTitle() {

        // Storing Title name in the String variable
        String title = webDriver.getTitle();
        return title;

    }

    public void waitForThePageToBeLoaded() {
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void closeBrowser() {
        webDriver.quit();
    }
}
