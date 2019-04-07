package sergioandrade.blackjack.gameLogic;

import android.graphics.Bitmap;

import sergioandrade.blackjack.creation.Card;

public class Mediator {
    private static Logic colleague;
    private static Mediator instance;

    private Mediator(){ }

    public static Mediator getInstance(){
            return (instance == null) ? instance = new Mediator() : instance;
    }

    public static void setColleague(Logic l){
        colleague = l;
    }

    public void win(){
        colleague.win();
    }

    public void lose(){
        colleague.lose();
    }

    public void addCardPlayer(Card c){
        colleague.addCardPlayer(c);
    }

    public void addCardIA(Card c){
        colleague.addCardIA(c);
    }
}
