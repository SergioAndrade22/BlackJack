package sergioandrade.blackjack;

public class Score {
    private int score;
    private final String base = "Hand: ";
    private String display = base + score;

    public Score(){
        score = 0;
    }

    public void update(int points){
        if (points == 11){
            if (score + 11 <= 21)
                score += 11;
            else
                score ++;
        }
        else {
            score += points;
        }
        display = base + score;
    }

    public int getScore() {
        return score;
    }

    public String getDisplay(){
        return display;
    }
}
