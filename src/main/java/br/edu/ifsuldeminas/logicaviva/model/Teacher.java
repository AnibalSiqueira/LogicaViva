package br.edu.ifsuldeminas.logicaviva.model;

public class Teacher extends User {

    private Long teacherId;

    public Teacher(){}

    public Teacher(String userName, String userEmail, String userRole, String passwdHash) {
        super(teacherId, userName, userEmail, userRole, passwdHash);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
