Feature: IMDB
  
Scenario: Extract the country and release date
Given User is on home page
And User type pushpa on search "IMDB"
When user click PUSHPA in suggestion bar
Then the page title should be "Pushpa: The Rise - Part 1 (2021) - IMDb"
And user can see the Details 
And user can get the "contry of origine" and "realease date"

 