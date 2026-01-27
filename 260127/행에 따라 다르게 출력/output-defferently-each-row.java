import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int start = 1;

        for (int i = 0; i < N; i++) {
            int step = (i % 2 == 0) ? 1 : 2;
            int num = start;

            for (int j = 0; j < N; j++) {
                System.out.print(num);
                if (j < N - 1) System.out.print(" ");
                num += step;
            }
            System.out.println();

            int last = num - step;

            if (step == 1) {
                start = last + 2;
            } else {
                start = last + 1;
            }
        }

        sc.close();
    }
}
