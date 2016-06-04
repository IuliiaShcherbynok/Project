Story: Find teacher

Narrative:
As a user I want to check if teachers are present in SkillsUp school and what course they teach

Scenario: Find teachers
Given the user is on Home page
When the user goes to Our Team Page
Then he should see the name <name>

Examples:
|name|
|Евгения Бохан|
|Михаил Чокан|
|Артем Карпов|
|Ева Корнеплянская|
|Илья|

Scenario: Find course
Given the user is on Our Team page
When the user clicks on teacher <name>
Then he should see the name <name> and course <course>

Examples:
|name|course|
|Евгения Бохан|Diving into Software Testing|
|Михаил Чокан|Руководитель учебного курса|
|Артем Карпов|Автоматизация тестирования ПО|
|Ева Корнеплянская|Технологии|
|Илья|Административная и операционная поддержка|
