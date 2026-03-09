import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[100];

        for(int i = 0; i < 100; i++){
            arr[i] = in.nextInt();

            if (arr[i] == 0) break;

            if(arr[i] % 2 == 0){
                System.out.print(arr[i] / 2 + " ");
            }
            else{
                System.out.print(arr[i] + 3 + " ");
            }
        }
    }
}