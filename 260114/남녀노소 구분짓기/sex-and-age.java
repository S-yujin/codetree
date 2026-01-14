import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sex = in.nextInt();
        int age = in.nextInt();

        if(sex == 0 && age >= 19){
            System.out.println("MAN");
        }
        else if(sex == 1 && age >= 19){
            System.out.println("WOMAN");
        }
        else if(sex == 0 && age < 19){
            System.out.println("BOY");
        }
        else{
            System.out.println("GIRL");
        }
    }
}