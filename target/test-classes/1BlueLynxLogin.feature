Feature: To validate the login functionality of BlueLynx
	@login
  Scenario: To login with invalid username and password
    Given To launch the chrome browser
    When To launch the url to launch the application
    And To mouseover action to my account button
    And To click the myaccount button
    And To pass the invalid username in username textbox
    And To pass the invalid password in password textbox
    And To click the signin button
    Then To close the browser
@multiplelogin
  Scenario Outline: To pass bulk of datas
    Given launch the chrome browser
    When To launch the url
    And To mouseover action  my account button
    And To click  myaccount button
    And To pass the invalid username "<emailfield>" username textbox
    And To pass the invalid password "<passfield>" password textbox
    And To click  signin button
    Then close the browser

    Examples: 
      | emailfield       | passfield   |
      | jai22@yahoo.com  | sql@123     |
      | raja@hotmail.com | res@234     |
      | jpr@gmail.com    | foodie@1234 |
