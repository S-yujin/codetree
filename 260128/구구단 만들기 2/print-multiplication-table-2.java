import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        for(int i = 2; i < 10; i += 2){
            for(int j = b; j >= a; j--){
                if(j > a){
                    System.out.print(j + " * " + i + " = " + i*j + " / ");
                }
                else{
                    System.out.print(j + " * " + i + " = " + i*j);
                }
            }
            System.out.println();
        }
    }
}