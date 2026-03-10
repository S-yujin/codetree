import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int num = 1;

        for (int i = 0; i < N; i++) {    
            for (int j = 0; j < N; j++) { 
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
