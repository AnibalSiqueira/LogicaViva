/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogiaViva;

import java.time.LocalDateTime;

/**
 *
 * @author Isabela Melo
 */
public class Submission {
    //Attributes
     private Long submissionId;
    private LocalDateTime submittedAt;
    private String feedback;
    private String content;

    //Constructor
    public Submission(Long id, String content) {
        this.submissionId=id;
        this.content=content;
        this.submittedAt= LocalDateTime.now();
        this.feedback="";
    }

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

    public String getContent() {
        return content;
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

    public void setContent(String content) {
        this.content = content;
    }
    
    
    

}
