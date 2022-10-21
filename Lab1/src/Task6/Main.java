package Task6;
import Task6.Matrix.Matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a N: ");
        int N = in.nextInt();

        Matrix matrix = new Matrix();
        matrix.getMatrix(N);
    }
}
