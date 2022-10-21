package Task7;
import Task7.ShellSort.ShellSort;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a N: ");
            int N = in.nextInt();

            ShellSort shell = new ShellSort();
            int[] mainArr = shell.sort(N);
            for (int i = 0; i<N; i++)
            {
                System.out.print(mainArr[i] + " ");
            }
        }
}
