import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int n = in.nextInt();
       int m = in.nextInt();

       System.out.println(lcm(n, m));
    }
}