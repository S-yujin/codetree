import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            int n = in.nextInt();

            if(n < 25){
                System.out.println("Higher");
            }
            else if(n > 25){
                System.out.println("Lower");
            }
            else if(n == 25){
                System.out.println("Good");
                break;
            }
        }
    }
}