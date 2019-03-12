package codew3.Template;

public class Monopoly extends Boardgames {
    @Override
    void initialize() {
        System.out.println("You are about to play MONOPOLY \nDivide the tokens across the players and give them starting money");
    }

    @Override
    void startPlay() {
        System.out.println("First player rolls the dice and buys the street they land on. And so on...");
    }

    @Override
    void endPlay() {
        System.out.println("All but one player is bankrupt and they win!");
    }
}
