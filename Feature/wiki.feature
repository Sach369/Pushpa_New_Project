Feature: wikipedia

Scenario: Extract the release date and release time
Given User is on wikipedia home page
And user type "pushpa" on search Wikipedia
When user click search button
Then the page title should be the "Pushpa: The Rise - Wikipedia"
And user starts scrolldown can see the name Theatrical release poster
Then user get the release date and release time
