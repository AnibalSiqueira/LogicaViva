package br.edu.ifsuldeminas.logicaviva.model;

/**
 *
 *
 * @author Anibal Siqueira
 */
public class Teacher extends User {

    private Long teacherId;

    public Teacher(){}

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
