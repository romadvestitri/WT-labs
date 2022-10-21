package Task4.SimpleNumbers;

public class CheckingSimples {
    public void check(int[] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("\n");
        boolean flag = false;
        for (int i=0; i<arr.length; i++)
        {
            flag = false;
            for (int j=2; j<arr[i]; j++)
            {
                if (arr[i] % j == 0)
                {
                    flag = true;

                }
            }
            if ((flag == false) && (arr[i] != 1))
            {
                System.out.print(i + " ");
            }

        }
    }
}
