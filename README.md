<div align="center">
# 🎓 Student Feedback Management System
### A Java-based CLI application for collecting, managing, moderating and analysing student feedback.
<br>
![Java](https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=openjdk)
![CLI](https://img.shields.io/badge/Application-CLI-blue?style=for-the-badge)
![File Storage](https://img.shields.io/badge/Storage-Text%20Files-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
<br>
**Java Course Project | B.Tech CSE (AI & ML)**  
**VIT Bhopal University**
</div>
---
## 📌 Overview
The **Student Feedback Management System** is a menu-driven Java application designed to provide a simple way to collect and manage student feedback.
The system allows students to be registered, feedback to be submitted for subjects, comments to be moderated, and feedback to be searched, updated, deleted and analysed.
The project demonstrates core Java concepts including:
- Object-Oriented Programming
- Classes and Objects
- Encapsulation
- ArrayList collections
- Packages
- File Handling
- Exception Handling
- Input Validation
- String Processing
- Modular Programming
The application runs completely through the **command line**, making it lightweight and easy to execute without any external database or framework.
---
# ✨ Feature Overview
| Feature | Description |
|---|---|
| 👤 Student Registration | Register students using a unique Student ID |
| 📝 Feedback Management | Add, view, update and delete feedback |
| 🔎 Feedback Search | Search feedback using subject names |
| ⭐ Rating System | Give ratings from 1 to 5 |
| 🛡️ Content Moderation | Automatically masks selected inappropriate words |
| 💾 Data Persistence | Saves student and feedback data into text files |
| 📊 Statistics | Calculates total feedback, average rating and rating counts |
| ✅ Input Validation | Validates IDs, ratings and required text fields |
| 💻 CLI Interface | Simple menu-driven command-line interaction |
---
# 🏗️ System Architecture
The project follows a simple layered structure:
```text
                ┌─────────────────────┐
                │       Main.java     │
                │   CLI / User Input  │
                └──────────┬──────────┘
                           │
                           ▼
                ┌─────────────────────┐
                │   Service Layer     │
                │                     │
                │ StudentService      │
                │ FeedbackService     │
                │ FeedbackStatistics  │
                └──────────┬──────────┘
                           │
                           ▼
                ┌─────────────────────┐
                │     Model Layer     │
                │                     │
                │ Student             │
                │ Feedback            │
                └──────────┬──────────┘
                           │
                           ▼
                ┌─────────────────────┐
                │     Utility Layer   │
                │                     │
                │ InputValidator      │
                │ ContentModerator    │
                │ FileManager         │
                └──────────┬──────────┘
                           │
                           ▼
                ┌─────────────────────┐
                │    Text Storage     │
                │                     │
                │ students.txt        │
                │ feedback.txt        │
                └─────────────────────┘

Architecture Layers

Main Layer

Handles the command-line menu, user input and overall application flow.

Service Layer

Contains the main application logic for students, feedback and statistics.

Model Layer

Contains the data classes representing students and feedback.

Utility Layer

Provides reusable functions for validation, content moderation and file operations.

Storage Layer

Stores data locally using text files so that information remains available after restarting the application.

⸻

🔄 System Workflow

        START
          │
          ▼
   Display Main Menu
          │
          ▼
   Select an Operation
          │
     ┌────┴─────┐
     │          │
     ▼          ▼
 Student      Feedback
Registration  Management
     │          │
     │          ▼
     │    Validate Input
     │          │
     │          ▼
     │    Check Student ID
     │          │
     │          ▼
     │    Moderate Comment
     │          │
     │          ▼
     │      Save Data
     │          │
     └────┬─────┘
          │
          ▼
    View / Search /
    Update / Delete
          │
          ▼
     View Statistics
          │
          ▼
         EXIT

⸻

🧩 Project Structure

StudentFeedbackSystem/
│
├── src/
│   │
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
├── statement.md
├── README.md
├── .gitignore
└── students.txt / feedback.txt

⸻

🛠️ Technology Used

Programming Language

Java

Java Concepts

* Classes and Objects
* Encapsulation
* Constructors
* Getters and Setters
* ArrayList
* Methods
* Packages
* Loops and Conditional Statements
* Exception Handling
* File I/O
* String Processing

Storage

Local text files:

students.txt
feedback.txt

Development Environment

* Java 25
* VS Code
* macOS Terminal
* Git
* GitHub

External Libraries

No external libraries or frameworks are required.

⸻

👤 Student Registration

The registration module allows a student to create a profile using:

* Student ID
* Name
* Email

Each student must have a unique Student ID.

Example

Enter Student ID: 101
Enter Student Name: Divya
Enter Email: divya@example.com
Student registered successfully!

If the same ID is entered again:

Student ID already exists.
Registration failed.

This prevents duplicate student records.

⸻

📝 Feedback Management

Students can submit feedback by providing:

* Feedback ID
* Student ID
* Subject
* Rating
* Comment

Example:

Enter Feedback ID: 1
Enter Student ID: 101
Enter Subject: Java
Enter Rating: 5
Enter Comment: The subject was well explained.
Feedback added successfully!

Before feedback is stored, the system checks whether the student exists.

⸻

⭐ Rating System

The system accepts ratings from:

1 → Lowest Rating
2
3
4
5 → Highest Rating

Only ratings between 1 and 5 are accepted.

Invalid input such as:

0
6

is rejected.

This prevents invalid rating values from entering the system.

⸻

🛡️ Content Moderation

The project includes a basic content moderation module.

Selected inappropriate words are automatically replaced with asterisks before the feedback is displayed.

Example

Input:

This subject is stupid.

Output:

This subject is ******.

The moderation logic is implemented inside:

ContentModerator.java

This demonstrates basic string processing and input sanitisation.

⸻

🔎 Search Feedback

Users can search for feedback using the subject name.

Example:

Enter subject to search: Java

The system displays matching feedback records.

The search is case-insensitive, so:

Java
java
JAVA

can all match the same subject.

⸻

✏️ Update Feedback

Existing feedback can be updated using its Feedback ID.

The user can change:

* Rating
* Comment

Example:

Enter Feedback ID: 1
Enter New Rating: 4
Enter New Comment: The lectures were good but more examples would help.
Feedback updated successfully!

⸻

🗑️ Delete Feedback

Feedback can also be removed using its Feedback ID.

Example:

Enter Feedback ID: 1
Feedback deleted successfully!

The updated feedback list is then saved back to the storage file.

⸻

📊 Feedback Statistics

The system provides basic feedback analysis.

The statistics module calculates:

* Total number of feedback records
* Average rating
* Number of 5-star ratings
* Number of 1-star ratings

Example:

--- Feedback Statistics ---
Total Feedback: 10
Average Rating: 4.20/5
5-Star Feedback: 5
1-Star Feedback: 1

This gives a quick overview of the collected feedback.

⸻

💾 Data Persistence

The application uses Java file handling to store data locally.

Two files are used:

students.txt
feedback.txt

Example student record:

101|Divya|divya@example.com

Example feedback record:

1|101|Java|5|The subject was well explained.

When the program starts, existing records are loaded from these files.

When a record is added, updated or deleted, the corresponding file is updated.

Therefore, data is preserved even after the application is closed.

⸻

🔐 Input Validation

The application validates important user inputs before processing them.

Student ID

Must be greater than zero.

Feedback ID

Must be greater than zero.

Rating

Must be between 1 and 5.

Text Fields

Required text fields cannot be empty.

Student Verification

Feedback cannot be added for an unregistered Student ID.

⸻

💻 Application Menu

The application provides a menu-driven interface.

===== Student Feedback Management System =====
1. Register Student
2. View All Students
3. Add Feedback
4. View All Feedback
5. Search Feedback by Subject
6. Update Feedback
7. Delete Feedback
8. View Feedback Statistics
9. Exit
Enter your choice:

The menu allows users to access all major functions from one place.

⸻

🧪 Testing

The application was tested manually using different valid and invalid inputs.

Test Case	Expected Result	Status
Register valid student	Student added	✅ Passed
Register duplicate Student ID	Registration rejected	✅ Passed
Add feedback for registered student	Feedback added	✅ Passed
Add feedback for unregistered student	Feedback rejected	✅ Passed
Enter rating 6	Input rejected	✅ Passed
Enter rating 0	Input rejected	✅ Passed
Enter inappropriate word	Word masked	✅ Passed
Search existing subject	Matching feedback shown	✅ Passed
Update feedback	Feedback changed	✅ Passed
Delete feedback	Feedback removed	✅ Passed
Restart application	Previous data loaded	✅ Passed
View statistics	Correct values displayed	✅ Passed

⸻

🧠 Design Decisions

Why Java?

Java was selected because the project is intended to demonstrate core Java programming and Object-Oriented Programming concepts.

Why ArrayList?

ArrayList provides a simple way to store and manage multiple student and feedback objects dynamically.

Why Text Files?

Text files keep the project lightweight and remove the need for an external database while still demonstrating persistent storage and Java File I/O.

Why Separate Packages?

The project is divided into:

model
service
util

to keep data classes, business logic and reusable utilities separated.

This makes the code easier to understand and maintain.

⸻

📦 Classes and Responsibilities

Class	Responsibility
Main	Handles CLI menu and user interaction
Student	Represents student information
Feedback	Represents feedback information
StudentService	Manages student records
FeedbackService	Manages feedback operations
FeedbackStatistics	Calculates feedback statistics
InputValidator	Validates user input
ContentModerator	Masks selected inappropriate words
FileManager	Handles reading and writing files

The project contains 9 Java classes, keeping the implementation modular.

⸻

⚙️ Implementation Highlights

Object-Oriented Design

The project uses separate classes for different entities and responsibilities.

For example:

Student
Feedback

represent the application’s main data objects.

Encapsulation

Important data members are declared as private and accessed using methods.

Example:

private int studentId;
private String name;
private String email;

Collections

ArrayList is used to store student and feedback objects.

File Handling

Java’s:

BufferedReader
BufferedWriter
FileReader
FileWriter

are used for persistent storage.

Exception Handling

File operations are handled using try-catch blocks to prevent application crashes due to common file-related errors.

⸻

📸 Screenshots

Screenshots of the working application can be added below.

Main Menu

Add screenshot here

Student Registration

Add screenshot here

Feedback Submission

Add screenshot here

Content Moderation

Add screenshot here

Search / Update / Delete

Add screenshot here

Statistics

Add screenshot here

Terminal Execution

Add screenshot here

⸻

🚀 How to Access the Project

The complete source code is available on GitHub:

Repository:
https://github.com/divyajalan25/StudentFeedbackSystem

Clone the repository using:

git clone https://github.com/divyajalan25/StudentFeedbackSystem.git

Move into the project folder:

cd StudentFeedbackSystem

⸻

▶️ How to Run

Make sure Java is installed.

Check the Java version:

java -version

Check the compiler:

javac -version

Compile the project:

javac -d out src/Main.java src/model/*.java src/service/*.java src/util/*.java

Run the application:

java -cp out Main

The application will start in the terminal.

⸻

📁 Data Files

The application creates/uses two local files:

students.txt
feedback.txt

These files store application data between executions.

The generated out/ directory contains compiled .class files and is excluded from Git using .gitignore.

⸻

📋 Project Requirements Covered

The project covers the major requirements expected from the Java course project.

Functional Requirements

* Student registration
* Feedback creation
* Feedback viewing
* Feedback searching
* Feedback updating
* Feedback deletion
* Rating system
* Feedback statistics
* Content moderation

Non-Functional Requirements

* Usability
* Reliability
* Maintainability
* Error handling
* Resource efficiency
* Data persistence

Technical Requirements

* Modular Java implementation
* Multiple classes
* Package structure
* Object-Oriented Programming
* File handling
* Input validation
* Exception handling
* Git/GitHub version control

⸻

🎯 Project Scope

The current version focuses on a simple command-line feedback management workflow.

The system is suitable as a small academic project for demonstrating Java programming concepts.

It does not currently include:

* A web interface
* A graphical user interface
* A relational database
* Cloud deployment
* User authentication
* Advanced natural language processing

These can be considered for future versions.

⸻

🔮 Future Enhancements

Possible improvements include:

* 🌐 Web-based interface
* 🗄️ MySQL or other database integration
* 🔐 Student and Admin login
* 📧 Email notifications
* 📈 More detailed analytics
* 📊 Graphical reports
* 🔍 Advanced feedback filtering
* 🤖 AI-based sentiment analysis
* ☁️ Cloud-based data storage
* 📱 Mobile-friendly interface

⸻

📚 Learning Outcomes

Through this project, the following concepts were practically implemented:

* Designing Java classes
* Applying encapsulation
* Working with objects
* Using ArrayList
* Creating packages
* Writing reusable methods
* Handling files
* Handling exceptions
* Validating user input
* Processing strings
* Building menu-driven applications
* Structuring a multi-class Java project
* Using Git and GitHub for project management

⸻

📄 Project Documentation

Additional project documentation is available in:

statement.md

It contains the project problem statement, scope, target users and high-level features.

The project report includes:

* Introduction
* Problem Statement
* Objectives
* Functional Requirements
* Non-Functional Requirements
* System Architecture
* Workflow
* UML Diagrams
* Implementation
* Testing
* Challenges
* Learnings
* Future Enhancements
* References

⸻

🗂️ Repository

The complete project is available here:

👉 https://github.com/divyajalan25/StudentFeedbackSystem

The repository contains the Java source code, project documentation and configuration files required to run the application.

⸻

👩‍💻 Author

Divya Jalan

B.Tech CSE (AI & ML)
VIT Bhopal University
