import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean sat = true;

        for(int i = 0; i < 5; i++){
            int n = in.nextInt();

            if(n % 3 != 0){
                sat = false;
            }
        }

        if(sat == false){
            System.out.print("0");
        }
        else{
            System.out.print("1");
        }
    }
}