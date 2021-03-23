package pages;

import framework.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    
    private WebDriver driver;
    private WebDriverWait wait;
    private final By emailFieldLocator = By.name("identifier");
    private final By passwordFieldLocator = By.name("password");
    private final By loginButtonLocator = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]");
    
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    
    private void setValidEmail() {
        driver.findElement(emailFieldLocator).sendKeys(Configuration.validEmail);
        //wait.until(ExpectedConditions.elementToBeSelected(emailFieldLocator))
    }
    
    private void setValidPassword() {
        driver.findElement(passwordFieldLocator).sendKeys(Configuration.validPassword);
    }
        
    private void clickLoginButton() {
        driver.findElement(loginButtonLocator).click();
    }
           
    public HomePage login() throws InterruptedException {
        Thread.sleep(2000);
        setValidEmail();
        clickLoginButton();
        setValidPassword();
        clickLoginButton();
        return new HomePage(driver, wait);
    }    
}
