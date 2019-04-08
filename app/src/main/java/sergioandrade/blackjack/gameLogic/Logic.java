package sergioandrade.blackjack.gameLogic;

import android.graphics.Bitmap;

import sergioandrade.blackjack.activities.PlayerVsIA;
import sergioandrade.blackjack.creation.Card;
import sergioandrade.blackjack.creation.Deck;

public class Logic {
    private Deck deck;
    private PlayerHand playerHand;
    private IAHand iaHand;
    private PlayerVsIA pvia;

    public Logic(PlayerVsIA p){
        deck = Deck.getInstance();
        playerHand = new PlayerHand();
        iaHand = new IAHand();
        Mediator.getInstance();
        Mediator.setColleague(this);
        pvia = p;
    }

    public void deal(){
        Card aux;
        for (int i = 0; i < 2; i++){
            aux = deck.give();
            playerHand.add(aux);
            aux = deck.give();
            iaHand.add(aux);
        }
    }

    public void draw(){
        if (!deck.isEmpty()) {
            playerHand.act();
            pvia.disableDraw();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            iaHand.act();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pvia.enableDraw();
        }
    }

    public void stay(){
        if (!deck.isEmpty()) {
            iaHand.act();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        pvia.disableDraw();
        if (playerHand.getScore() >= iaHand.getScore()){
            win();
        }
        else
            lose();
    }

    public String getPlayerDisplay(){
        return playerHand.getScoreDisplay();
    }

    public String getIADisplay(){
        return iaHand.getScoreDisplay();
    }

    public void win(){
        pvia.callWin();
    }

    public void lose(){
        pvia.callLose();
    }

    public void addCardPlayer(Card c){
        pvia.addCardPlayer(c);
    }

    public void addCardIA(Card c){
        pvia.addCardIA(c);
    }
}