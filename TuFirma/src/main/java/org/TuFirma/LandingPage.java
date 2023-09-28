package org.TuFirma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private By BtnIniciarSesionLP = By.xpath("/html/body/app-root/layout/empty-layout/div/div/public-component/div/div[1]/app-nav-bar-public/nav/div[1]/nav-component/button");

    private By ValidarLandingPage1 = By.xpath("/html/body/app-root/layout/empty-layout/div/div/public-component/div/div[1]/app-nav-bar-public/nav/div[1]/div/span[1]/img");

    private By ValidarLandingPage2 = By.xpath("/html/body/app-root/layout/empty-layout/div/div/public-component/div/app-footer-public/section/footer/div/div/a/img");

    public LandingPage (WebDriver driver) {
       this.driver = driver;
        this.wait =new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void clickarIniciarSesionLP(){
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(BtnIniciarSesionLP));
        element1.click();
    }

    public void levantarPagina(String url){
        this.driver.get(url);
    }
}
