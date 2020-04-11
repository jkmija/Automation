package com.automation.core.selenium.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements IDriver {

  @Override
  public WebDriver initWebDriver() {
    WebDriverManager.chromedriver().setup();
    return new ChromeDriver();
  }
}
