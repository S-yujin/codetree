import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String d = in.next();
        String[] strArr = d.split("\\.");

        System.out.print(strArr[1] + "-" + strArr[2] + "-" + strArr[0]);
    }
}