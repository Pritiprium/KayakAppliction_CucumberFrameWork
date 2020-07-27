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
  "line": 8,
  "name": "Click on Calendar",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select Depart Date",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select Return Date",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click On Search btn",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "quit browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Flight_BookingSteps.url_passed_launch_the_browser()"
});
formatter.result({
  "duration": 30946163800,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.close_the_default_button()"
});
formatter.result({
  "duration": 5887152000,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.select_airport()"
});
formatter.result({
  "duration": 4685863700,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.click_on_destination_btn()"
});
formatter.result({
  "duration": 359148500,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.enter_destination_city()"
});
formatter.result({
  "duration": 2733700600,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.click_on_Calendar()"
});
formatter.result({
  "duration": 2374824500,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.select_Depart_Date()"
});
formatter.result({
  "duration": 301116100,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.select_Return_Date()"
});
formatter.result({
  "duration": 2445155500,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.click_On_Search_btn()"
});
formatter.result({
  "duration": 316437700,
  "status": "passed"
});
formatter.match({
  "location": "Flight_BookingSteps.quit_browser()"
});
formatter.result({
  "duration": 1358367900,
  "status": "passed"
});
});