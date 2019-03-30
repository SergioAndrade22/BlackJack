package sergioandrade.blackjack.gameLogic;

import sergioandrade.blackjack.creation.Deck;

public class PlayerIntelligence extends Intelligence {

    public PlayerIntelligence(Hand h){
        hand = h;
    }

    public void act(){
        hand.add(Deck.getInstance().give());
    }
}
