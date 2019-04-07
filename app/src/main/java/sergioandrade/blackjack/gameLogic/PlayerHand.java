package sergioandrade.blackjack.gameLogic;

import sergioandrade.blackjack.creation.Card;

public class PlayerHand extends Hand {

    public PlayerHand(){
        intelligence = new PlayerIntelligence(this);
        score = new PlayerScore();
    }

    public void add(Card c){
        hand.add(c);
        Mediator.getInstance().addCardPlayer(c);
        score.update(c.getValue());
    }
}
