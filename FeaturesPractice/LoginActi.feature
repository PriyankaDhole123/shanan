Feature: Verify Login Functionality
Scenario: Verify login page with valid credensial
Given  Broser is open
And  user is on login page
When  Enter valid username & password
And  click on login button
Then  user land on home page 


