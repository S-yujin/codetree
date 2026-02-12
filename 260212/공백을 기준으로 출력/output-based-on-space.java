import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();

        String result = str1.replace(" ", "") + 
                        str2.replace(" ", "");

        System.out.println(result);
    }
}
