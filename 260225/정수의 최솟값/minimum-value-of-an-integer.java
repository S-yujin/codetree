import java.util.Scanner;

public class Main {
    public static int minValue(int a, int b, int c){
        int min = a;

        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int result = minValue(a, b, c);

        System.out.println(result);'
    }
}