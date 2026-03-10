import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        String str2 = in.next();

        if(str.length() > str2.length()){
            System.out.print(str + " " + str.length());
        }
        else if(str.length() == str2.length()){
            System.out.print("same");
        }
        else{
            System.out.print(str2 + " " + str2.length());
        }
    }
}
