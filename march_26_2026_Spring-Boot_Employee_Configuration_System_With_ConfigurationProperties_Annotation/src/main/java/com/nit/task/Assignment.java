/*Task 1: Employee Configuration System
Objective

Bind all types of properties using @ConfigurationProperties:

Class Design

1. Employee (Main Class)
➤ Responsibility
Acts as the primary configuration holder
Binds all types of properties using prefix employee

➤ Fields

Simple Properties
id
name
salary
skills (String array)
projects (List of Strings)
tools (Set of Strings)
experience (Map<String, Integer>)
Key → Technology
Value → Years of experience
address (Address class object)

2. Address (Nested Class)

➤ Responsibility
Represents employee address details
Used as HAS-A relationship inside Employee

➤ Fields
city
state
pincode

3. EmployeeRunner (Runner Class)

➤ Responsibility
Fetch Employee object from Spring Container
Display all bound values


Property Binding Structure (Concept)
Prefix: employee
Types Covered:
Single value → direct binding
Array → comma-separated values
List → indexed values
Set → comma-separated (duplicates removed)
Map → key-value pairs
Nested object → hierarchical properties*/



