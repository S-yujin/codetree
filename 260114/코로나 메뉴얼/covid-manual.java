import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countA = 0;

        String s1 = sc.next();
        double t1 = sc.nextDouble();
        if (s1.equals("Y") && t1 >= 37) countA++;

        String s2 = sc.next();
        double t2 = sc.nextDouble();
        if (s2.equals("Y") && t2 >= 37) countA++;

        String s3 = sc.next();
        double t3 = sc.nextDouble();
        if (s3.equals("Y") && t3 >= 37) countA++;

        if (countA >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}
