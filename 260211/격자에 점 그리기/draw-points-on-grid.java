import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[][] arr = new int[N][N];

        for(int k = 1; k <= M; k++){
            int r = in.nextInt();
            int c = in.nextInt();

            arr[r-1][c-1] = k; 
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
