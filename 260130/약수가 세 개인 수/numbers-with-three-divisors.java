import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int end = in.nextInt();

        int cnt = 0;

        for(int i = start; i <= end; i++){
            int sum = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    sum ++;
                }
            }
            if(sum == 3){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}