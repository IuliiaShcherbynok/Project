Story: Search results

Narrative:
As a user I want to check if search is working properly


Scenario: Find teacher, his position and course
Given the user is on Home page
When the user puts input <input> in search field
Then he should see the name <name>, position <position> and course <course>

Examples:
|input|name|position|course|
|Alexander|Alexander Galkovskiy|Java Tech Leader|Diving into Java|


Scenario: Find certificate by name
Given the user is on Home page
When the user puts input <input> in search field
Then he should see the name <name> and certificate <certificate>

Examples:
|input|name|certificate|
|Alexander|Alexander Tsariov|06109150|

Scenario: Search in Russian doesn't work
Given the user is on Home page
When the user puts input <input> in search field
Then he shouldn't see results for input <input>

Examples:
|input|
|Галковский|







