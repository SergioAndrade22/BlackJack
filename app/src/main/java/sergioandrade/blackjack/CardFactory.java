package sergioandrade.blackjack;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The following class implements the Object Factory Design Pattern
 */
class CardFactory {

    /**
     * Constructor, takes no params
     */
    public CardFactory(){}

    /**
     * Creates all cards from the given suit and returns a collection with them.
     * @return a collection containing all cards from given suit
     */
    public Collection<Card> createClubs(){
        Collection<Card> toRet = new ArrayList<>();
        Card aux;
        for (int i = 0; i <= 13; i++){
            aux = new Card("club", i);
            toRet.add(aux);
        }
        return toRet;
    }

    /**
     * Creates all cards from the given suit and returns a collection with them.
     * @return a collection containing all cards from given suit
     */
    public Collection<Card> createDiamonds(){
        Collection<Card> toRet = new ArrayList<>();
        Card aux;
        for (int i = 0; i <= 13; i++){
            aux = new Card("diamonds", i);
            toRet.add(aux);
        }
        return toRet;
    }

    /**
     * Creates all cards from the given suit and returns a collection with them.
     * @return a collection containing all cards from given suit
     */
    public Collection<Card> createHearts(){
        Collection<Card> toRet = new ArrayList<>();
        Card aux;
        for (int i = 0; i <= 13; i++){
            aux = new Card("heart", i);
            toRet.add(aux);
        }
        return toRet;
    }

    /**
     * Creates all cards from the given suit and returns a collection with them.
     * @return a collection containing all cards from given suit
     */
    public Collection<Card> createSpades(){
        Collection<Card> toRet = new ArrayList<>();
        Card aux;
        for (int i = 0; i <= 13; i++){
            aux = new Card("spade", i);
            toRet.add(aux);
        }
        return toRet;
    }
}
