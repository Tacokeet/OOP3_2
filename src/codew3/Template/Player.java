package codew3.Template;

public class Player {
    public static void main(String[] args) {

        Boardgames risk = new Risk();
        risk.play();
        System.out.println("\n");
        Boardgames monopoly = new Monopoly();
        monopoly.play();
    }
}
