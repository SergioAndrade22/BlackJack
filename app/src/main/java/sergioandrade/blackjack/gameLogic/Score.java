package sergioandrade.blackjack.gameLogic;

public abstract class Score {
    protected int score;
    protected final String base = "Hand: ";
    protected String display = base + score;

    public abstract void update(int points);

    public int getScore() {
        return score;
    }

    public String getDisplay(){
        return display;
    }
}
