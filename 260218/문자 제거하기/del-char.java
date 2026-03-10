import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        for (int i = 0; i < 20; i++) {
            if (str.length() <= 1) {
                break;
            }

            int n = in.nextInt();

            if (n >= 0 && n < str.length()) {
                str = str.substring(0, n) + str.substring(n + 1);
            } else {
                str = str.substring(0, str.length() - 1);
            }

            System.out.println(str);
        }
    }
}
