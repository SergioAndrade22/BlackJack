package sergioandrade.blackjack.gameLogic;

public class Mediator {
    private static Logic colleague;
    private static Mediator instance;

    private Mediator(){ }

    public static Mediator getInstance(){
        synchronized (instance) {
            return (instance == null) ? instance = new Mediator() : instance;
        }
    }

    public static void setColleague(Logic l){
        colleague = l;
    }

    public static void win(){
        colleague.win();
    }

    public static void lose(){
        colleague.lose();
    }
}
