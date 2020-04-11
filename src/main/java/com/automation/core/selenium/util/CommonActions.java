package com.automation.core.selenium.util;


import static com.automation.core.selenium.browser.DriverManager.getInstance;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions {

  private static final WebDriver driver = getInstance().getWebDriver();
  private static final WebDriverWait wait = getInstance().getWebDriverWait();

  private CommonActions(){}

  public static void enterTextField(final WebElement webElement, final String text) {
    wait.until(ExpectedConditions.visibilityOf(webElement));
    webElement.clear();
    webElement.sendKeys(text);
  }

  public static void clickElement(WebElement webElement) {
    wait.until(ExpectedConditions.elementToBeClickable(webElement));
    webElement.click();
  }

  public static void selectListBoxByValue(WebElement element, String value) {
    // wait.until(ExpectedConditions.visibilityOf(element));
    new Select(element).selectByValue(value);
  }

  public static String getText(WebElement webElement) {
    wait.until(ExpectedConditions.visibilityOf(webElement));
    return webElement.getText();
  }

  public static void clickElementByJavaScript(WebElement webElement) {
    wait.until(ExpectedConditions.elementToBeClickable(webElement));
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("arguments[0].click();", webElement);
  }
}
