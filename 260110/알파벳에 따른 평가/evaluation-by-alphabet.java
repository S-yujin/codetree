import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        if ("S".equals(n)) {
            System.out.println("Superior");
        } else if ("A".equals(n)) {
            System.out.println("Excellent");
        } else if ("B".equals(n)) {
            System.out.println("Good");
        } else if ("C".equals(n)) {
            System.out.println("Usually");
        } else if ("D".equals(n)) {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }
    }
}
