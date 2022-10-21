package Task5;
import java.util.Scanner;
import Task5.Sequence.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a N: ");
        int N = in.nextInt();
        Initialization initializator = new Initialization();
        int [] mainArr = initializator.initializeSequence(N);
        Finder finder = new Finder();
        int result = finder.deleteNumbers(mainArr);
        System.out.println("\n" + result);
    }
}
