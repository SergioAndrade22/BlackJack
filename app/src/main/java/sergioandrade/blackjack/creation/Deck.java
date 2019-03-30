package sergioandrade.blackjack.creation;

import java.util.ArrayList;
import java.util.Random;

/**
 * Emulates the Deck
 * The following class implements an Object Pool Design Pattern and Singleton
 */
public class Deck {
    private ArrayList<Card> cards;
    private static Deck instance;

    /**
     * Used to get the current instance of the Deck
     * @return the Deck instance
     */
    public static synchronized Deck getInstance(){
        return (instance == null) ? (instance = new Deck()) : instance;
    }

    /**
     * Constructor for the deck, also builds the cards, takes no params
     */
    private Deck(){
        cards = new ArrayList<>();
        CardFactory factory = new CardFactory();
        cards.addAll(factory.createClubs());
        cards.addAll(factory.createDiamonds());
        cards.addAll(factory.createHearts());
        cards.addAll(factory.createSpades());
    }

    /**
     * Gives a random card from the deck
     * @return a random card from the deck or null if empty
     */
    public Card give(){
        Random r = new Random();
        Card toRet;
        toRet = cards.get(r.nextInt(cards.size()));
        cards.remove(toRet);
        return toRet;
    }

    /**
     * Helps keep track of the number of cards on the Deck before calling the give() method
     * @return true if no more cards are left on the deck, false on the contrary
     */
    public boolean isEmpty(){
        return cards.isEmpty();
    }
}
