import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 1; i <= 2 * n -1; i += 2){
            for(int j = 10; j < 10 + 2 * n; j += 2){
                System.out.print(i+j + " ");
            }
            System.out.println();
        }
    }
}