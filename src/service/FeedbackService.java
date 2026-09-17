package service;

import model.Feedback;
import util.FileManager;

import java.util.ArrayList;

public class FeedbackService {

    private ArrayList<Feedback> feedbackList;

    public FeedbackService() {
        feedbackList = FileManager.loadFeedback();
    }

    public boolean feedbackIdExists(int feedbackId) {

        for (Feedback feedback : feedbackList) {

            if (feedback.getFeedbackId() == feedbackId) {
                return true;
            }
        }

        return false;
    }

    public void addFeedback(Feedback feedback) {

        if (feedbackIdExists(feedback.getFeedbackId())) {

            System.out.println(
                    "Feedback ID already exists. Feedback not added."
            );

            return;
        }

        feedbackList.add(feedback);

        FileManager.saveFeedback(feedbackList);

        System.out.println("Feedback added successfully!");
    }

    public void viewAllFeedback() {

        if (feedbackList.isEmpty()) {

            System.out.println("No feedback available.");

            return;
        }

        for (Feedback feedback : feedbackList) {

            displayFeedback(feedback);
        }
    }

    public void searchBySubject(String subject) {

        boolean found = false;

        for (Feedback feedback : feedbackList) {

            if (feedback.getSubject()
                    .equalsIgnoreCase(subject)) {

                displayFeedback(feedback);

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No feedback found for this subject."
            );
        }
    }

    public boolean updateFeedback(
            int feedbackId,
            int newRating,
            String newComment) {

        for (Feedback feedback : feedbackList) {

            if (feedback.getFeedbackId() == feedbackId) {

                feedback.setRating(newRating);
                feedback.setComment(newComment);

                FileManager.saveFeedback(feedbackList);

                return true;
            }
        }

        return false;
    }

    public boolean deleteFeedback(int feedbackId) {

        for (int i = 0; i < feedbackList.size(); i++) {

            if (feedbackList.get(i).getFeedbackId() == feedbackId) {

                feedbackList.remove(i);

                FileManager.saveFeedback(feedbackList);

                return true;
            }
        }

        return false;
    }

    public ArrayList<Feedback> getFeedbackList() {

        return feedbackList;
    }

    private void displayFeedback(Feedback feedback) {

        System.out.println(
                "Feedback ID: " + feedback.getFeedbackId()
        );

        System.out.println(
                "Student ID: " + feedback.getStudentId()
        );

        System.out.println(
                "Subject: " + feedback.getSubject()
        );

        System.out.println(
                "Rating: " + feedback.getRating() + "/5"
        );

        System.out.println(
                "Comment: " + feedback.getComment()
        );

        System.out.println("---------------------------");
    }
}