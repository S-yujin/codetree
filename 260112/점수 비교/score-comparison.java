import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int x = in.nextInt();
        int y = in.nextInt();

        if(a > x && b > y ){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}