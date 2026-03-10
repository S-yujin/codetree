import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        for(int i = a; i <= b;){
            if(i % 2 == 1){
                System.out.printf(i + " ");
                i *= 2;
            }
            else{
                System.out.printf(i + " ");
                i += 3;
            }
        }
    }
}