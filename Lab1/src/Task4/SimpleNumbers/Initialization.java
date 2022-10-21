package Task4.SimpleNumbers;
import java.util.Random;

public class Initialization {
    public int[] initializeArray(int N)
    {
        int[] resultArray = new int[N];
        Random random = new Random();
        for (int i=0; i<N; i++)
        {
            resultArray[i] = random.nextInt(100);
        }
        return resultArray;
    }
}
