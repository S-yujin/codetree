import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            boolean has369 = false;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '3' || c == '6' || c == '9') {
                    has369 = true;
                    break;
                }
            }
            if (i % 3 == 0){
                has369 = true;
            }

            if (has369) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
