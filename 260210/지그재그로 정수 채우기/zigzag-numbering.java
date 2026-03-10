import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[][] arr = new int[N][M];
        int num = 0;

        for (int j = 0; j < M; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < N; i++) {
                    arr[i][j] = num++;
                }
            } else {
                for (int i = N - 1; i >= 0; i--) {
                    arr[i][j] = num++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
