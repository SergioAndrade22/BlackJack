package sergioandrade.blackjack.gameLogic;

import sergioandrade.blackjack.creation.Card;

public class IAHand extends Hand {

    public IAHand(){
        intelligence = new IAIntelligence(this);
        score = new IAScore();
    }
    public void add(Card c){
        hand.add(c);
        Mediator.getInstance().addCardIA(c);
        score.update(c.getValue());
    }
}
