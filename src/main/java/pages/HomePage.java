package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    
    protected WebDriver driver;
    protected WebDriverWait wait;
    
    protected By searchBoxFieldLocator = By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input");
    protected By searchButtonLocator = By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[1]");
    protected By loginButtonLocator = By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a");
    
    
    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    
    private void enterTextInSerchBox(String searchedText) {
        wait.until(ExpectedConditions.elementToBeClickable(searchBoxFieldLocator)).sendKeys(searchedText);
    }
    
    public SearchPage clickOnSearchButton(String searchedText) {
        enterTextInSerchBox(searchedText);
        driver.findElement(searchButtonLocator).click();
        return new SearchPage(driver, wait);
    }
    
    public LoginPage clickOnLoginButton() {
        driver.findElement(loginButtonLocator).click();
        return new LoginPage(driver, wait);
    }
}