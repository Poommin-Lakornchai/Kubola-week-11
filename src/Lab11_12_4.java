/*class Dice {
    private int score;

    public void rollDice() {
        score = (int)(Math.random() * 6) + 1;
    }
    public int getScore () {
        return score;
    }
}
class GameSeven {
    private Dice d1,d2,d3;

    public void GameSeven () {
        d1 = new Dice();
        d2 = new Dice();
        d3 = new Dice();
    }
    public void playGameSeven () {
        d1.rollDice();
        d2.rollDice();
        d3.rollDice();

        System.out.println(d1.getScore() + " " + d2.getScore() + " " + d3.getScore());

        boolean allSame = d1.getScore() == d2.getScore() && d2.getScore() == d3.getScore();
        boolean allOdd = d1.getScore()%2 != 0 && d2.getScore()%2 != 0 && d3.getScore()%2 != 0;
        boolean allEven = d1.getScore()%2 == 0 && d2.getScore()%2 == 0 && d3.getScore()%2 == 0;

        if (allSame | allOdd | allEven) {
            System.out.println("You win");
        } else {
            System.out.println("Nice try :V");
        }
    }

}
public class Lab11_12_4 {
    public static void main(String[] args) {
        GameSeven g = new GameSeven();
        g.GameSeven();
        g.playGameSeven();
    }
}*/
