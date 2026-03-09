import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }

        System.out.print(sum);
    }
}