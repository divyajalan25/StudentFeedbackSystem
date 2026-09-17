Student Feedback Management System

Problem Statement

In educational institutions, student feedback is an important source of information for understanding students’ experiences with courses and academic activities. However, feedback can become difficult to manage when it is collected without a structured system.

The Student Feedback Management System provides a simple command-line based solution for collecting and managing student feedback. It allows students to be registered, submit ratings and comments, and manage their feedback. The system also provides search and basic statistical analysis to make the collected feedback easier to understand.

Objectives

The main objectives of the system are:

* To provide a structured way to register students.
* To collect course or subject feedback from students.
* To validate feedback before storing it.
* To prevent duplicate student and feedback IDs.
* To provide basic content moderation for inappropriate words.
* To allow feedback to be searched, updated, and deleted.
* To provide basic statistics from collected feedback.
* To maintain feedback data using persistent file storage.

Scope

The system is designed for a small educational environment where student feedback needs to be collected and managed.

The current scope includes:

* Student registration
* Feedback submission
* Feedback validation
* Basic content moderation
* Feedback search
* Feedback update and deletion
* Student record viewing
* Feedback statistics
* File-based data persistence

The current version is a command-line application and does not include a graphical interface, online authentication, or database integration.

Target Users

Students

Students can be registered in the system and submit feedback for subjects or courses using a rating and written comment.

Faculty / Administrators

Faculty members or administrators can view submitted feedback, search feedback by subject, manage feedback records, and view basic statistics.

High-Level Features

1. Student Registration
    * Register students using Student ID, name, and email.
    * Prevent duplicate Student IDs.
2. Feedback Management
    * Add feedback with subject, rating, and comment.
    * Update or delete existing feedback.
    * Prevent duplicate Feedback IDs.
3. Feedback Search
    * Search feedback using the subject or course name.
4. Input Validation
    * Validate IDs, ratings, and required text fields.
    * Handle invalid numeric input.
5. Content Moderation
    * Detect selected inappropriate words.
    * Replace detected words with asterisks before storing feedback.
6. Feedback Statistics
    * Calculate total feedback.
    * Calculate average rating.
    * Count 5-star and 1-star feedback.
7. Persistent Storage
    * Store student information in students.txt.
    * Store feedback information in feedback.txt.
    * Load stored data when the application starts.

Expected Outcome

The system provides a lightweight Java-based solution for managing student feedback through a structured command-line workflow. It demonstrates object-oriented programming, modular design, collections, file handling, validation, exception handling, and basic data processing.