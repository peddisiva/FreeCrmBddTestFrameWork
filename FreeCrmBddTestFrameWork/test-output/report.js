$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/developing/java/selenium/practice/FreeCrmBddTestFrameWork/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "logo of Landing Page have YOUR BUSINESS CLOUD PARTNER",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "login button is visible",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login buttton",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefination.landingPage_check()"
});
formatter.result({
  "duration": 8899270500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefination.logo_of_Landing_Page_have_YOUR_BUSINESS_CLOUD_PARTNER()"
});
formatter.result({
  "duration": 617802000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1959715300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefination.login_button_is_visible()"
});
formatter.result({
  "duration": 50299200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefination.enter_username_and_password()"
});
formatter.result({
  "duration": 184607900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefination.user_clicks_on_login_buttton()"
});
formatter.result({
  "duration": 51694900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefination.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 4647000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefination.close_the_browser()"
});
formatter.result({
  "duration": 677739600,
  "status": "passed"
});
});