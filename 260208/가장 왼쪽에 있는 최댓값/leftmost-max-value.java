import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int end = N - 1;

        while(true){
            int max = arr[0];
            int maxIdx = 0;

            for(int i = 0; i <= end; i++){
                if(arr[i] > max){
                    max = arr[i];
                    maxIdx = i;
                }
            }

            System.out.print((maxIdx + 1) + " ");

            if(maxIdx == 0) break;

            end = maxIdx - 1;
        }
    }
}
