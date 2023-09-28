package org.TuFirma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private By validarLoginPage1 = By .xpath("/html/body/app-root/layout/empty-layout/div/div/auth-sign-in/div/sign-in-classic/div/div/div/sign-in-header-component/div[1]/img");

    private By validarLoginPage2 = By .xpath("/html/body/app-root/layout/empty-layout/div/div/auth-sign-in/div/sign-in-classic/div/div/div/sign-in-header-component/div[2]");

    private By emailLogin = By .xpath("//input[@formcontrolname='email' and @type='email']");

    private By contrasenaLogin = By .xpath("//input[@type='password']");

    private By BtnLogin = By .xpath("/html/body/app-root/layout/empty-layout/div/div/auth-sign-in/div/sign-in-classic/div/div/div/signin-form-component/form/button/span[5]");




    public LoginPage (WebDriver driver) {
        this.driver = driver;
        this.wait =new WebDriverWait(driver, Duration.ofSeconds(15));

    }
    public boolean validarLogin1() {
        WebElement elementValidacionlogin1 = wait.until(ExpectedConditions.presenceOfElementLocated(validarLoginPage1));
        return elementValidacionlogin1 .isDisplayed();

    }
    public boolean validarLogin2() {
        WebElement elementValidacionlogin2 = wait.until(ExpectedConditions.presenceOfElementLocated(validarLoginPage2));
        return elementValidacionlogin2 .isDisplayed();
    }
    public void login(String email, String password) {
        WebElement elementMailUsuario = wait.until(ExpectedConditions.presenceOfElementLocated(emailLogin));
        elementMailUsuario.sendKeys(email);

        WebElement elementContrasenaUsuario = wait.until(ExpectedConditions.presenceOfElementLocated(contrasenaLogin));
        elementContrasenaUsuario.sendKeys(password);

        WebElement elementClickSignIn = wait.until(ExpectedConditions.elementToBeClickable(BtnLogin));
        elementClickSignIn.click();


}
}
