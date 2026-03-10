import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int size = 2 * N - 1;
        int mid = N - 1;

        for (int i = 0; i < size; i++) {
            int cnt = N - Math.abs(i - mid); // 별 개수

            // 앞 공백
            for (int s = 0; s < Math.abs(i - mid); s++) {
                System.out.print(" ");
            }

            // 별 출력 (사이 공백 1칸)
            for (int k = 0; k < cnt; k++) {
                System.out.print("*");
                if (k != cnt - 1) System.out.print(" ");
            }

            System.out.println();
        }
    }
}
