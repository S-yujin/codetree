import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String result = str.substring(1) + str.charAt(0);

        System.out.println(result);
    }
}
