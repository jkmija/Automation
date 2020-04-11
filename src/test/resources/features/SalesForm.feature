Feature: Sales Form Manager
  Test sales Form

  @Test1
  Scenario: Create a new sales Form on nice in nice in contact page
    Given I navigate to contact page
    And enter "Test" First Name on 'Contact' page
    And enter "Add" Last Name on 'Contact' page
    And enter "Testing" Job Title on 'Contact' page
    And enter "TET" Company on 'Contact' page
    And enter "TET@gmail.com" Email Address on 'Contact' page
    And enter "Test" Message on 'Contact' page
    And select "Canada" Country on 'Contact' page
    And select "Sales" Contact Department on 'Contact' page
    When click 'Submit' button on 'Contact' page
#    Then The Message should be
#  """
#  Thank you for contacting us!
#  """

