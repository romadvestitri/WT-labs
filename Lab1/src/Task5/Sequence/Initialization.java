package Task5.Sequence;

import java.util.Random;

public class Initialization {
    public int[] initializeSequence(int N)
    {
        int[] resultArray = new int[N];
        Random random = new Random();
        for (int i=0; i<N; i++)
        {
            resultArray[i] = random.nextInt(100);
            System.out.print(resultArray[i] + " ");
        }

        return resultArray;
    }
}
