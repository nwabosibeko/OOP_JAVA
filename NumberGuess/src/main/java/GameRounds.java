import java.util.*;

public class GameRounds {

    private int selectedNumber, chances, limitedChances;

    private boolean guessCorrect;


    public GameRounds(int maxChances){

        limitedChances = maxChances;
        guessCorrect = false;
        selectedNumber = new Random().nextInt(100) + 1;

    }

    public int getSelectedNumber() {return selectedNumber;}

//    public int getChances(){return chances;}

    public boolean isGuessCorrect() { return guessCorrect;}

    public boolean remainChances(){ return chances != limitedChances;}

    public String guessResponse(int userNum){

        chances = chances + 1;
        if(userNum < selectedNumber){ return "Your Guess Is Too Low!";}
        else if(userNum > selectedNumber){ return "Your Guess Is Too High!";}

        return "CORRECT GUESS!!!";

    }

}
