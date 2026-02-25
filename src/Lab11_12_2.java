/*class Dice {
    int dice;
}
public class Lab11_12_2 {
    public static void main(String[] args) {
        Dice d1,d2,d3;

        d1 = new Dice();
        d2 = new Dice();
        d3 = new Dice();

        d1.dice = (int)(Math.random() * 6) + 1;
        d2.dice = (int)(Math.random() * 6) + 1;
        d3.dice = (int)(Math.random() * 6) + 1;

        System.out.println(d1.dice + " " + d2.dice + " " + d3.dice);

        boolean allSame = d1.dice == d2.dice && d2.dice == d3.dice;
        boolean allOdd = d1.dice%2 != 0 && d2.dice%2 != 0 && d3.dice%2 != 0;
        boolean allEven = d1.dice%2 == 0 && d2.dice%2 == 0 && d3.dice%2 == 0;

        if (allSame | allOdd | allEven) {
            System.out.println("You win");
        } else {
            System.out.println("Nice try :V");
        }
    }
}*/
