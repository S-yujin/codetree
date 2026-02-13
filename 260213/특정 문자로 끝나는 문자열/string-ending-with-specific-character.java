import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextLine();
        }

        char ch = sc.nextLine().charAt(0);

        boolean found = false;

        for(int i = 0; i < 10; i++){
            String str = arr[i];

            if(str.charAt(str.length() - 1) == ch){
                System.out.println(str);
                found = true;
            }
        }

        if(!found){
            System.out.println("None");
        }
    }
}
