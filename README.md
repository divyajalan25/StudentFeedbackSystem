<div align="center">
# 🎓 Student Feedback Management System
### Collect • Manage • Moderate • Analyse
A Java CLI application built for managing student feedback in a simple and structured way.
![Java](https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![CLI](https://img.shields.io/badge/CLI-Application-6C63FF?style=for-the-badge)
![Storage](https://img.shields.io/badge/Storage-Text%20Files-2EA44F?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
[View Repository →](https://github.com/divyajalan25/StudentFeedbackSystem)
</div>
---
## 💭 About the Project
Giving feedback is easy.
Managing multiple feedback records properly is a different story.
So, I built this **Student Feedback Management System** using Java. It allows students to be registered, feedback to be submitted and managed, comments to be moderated, and feedback data to be analysed.
The entire application runs through the **command line** and uses local text files for storing data.
---
## ✨ Features
| 👤 Students | 📝 Feedback | 📊 Analysis |
|---|---|---|
| Student registration | Add feedback | Total feedback |
| Unique Student ID | View feedback | Average rating |
| View students | Search by subject | 5-star count |
| Duplicate ID checking | Update feedback | 1-star count |
| | Delete feedback | |
### Also included
- ⭐ Rating system from 1–5
- 🛡️ Basic content moderation
- ✅ Input validation
- 💾 Persistent local storage
- ⚠️ Error handling
- 🔎 Case-insensitive subject search
---
## 🔄 How It Works
```mermaid
flowchart LR
    A[👤 Student] --> B[📝 Submit Feedback]
    B --> C[✅ Validate Input]
    C --> D[🛡️ Moderate Comment]
    D --> E[💾 Save Data]
    E --> F[🔎 Search / Update / Delete]
    E --> G[📊 View Statistics]

⸻

🏗️ Architecture

flowchart TB
    A["💻 Main.java<br/>CLI Interface"]
    A --> B["⚙️ Service Layer"]
    B --> B1["StudentService"]
    B --> B2["FeedbackService"]
    B --> B3["FeedbackStatistics"]
    B1 --> C["📦 Model Layer"]
    B2 --> C
    C --> C1["Student"]
    C --> C2["Feedback"]
    B --> D["🧰 Utility Layer"]
    D --> D1["InputValidator"]
    D --> D2["ContentModerator"]
    D --> D3["FileManager"]
    D3 --> E["💾 students.txt"]
    D3 --> F["💾 feedback.txt"]

⸻

📁 Project Structure

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
├── statement.md
├── README.md
└── .gitignore

⸻

☕ Tech Used

Java 25

The project uses core Java concepts rather than external frameworks.

* Object-Oriented Programming
* Classes & Objects
* Encapsulation
* ArrayList
* Packages
* File I/O
* Exception Handling
* Input Validation
* String Processing
* Regular Expressions

Tools: VS Code • Terminal • Git • GitHub

⸻

🛡️ Content Moderation

Feedback comments pass through a basic moderation step before being stored.

"This subject is stupid."
             ↓
      🛡️ ContentModerator
             ↓
"This subject is ******."

Selected inappropriate words are replaced with asterisks using Java string processing and regular expressions.

⸻

💾 Data Persistence

The application doesn’t lose everything when the terminal closes.

Student and feedback information is stored in:

students.txt
feedback.txt
Run Application
      ↓
Add / Update / Delete Data
      ↓
Save to File
      ↓
Exit
      ↓
Run Again
      ↓
Load Previous Data

No database setup is required.

⸻

📊 Feedback Statistics

The statistics module currently provides:

--- Feedback Statistics ---
Total Feedback: 10
Average Rating: 4.20/5
5-Star Feedback: 5
1-Star Feedback: 1

This gives a quick overview of the feedback collected by the system.

⸻

🖥️ Application

Main Menu

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

Feedback Flow

Feedback ID
     +
Student ID
     +
Subject
     +
Rating
     +
Comment
     ↓
Validation
     ↓
Moderation
     ↓
Storage

⸻

🧪 Testing

The main functionality was manually tested using both valid and invalid inputs.

✓ Student registration
✓ Duplicate Student ID rejection
✓ Feedback submission
✓ Unregistered Student ID rejection
✓ Invalid rating rejection
✓ Content moderation
✓ Subject search
✓ Feedback update
✓ Feedback deletion
✓ Statistics
✓ Data persistence after restart

⸻

📸 Screenshots

Main Menu

<!-- Add screenshot here -->

Student Registration

<!-- Add screenshot here -->

Feedback Submission

<!-- Add screenshot here -->

Content Moderation

<!-- Add screenshot here -->

Statistics

<!-- Add screenshot here -->

⸻

🚀 Run Locally

1. Clone the repository

git clone https://github.com/divyajalan25/StudentFeedbackSystem.git

2. Open the project

cd StudentFeedbackSystem

3. Compile

javac -d out src/Main.java src/model/*.java src/service/*.java src/util/*.java

4. Run

java -cp out Main

And you’re ready to go. 🚀

⸻

🧩 Java Classes

Class	Responsibility
Main	Handles the menu and user interaction
Student	Stores student information
Feedback	Stores feedback information
StudentService	Manages student records
FeedbackService	Handles feedback operations
FeedbackStatistics	Calculates statistics
InputValidator	Validates user input
ContentModerator	Moderates selected words
FileManager	Handles file storage

The project contains 9 Java classes, keeping the implementation divided into manageable parts.

⸻

🔮 Future Improvements

The current version focuses on the core Java implementation.

Some ideas for future versions:

* 🌐 Web interface
* 🗄️ MySQL database
* 🔐 Student/Admin authentication
* 📈 More detailed analytics
* 🤖 Sentiment analysis
* ☁️ Cloud storage
* 📱 Mobile-friendly interface

⸻

📚 Documentation

statement.md contains the:

* Problem Statement
* Project Scope
* Target Users
* High-Level Features

The accompanying project report covers the architecture, workflow, UML diagrams, implementation, testing, challenges and learnings.

⸻

👩‍💻 Author

Divya Jalan

B.Tech CSE (AI & ML)
VIT Bhopal University

GitHub Repository⁠￼

⸻

<div align="center">

Built with ☕ Java

Student Feedback Management System

</div>
```
