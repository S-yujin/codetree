import java.util.Scanner;

public class Main {

    public static boolean isValidDate(int M, int D) {
        int days = 0;

        if (M < 1 || M > 12)
            return false;

        if (M == 2) {
            days = 28;
        } 
        else if (M == 4 || M == 6 || M == 9 || M == 11) {
            days = 30;
        } 
        else {
            days = 31;
        }

        if (D >= 1 && D <= days)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        if (isValidDate(M, D))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}