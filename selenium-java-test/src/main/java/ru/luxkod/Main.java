package ru.luxkod;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriverManager
                .chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        webDriver.get("http://localhost:3000/");

        WebElement linkToFormPageElement = webDriver.findElement(By.tagName("a"));
        linkToFormPageElement.click();

        WebElement nameFormElement = webDriverWait
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.name("username")));

        nameFormElement.sendKeys("aaaaa");
    }
}