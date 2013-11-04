package com.shift.mdes.test.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

/**
 * Created with IntelliJ IDEA.
 * User: lei.wang
 * Date: 13/11/03
 * Time: 12:13
 * To change this template use File | Settings | File Templates.
 */
public class Criteria {
    public static ExpectedCondition<WebElement> visibilityOfElementLocated(
            final By by) {
        return new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(by);
                return element.isDisplayed() ? element : null;
            }
        };
    }
}
