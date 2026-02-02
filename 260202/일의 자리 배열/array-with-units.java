import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0; i < 2; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < 10; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
            
            System.out.print(arr[i]+ " ");
        }
    }
}