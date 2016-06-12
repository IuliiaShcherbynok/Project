Story: Find course of teachers

Narrative:
As a user I want to check if teachers are present in SkillsUp school and what course they teach


Scenario: Find course
Given the user is on Our Team page
When the user clicks on teacher <name>
Then he should see the name <name> and course <course>

Examples:
|name|course|
|Илья|Административная и операционная поддержка|
|Евгения Бохан|Diving into Software Testing|
|Михаил Чокан|Руководитель учебного курса|
|Артем Карпов|Автоматизация тестирования ПО|
|Ева Корнеплянская|Технологии|
