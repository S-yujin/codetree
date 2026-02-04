import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = in.nextInt();
            if (num == M) {
                count++;
            }
        }

        System.out.println(count);
    }
}
