import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char target = in.next().charAt(0);

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                count++;
            }
        }

        System.out.println(count);
    }
}
