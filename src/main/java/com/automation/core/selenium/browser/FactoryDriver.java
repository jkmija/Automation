package com.automation.core.selenium.browser;

import org.openqa.selenium.WebDriverException;

public class FactoryDriver {
  private static final String BROWSER_NOT_FOUND = "Browser not found";
  private FactoryDriver(){}

  public static IDriver getDriver(String browser) {
    switch (Browser.valueOf(browser)) {
      case CHROME:
        return new Chrome();
      case FIREFOX:
        return new Firefox();
      default:
        throw new WebDriverException(BROWSER_NOT_FOUND);
    }
  }
}
