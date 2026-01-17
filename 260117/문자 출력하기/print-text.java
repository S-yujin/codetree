import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String x = in.next();
        int i = 0;

        while(i < 8){
            System.out.printf(x);
            i ++;
        }
    }
}