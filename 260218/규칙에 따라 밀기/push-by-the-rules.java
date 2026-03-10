import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String cmd = in.nextLine();

        for (int i = 0; i < cmd.length(); i++) {
            if (cmd.charAt(i) == 'L') {
                str = str.substring(1) + str.charAt(0);
            } 
            else if (cmd.charAt(i) == 'R') {
                str = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
            }
        }

        System.out.println(str);
    }
}
