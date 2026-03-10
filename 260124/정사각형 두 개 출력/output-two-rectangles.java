import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        for(int i = 1; i <= 2; i++){
            for(int j = 0; j < n; j++){
                for(int z = 0; z < n; z++){
                    System.out.print("*");
                }
                
                System.out.println();
            }

            System.out.println();
        }
    }
}