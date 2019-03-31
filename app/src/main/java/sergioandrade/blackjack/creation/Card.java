package sergioandrade.blackjack.creation;

import android.graphics.drawable.Icon;

/**
 * Emulates the cards used on a Deck
 */
public class Card {
    private String suit;
    private int value;
    private Icon image[];

    /**
     * Constructor, builds the card upside down
     * @param s card's suit
     * @param v card's value
     */
    public Card(String s, int v){
        suit = s;
        value = v;
        image = new Icon[1];
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

    /**
     * Return the image of the card that varies from upside down or normal
     * @return card's image
     */
    public Icon getImage(){
        return image[0];
    }
}
