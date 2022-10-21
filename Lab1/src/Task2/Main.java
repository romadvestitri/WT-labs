package Task2;
import java.util.Scanner;
import Task2.CoordinateAxis.AxisCalculator;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a x: ");
        int x = in.nextInt();
        System.out.print("Input a y: ");
        int y = in.nextInt();

        AxisCalculator result = new AxisCalculator();

        System.out.print(result.checkBorders(x, y));
    }
}
