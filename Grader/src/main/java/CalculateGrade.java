import java.util.Map;
import java.util.Scanner;

public class CalculateGrade {

    public static final String PURPLE = "\033[0;35m";
    public static final String RESET = "\033[0m";
    public static final String BLUE = "\033[0;34m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String ORANGE = "\033[0;33m";




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println(BLUE +
                "███████╗████████╗██╗   ██╗██████╗ ███████╗███╗   ██╗████████╗    ██████╗ ██████╗  █████╗ ██████╗ ███████╗    ██████╗ █████╗ ██╗      ██████╗██╗   ██╗██╗      █████╗ ████████╗ ██████╗ ██████╗\n" +
                "██╔════╝╚══██╔══╝██║   ██║██╔══██╗██╔════╝████╗  ██║╚══██╔══╝   ██╔════╝ ██╔══██╗██╔══██╗██╔══██╗██╔════╝   ██╔════╝██╔══██╗██║     ██╔════╝██║   ██║██║     ██╔══██╗╚══██╔══╝██╔═══██╗██╔══██╗\n" +
                "███████╗   ██║   ██║   ██║██║  ██║█████╗  ██╔██╗ ██║   ██║      ██║  ███╗██████╔╝███████║██║  ██║█████╗     ██║     ███████║██║     ██║     ██║   ██║██║     ███████║   ██║   ██║   ██║██████╔╝\n" +
                "╚════██║   ██║   ██║   ██║██║  ██║██╔══╝  ██║╚██╗██║   ██║      ██║   ██║██╔══██╗██╔══██║██║  ██║██╔══╝     ██║     ██╔══██║██║     ██║     ██║   ██║██║     ██╔══██║   ██║   ██║   ██║██╔══██╗\n" +
                "███████║   ██║   ╚██████╔╝██████╔╝███████╗██║ ╚████║   ██║      ╚██████╔╝██║  ██║██║  ██║██████╔╝███████╗   ╚██████╗██║  ██║███████╗╚██████╗╚██████╔╝███████╗██║  ██║   ██║   ╚██████╔╝██║  ██║\n" +
                "╚══════╝   ╚═╝    ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═══╝   ╚═╝       ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝    ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝" + RESET);

        System.out.println("Enter your Name and Surname: ");
        String studentName = input.nextLine();

        System.out.println("Enter number of subjects: ");
        int numberOfSubjects = input.nextInt();
        input.nextLine();

        Learner learner = new Learner(studentName);

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter subject name: ");
            String subjectName = input.nextLine();

            System.out.println("Enter subject mark for " + subjectName + ": ");
            double subjectMark = input.nextDouble();
            input.nextLine();

            learner.addSubject(subjectName, subjectMark);
        }

        System.out.println("\nGRADE REPORT:\t" + learner.getName() +
                "\n_________________________________");

        Map<String, String> subjectGrades = learner.getSubjectGrades();

        System.out.println("Subject\t\t|Mark\t\t|Grade\t|" +
                "\n____________|___________|_______|");

        for (Map.Entry<String, String> entry : subjectGrades.entrySet()) {
            String subjectName = entry.getKey();
            String grade = entry.getValue();
            double mark = learner.getSubjects().stream()
                    .filter(s -> s.getSubName().equals(subjectName))
                    .findFirst()
                    .map(Subject::getMark)
                    .orElse(0.0);
            System.out.printf(subjectName.toUpperCase() + "\t\t  " + mark + "\t\t  (" + grade + ")\n");

        }


    }

    public static String calculateGradeAverage(double avgPercentage) {
        if(avgPercentage >= 90) {
            return GREEN + "A+" + RESET;
        } else if (avgPercentage >= 80) {
            return GREEN + "A" + RESET;
        } else if (avgPercentage >= 70) {
            return YELLOW + "B" + RESET;
        } else if (avgPercentage >= 60) {
            return YELLOW + "C" + RESET;
        } else if (avgPercentage >= 50){
            return ORANGE + "D" + RESET;
        }
        return RED + "F" + RESET;
    }

}
