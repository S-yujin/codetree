import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) { // 짝수 줄: i개
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                    if (j != i - 1) System.out.print(" ");
                }
            } else { // 홀수 줄: 1개
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
