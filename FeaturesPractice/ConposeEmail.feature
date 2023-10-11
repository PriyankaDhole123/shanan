Feature: Verify the compose button functionality
Scenario: Verify the user is able to login with credintial
Given  Browser is open & user is on login page(sign in page) enter valid crediential
And  click on logion button & user should land on homepage
When  click on compose button
And new massage frame should be display
And enter the mail ids in 'To','cc','bcc' text field 
And write a massage in massage body,set size,font & attaches pdf,file,vedio etc.
And click on send button
Then mail should be send sucessfully & user should be see a confirmation massage indicating that mail has been sent.