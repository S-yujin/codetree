import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n >= 3000){
            System.out.println("book");
        }
        else if (n >= 1000){
            System.out.println("mask");
        }
        else{
            System.out.println("no");
        }
    }
}