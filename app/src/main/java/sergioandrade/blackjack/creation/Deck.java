package sergioandrade.blackjack.creation;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    private static Deck instance;

    public static synchronized Deck getInstance(){
        return (instance == null) ? (instance = new Deck()) : instance;
    }

    private Deck(){
        cards = new ArrayList<>();
        CardFactory factory = new CardFactory();
        cards.addAll(factory.createClubs());
        cards.addAll(factory.createDiamonds());
        cards.addAll(factory.createHearts());
        cards.addAll(factory.createSpades());
    }

    public Card give(){
        Random r = new Random();
        Card toRet;
        toRet = cards.get(r.nextInt(cards.size()));
        cards.remove(toRet);
        return toRet;
    }

    public boolean isEmpty(){
        return cards.isEmpty();
    }
}
