import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { // 홀수 행
                for (int j = 1; j <= n; j++) {
                    System.out.print(j);
                }
            } else { // 짝수 행
                for (int j = n; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
