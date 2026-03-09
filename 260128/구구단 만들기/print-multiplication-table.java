import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();

        for(int i = 1; i < 10; i++){
            for(int j = b; j > a - 1; j -= 2){
                System.out.print(j + " * " + i + " = " + i*j);
                if(j > a){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}