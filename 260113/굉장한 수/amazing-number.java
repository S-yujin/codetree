import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if((a % 3 == 0 && a % 2 == 1) || (a % 2 == 0 && a % 5 == 0)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}