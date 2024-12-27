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

    private String calculateGradeSymbol(double mark) {

        if (mark >= 90) return "A";
        else if (mark >= 80) return "B";
        else if (mark >= 70) return "C";
        else if (mark >= 60) return "D";
        else return "F";
    }

    public Map<String, String> getSubjectGrades() {
        Map<String, String> subjectGrades = new HashMap<>();

        for (Subject subject : subjects) {
            String grade = calculateGradeSymbol(subject.getMark());
            subjectGrades.put(subject.getSubName(), grade);
        }

        return subjectGrades;
    }



}
