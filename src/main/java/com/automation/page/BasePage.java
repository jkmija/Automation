package com.automation.page;

import com.automation.core.selenium.browser.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
  protected WebDriver driver;
  protected WebDriverWait wait;

  public BasePage(){
    driver = DriverManager.getInstance().getWebDriver();
    wait = DriverManager.getInstance().getWebDriverWait();
    PageFactory.initElements(driver,this);
  }

}
