import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        if(a > b){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        if(a > c){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        if(a > d){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        if(a > e){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}