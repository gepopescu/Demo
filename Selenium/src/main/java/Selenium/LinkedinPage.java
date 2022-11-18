package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class LinkedinPage extends Driver {


    @FindBy(xpath = "//*[@class='jobs-job-board-list__item list-style-none']")
    public List<WebElement> jobsTable;
    @FindBy(xpath = "//*[@id='global-nav']/div/nav/ul/li[3]/a")
    public WebElement jobsBtn;

    public LinkedinPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void getJobsList() {
        waitForThePageToBeLoaded();
        jobsBtn.click();
        waitForThePageToBeLoaded();
        System.out.println("First recommended job" + Arrays.stream(jobsTable.get(0).getText().split("\n")).findFirst());
        System.out.println("Second recommended job" + Arrays.stream(jobsTable.get(1).getText().split("\n")).findFirst());

    }
}
