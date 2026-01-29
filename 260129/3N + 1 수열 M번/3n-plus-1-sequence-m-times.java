import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();

        for(int i = 0; i < m; i++){
            int n = in.nextInt();
            int cnt = 0;

            for(;;){
                if(n == 1){
                    System.out.println(cnt);
                    break;
                }
                else if(n % 2 == 0){
                    n /= 2;
                    cnt ++;
                    if(n == 1){
                        System.out.println(cnt);
                        break;
                    }
                }
                else if(n % 2 != 0){
                    n = n * 3 + 1;
                    cnt ++;
                    if(n == 1){
                        System.out.println(cnt);
                        break;
                    }
                }
            }
        }
    }
}