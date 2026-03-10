import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int idx = str.indexOf('e');

        String result = str.substring(0, idx) 
                      + str.substring(idx + 1);

        System.out.println(result);
    }
}
