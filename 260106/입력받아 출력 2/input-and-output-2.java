import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String[] strArr = a.split("-");

        System.out.printf(strArr[0]+strArr[1]);
    }
}