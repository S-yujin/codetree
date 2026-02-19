import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        int b = sc.nextInt();

        int asciiValue = (int)a;
        char asciiChar = (char)b;

        System.out.println(asciiValue + " " + asciiChar);
    }
}
