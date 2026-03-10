import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String A = in.nextLine();
        String B = in.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            sb.append(A.charAt(i));

            if (sb.length() >= B.length()) {
                boolean isSame = true;

                for (int j = 0; j < B.length(); j++) {
                    if (sb.charAt(sb.length() - B.length() + j) != B.charAt(j)) {
                        isSame = false;
                        break;
                    }
                }

                if (isSame) {
                    sb.delete(sb.length() - B.length(), sb.length());
                }
            }
        }

        System.out.println(sb.toString());
    }
}
