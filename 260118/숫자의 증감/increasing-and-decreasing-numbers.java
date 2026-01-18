import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String c = in.next();
        int n = in.nextInt();

        if (c.equals("A")) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
        else if (c.equals("D")) {
            for (int i = n; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
