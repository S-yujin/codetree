import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxUnder500 = 0;    
        int minOver500 = 1001;    

        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();

            if(n < 500){
                if(n > maxUnder500){
                    maxUnder500 = n;
                }
            }
            else if(n > 500){
                if(n < minOver500){
                    minOver500 = n;
                }
            }
        }

        System.out.print(maxUnder500 + " " + minOver500);
    }
}
