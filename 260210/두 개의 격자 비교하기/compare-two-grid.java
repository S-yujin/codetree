import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                A[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                B[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(A[i][j] == B[i][j]){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();

        }
    }
}
