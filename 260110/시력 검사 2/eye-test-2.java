import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();

        if(a >= 1.0){
            System.out.println("High");
        }
        else if(a >= 0.5){
            System.out.println("Middle");
        }
        else{
            System.out.println("Low");
        }
    }
}