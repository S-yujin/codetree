import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int num1 = (int)a;
        int num2 = (int)b;

        int sum = num1 + num2;
        int diff = Math.abs(num1 - num2);

        System.out.println(sum + " " + diff);
    }
}
