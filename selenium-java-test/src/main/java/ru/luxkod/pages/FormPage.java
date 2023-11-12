package ru.luxkod.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
    private WebDriver webDriver;
    private By username = By.id("username");
    private By email = By.id("email");
    private By ratingStar(int starNumber) {
        return By.xpath("//span[text()='★' or text()='☆'][" + starNumber + "]");
    }

    public FormPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setUsername(String name) {
        webDriver.findElement(username).sendKeys(name);
    }

    public void setEmail(String email) {
        webDriver.findElement(this.email).sendKeys(email);
    }
}
