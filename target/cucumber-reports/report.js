$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/kayak.feature");
formatter.feature({
  "line": 1,
  "name": "Kayak Automation",
  "description": "",
  "id": "kayak-automation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Selecting flights",
  "description": "",
  "id": "kayak-automation;selecting-flights",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "URL passed launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Close the default button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Select airport",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Click on destination btn",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter destination city",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Calendar",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Select Depart Date",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Select Return Date",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click On Search btn",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "quit browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Flight_BookingSteps.url_passed_launch_the_browser()"
});
formatter.result({
  "duration": 21398343500,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.close_the_default_button()"
});
formatter.result({
  "duration": 374218800,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.select_airport()"
});
formatter.result({
  "duration": 5425418500,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.click_on_destination_btn()"
});
formatter.result({
  "duration": 249848600,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.enter_destination_city()"
});
formatter.result({
  "duration": 2584258700,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.click_on_Calendar()"
});
formatter.result({
  "duration": 2420298200,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.select_Depart_Date()"
});
formatter.result({
  "duration": 347539600,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.select_Return_Date()"
});
formatter.result({
  "duration": 2401499100,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.click_On_Search_btn()"
});
formatter.result({
  "duration": 322501100,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.quit_browser()"
});
formatter.result({
  "duration": 2496030800,
  "status": "passed"
});
});