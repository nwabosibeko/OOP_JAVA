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
    }
}
