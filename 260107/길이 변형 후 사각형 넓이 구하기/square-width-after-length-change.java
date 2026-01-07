import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        x += 8;
        y *= 3;

        System.out.println(x);
        System.out.println(y);
        System.out.println(x * y);
    }
}