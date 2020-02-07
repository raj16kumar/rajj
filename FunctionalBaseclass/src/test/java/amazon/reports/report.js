$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Sadhana/eclipse-workspace/FunctionalBaseclass/feature/amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon web application smoke test cases",
  "description": "This includes Singin,Creat Your Amazon account functionality",
  "id": "amazon-web-application-smoke-test-cases",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 16,
  "name": "Verify the user create your amazon account funtionality",
  "description": "",
  "id": "amazon-web-application-smoke-test-cases;verify-the-user-create-your-amazon-account-funtionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@TC-002"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User launch amazon application",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User click signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User click create your amazon account button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User enter name in create account module",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enter emailid in create account module",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enter password in create account module",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User enter reenter password in create account module",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User click on create your amazon account",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User verify the account hasbeen created",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefition.user_launch_amazon_application()"
});
formatter.result({
  "duration": 73271853100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.user_click_signin_button()"
});
formatter.result({
  "duration": 25348868800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.user_click_create_your_amazon_account_button()"
});
formatter.result({
  "duration": 11355489100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.user_enter_name_in_create_account_module()"
});
formatter.result({
  "duration": 884053700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.user_enter_emailid_in_create_account_module()"
});
formatter.result({
  "duration": 1213692500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.user_enter_password_in_create_account_module()"
});
formatter.result({
  "duration": 50600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.user_enter_reenter_password_in_create_account_module()"
});
formatter.result({
  "duration": 39200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.user_click_on_create_your_amazon_account()"
});
formatter.result({
  "duration": 38800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefition.user_verify_the_account_hasbeen_created()"
});
formatter.result({
  "duration": 42000,
  "status": "passed"
});
});