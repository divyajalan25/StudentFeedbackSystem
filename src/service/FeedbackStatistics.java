package service;

import model.Feedback;
import java.util.ArrayList;

public class FeedbackStatistics {

    public void displayStatistics(ArrayList<Feedback> feedbackList) {

        System.out.println("\n--- Feedback Statistics ---");

        if (feedbackList.isEmpty()) {

            System.out.println("No feedback available for analysis.");

            return;
        }

        int totalFeedback = feedbackList.size();
        int totalRating = 0;
        int fiveStarCount = 0;
        int oneStarCount = 0;

        for (Feedback feedback : feedbackList) {

            int rating = feedback.getRating();

            totalRating += rating;

            if (rating == 5) {
                fiveStarCount++;
            }

            if (rating == 1) {
                oneStarCount++;
            }
        }

        double averageRating =
                (double) totalRating / totalFeedback;

        System.out.println(
                "Total Feedback: " + totalFeedback
        );

        System.out.println(
                "Average Rating: " +
                String.format("%.2f", averageRating) +
                "/5"
        );

        System.out.println(
                "5-Star Feedback: " + fiveStarCount
        );

        System.out.println(
                "1-Star Feedback: " + oneStarCount
        );
    }
}