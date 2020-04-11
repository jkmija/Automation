package com.automation.core.selenium.browser;

import static com.automation.core.selenium.util.Constants.IMPLICIT_WAIT_TIME;
import static com.automation.core.selenium.util.Constants.LOAD_PAGE_TIME;
import static com.automation.core.selenium.util.Constants.WAIT_TIME;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {

  private static DriverManager instance;
  private WebDriver webDriver;
  private WebDriverWait webDriverWait;

  private DriverManager() {
    initWebDriver();
  }

  public static DriverManager getInstance() {
    if (instance == null) {
      instance = new DriverManager();
    }
    return instance;
  }

  private void initWebDriver() {
    webDriver = FactoryDriver.getDriver("CHROME").initWebDriver();
    webDriver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
    webDriver.manage().timeouts().pageLoadTimeout(LOAD_PAGE_TIME, TimeUnit.SECONDS);
    webDriver.manage().window().maximize();
    webDriverWait = new WebDriverWait(webDriver, WAIT_TIME);
  }

  public WebDriver getWebDriver() {
    return webDriver;
  }

  public WebDriverWait getWebDriverWait() {
    return webDriverWait;
  }

}
