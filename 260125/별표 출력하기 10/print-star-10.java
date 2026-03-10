import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int temp = n;

        for (int i = 1; i <= 2*n; i++) {
            if (i%2 == 1) {
                for(int j = 1; j <= i/2+1; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 1; j <= temp; j++) {
                    System.out.print("* ");
                }
                temp--;
            }
            System.out.print("\n");
        }
    }
}
