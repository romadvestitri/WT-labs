package Task7.ShellSort;

import java.util.Random;

public class ShellSort {

    public int[] sort(int N)
    {
        int[] array = new int[N];
        Random random = new Random();
        for (int i = 0; i<N; i++)
        {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i != 0) i -= 2;
            }
        }
        return array;
    }
}
