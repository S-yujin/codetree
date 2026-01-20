import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(i % 5 == 0 || i % 7 == 0){
                sum += i;
                cnt ++;
            }
        }

        System.out.printf(sum + " " + Math.round((double)sum / cnt * 10) / 10.0);
    }
}