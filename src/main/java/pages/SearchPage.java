package pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends HomePage {
    
        public SearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    
    protected By firstResult = By.xpath("/html/body/div[7]/div/div[9]/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/a/h3/span");
    
    public String getFirstResultText() {
        return wait.until(ExpectedConditions.elementToBeClickable(firstResult)).getText();
    }
    
}