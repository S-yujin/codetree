import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        boolean sat = false;

        for(int i = a; i <= b; i++){
            if(1920 % i == 0 && 2880 % i == 0){
                sat = true;
            }
        }

        if(sat == true){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
}