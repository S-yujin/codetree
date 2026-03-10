import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        char first = str.charAt(0);
        char second = str.charAt(1);
        
        String result = "";
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch == first) {
                result += second;
            }
            else if(ch == second) {
                result += first;
            }
            else {
                result += ch;
            }
        }
        
        System.out.println(result);
    }
}
