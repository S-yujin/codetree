import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(a, Math.min(b, c));
        int firstIsMin = (a == min) ? 1 : 0;

        int allEqual = (a == b && b == c) ? 1 : 0;

        System.out.println(firstIsMin + " " + allEqual);
    }
}
