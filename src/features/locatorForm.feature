Feature: Locator Form  Flows


Scenario:Health Desk View Work flow
When User Logs in to the Health Desk View


Scenario Outline:Public View Work flow
When User Loads the Public View form
Then Public View Form loads
And 'Next' Button Disabled before user selects Resident Type
When User Selects Resident Type "<resdentType>"
Then 'Next' Button activated after user selects Resident Type
When User clicks 'Next' Button
Examples:
     |resdentType | 
     |Resident    | 
     |Non-Resident|
