import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if(n < 0 ){
            System.out.println(n);
            System.out.println("minus");
        }
        else{
            System.out.println(n);
        }
    }
}