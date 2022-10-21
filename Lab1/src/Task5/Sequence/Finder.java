package Task5.Sequence;

public class Finder {
    public int deleteNumbers(int[] arr)
    {
        int numDeleteNumbers = 0;
        int resultSequence = 1;
        int[] tempArr = new int[arr.length];
        tempArr[0] = arr[0];
        for (int i=1; i < arr.length; i++)
        {
            if (arr[i] < tempArr[resultSequence-1])
            {
                numDeleteNumbers++;
            }
            else
            {
                resultSequence++;
                tempArr[resultSequence-1] = arr[i];
            }

        }
        return numDeleteNumbers;
    }
}
