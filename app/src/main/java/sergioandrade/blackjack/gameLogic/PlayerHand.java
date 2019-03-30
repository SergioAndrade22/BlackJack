package sergioandrade.blackjack.gameLogic;

public class PlayerHand extends Hand {

    public PlayerHand(){
        intelligence = new PlayerIntelligence(this);
        score = new Score();
    }
}
