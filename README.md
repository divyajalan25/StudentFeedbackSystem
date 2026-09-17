## Student Feedback Management System

## Overview

The Student Feedback Management System is a Java-based command-line application designed to collect, manage, search, update, and analyze student feedback.

The system allows students to be registered before submitting feedback. Each feedback entry contains a subject, rating, and comment. The application also includes basic content moderation to mask inappropriate words in comments.

The system uses text files for persistent storage, so student and feedback data remains available even after the program is closed.

## Features

* Student registration
* Duplicate Student ID detection
* Feedback submission
* Student ID verification before feedback submission
* Rating validation from 1 to 5
* Basic inappropriate-word moderation
* View all feedback
* Search feedback by subject
* Update existing feedback
* Delete feedback
* View registered students
* Feedback statistics
* Persistent file-based data storage
* Input validation and error handling

## Technology Used

* Language: Java
* Java Version: Java 25
* Interface: Command Line Interface (CLI)
* Storage: Text files
* Development Environment: VS Code
* Version Control: Git and GitHub

## Project Structure

StudentFeedbackSystem/
│
├── src/
│   ├── Main.java
│   │
│   ├── model/
│   │   ├── Student.java
│   │   └── Feedback.java
│   │
│   ├── service/
│   │   ├── StudentService.java
│   │   ├── FeedbackService.java
│   │   └── FeedbackStatistics.java
│   │
│   └── util/
│       ├── InputValidator.java
│       ├── ContentModerator.java
│       └── FileManager.java
│
├── students.txt
├── feedback.txt
├── .gitignore
└── README.md

## How to Run

1. Clone the repository

git clone <YOUR_GITHUB_REPOSITORY_URL>

2. Open the project directory

cd StudentFeedbackSystem

3. Compile the Java files

javac -d out src/Main.java src/model/*.java src/service/*.java src/util/*.java

4. Run the application

java -cp out Main

## Main Menu

The application provides the following options:

1. Register Student
2. Add Feedback
3. View All Feedback
4. Search Feedback
5. Update Feedback
6. Delete Feedback
7. View All Students
8. View Feedback Statistics
9. Exit

## Data Storage

The application stores data in two text files:

* students.txt — stores registered student information.
* feedback.txt — stores submitted feedback.

Data is loaded when the application starts and saved whenever student or feedback information is changed.

Content Moderation

Before feedback is stored, the comment is checked for a small predefined list of inappropriate words.

Detected words are replaced with * characters.

## For example:

Input:
This subject is stupid
Stored:
This subject is ******

## Validation

The application performs basic input validation, including:

* Student ID must be positive.
* Feedback ID must be positive.
* Student IDs must be unique.
* Feedback IDs must be unique.
* Student must be registered before submitting feedback.
* Rating must be between 1 and 5.
* Required text fields cannot be empty.
* Invalid numeric input is handled using exception handling.

## Feedback Statistics

The system provides basic feedback analysis:

* Total number of feedback entries
* Average rating
* Number of 5-star feedback entries
* Number of 1-star feedback entries

## Testing

The following functional cases were tested:

Test Case	Expected Result
Register valid student	Student is registered
Register duplicate Student ID	Registration is rejected
Add feedback for registered student	Feedback is added
Add feedback for unregistered student	Feedback is rejected
Enter rating outside 1–5	Rating is rejected
Enter inappropriate word	Word is masked
Search existing subject	Matching feedback is displayed
Update feedback	Feedback is updated
Delete feedback	Feedback is removed
Restart application	Previously saved data remains available

## Project Scope

The project focuses on providing a simple and reliable feedback management system for an educational environment using Java and object-oriented programming concepts.

It is implemented as a command-line application to keep the system lightweight and easy to operate without requiring a database or external framework.

## Future Enhancements

Possible future improvements include:

* Admin login and role-based access
* More advanced content moderation
* Subject-wise rating analysis
* Exporting feedback reports
* Database integration
* Graphical user interface
* Anonymous feedback option
* More detailed analytics

## Author

Divya Jalan

B.Tech CSE (AI & ML)
VIT Bhopal University
