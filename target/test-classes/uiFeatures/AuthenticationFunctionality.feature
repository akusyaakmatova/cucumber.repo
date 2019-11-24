@userStory1
Feature: Authentication Functionality

    //Background:
   //Given Navigate to Webpage
     // Then Sign in with valid credentials


  @test1
  Scenario: Create an account verify it is created by signing in (Use Datatable)
    Given Navigate to Webpage
    Then Sign in with valid credentials

    Then After inputing email user click on Create an account button
    Then User logs in with valid email "helloworld2222@gmail.com" and creates account
    Then User enters personal information
      | Title | First name | Last name | E-mail                   | Password    | First Name | Last name | Company    | Address      | Country       | City    | State    | Zip   | Mobile phone |Assign Reference|
      | Mrs   | Akylai     | Akmatova  | helloworld2222@gmail.com | kyrgyzstan1 | Akylai     | Akmatova  | Techtorial | 123 Main str | United States | Chicago | Illinois | 60656 | 323-246-6867 | techtorial |
    And Verify if the account created by signing in

    @test2
    Scenario: Verifying with valid credential
      Given Navigate to Webpage
      Then Sign in with valid credentials

      Then User logs in with valid credentials username email address "helloworld2222@gmail.com" and password "kyrgyzstan1"



  @test3
  Scenario: Verifying with invalid credentials
    Given Navigate to Webpage
    Then Sign in with valid credentials
    Then User logs  with invalid credentials username "asdfg" password "12345"
