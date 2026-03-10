/*Task 01. Spring Boot Core Task: Season Finder:
=======================================
✅ Objective
Build a Spring Boot Core-based console application that:
Accepts a month number (1–12) as user input from the console.
Determines the correct season (Winter, Spring, Summer, Autumn).
Prints the result in the console.

🛠 Task Requirements
1.Main Application Class

Use @SpringBootApplication.
Launch the app using SpringApplication.run().
Create a SeasonService class.
Annotate it with @Component.

Add a method:
public String getSeason(int month)
which returns the season string based on the month.
Use Scanner to prompt the user:
"Enter month number (1–12):"
Pass input to SeasonService.getSeason().

Print the result to the console.

If the user enters an invalid month (outside 1–12), return:
"Invalid month! Please enter 1–12."*/