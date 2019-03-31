package sergioandrade.blackjack.gameLogic;

public class PlayerScore extends Score {

    public PlayerScore(){
        score = 0;
    }

    public void update(int points) {
        if (points == 11){
            if (score + 11 <= 21)
                score += 11;
            else
                score ++;
        }
        else {
            score += points;
        }
        if (score == 21)
            Mediator.getInstance().win();
        else if(score > 21)
            Mediator.getInstance().lose();
        display = base + score;
    }
}