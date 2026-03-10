import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        boolean sat = true;
        
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                sat = false;
            }
        }

        if(sat == false){
            System.out.print("C");
        }
        else{
            System.out.print("P");
        }
    }
}