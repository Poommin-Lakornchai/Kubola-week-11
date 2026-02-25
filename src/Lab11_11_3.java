/*class Dice {
    private int score;

    public void roll() {
        score = (int)(Math.random() * 6) + 1;
    }

    public int getScore() {
        return score;
    }
}
public class Lab11_11_3 {
    public static void main(String[] args) {
        Dice d1,d2;
        int total;

        d1 = new Dice();
        d2 = new Dice();

        //d1.score = (int)(Math.random() * 6) + 1;
        d1.roll();
        //d2.score = (int)(Math.random() * 6) + 1;
        d2.roll();

        //System.out.println(d1.score + " " + d2.score);
        System.out.println(d1.getScore() + " " + d2.getScore());

        //total = d1.score + d2.score;
        total = d1.getScore() + d2.getScore();

        if (total == 7)
            System.out.println("You win.");
        else
            System.out.println("You lose.");
    }
}*/


