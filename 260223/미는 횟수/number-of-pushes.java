import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String A = in.nextLine();
        String B = in.nextLine();

        int len = A.length();
        int answer = -1;

        for (int i = 0; i < len; i++) {
            if (A.equals(B)) {
                answer = i;
                break;
            }

            A = A.charAt(len - 1) + A.substring(0, len - 1);
        }

        System.out.println(answer);
    }
}