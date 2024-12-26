import java.util.ArrayList;

public class Learner {

    private String name;
    private ArrayList<Subject> subjects;

    public Learner(String studentName) {
        name = studentName;
        subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSubject(String subjectName, double mark) {
        subjects.add(new Subject(subjectName, mark));
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

}
