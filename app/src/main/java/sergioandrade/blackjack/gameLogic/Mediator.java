package sergioandrade.blackjack.gameLogic;

public class Mediator {
    private static Logic colleague;
    private static Mediator instance;

    private Mediator(){ }

    public static Mediator getInstance(){
            return (instance == null) ? instance = new Mediator() : instance;
    }

    public static void setColleague(Logic l){
        colleague = l;
    }

    public void win(){
        colleague.win();
    }

    public void lose(){
        colleague.lose();
    }
}
