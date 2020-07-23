Feature: Kayak Automation
Scenario: Selecting flights
Given URL passed launch the browser
When Close the default button
Then Select airport 
When Click on destination btn
And Enter destination city
When Click on Calendar
And Select Depart Date
And Select Return Date
Then Click On Search btn 
Then quit browser
