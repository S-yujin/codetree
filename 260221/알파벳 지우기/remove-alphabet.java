import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String numStr1 = "";
        String numStr2 = "";

        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(Character.isDigit(ch)) {
                numStr1 += ch;
            }
        }
        
        for(int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if(Character.isDigit(ch)) {
                numStr2 += ch;
            }
        }

        int num1 = Integer.parseInt(numStr1);
        int num2 = Integer.parseInt(numStr2);

        System.out.println(num1 + num2);
    }
}