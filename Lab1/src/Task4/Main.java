package Task4;
import java.util.Scanner;
import Task4.SimpleNumbers.Initialization;
import Task4.SimpleNumbers.CheckingSimples;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a N: ");
        int N = in.nextInt();

        Initialization initialization = new Initialization();
        int[] mainArray = initialization.initializeArray(N);
        CheckingSimples simples = new CheckingSimples();
        simples.check(mainArray);
    }
}
