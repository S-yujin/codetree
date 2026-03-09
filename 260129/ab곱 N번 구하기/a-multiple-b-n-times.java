import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            int sum = 1;
            
            for(int j = a; j <= b; j++){
                sum *= j;
            }
            System.out.println(sum);
        }
    }
}