import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println((int)Math.pow(n, 2));

        if (n < 5){
            System.out.println("tiny");
        }
    }
}