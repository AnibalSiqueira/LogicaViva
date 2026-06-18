package br.edu.ifsuldeminas.logicaviva.model;

import java.time.LocalDate;

/**
 *
 * @author Isabela Melo
 */
public class Exercise {
    //Attributes
    private Long id;
    private String title;
    private String description;
    private LocalDate deadline ;
    
    //Constructor
    public Exercise(Long id, String title,String description, LocalDate deadline){
        this.id=id;
        this.title=title;
        this.description=description;
        this.deadline=deadline;
    }
    
    
    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
    
    
    //Method
    public String getDetails(){
        return "Exercise id: "
                + id
                + "\nTitle: "
                + title
                + "\nDescription: "
                + description
                + "\nDeadline: "
                + deadline;

    }
}
