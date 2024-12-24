import java.util.Scanner;

public class RunGame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String playerName = scanner.nextLine();
        Game game = new Game(playerName);
        game.anotherRound();

    }

}
