Feature: Search flights avilable

	Background: setup files
		When files setup done
  Scenario: Search flights avilable from pune to mumbai
    Given Open browser and maximize it
    When navigate to https://care.ideacellular.com/wps/portal/account/account-login
    Then enter uname and password
    And click on login button
    Then click on Pay button
    Then enter amt to be paid
    Then choose cards and net-banking option
    Then click on submit button