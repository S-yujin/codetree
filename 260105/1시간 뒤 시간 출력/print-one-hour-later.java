import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String t = in.next();
        String[] strArr = t.split(":");

        int hour = Integer.parseInt(strArr[0]) + 1;
        int min = Integer.parseInt(strArr[1]);

        System.out.println(hour + ":" + min);
    }
}
