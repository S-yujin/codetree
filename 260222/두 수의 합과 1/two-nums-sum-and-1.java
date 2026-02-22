import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum = n1 + n2;
        int cnt = 0;
        String str = Integer.toString(sum);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}