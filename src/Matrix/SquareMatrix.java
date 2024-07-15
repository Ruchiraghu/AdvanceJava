package Matrix;
import java.util.Scanner;
public class SquareMatrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");

        int N = sc.nextInt();
        int squareMatrix [][] = new int [N][N];

        for(int row=0;row<N;row++){
            for(int col= 0;col<N;col++){
                squareMatrix[row][col] = sc.nextInt();
            }
        }
        for (int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                squareMatrix[row][col]++;
            }
        }
        for (int row=0;row<N;row++){
            for (int col= 0;col<N;col++){
                System.out.println(squareMatrix[row][col]+" ");
            }
            System.out.println();
        }
        sc.close();
    }

}
