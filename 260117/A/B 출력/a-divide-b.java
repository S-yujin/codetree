import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.print(A / B + ".");

        int remainder = A % B;

        for (int i = 0; i < 20; i++) {
            remainder *= 10;
            System.out.print(remainder / B);
            remainder %= B;
        }
    }
}
