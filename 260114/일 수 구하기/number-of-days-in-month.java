import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();

        if (month == 2) {
            System.out.println(28);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(30);
        } else {
            System.out.println(31);
        }
    }
}
