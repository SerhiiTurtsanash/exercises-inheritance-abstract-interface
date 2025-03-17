package Herencia_3;

public class Student extends Person {
    protected String cycle;
    protected int course;

    public Student() {
        super();
        System.out.println("Sóc el constructor de la classe Student");
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
