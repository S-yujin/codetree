import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int cnt = 0;

        for(int i = 1; i < 100; i++){

            if(n / i >= 1){
                System.out.print(cnt);
                break;
            }
            cnt ++;
        }
    }
}