import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int minDiff = 101; 

        for(int i = 1; i < N; i++){
            int diff = arr[i] - arr[i-1];
            if(diff < minDiff){
                minDiff = diff;
            }
        }

        System.out.println(minDiff);
    }
}
