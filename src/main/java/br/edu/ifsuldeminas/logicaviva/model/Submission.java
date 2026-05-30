package br.edu.ifsuldeminas.logicaviva.model;

import java.time.LocalDateTime;

public class Submission {

    private Long submissionId;
    private LocalDateTime submittedAt;
    private String feedback;

    //Constructor
    public Submission() {}

    //Getters
    public Long getSubmissionId() {
        return submissionId;
    }
    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }
    public String getFeedback() {
        return feedback;
    }

    //Setters
    public void setSubmissionId(Long submissionId) {
        this.submissionId = submissionId;
    }
    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    //Methods

}
