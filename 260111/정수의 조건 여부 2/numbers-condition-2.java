import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if (a == 5){
            System.out.println("A");
        }
        if (a % 2 == 0){
           System.out.println("B");
        }
    }
}