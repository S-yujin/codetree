import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();          
        int min = Integer.MAX_VALUE;  
        int cnt = 0;                 

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num < min) {      
                min = num;      
                cnt = 1;         
            } else if (num == min) {
                cnt++;             
            }
        }

        System.out.println(min + " " + cnt);
    }
}
