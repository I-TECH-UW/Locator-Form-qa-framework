Feature: Locator Form Work Flow

@locator1
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
When User clicks 'Back', to go to the previous step
Then User information is still populated in the fields , and can click 'Next' to move back the current step
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
When User clicks 'Back', to go to the previous step
Then User information is still populated in the fields , and can click 'Next' to move back the current step
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
When User clicks 'Back', to go to the previous step
Then User information is still populated in the fields , and can click 'Next' to move back the current step
When User clicks 'Next' Button
# step 5  Vaccine
Then 'Vaccine' Page loads
And 'Next' Button activated ,no required fields
And User Selects Whether Vaccinated
And User Selects Name of First Vaccine
And User Enters Date Of First Dose
And User Selects Name of Second Vaccine
And User Enters Date Of Second Dose
When User clicks 'Back', to go to the previous step
Then User information is still populated in the fields , and can click 'Next' to move back the current step
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
When User clicks 'Back', to go to the previous step
Then User information is still populated in the fields , and can click 'Next' to move back the current step
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
When User clicks 'Back', to go to the previous step
Then User information is still populated in the fields , and can click 'Next' to move back the current step
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
When User clicks 'Back', to go to the previous step
Then User information is still populated in the fields , and can click 'Next' to move back the current step
When User clicks 'Next' Button
# step 8 Travel Companions
Then 'Travel Companions' Page loads
And 'Next' Button activated ,no required fields
When User Clicks 'Add Travel Companion Family' Button
Then 'Next' Button Disabled before user fills required details
When User Enters Travel Companion ,Last Name "<lastName>"
And User Enters Travel Companion ,First Name "<firstName>"
And User selects Travel Companion ,sex
And User Enters Travel Companion ,Seat "<seatNumber>"
And User Enters Travel Companion ,Date Of Birth "<dob>"
And User selects Travel Companion ,Nationality 
And User Enters Travel Companion ,Passport Number "<companionPassport>"
Then 'Next' Button activated after user fills required details 
When User Clicks 'Add Travel Companion Family' Button again,to add another Family Companion
Then 'Next' Button Disabled before user fills required details
When User Removes the Extra Added Family Companion
Then 'Next' Button activated after user fills required details
When User Clicks 'Add Travel Companion Non-Family' Button ,to add Non-Family Companion
Then 'Next' Button Disabled before user fills required details
When User removes the Added Non-Family Companion
Then 'Next' Button activated after user fills required details
When User clicks 'Back', to go to the previous step
Then User information is still populated in the fields , and can click 'Next' to move back the current step
When User clicks 'Next' Button
# step 9 Confirmation
Then 'Confirmation' Page loads
And Confirmation Page contains the right Summary Information
And 'Submit' Button Disabled before User checks Accept terms CheckBox
When User checks Accept terms CheckBox
Then 'Submit' Button activated after User checks Accept terms CheckBox
When User clicks 'Back', to go to the previous step
Then User information is still populated in the fields , and can click 'Next' to move back the current step
When User Clicks 'Submit' Button
Then 'Summary' Page loads
When User Clicks 'Print Summary' Button
Then Summary Pdf is generated
Examples:
     |residentType |flightNumber|seatNumber|natianalId |lastName |firstName |middleInnitial|dob        |profession|port    |phoneNumber    |email          |passport |street        |apartment|city   |hotel |companionPassport|
     |Resident     | AA35       |SEAT1     | AANNBB1   |mozzy    |mutesa    | mm           |04/27/1992 |engineer  |PortBell|56565656       |mozzy@gmail.com|PASSPORT1|Kampala,Gayaza|003      |Kampala|Serena|PASSPORT3        |
     |Non-Resident | AA35       |SEAT1     | AANNBB2   |mozzy    |mutesa    | mm           |04/27/1992 |engineer  |PortBell|949 494 9494   |mozzy@gmail.com|PASSPORT2|Kampala,Gayaza|003      |Kampala|Serena|PASSPORT4        |

@locator
Scenario:Health Desk View Work flow
When User Loads the Health Desk View
Then User is redirected to KeyClock Login Page
When User Logs in to KeyCloak Login Page
Then User is redirected to Health Desk View Page
When Users Enters Passport Number "<passport>" for Search
Then Page returns Search Results
When User Clicks on Passenger search Result 
Then Form displays with User details
Examples: 
     |passport |
     |PASSPORT2|