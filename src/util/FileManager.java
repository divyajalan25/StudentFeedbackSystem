package util;

import model.Feedback;
import model.Student;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private static final String STUDENT_FILE = "students.txt";
    private static final String FEEDBACK_FILE = "feedback.txt";

    // =========================
    // SAVE STUDENTS
    // =========================
    public static void saveStudents(ArrayList<Student> students) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(STUDENT_FILE))) {

            for (Student student : students) {

                writer.write(
                        student.getStudentId() + "|" +
                        student.getName() + "|" +
                        student.getEmail()
                );

                writer.newLine();
            }

        } catch (IOException e) {

            System.out.println(
                    "Error saving student data: " + e.getMessage()
            );
        }
    }


    // =========================
    // LOAD STUDENTS
    // =========================
    public static ArrayList<Student> loadStudents() {

        ArrayList<Student> students = new ArrayList<>();

        File file = new File(STUDENT_FILE);

        if (!file.exists()) {
            return students;
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split("\\|");

                if (data.length == 3) {

                    int id = Integer.parseInt(data[0]);

                    Student student = new Student(
                            id,
                            data[1],
                            data[2]
                    );

                    students.add(student);
                }
            }

        } catch (IOException | NumberFormatException e) {

            System.out.println(
                    "Error loading student data: " + e.getMessage()
            );
        }

        return students;
    }


    // =========================
    // SAVE FEEDBACK
    // =========================
    public static void saveFeedback(
            ArrayList<Feedback> feedbackList) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FEEDBACK_FILE))) {

            for (Feedback feedback : feedbackList) {

                writer.write(
                        feedback.getFeedbackId() + "|" +
                        feedback.getStudentId() + "|" +
                        feedback.getSubject() + "|" +
                        feedback.getRating() + "|" +
                        feedback.getComment()
                );

                writer.newLine();
            }

        } catch (IOException e) {

            System.out.println(
                    "Error saving feedback data: " + e.getMessage()
            );
        }
    }


    // =========================
    // LOAD FEEDBACK
    // =========================
    public static ArrayList<Feedback> loadFeedback() {

        ArrayList<Feedback> feedbackList = new ArrayList<>();

        File file = new File(FEEDBACK_FILE);

        if (!file.exists()) {
            return feedbackList;
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split("\\|");

                if (data.length == 5) {

                    int feedbackId =
                            Integer.parseInt(data[0]);

                    int studentId =
                            Integer.parseInt(data[1]);

                    String subject = data[2];

                    int rating =
                            Integer.parseInt(data[3]);

                    String comment = data[4];

                    Feedback feedback = new Feedback(
                            feedbackId,
                            studentId,
                            subject,
                            rating,
                            comment
                    );

                    feedbackList.add(feedback);
                }
            }

        } catch (IOException | NumberFormatException e) {

            System.out.println(
                    "Error loading feedback data: " + e.getMessage()
            );
        }

        return feedbackList;
    }
}