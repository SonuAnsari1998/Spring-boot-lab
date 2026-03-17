/*Task 3 — Student Result Evaluation System
Objective

To evaluate student performance using marks from properties file.

Description

Educational systems often calculate results based on marks stored in configuration or database.
 This task helps you use @Value to read marks and compute total, average, and pass/fail status.

The system should:

Read marks for multiple subjects

Calculate total and average

Determine result using condition:

PASS if all subjects ≥ 35

FAIL otherwise

Input

Student Name

Marks (Math, Science, English)

Processing Logic

Inject marks using @Value

Use SpEL for:

Total calculation

Average calculation

Conditional result (PASS/FAIL)

Expected Output

Student details:
Marks in each subject
Math: 
Science: 
English:
Total marks
Average marks
Result status

*/