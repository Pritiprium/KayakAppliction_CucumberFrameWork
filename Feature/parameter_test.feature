Feature: salesforece testing

Scenario Outline: launching multiple browser
Given open  "<Browser>" Browser
When enter the URL
And Enter Valid Username "<username>" and password "<password>"
Then click on login button

Then quit the browser.

Examples: 
|Browser		|value|	username					| password	|
|chrome			|01		|admin123@gmail.com	|admin123	|
|Firefox		|02		|admin123@gmail.com	|admin123  |

