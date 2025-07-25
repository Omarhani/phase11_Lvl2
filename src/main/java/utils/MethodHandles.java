package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MethodHandles {

    protected WebDriver driver;

    WebDriverWait wait;

    public MethodHandles(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement webElement(By locator) {
        return driver.findElement(locator);
    }

    private void explicitWait(By locator, int time) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(webElement(locator)),
                ExpectedConditions.presenceOfElementLocated(locator),
                ExpectedConditions.elementToBeClickable(webElement(locator)),
                ExpectedConditions.visibilityOfElementLocated(locator)));
    }

    protected void click(By locator, int time) {
        explicitWait(locator, time);
        webElement(locator).click();
    }
    protected void clear(By locator, int time) {
        explicitWait(locator, time);
        webElement(locator).clear();
    }
    protected void sendKeys(By locator, int time, String text) {
        explicitWait(locator, time);
        webElement(locator).sendKeys(text);
    }
    protected String getText(By locator, int time) {
        explicitWait(locator, time);
        return webElement(locator).getText();
    }
    protected boolean isSelected(By locator, int time) {
        explicitWait(locator, time);
        return webElement(locator).isSelected();
    }
    protected boolean isDisplayed(By locator, int time) {
        explicitWait(locator, time);
        return webElement(locator).isDisplayed();
    }
    protected boolean isEnabled(By locator, int time) {
        explicitWait(locator, time);
        return webElement(locator).isEnabled();
    }


}
