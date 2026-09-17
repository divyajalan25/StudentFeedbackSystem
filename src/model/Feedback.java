package model;

public class Feedback {

    private int feedbackId;
    private int studentId;
    private String subject;
    private int rating;
    private String comment;

    public Feedback(
            int feedbackId,
            int studentId,
            String subject,
            int rating,
            String comment) {

        this.feedbackId = feedbackId;
        this.studentId = studentId;
        this.subject = subject;
        this.rating = rating;
        this.comment = comment;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }


    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}