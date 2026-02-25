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
        d1.roll();
        d2.roll();

        System.out.println(d1.getScore() + " " + d2.getScore());

        total = d1.getScore() + d2.getScore();

        if (total == 7)
            System.out.println("You win.");
        else
            System.out.println("You lose.");

    }
}
public class Lab11_11_4 {
    public static void main(String[] args) {
        GameSeven g;
        g = new GameSeven();
        g.play();
    }
}*/

