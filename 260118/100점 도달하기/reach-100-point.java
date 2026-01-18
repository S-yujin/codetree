import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        while(n <= 100){
            if(n >= 90){
                System.out.printf("A ");
            }
            else if(n >= 80){
                System.out.printf("B ");
            }
            else if(n >= 70){
                System.out.printf("C ");
            }
            else if(n >= 60){
                System.out.printf("D ");
            }
            else{
                System.out.printf("F ");
            }
            n++;
        }
    }
}