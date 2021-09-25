Feature: Locator Form  Flows


Scenario:Health Desk View Work flow
When User Logs in to the Health Desk View


Scenario Outline:Public View Work flow
# step 1
When User Loads the Public View form
Then Public View Form loads
And 'Next' Button Disabled before user fills required details
When User Selects Resident Type "<resdentType>"
Then 'Next' Button activated after user fills required details
When User clicks 'Next' Button
# step 2
Then 'Flight' details page loads
And 'Next' Button Disabled before user fills required details
When User select flight Airline 
And User enters Flight Number "<flightNumber>"
And User enters seat Number "<seatNumber>"
And User enters Date of Arrival 
And User Select Purpose of Visit
Then 'Next' Button activated after user fills required details
When User clicks 'Next' Button
# step 3
Examples:
     |resdentType |flightNumber|seatNumber| 
     |Resident    | AA35       |SEAT1     |
     |Non-Resident| AA35       |SEAT1     |
