/*class Dice {
    private int score;

    public void roll() {
        score = (int)(Math.random() * 6) + 1;
    }

    public int getScore() {
        return score;
    }
}
class GameSeven {
    private Dice d1;
    private Dice d2;
    private int total;

    public GameSeven() {
        d1 = new Dice();
        d2 = new Dice();
    }

    public void play() {
        rollDices();

        showDiceScore();

        addDiceScore();


        showGameResult();
    }
    private void rollDices() {
        d1.roll();
        d2.roll();
    }
    private void showDiceScore() {
        System.out.println(d1.getScore() + " " + d2.getScore());
    }
    private void addDiceScore() {
        total = d1.getScore() + d2.getScore();
    }
    private void showGameResult() {
        if (total == 7)
            System.out.println("You win.");
        else
            System.out.println("You lose.");
    }
}
public class Lab11_11_5 {
    public static void main(String[] args) {
        GameSeven g;
        g = new GameSeven();
        g.play();
    }
}*/

