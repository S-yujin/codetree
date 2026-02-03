import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int tmp = 0;
        int sum = 0;

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {

            tmp = a % b;
            a = a / b;
            arr[tmp]++;

            if(a == 0){
                break;
            }
        }

        for (int j = 0; j < 100; j++) {
            sum += arr[j] * arr[j];
        }

        System.out.println(sum);

    }
}
