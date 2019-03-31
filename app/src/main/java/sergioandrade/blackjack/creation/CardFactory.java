package sergioandrade.blackjack.creation;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;

import sergioandrade.blackjack.R;
import sergioandrade.blackjack.activities.PlayerVsIA;

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
        for (int i = 1; i <= 13; i++){
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
        for (int i = 1; i <= 13; i++){
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
        for (int i = 1; i <= 13; i++){
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
        for (int i = 1; i <= 13; i++){
            aux = new Card("spade", i);
            toRet.add(aux);
        }
        return toRet;
    }
}
