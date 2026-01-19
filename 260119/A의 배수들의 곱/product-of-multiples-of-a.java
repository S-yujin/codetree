import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int prod = 1;

        for(int i = 1; i <= b; i++){
            if(i % a == 0){
                prod *= i;
            }
        }

        System.out.print(prod);
    }
}