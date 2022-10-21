package Task3.TangentCalculator;

public class Calculator {
    public void calculateExpression(double a, double b, double h)
    {
        double result;
        while (a <= b)
        {
            result = Math.tan(a);
            System.out.printf("| %.3f | %.3f  |\n", a, result);
            a += h;
        }
    }
}
