package br.edu.ifsuldeminas.logicaviva.model;

/**
 *
 *
 * @author Anibal Siqueira
 */
public class Student {

    private String enrollmentId;

    //Constructor
    public Student(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    //Getter && setter
    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

//    public Submission submitSolution() {
//
//    }

}
