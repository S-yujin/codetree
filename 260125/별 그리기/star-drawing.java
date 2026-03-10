import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        int height = 2 * n - 1;
        int mid = n - 1;

        for (int i = 0; i < height; i++) {
            int stars = 2 * (n - Math.abs(i - mid)) - 1;
            int spaces = (2 * n - 1 - stars) / 2;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int s = 0; s < stars; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
