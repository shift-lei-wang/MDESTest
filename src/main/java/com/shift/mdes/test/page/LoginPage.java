package com.shift.mdes.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: lei.wang
 * Date: 13/11/03
 * Time: 11:40
 * To change this template use File | Settings | File Templates.
 */
public class LoginPage extends
        LoadableComponent<LoginPage> {

    static final String PAGE_URL = "";
    WebDriver driver;
    @FindBy(how = How.ID_OR_NAME, using = "login")
    WebElement login_button;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    protected void isLoaded() throws Error {
        String url = driver.getCurrentUrl();
        assertThat("Error: the required page is not loaded.", url, is(PAGE_URL));
    }

    @Override
    protected void load() {
        driver.get(PAGE_URL);
    }

    public boolean isTextPresent(String text) {
        return driver.findElements(By.xpath("//*[contains(.,'" + text + "')]"))
                .size() > 0;
    }

    public void login() {
        login_button.click();
    }

    public List<WebElement> getInputElementsByType(String type) {
        return driver.findElements(By.xpath("//input[@type='" + type + "']"));
    }

//    public String getDropdownSelectedValue(String id) {
//        Select select = new Select(driver.findElement(By.xpath("//select[@id='"
//                + id + "']")));
//        WebElement option = select.getFirstSelectedOption();
//        return option.getText();
//    }

//    public String getMainContact() {
//        return maincontact_radiobox.getAttribute("value");
//    }

}
