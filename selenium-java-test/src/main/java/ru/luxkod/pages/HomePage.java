package ru.luxkod.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver webDriver;
    private By ourFrame = By.id("surveyFrame");
    private By ourForm = By.id("surveyForm");
    private By goToFormPageLink = By.linkText("Go to Form Page");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void switchToOurFrame() {
        webDriver
                .switchTo().frame(webDriver.findElement(ourFrame));
    }

    public void switchToDefaultContent() {
        webDriver.switchTo().defaultContent();
    }

    public void selectRadioOption(String id) {
        webDriver.findElement(By.id(id)).click();
    }

    public void submitForm() {
        webDriver.findElement(ourForm).submit();
    }

    public void clickGoToFormPageLink(){
        webDriver.findElement(goToFormPageLink).click();
    }
}
