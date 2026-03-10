import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String num = in.next();
        String[] Arr = num.split("-");

        System.out.printf(Arr[0] +"-"+ Arr[2]+"-" + Arr[1]);
    }
}