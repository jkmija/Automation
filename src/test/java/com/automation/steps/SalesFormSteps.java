package com.automation.steps;

import com.automation.page.SalesFormPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SalesFormSteps {
  private SalesFormPage salesFormPage;

  @Given("I navigate to contact page")
  public void iNavigateToContactPage() {
    salesFormPage = new SalesFormPage();
  }

  @And("enter {string} First Name on 'Contact' page")
  public void enterFirstNameOnContactPage(final String firstName) {
    salesFormPage.enterFirstName(firstName);
  }

  @And("enter {string} Last Name on 'Contact' page")
  public void enterLastNameOnContactPage(final String lastName) {
    salesFormPage.enterLastName(lastName);
  }

  @And("enter {string} Job Title on 'Contact' page")
  public void enterJobTitleOnContactPage(final String jobTitle) {
    salesFormPage.enterJobTitle(jobTitle);  }

  @And("enter {string} Company on 'Contact' page")
  public void enterCompanyOnContactPage(final String company) {
    salesFormPage.enterCompany(company);
  }

  @And("enter {string} Email Address on 'Contact' page")
  public void enterEmailAddressOnContactPage(String emailAddress) {
    salesFormPage.enterEmail(emailAddress);
  }

  @And("select {string} Country on 'Contact' page")
  public void selectCountryOnContactPage(final String country) {
    salesFormPage.selectCountry(country);
  }

  @And("select {string} Contact Department on 'Contact' page")
  public void selectContactDepartmentOnContactPage(final String department) {
    salesFormPage.selectContactDepartment(department);
  }

  @And("enter {string} Message on 'Contact' page")
  public void enterMessageOnContactPage(final String message) {
    salesFormPage.enterMessage(message);
  }

  @And("click 'Submit' button on 'Contact' page")
  public void clickSubmitButtonOnContactPage() {
    salesFormPage.clickSubmitButton();
  }

  @Then("The Message should be")
  public void theMessageShouldBe(final String expectedMessage) {
    final String actualMessage = salesFormPage.getMessage();
    Assert.assertEquals(String.format("The Expect Value is: '%s' But the Actual value is : '%s'",expectedMessage,actualMessage),expectedMessage,actualMessage);
  }
}
