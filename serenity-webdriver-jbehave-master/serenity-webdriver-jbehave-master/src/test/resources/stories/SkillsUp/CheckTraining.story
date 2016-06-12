Story: Check training

Narrative:
As a user I want to check if price and size of group is correct

Scenario: Check price of training and size of group
Given the user is on Home page
When the users goes to training page
Then should see price <price> of training and size <size> of group

Examples:
|price|size|
|4500 грн|12-16 человек|