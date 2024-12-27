import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public double getTotalMarks() {
        return subjects.stream().mapToDouble(Subject::getMark).sum();
    }

    public double getAveragePercentage() {
        if (subjects.isEmpty()) {
            return 0;
        }
        return getTotalMarks() / subjects.size();
    }



}
