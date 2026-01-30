import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] >= 250) {
                break;
            }
            sum += arr[i];
            cnt++;
        }

        double avg = (double) sum / cnt;
        System.out.printf("%d %.1f", sum, avg);
    }
}
