import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            int a = in.nextInt();

            sum += a;
            cnt ++;
        }

        System.out.printf(sum + " " + Math.round((double)sum/cnt * 10) / 10.0);
    }
}