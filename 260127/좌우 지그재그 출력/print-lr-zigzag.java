import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int start = i * N + 1;

            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    System.out.print(start + j);
                    if (j < N - 1) System.out.print(" ");
                }
            } else {
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(start + j);
                    if (j > 0) System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
