import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[][] arr = new int[N][M];
        int num = 1;

        for(int k = 0; k <= N + M - 2; k++){
            int i = (k < M) ? 0 : k - M + 1;
            int j = (k < M) ? k : M - 1;

            while(i < N && j >= 0){
                arr[i][j] = num++;
                i++;
                j--;
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
