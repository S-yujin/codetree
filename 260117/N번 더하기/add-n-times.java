import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int n = in.nextInt();

        for (int i = 0; i < n; i ++){
            a += n;
            int sum = a;
            System.out.println(sum);
        }
    }
}