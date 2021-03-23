package login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import base.BaseTests;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.LoginPage;


public class LoginTests extends BaseTests {
        
    @Test
    public void testSuccessfulLogin() throws InterruptedException {
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = homePage.clickOnLoginButton();
        loginPage.login();
        
        //assertEquals("failure - Url's doesn't match!", "http://bvtest.school.cubes.rs/admin", driver.getCurrentUrl());
        //assertEquals("failure - heading's doesn't match!", "Dashboard", dashboardPage.getPanelHeading());
    }
    
}
