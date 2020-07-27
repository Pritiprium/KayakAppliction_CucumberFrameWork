Feature: Kayak Automation
Scenario Outline: Selecting flights
Given URL passed launch the browser
When Close the default button
Then Select airport "<SourceCity>"
When Click on destination btn
And Enter destination city "<DestinatinCity>"
When Click on Calendar
And Select Depart Date
And Select Return Date
Then Click On Search btn 
Then quit browser

Examples:
|SourceCity		|DestinatinCity	|
|chi					|Dallas					|
|Dallas				|Denver					|
|chi					|Denver					|