import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int total = 2 * N - 1;

        for (int i = 0; i < total; i++) {
            int spaces, stars;

            if (i < N) {
                spaces = i;
                stars = 2 * (N - i) - 1;
            } else {
                spaces = total - 1 - i;
                stars = 2 * (i - N + 2) - 1;
            }
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            for (int s = 0; s < stars; s++) {
                if (s == stars - 1)
                    System.out.print("*");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
