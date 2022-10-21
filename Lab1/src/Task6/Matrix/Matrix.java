package Task6.Matrix;

public class Matrix {
    public void getMatrix(int N)
    {
        int[][] mainMatrix = new int[N][N];
        for (int i=0; i<N; i++)
        {
            int m = i;
            for (int j=0; j<N-i; j++)
            {
                mainMatrix[i][j] = m;
                m++;
            }
            int j = 1;
            for (int k=N-i; k<N; k++)
            {
                mainMatrix[i][k] = j;
                j++;
            }

        }
        for (int i=0; i<N; i++)
        {
            for (int j=0; j<N; j++)
            {
                System.out.print(mainMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
