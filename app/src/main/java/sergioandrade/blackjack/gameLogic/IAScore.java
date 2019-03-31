package sergioandrade.blackjack.gameLogic;

public class IAScore extends Score {

    public IAScore(){
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
            Mediator.getInstance().lose();
        else if(score > 21)
            Mediator.getInstance().win();
        display = base + score;
    }
}
