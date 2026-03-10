import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if (a % 2 == 0){
            a = a / 2;
        }
        if (a % 2 == 1){
            a = (a + 1) / 2;
        }

        System.out.println(a);
    }
}