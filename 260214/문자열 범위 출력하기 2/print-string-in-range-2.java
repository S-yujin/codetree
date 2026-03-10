import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        int n = in.nextInt();

        for(int i = str.length() - 1; i >= str.length() - n; i--){
            System.out.print(str.charAt(i));

            if(i == 0) {
                break;
            }
        }

    }
}