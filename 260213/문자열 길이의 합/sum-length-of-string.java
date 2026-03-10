import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0, cnt = 0;

        for(int i = 0; i < n; i++){
            String str = in.next();
            sum += str.length();

            if(str.charAt(0) == 'a'){
                cnt++;
            }
        }

        System.out.println(sum + " " + cnt);
    }
}
