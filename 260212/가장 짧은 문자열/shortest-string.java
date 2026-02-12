import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 0;
        int min = 100;   

        for(int i = 0; i < 3; i++){
            String str = in.next();
            int len = str.length();

            if(len > max){
                max = len;
            }
            if(len < min){
                min = len;
            }
        }

        System.out.println(max - min);
    }
}
