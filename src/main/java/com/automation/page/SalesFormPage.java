package com.automation.page;

import static com.automation.core.selenium.util.CommonActions.*;
import static com.automation.core.selenium.util.CommonActions.clickElement;
import static com.automation.core.selenium.util.CommonActions.enterTextField;
import static com.automation.core.selenium.util.CommonActions.selectListBoxByValue;

import com.automation.core.selenium.util.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SalesFormPage extends BasePage {

  @FindBy(id = "FirstName")
  private WebElement firstNameTextField;
  @FindBy(id = "LastName")
  private WebElement lastNameTextField;
  @FindBy(id = "Title")
  private WebElement jobTitleTextField;
  @FindBy(id = "Email")
  private WebElement emailTextField;
  @FindBy(id = "Company")
  private WebElement companyTextField;
  @FindBy(id = "Country")
  private WebElement countryComboBox;
  @FindBy(id = "Division_Department__c")
  private WebElement contactDepartmentComboBox;
  @FindBy(id = "comment_capture")
  private WebElement messageTextField;

  @FindBy(xpath= "//button[@type='submit']")
  private WebElement submitButton;
  @FindBy(className= "page-title")
  private WebElement messageText;
//
//  @FindBy(xpath= "//div/div/img")
//  private WebElement title2;

  public SalesFormPage() {
    driver.get("https://www.niceincontact.com/contact-us");
  }

  public SalesFormPage enterFirstName(final String firstName){
    enterTextField(firstNameTextField,firstName);
    return this;
  }

  public SalesFormPage enterLastName(final String lastName){
    enterTextField(lastNameTextField, lastName);
    return this;
  }

  public SalesFormPage enterJobTitle(final String jobTitle){
    enterTextField(jobTitleTextField, jobTitle);
    return this;
  }

  public SalesFormPage enterMessage(final String message){
    enterTextField(messageTextField, message);
    return this;
  }

  public SalesFormPage enterEmail(final String email){
    enterTextField(emailTextField, email);
    return this;
  }

  public SalesFormPage enterCompany(final String company){
    enterTextField(companyTextField, company);
    return this;
  }

  public SalesFormPage selectCountry(final String country){
    selectListBoxByValue(countryComboBox, country);
    return this;
  }

  public SalesFormPage selectContactDepartment(final String contactDepartment){
    selectListBoxByValue(contactDepartmentComboBox, contactDepartment);
    return this;
  }

  public SalesFormPage clickSubmitButton(){
    CommonActions.clickElementByJavaScript(submitButton);
    return this;
  }

  public String getMessage(){
    return getText(messageText);
  }
}
