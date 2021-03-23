package search;

import base.BaseTests;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import pages.HomePage;
import pages.SearchPage;

public class SearchTests extends BaseTests {
    
    @Test
    public void testSearchParametar() {
        HomePage homePage = new HomePage(driver, wait);
        SearchPage searchPage = homePage.clickOnSearchButton("4Create");
        String firstResultText = searchPage.getFirstResultText();
        
        assertTrue("Failure - Url doesn't match", driver.getCurrentUrl().contains("https://www.google.com/search?"));
        assertTrue("Failure - searched text doesn't match", firstResultText.contains("4Create"));
    }
}
