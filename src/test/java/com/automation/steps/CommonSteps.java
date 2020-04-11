package com.automation.steps;

import com.automation.core.selenium.browser.DriverManager;
import cucumber.api.java.After;

public class CommonSteps {

  public CommonSteps(){

  }

  @After(order = 0)
  public void closeDiver(){
    DriverManager.getInstance().getWebDriver().quit();
  }

}
