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
            switch (i){
                case 1 : aux.setDrawable(R.drawable.club_1); break;
                case 2 : aux.setDrawable(R.drawable.club_2); break;
                case 3 : aux.setDrawable(R.drawable.club_3); break;
                case 4 : aux.setDrawable(R.drawable.club_4); break;
                case 5 : aux.setDrawable(R.drawable.club_5); break;
                case 6 : aux.setDrawable(R.drawable.club_6); break;
                case 7 : aux.setDrawable(R.drawable.club_7); break;
                case 8 : aux.setDrawable(R.drawable.club_8); break;
                case 9 : aux.setDrawable(R.drawable.club_9); break;
                case 10 : aux.setDrawable(R.drawable.club_10); break;
                case 11 : aux.setDrawable(R.drawable.club_11); break;
                case 12 : aux.setDrawable(R.drawable.club_12); break;
                case 13 : aux.setDrawable(R.drawable.club_13); break;
            }
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
            switch (i){
                case 1 : aux.setDrawable(R.drawable.diamond_1); break;
                case 2 : aux.setDrawable(R.drawable.diamond_2); break;
                case 3 : aux.setDrawable(R.drawable.diamond_3); break;
                case 4 : aux.setDrawable(R.drawable.diamond_4); break;
                case 5 : aux.setDrawable(R.drawable.diamond_5); break;
                case 6 : aux.setDrawable(R.drawable.diamond_6); break;
                case 7 : aux.setDrawable(R.drawable.diamond_7); break;
                case 8 : aux.setDrawable(R.drawable.diamond_8); break;
                case 9 : aux.setDrawable(R.drawable.diamond_9); break;
                case 10 : aux.setDrawable(R.drawable.diamond_10); break;
                case 11 : aux.setDrawable(R.drawable.diamond_11); break;
                case 12 : aux.setDrawable(R.drawable.diamond_12); break;
                case 13 : aux.setDrawable(R.drawable.diamond_13); break;
            }
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
            switch (i){
                case 1 : aux.setDrawable(R.drawable.heart_1); break;
                case 2 : aux.setDrawable(R.drawable.heart_2); break;
                case 3 : aux.setDrawable(R.drawable.heart_3); break;
                case 4 : aux.setDrawable(R.drawable.heart_4); break;
                case 5 : aux.setDrawable(R.drawable.heart_5); break;
                case 6 : aux.setDrawable(R.drawable.heart_6); break;
                case 7 : aux.setDrawable(R.drawable.heart_7); break;
                case 8 : aux.setDrawable(R.drawable.heart_8); break;
                case 9 : aux.setDrawable(R.drawable.heart_9); break;
                case 10 : aux.setDrawable(R.drawable.heart_10); break;
                case 11 : aux.setDrawable(R.drawable.heart_11); break;
                case 12 : aux.setDrawable(R.drawable.heart_12); break;
                case 13 : aux.setDrawable(R.drawable.heart_13); break;
            }
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
            switch (i){
                case 1 : aux.setDrawable(R.drawable.spade_1); break;
                case 2 : aux.setDrawable(R.drawable.spade_2); break;
                case 3 : aux.setDrawable(R.drawable.spade_3); break;
                case 4 : aux.setDrawable(R.drawable.spade_4); break;
                case 5 : aux.setDrawable(R.drawable.spade_5); break;
                case 6 : aux.setDrawable(R.drawable.spade_6); break;
                case 7 : aux.setDrawable(R.drawable.spade_7); break;
                case 8 : aux.setDrawable(R.drawable.spade_8); break;
                case 9 : aux.setDrawable(R.drawable.spade_9); break;
                case 10 : aux.setDrawable(R.drawable.spade_10); break;
                case 11 : aux.setDrawable(R.drawable.spade_11); break;
                case 12 : aux.setDrawable(R.drawable.spade_12); break;
                case 13 : aux.setDrawable(R.drawable.spade_13); break;
            }
            toRet.add(aux);
        }
        return toRet;
    }
}
