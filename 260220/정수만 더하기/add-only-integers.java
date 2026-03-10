import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String str = in.nextLine();
        int sum = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isDigit(ch)) { 
                sum += ch - '0';     
            }
        }

        System.out.println(sum);
    }
}