import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            sb.append(in.next());
        }

        String result = sb.toString();

        for(int i = 0; i < result.length(); i++){
            System.out.print(result.charAt(i));

            if((i + 1) % 5 == 0){
                System.out.println();
            }
        }
    }
}
