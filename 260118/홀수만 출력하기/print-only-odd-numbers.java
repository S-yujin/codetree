import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            int x = in.nextInt();

            if (x % 2 == 1 && x % 3 == 0){
                System.out.println(x);
            }
        }        
    }
}