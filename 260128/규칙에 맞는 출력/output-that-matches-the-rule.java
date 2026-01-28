import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            int cnt = n - i + 1;
            for (int j = 0; j < i; j++) {
                System.out.print(cnt + j + " ");
            }
            System.out.println();
        }
    }
}
