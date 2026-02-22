import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            String str = in.next();

            if(str.equals("END")){
                break;
            }

            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse());
        }
    }
}