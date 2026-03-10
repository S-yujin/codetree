import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        while (true) {
            int age = in.nextInt();

            if (age >= 20 && age <= 29) {
                sum += age;
                cnt++;
            } else {
                break;
            }
        }

        double avg = (double) sum / cnt;
        avg = Math.round(avg * 100) / 100.0;

        System.out.printf("%.2f", avg);
    }
}
