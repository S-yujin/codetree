import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            int n = in.nextInt();
            
            if(n >=0 && n <= 200){
                sum += n;
                cnt ++;
            }
        }

        System.out.printf(sum + " " + Math.round((double)sum/cnt * 10) / 10.0);
    }
}