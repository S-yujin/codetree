import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // 위쪽 (1 ~ N) : 앞 공백 있음
        for (int i = 1; i <= N; i++) {
            // 앞 공백: N - i
            for (int s = 0; s < N - i; s++) System.out.print("  ");

            // @: i개 (사이 공백 1칸)
            for (int k = 1; k <= i; k++) {
                System.out.print("@");
                if (k != i) System.out.print(" ");
            }
            System.out.println();
        }

        // 아래쪽 (N-1 ~ 1) : 앞 공백 없음
        for (int i = N - 1; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("@");
                if (k != i) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
