import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        for(int i = 0 ; i < n; i++){
            sum += in.nextInt();
        }

        String str = Integer.toString(sum);

        if(str.length() == 1){
            System.out.println(str);
        }
        else{
            String result = str.substring(1) + str.charAt(0);
            System.out.println(result);
        }
    }
}