import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int cnt = 0;
        int i = 1;

        while (n > 1) {
            n = n / i;
            cnt++;
            i++;
        }

        System.out.print(cnt);
    }
}
