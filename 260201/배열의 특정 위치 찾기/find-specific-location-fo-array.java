import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[11];

        int sum = 0;
        int num = 0;
        int cnt = 0;

        for(int i = 1; i <= 10; i++){
            arr[i] = in.nextInt();

            if(i % 2 == 0){
                sum += arr[i];
            }
            if(i % 3 == 0){
                num += arr[i];
                cnt ++;
            }
        }
        System.out.print(sum + " " + (double) num / cnt);
    }
}