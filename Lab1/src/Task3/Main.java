package Task3;
import java.util.Scanner;
import Task3.TangentCalculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an a: ");
        double a = in.nextDouble();
        System.out.print("Input a b: ");
        double b = in.nextDouble();
        System.out.print("Input a h: ");
        double h = in.nextDouble();

        Calculator mainCalculator = new Calculator();
        mainCalculator.calculateExpression(a, b, h);

    }
}
