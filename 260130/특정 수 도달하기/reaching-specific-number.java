import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new arr[10];

        int sum = 0;
        double avg = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = in.nextInt();

            sum += arr[i];
            avg = sum / 10;
        }

        System.out.print(sum + " " + avg);
    }
}