package sergioandrade.blackjack.creation;

public class Card {
    private String suit;
    private int value;
    private int drawable;

    public Card(String s, int v){
        suit = s;
        value = v;
    }

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

    public String getSuit(){
        return suit;
    }

    public void setDrawable(int d){
        drawable = d;
    }

    public int getDrawable(){
        return drawable;
    }
}
