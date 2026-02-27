import java.util.Scanner;

public class Main {

    public static int add(int a, int c) {
        return a + c;
    }

    public static int sub(int a, int c) {
        return a - c;
    }

    public static int mul(int a, int c) {
        return a * c;
    }

    public static int div(int a, int c) {
        return a / c;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String o = sc.next();
        int c = sc.nextInt();

        if(o.equals("+")) {
            System.out.println(a + " + " + c + " = " + add(a, c));
        }
        else if(o.equals("-")) {
            System.out.println(a + " - " + c + " = " + sub(a, c));
        }
        else if(o.equals("*")) {
            System.out.println(a + " * " + c + " = " + mul(a, c));
        }
        else if(o.equals("/")) {
            System.out.println(a + " / " + c + " = " + div(a, c));
        }
        else {
            System.out.println("False");
        }
    }
}