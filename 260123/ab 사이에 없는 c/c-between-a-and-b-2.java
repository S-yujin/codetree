import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        boolean sat = false;

        for(int i = a; i <= b; i++){
            if(i % c != 0){
                sat = true;
            }
            else if(i % c == 0){
                sat = false;
                break;
            }
        }

        if(sat == true){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}