package sergioandrade.blackjack.creation;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.Icon;
import android.media.Image;

import sergioandrade.blackjack.R;

/**
 * Emulates the cards used on a Deck
 */
public class Card {
    private String suit;
    private int value;
    private int represValue;

    /**
     * Constructor, builds the card upside down
     * @param s card's suit
     * @param v card's value
     */
    public Card(String s, int v){
        suit = s;
        value = represValue = v;
    }

    /**
     * Returns the value of the card, for the purposes of the application this values varies from 2-11
     * @return card's value
     */
    public int getValue(){
        int toRet = 0;
        switch (value){
            case 1 : {
                toRet = 11;
                break;
            }
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 : {
                toRet = value;
                break;
            }
            case 11 :
            case 12 :
            case 13 :{
                toRet = 10;
                break;
            }
        }
        return toRet;
    }

    public int getRepresValue(){
        return represValue;
    }

    public String getSuit(){
        return suit;
    }
}
