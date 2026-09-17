import model.Feedback;
import model.Student;
import service.FeedbackService;
import service.FeedbackStatistics;
import service.StudentService;
import util.ContentModerator;
import util.InputValidator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FeedbackService feedbackService = new FeedbackService();
        FeedbackStatistics statistics = new FeedbackStatistics();
        StudentService studentService = new StudentService();

        while (true) {

            System.out.println("\n==============================");
            System.out.println("   STUDENT FEEDBACK SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Register Student");
            System.out.println("2. Add Feedback");
            System.out.println("3. View All Feedback");
            System.out.println("4. Search Feedback");
            System.out.println("5. Update Feedback");
            System.out.println("6. Delete Feedback");
            System.out.println("7. View All Students");
            System.out.println("8. View Feedback Statistics");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {

                // =========================
                // 1. REGISTER STUDENT
                // =========================
                case "1":

                    System.out.println("\n--- Student Registration ---");

                    try {

                        System.out.print("Enter Student ID: ");
                        int studentId =
                                Integer.parseInt(scanner.nextLine());

                        if (!InputValidator.isValidId(studentId)) {
                            System.out.println("Invalid Student ID.");
                            break;
                        }

                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine();

                        if (!InputValidator.isNotEmpty(name)) {
                            System.out.println("Name cannot be empty.");
                            break;
                        }

                        System.out.print("Enter Student Email: ");
                        String email = scanner.nextLine();

                        if (!InputValidator.isNotEmpty(email)) {
                            System.out.println("Email cannot be empty.");
                            break;
                        }

                        Student student =
                                new Student(studentId, name, email);

                        studentService.addStudent(student);

                    } catch (NumberFormatException e) {

                        System.out.println(
                                "Please enter a valid number."
                        );
                    }

                    break;


                // =========================
                // 2. ADD FEEDBACK
                // =========================
                case "2":

                    System.out.println("\n--- Add Feedback ---");

                    try {

                        System.out.print("Enter Feedback ID: ");
                        int feedbackId =
                                Integer.parseInt(scanner.nextLine());

                        if (!InputValidator.isValidId(feedbackId)) {
                            System.out.println("Invalid Feedback ID.");
                            break;
                        }

                        System.out.print("Enter Student ID: ");
                        int feedbackStudentId =
                                Integer.parseInt(scanner.nextLine());

                        if (!InputValidator.isValidId(feedbackStudentId)) {
                            System.out.println("Invalid Student ID.");
                            break;
                        }

                        // Check whether student is registered
                        if (!studentService.studentIdExists(
                                feedbackStudentId)) {

                            System.out.println(
                                    "Student ID not found. " +
                                    "Please register the student first."
                            );

                            break;
                        }

                        System.out.print("Enter Subject/Course: ");
                        String subject = scanner.nextLine();

                        if (!InputValidator.isNotEmpty(subject)) {
                            System.out.println(
                                    "Subject cannot be empty."
                            );
                            break;
                        }

                        System.out.print("Enter Rating (1-5): ");
                        int rating =
                                Integer.parseInt(scanner.nextLine());

                        if (!InputValidator.isValidRating(rating)) {
                            System.out.println(
                                    "Rating must be between 1 and 5."
                            );
                            break;
                        }

                        System.out.print("Enter Comment: ");
                        String comment = scanner.nextLine();

                        if (!InputValidator.isNotEmpty(comment)) {
                            System.out.println(
                                    "Comment cannot be empty."
                            );
                            break;
                        }

                        // Moderate inappropriate words
                        comment = ContentModerator.moderate(comment);

                        Feedback feedback = new Feedback(
                                feedbackId,
                                feedbackStudentId,
                                subject,
                                rating,
                                comment
                        );

                        feedbackService.addFeedback(feedback);

                    } catch (NumberFormatException e) {

                        System.out.println(
                                "Please enter a valid number."
                        );
                    }

                    break;


                // =========================
                // 3. VIEW ALL FEEDBACK
                // =========================
                case "3":

                    System.out.println("\n--- All Feedback ---");

                    feedbackService.viewAllFeedback();

                    break;


                // =========================
                // 4. SEARCH FEEDBACK
                // =========================
                case "4":

                    System.out.println("\n--- Search Feedback ---");

                    System.out.print("Enter Subject/Course: ");
                    String searchSubject = scanner.nextLine();

                    if (!InputValidator.isNotEmpty(searchSubject)) {
                        System.out.println(
                                "Subject cannot be empty."
                        );
                        break;
                    }

                    feedbackService.searchBySubject(searchSubject);

                    break;


                // =========================
                // 5. UPDATE FEEDBACK
                // =========================
                case "5":

                    System.out.println("\n--- Update Feedback ---");

                    try {

                        System.out.print("Enter Feedback ID: ");
                        int updateId =
                                Integer.parseInt(scanner.nextLine());

                        if (!InputValidator.isValidId(updateId)) {
                            System.out.println(
                                    "Invalid Feedback ID."
                            );
                            break;
                        }

                        System.out.print("Enter New Rating (1-5): ");
                        int newRating =
                                Integer.parseInt(scanner.nextLine());

                        if (!InputValidator.isValidRating(newRating)) {
                            System.out.println(
                                    "Rating must be between 1 and 5."
                            );
                            break;
                        }

                        System.out.print("Enter New Comment: ");
                        String newComment = scanner.nextLine();

                        if (!InputValidator.isNotEmpty(newComment)) {
                            System.out.println(
                                    "Comment cannot be empty."
                            );
                            break;
                        }

                        // Moderate updated comment
                        newComment =
                                ContentModerator.moderate(newComment);

                        boolean updated =
                                feedbackService.updateFeedback(
                                        updateId,
                                        newRating,
                                        newComment
                                );

                        if (updated) {

                            System.out.println(
                                    "Feedback updated successfully!"
                            );

                        } else {

                            System.out.println(
                                    "Feedback ID not found."
                            );
                        }

                    } catch (NumberFormatException e) {

                        System.out.println(
                                "Please enter a valid number."
                        );
                    }

                    break;


                // =========================
                // 6. DELETE FEEDBACK
                // =========================
                case "6":

                    System.out.println("\n--- Delete Feedback ---");

                    try {

                        System.out.print("Enter Feedback ID: ");
                        int deleteId =
                                Integer.parseInt(scanner.nextLine());

                        if (!InputValidator.isValidId(deleteId)) {
                            System.out.println(
                                    "Invalid Feedback ID."
                            );
                            break;
                        }

                        boolean deleted =
                                feedbackService.deleteFeedback(deleteId);

                        if (deleted) {

                            System.out.println(
                                    "Feedback deleted successfully!"
                            );

                        } else {

                            System.out.println(
                                    "Feedback ID not found."
                            );
                        }

                    } catch (NumberFormatException e) {

                        System.out.println(
                                "Please enter a valid number."
                        );
                    }

                    break;


                // =========================
                // 7. VIEW ALL STUDENTS
                // =========================
                case "7":

                    System.out.println(
                            "\n--- Registered Students ---"
                    );

                    studentService.viewAllStudents();

                    break;


                // =========================
                // 8. FEEDBACK STATISTICS
                // =========================
                case "8":

                    statistics.displayStatistics(
                            feedbackService.getFeedbackList()
                    );

                    break;


                // =========================
                // 9. EXIT
                // =========================
                case "9":

                    System.out.println(
                            "\nThank you for using Student Feedback System!"
                    );

                    scanner.close();

                    return;


                // =========================
                // INVALID OPTION
                // =========================
                default:

                    System.out.println(
                            "Invalid choice. Please try again."
                    );
            }
        }
    }
}