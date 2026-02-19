import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.next());
        int Q = sc.nextInt();

        for(int i = 0; i < Q; i++){
            int cmd = sc.nextInt();

            if(cmd == 1){
                char first = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(first);

            } else if(cmd == 2){
                char last = sb.charAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                sb.insert(0, last);

            } else if(cmd == 3){
                sb.reverse();
            }

            System.out.println(sb);
        }
    }
}
