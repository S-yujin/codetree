import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt3 = 0;
        int cnt5 = 0;

        for(int i = 0; i < 10; i++){
            int n = in.nextInt();
            
            if(n % 3 == 0){
                cnt3++;
            }
            if(n % 5 == 0){
                cnt5++;
            }
        }

        System.out.print(cnt3 + " " + cnt5);
    }
}