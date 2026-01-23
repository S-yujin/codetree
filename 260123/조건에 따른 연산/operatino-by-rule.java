import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int cnt = 0;

        while(true){
            if(n < 1000){
                if(n % 2 == 0){
                    n = n * 3 + 1;
                }
                else{
                    n = n * 2 + 2;
                }
                
                cnt ++;
            }
            else{
                System.out.print(cnt);
                break;
            }
        }
    }
}