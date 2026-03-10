import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][N];
        int num = 1;

        for(int j = N-1; j >= 0; j--) {

            if((N-1-j) % 2 == 0) {  
                for(int i = N-1; i >= 0; i--) {
                    arr[i][j] = num++;
                }
            } else {       
                for(int i = 0; i < N; i++) {
                    arr[i][j] = num++;
                }
            }
        }

        // 출력
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
