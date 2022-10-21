package Task8.Sequence;
import java.util.Random;
public class Sequence {
    int[] mainSequence;
    public int[] makeSequence(int N)
    {
        int[] sequence = new int[N];
        Random random = new Random();
        sequence[0] = random.nextInt(10);
        for (int i = 1; i < N; i++)
        {
            sequence[i] = random.nextInt(10);
            while (sequence[i] < sequence[i-1])
            {
                sequence[i] = random.nextInt(10);
            }
        }
        this.mainSequence = sequence;
        for (int i =0; i<sequence.length; i++)
        {
            System.out.print(sequence[i] + " ");
        }
        System.out.print("\n");
        return sequence;
    }
    public int[] findPlaces(int[] arr)
    {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int index = 0;
            while (index < this.mainSequence.length && this.mainSequence[index] < arr[i]) index++;
            result[i] = index;
        }

        return result;
    }

}
