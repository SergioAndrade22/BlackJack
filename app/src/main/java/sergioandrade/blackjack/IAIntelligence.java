package sergioandrade.blackjack;

public class IAIntelligence extends Intelligence {
    private int counter;


    public IAIntelligence(Hand h){
        hand = h;
        counter = 0;
    }

    public void act(){
        int score = hand.getScore();
        if (12 <= score && score <= 16 && counter > 4) {
            Card aux = Deck.getInstance().give();
            hand.add(aux);
            int value =aux.getValue();
            switch (value){
                case 2 :
                case 3 :
                case 4 :
                case 5 :
                case 6 : {
                    counter++;
                    break;
                }
                case 7 :
                case 8 :
                case 9 : break;
                case 10 :
                case 11 :{
                    counter--;
                    break;
                }
            }
        }
        else if (16 <= score && score <= 19 && counter > -7){
            Card aux = Deck.getInstance().give();
            hand.add(aux);
        }
        else if (score <= 11 && counter > 3){
            Card aux = Deck.getInstance().give();
            hand.add(aux);
        }
        else if (score < 12) {
            Card aux = Deck.getInstance().give();
            hand.add(aux);
        }
    }
}
