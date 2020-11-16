import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println("El primer numero ingresado es: "+ a);
        System.out.println("El segundo numero ingresado es: "+ b);
        System.out.println("El tercer numero ingresado es: "+ c);

    }
}