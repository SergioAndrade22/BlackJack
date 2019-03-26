package sergioandrade.blackjack;

public class Logic {
    private Deck deck;
    private PlayerHand playerHand;
    private IAHand iaHand;

    public Logic(){
        deck = Deck.getInstance();
        playerHand = new PlayerHand();
        iaHand = new IAHand();
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
            iaHand.act();
        }
    }

    public void stay(){
        if (!deck.isEmpty())
            iaHand.act();
    }

    public String getPlayerDisplay(){
        return playerHand.getScoreDisplay();
    }

    public String getIADisplay(){
        return iaHand.getScoreDisplay();
    }
}
