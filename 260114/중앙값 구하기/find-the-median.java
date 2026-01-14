import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int m = (a > b) ? (a < c ? a : (b > c ? b : c)) : (b < c ? b : (a > c ? a : c));

        System.out.println(m);
    }
}