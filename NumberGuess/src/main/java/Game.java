import javax.swing.*;

public class Game {

    private Player play;


    public Game(String nameOfPlayer){

        play = new Player(nameOfPlayer);
    }
    
    public void playerRounds{

        int givenChances = 3;
        GameRounds gameRounds = new GameRounds(givenChances);

        JOptionPane.showMessageDialog(new JFrame(),"Guess the random number ranging from 1 to 100..." +
                "The maximum number of chances is: " + givenChances);


        while(!gameRounds.isGuessCorrect() && gameRounds.remainChances()){

            try{

                int user_guess = Integer.parseInt(JOptionPane.showInputDialog("Input your number..."));
                JOptionPane.showMessageDialog(new JFrame(),gameRounds.guessResponse(user_guess));

                if(gameRounds.guessResponse(user_guess).equals("CORRECT GUESS!!!")){

                    break;
                }

            }
            catch (NumberFormatException ex){

                JOptionPane.showMessageDialog(new JFrame(),"Enter a valid NUMBER!!!");

            }



            givenChances -= 1;
            JOptionPane.showMessageDialog(new JFrame(), "YOU HAVE " + givenChances + " ROUNDS LEFT");

            if(!gameRounds.isGuessCorrect() && givenChances == 0){ JOptionPane.showMessageDialog(new JFrame(), "Boo Hoo, YOU LOST... THE CORRECT NUMBER IS:" + gameRounds.getSelectedNumber());
                break;}
        }

    }

    public void anotherRound{

        String playAgain = "y";
        while (playAgain.equalsIgnoreCase("y")) {
            playerRounds();
            playAgain = JOptionPane.showInputDialog(new JFrame(), "Do you want to play another round? (y/n): ");

        }

        System.out.println("Thank you for playing! Your final score is: " + this.play.getUser_score());

    }

}
