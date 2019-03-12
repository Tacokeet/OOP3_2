package codew3.Template;

public class Risk extends Boardgames {
    @Override
    void initialize() {
        System.out.println("You are about to play RISK! \nDividing colors across all players and placing their units across the world.");
    }

    @Override
    void startPlay() {
        System.out.println("First player reinforces and attacks! And so on...");
    }

    @Override
    void endPlay() {
        System.out.println("World domination has been achieved by a player!");
    }
}
