package Herencia_3;

import java.util.HashSet;

public class Teacher extends Person{
    private HashSet<String> subjects;

    public Teacher() {
        super();
        subjects = new HashSet<>();
        System.out.println("Sóc el constructor de la classe Teacher");
    }
    public boolean addSubject(String subject) {
        return subjects.add(subject);
    }

    public boolean removeSubject(String subject) {
        return subjects.remove(subject);
    }
}
