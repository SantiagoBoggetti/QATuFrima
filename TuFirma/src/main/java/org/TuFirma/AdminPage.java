package org.TuFirma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private By validarAdminPage1 = By.xpath("/html/body/app-root/layout/classy-layout/div/div[3]/span");

    private By validarAdminPage2 = By.xpath("/html/body/app-root/layout/classy-layout/div/div[3]/span");

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean validarAdminPage1() {
        WebElement elementValidacionlogin1 = wait.until(ExpectedConditions.presenceOfElementLocated(validarAdminPage1));
        return elementValidacionlogin1.isDisplayed();
    }

    public boolean validarAdminPage2() {
        WebElement elementValidacionlogin2 = wait.until(ExpectedConditions.presenceOfElementLocated(validarAdminPage2));
        return elementValidacionlogin2.isDisplayed();
    }
}