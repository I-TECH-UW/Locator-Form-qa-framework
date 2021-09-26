Feature: Locator Form  Flows


Scenario:Health Desk View Work flow
When User Logs in to the Health Desk View


Scenario Outline:Public View Work flow
# step 1 Passenger Type
When User Loads the Public View form
Then 'Passenger Type' Page loads
And 'Next' Button Disabled before user fills required details
When User Selects Resident Type "<residentType>"
Then 'Next' Button activated after user fills required details
When User clicks 'Next' Button
# step 2 Flight details
Then 'Flight' Page loads
And 'Next' Button Disabled before user fills required details
When User select flight Airline 
And User enters Flight Number "<flightNumber>"
And User enters seat Number "<seatNumber>"
And User enters Date of Arrival 
And User Select Purpose of Visit
Then 'Next' Button activated after user fills required details
When User clicks 'Next' Button
# step 3  personal Information
Then 'Personal Info' Page loads
And 'Next' Button Disabled before user fills required details
When User enters NationaId "<natianalId>" if resident "<residentType>"
And User selects Title 
And User enters Last Name "<lastName>"
And User enters First Name "<firstName>"
And User enters Middle Innitial "<middleInnitial>"
And User selects Sex
And User enters Date of Birth "<dob>"
And User enters profession "<profession>"
Then 'Next' Button activated after user fills required details
When User clicks 'Next' Button
# step 4  Recent Travel
Then 'Recent Travel' Page loads
And 'Next' Button activated ,no required fields
And User selects Countries visited during last 6 months
And User enters Port Of Embarkation "<port>"
When User clicks 'Next' Button
# step 4  Health
Then 'Health' Page loads
And 'Next' Button activated ,no required fields
And User Checks Fever Test
And User Checks Covid test
When User clicks 'Next' Button
# step 5  Vaccine
Then 'Vaccine' Page loads
And 'Next' Button activated ,no required fields
And User Selects Whether Vaccinated
And User Selects Name of First Vaccine
And User Enters Date Of First Dose
And User Selects Name of Second Vaccine
And User Enters Date Of Second Dose
When User clicks 'Next' Button
# step 6  Contact Info
Then 'Contact Info' Page loads
And 'Next' Button Disabled before user fills required details
When User Enters Mobile Phone "<phoneNumber>"
And User Enters and Confirm Email "<email>"
And User selects Country of Birth
And User selects Passport Country of Issue
And User enters Passport Number "<passport>"
And User enters Date Of Expiry
Then 'Next' Button activated after user fills required details
When User clicks 'Next' Button
# step 6 Addresses
Then 'Addresses' Page loads
And 'Next' Button Disabled before user fills required details
When User enters Permanet Address, Number and Street "<street>"
And User enters Permanet Address, Apartment Number "<apartment>"
And User enters Permanet Address, City "<city>"
And User enters Temporary Address, Hotel Name "<hotel>"
And User enters Temporary Address, Number and Street "<street>"
And User enters Temporary Address, Apartment Number "<apartment>"
And User enters Proposed Length of Stay in Mauritius for Non Resdent "<residentType>"
Then 'Next' Button activated after user fills required details
When User clicks 'Next' Button
# step 7 Emergency Contact
Then 'Emergency Contact' Page loads
And 'Next' Button Disabled before user fills required details
When User enters Emergency Contact ,Last Name "<lastName>"
And User enters Emergency Contact ,First Name "<firstName>"
And User enters Emergency Contact ,Address "<street>"
And User selects Emergency Contact ,Country
And User enters Emergency Contact ,Mobile Phone "<phoneNumber>"
Then 'Next' Button activated after user fills required details
Examples:
     |residentType |flightNumber|seatNumber|natianalId |lastName |firstName |middleInnitial|dob        |profession|port    |phoneNumber    |email          |passport |street        |apartment|city   |hotel |
     |Resident     | AA35       |SEAT1     | AANNBB1   |mozzy    |mutesa    | mm           |04/27/1992 |engineer  |PortBell|56565656       |mozzy@gmail.com|PASSPORT1|Kampala,Gayaza|003      |Kampala|Serena|
     |Non-Resident | AA35       |SEAT1     | AANNBB2   |mozzy    |mutesa    | mm           |04/27/1992 |engineer  |PortBell|949 494 9494   |mozzy@gmail.com|PASSPORT1|Kampala,Gayaza|003      |Kampala|Serena|
