# Selenium Automation Test

This assignment contains Selenium automation tests for a web application, including functionalities for login, logout, add staff, update staff, and delete staff. Each function is separated into different Java files, and the main class file consists of login, logout, and actions to be performed.

The reason that Selenium is chosen as the testing framework is because Selenium supports multiple browsers such as Chrome, Firefox, etc. making it ideal for ensuring that web applications work across different environments. Besides that, Selenium can automate a wide range of browser actions, from simple clicks to complex interactions.
Each action (login, logout, add staff, update staff, delete staff, logs) is encapsulated in its own class. This modularity makes the code easier to understand, maintain, and reuse.

## Project Overview

The purpose of this assignment is to automate the testing of various functionalities on a web application using Selenium WebDriver in Java.

## Selenium WebDriver (Java)
Make sure that you have downloaded the Selenium WebDriver for Java. Here is the [a link] (https://www.selenium.dev/downloads/) to download.

1. After downloaded, go to File > Project Structure > Dependecies

![image](https://github.com/user-attachments/assets/5db81e18-be97-4c11-b879-3e594f936ee8)

2. Click the plus icon as highlighted in the image below and select JAR or Directories, then select Selenium file.

![image](https://github.com/user-attachments/assets/b680f37a-46b4-49ec-92d1-3bbce256048c)

3. Then click Apply.

## File Structure and Function

- Logs.java: Print the action, result of each action performed whether PASS or FAIL, and execution time taken in second in console.
- Login.java: Login into the website by entering username and password.
- Logout.java: Perform the logout action in the website.
- AddStaff.java: Add new staff by entering staff name, staff hourly rate, and staff PIN.
- EditStaff.java: Edit the staff information such as staff name, staff hourly rate, staff PIN, and display order. 
- DeleteStaff.java: Delete the existing staff information.
- Main.java: Performs various actions such as login, logout, add staff etc. Arguments are needed to perform the action successfully.

**Noted that:**
**1.Staff hourly rate must be at most 2 decimal places.**
**1.Staff PIN must be in 4 digits.**

## Result

The result printed in console containing information such as action performed, result  (PASS/FAIL), and execution time.

![image](https://github.com/user-attachments/assets/cb6ce785-d600-4dca-9f4b-cb02dd8ebb01)
