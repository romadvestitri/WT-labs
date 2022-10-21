package Task8;
import Task8.Sequence.Sequence;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a N: ");
        int N = in.nextInt();

        System.out.print("Input a M: ");
        int M = in.nextInt();

        Sequence sequence1 = new Sequence();
        sequence1.makeSequence(N);

        Sequence sequence2 = new Sequence();
        int[] arr = sequence2.makeSequence(M);

        int[] indexes = sequence2.findPlaces(arr);

        for (int i =0; i<indexes.length; i++)
        {
            System.out.print(indexes[i] + " ");
        }

    }
}