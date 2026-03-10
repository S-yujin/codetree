import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 1;

        while (i <= n){
            if(i % 3 == 0){
                System.out.printf(i + " ");
            }
            i ++;
        }
    }
}