$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/demo.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail Testing",
  "description": "",
  "id": "gmail-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Gmail Login",
  "description": "",
  "id": "gmail-testing;gmail-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "url opened",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "enter user id and click next",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "enter password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.url_opened()"
});
formatter.result({
  "duration": 6352357177,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_user_id_and_click_next()"
});
formatter.result({
  "duration": 4454416120,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_password()"
});
formatter.result({
  "duration": 2127587889,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_login()"
});
formatter.result({
  "duration": 122747057,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Gmail Close",
  "description": "",
  "id": "gmail-testing;gmail-close",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.close_browser()"
});
formatter.result({
  "duration": 32370,
  "status": "passed"
});
});