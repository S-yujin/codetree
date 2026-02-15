import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        int cnt = 0;
        int sum = 0;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == 'e' && str.charAt(i + 1) == 'e'){
                cnt += 1;
            }
            if(str.charAt(i) == 'e' && str.charAt(i + 1) == 'b'){
                sum += 1;
            }
        }
        System.out.print(cnt + " " + sum)
    }
}