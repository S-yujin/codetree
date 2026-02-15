import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        char c = in.next().charAt(0);
        int sum = -1;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                sum = i;
                break;
            }
        }

        if(sum == -1){
            System.out.println("No");
        }
        else{
            System.out.println(su)
        }
    }
}