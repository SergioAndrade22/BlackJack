package sergioandrade.blackjack;

public class PlayerIntelligence extends Intelligence {

    public PlayerIntelligence(Hand h){
        hand = h;
    }

    public void act(){
        hand.add(Deck.getInstance().give());
    }
}
