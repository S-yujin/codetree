import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (a < b){
            System.out.print(1 + " ");
        }
        else {
            System.out.print(0 + " ");
        }
        if(a == b){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}