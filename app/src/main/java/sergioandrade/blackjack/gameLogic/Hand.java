package sergioandrade.blackjack.gameLogic;

import java.util.ArrayList;

import sergioandrade.blackjack.creation.Card;

public abstract class Hand {
    protected ArrayList<Card> hand = new ArrayList<Card>();
    protected Intelligence intelligence;
    protected Score score;
    protected

    public void act(){
        intelligence.act();
    }

    public void add(Card c){
        hand.add(c);
        score.update(c.getValue());

    }

    public int getScore(){
        return score.getScore();
    }

    public String getScoreDisplay(){
        return score.getDisplay();
    }
}
