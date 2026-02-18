import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        
        for(int i = 0; i < str.length(); i++){
            int n = in.nextInt();

            System.out.pirntln(str.substring(n));
        }
    }
}