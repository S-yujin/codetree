import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.next();
        String s2 = in.next();

        int num1 = extractNumber(s1);
        int num2 = extractNumber(s2);

        System.out.println(num1 + num2);
    }

    public static int extractNumber(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isDigit(ch)) {
                result += ch;
            } else {
                break;
            }
        }

        return Integer.parseInt(result);
    }
}