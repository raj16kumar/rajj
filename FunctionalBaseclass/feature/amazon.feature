Feature: Amazon web application smoke test cases
This includes Singin,Creat Your Amazon account functionality

@TC-001
Scenario: verify the user Singin funtionality with valid crendentils
Given User launch amazon application
Then User verify the amazon logo is displayed in the header
And User click signin button
And User enter emailid in the signin page
And User click on the continue button
And User enter password after click continue page
And User click on the signin button
Then User verify the alert message displays for invalid crendentails

@TC-002
Scenario: Verify the user create your amazon account funtionality
Given User launch amazon application
Then User click signin button
Then User click create your amazon account button
And User enter name in create account module
And User enter emailid in create account module
And User enter password in create account module
And User enter reenter password in create account module
And User click on create your amazon account
Then User verify the account hasbeen created
 
