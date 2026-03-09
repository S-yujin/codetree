import java.util.Scanner;

public class Main {
    public static boolean isLeap(int Y) {
        return (Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0);
    }

    public static boolean isValidDate(int Y, int M, int D) {

        if (M < 1 || M > 12) return false;

        int days = 0;

        if (M == 2) {
            if (isLeap(Y))
                days = 29;
            else
                days = 28;
        }
        else if (M == 4 || M == 6 || M == 9 || M == 11) {
            days = 30;
        }
        else {
            days = 31;
        }

        return (D >= 1 && D <= days);
    }

    public static String getSeason(int M) {

        if (M >= 3 && M <= 5)
            return "Spring";
        else if (M >= 6 && M <= 8)
            return "Summer";
        else if (M >= 9 && M <= 11)
            return "Fall";
        else
            return "Winter";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        if (isValidDate(Y, M, D)) {
            System.out.println(getSeason(M));
        } else {
            System.out.println(-1);
        }
    }
}