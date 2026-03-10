import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // 알파벳이면
            if(Character.isLetter(ch)) {
                System.out.print(Character.toUpperCase(ch));
            }
        }
    }
}