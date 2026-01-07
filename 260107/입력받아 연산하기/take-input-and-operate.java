import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        a += 87;
        b = b % 10;

        System.out.println(a);
        System.out.println(b);
    }
}