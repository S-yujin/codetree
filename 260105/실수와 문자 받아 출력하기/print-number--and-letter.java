import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String c = in.next();
        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.println(c);
        System.out.printf("%.2f%n", a);
        System.out.printf("%.2f%n", b);
    }
}
