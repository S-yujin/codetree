import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int[] countArr = new int[100];       
        int zeroPoint = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] == 0){
                break;
            }
        }

        for (int i = 0; i < 100; i++) {
            
            if (arr[i] == 0) {
                zeroPoint = i;
            }
        }

        for (int i = 0; i < zeroPoint; i++) {
            countArr[arr[i] / 10]++;
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}
