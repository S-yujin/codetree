import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n == 1){
            System.out.println("John");
        }
        else if (n == 2){
            System.out.println("Tom");
        }
        else if (n == 3){
            System.out.println("Paul");
        }
        else{
            System.out.println("Vacancy");
        }
    }
}