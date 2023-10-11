Feature: Verify the compose button functionality
Scenario: Verify the user is able to login with invalid credintial
Given  Browser is open & user is on login page(sign in page) enter valid Email & invalid password
And  click on logion button & user should not land on homepage
When  login fail & massage display"Wrong password. Try again or click Forgot password to reset it."
