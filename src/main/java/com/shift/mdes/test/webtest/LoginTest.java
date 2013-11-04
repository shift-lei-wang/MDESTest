package com.shift.mdes.test.webtest;

import com.shift.mdes.test.page.LoginPage;
import com.shift.mdes.test.util.Criteria;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: lei.wang
 * Date: 13/11/03
 * Time: 12:36
 * To change this template use File | Settings | File Templates.
 */
public class LoginTest {
    WebDriver driver;
    LoginPage page;

    @Test
    public void testPageContents() {
//        Assert.assertTrue(page.isTextPresent("Create Application"));
//        Assert.assertEquals(driver.getTitle(), "Create Application");
//        Assert.assertEquals(page.getInputElementsByType("text").size(), 29);
//        Assert.assertEquals(page.getInputElementsByType("checkbox").size(), 7);
    }

    @Test
    public void testDefaultValues() {
//        Assert.assertEquals(page.getDropdownSelectedValue("child.gender"),
//                "Male");
//        Assert.assertEquals(
//                page.getDropdownSelectedValue("mother.nationality"), "Chinese");
//        Assert.assertEquals(
//                page.getDropdownSelectedValue("child.preferredLanguage"),
//                "English");
//
//        // to check no checkbox is checked
//        for (Iterator<WebElement> i = page.getInputElementsByType("checkbox")
//                .iterator(); i.hasNext();) {
//            Assert.assertFalse(i.next().isSelected());
//        }
//
//        // to check the main contact is default to mother
//        Assert.assertEquals(page.getMainContact(), "mother");
    }

    @Test
    public void testValidations() {

    }

    @Test
    public void testSuccessfulLogin() {

    }

    @Test
    public void testFailedLoginNoSuchUser() {

    }

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        page = new LoginPage(driver).get();

        Wait<WebDriver> wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(Criteria.visibilityOfElementLocated(By
                .id("login")));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
