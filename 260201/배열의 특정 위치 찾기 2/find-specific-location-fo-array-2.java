import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[11];

        int num = 0;
        int sum = 0;
        int hab = 0;

        for(int i = 1; i <= 10; i++){
            arr[i] = in.nextInt();

            if(i % 2 == 0){
                sum += arr[i];
            }
            else{
                num += arr[i];
            }
        }
        if(sum > num){
            hab = sum - num;
        }
        else{
            hab = num - sum;
        }
        System.out.print(hab);
    }
}