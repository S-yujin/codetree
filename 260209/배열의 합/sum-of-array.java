import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[4][4];
        int sum;

        for(int i = 0; i < 4; i++){
            sum = 0;
            for(int j = 0; j < 4; j++){
                arr[i][j] = in.nextInt();
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
