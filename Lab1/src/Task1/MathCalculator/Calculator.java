package Task1.MathCalculator;

public class Calculator {
    public double calculateExpression(double x, double y){
        double sinRes = Math.sin(x+y);
        double numerator = 1 + sinRes*sinRes;

        double denominator = 2 + Math.abs(x - (2*x)/(1+(x*x)*(y*y)));

        double result = numerator/denominator + x;
        return result;
    }
}
