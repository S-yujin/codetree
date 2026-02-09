import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[][] arr = new char[5][3];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = in.next().charAt(0);
            }
        }


        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
               arr[i][j] = (char)(arr[i][j]-32);
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
