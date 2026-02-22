import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String a = in.next();

        int cnt = 0;

        for(int i = 0; i < n; i++){
            String str = in.next();

            if(str.equals(a)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}