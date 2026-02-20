import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String str = in.nextLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                System.out.print(Character.toLowerCase(ch));
            }
        }
    }
}