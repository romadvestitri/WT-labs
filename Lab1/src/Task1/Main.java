package Task1;
import java.util.Scanner;
import Task1.MathCalculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a x: ");
        double x = in.nextDouble();
        System.out.print("Input a y: ");
        double y = in.nextDouble();

        Calculator result = new Calculator();

        System.out.printf("Result - %.5f \n", result.calculateExpression(x,y));
    }
}
