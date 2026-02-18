import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int L = str.length();

        for (int i = 0; i <= L; i++) {
            System.out.println(str);

            str = str.charAt(L - 1) + str.substring(0, L - 1);
        }
    }
}
