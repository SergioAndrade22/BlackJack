package sergioandrade.blackjack;

public class IAHand extends Hand {

    public IAHand(){
        intelligence = new IAIntelligence(this);
        score = new Score();
    }
}
