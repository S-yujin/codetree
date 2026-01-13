import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if(a < 10 || a > 20){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}