package com.shift.mdes.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
public class PageTemplate extends
        LoadableComponent<PageTemplate> {

    String pageUrl;
    WebDriver driver;

    public PageTemplate(WebDriver driver, String url) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.pageUrl = url;
    }

    @Override
    protected void isLoaded() throws Error {
        String url = driver.getCurrentUrl();
        assertThat("Error: the required page is not loaded.", url, is(pageUrl));
    }

    @Override
    protected void load() {
        driver.get(pageUrl);
    }

    public boolean isTextPresent(String text) {
        return driver.findElements(By.xpath("//*[contains(.,'" + text + "')]"))
                .size() > 0;
    }

    public List<WebElement> getInputElementsByType(String type) {
        return driver.findElements(By.xpath("//input[@type='" + type + "']"));
    }
}
