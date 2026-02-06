import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num > max1) {
                max2 = max1;  
                max1 = num;   
            } else if (num > max2) {
                max2 = num;  
            }
        }

        System.out.println(max1 + " " + max2);
    }
}
