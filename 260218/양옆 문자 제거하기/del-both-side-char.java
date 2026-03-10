import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.print(str.substring(0, 1) + str.substring(2, str.length() -2));
        System.out.print(str.substring(str.length() - 1));
    }
}