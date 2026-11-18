import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿que operacion quieres hacer? \n1.Sumar \n2.Restar \n3.Multiplicar \n4.Dividir");

        int eleccion = sc.nextInt();

        if (eleccion == 1) {
            System.out.println("Elije dos numeros que quieras sumar");
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();
            System.out.println("El resultado es: " + (numero1 + numero2));
        } else if (eleccion ==  2) {
            System.out.println("Elije dos numeros que quieras restar");
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();
            System.out.println("El resultado es: " + (numero1 - numero2));
        } else if (eleccion == 3) {
            System.out.println("Elije dos numeros que quieras multiplicar");
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();
            System.out.println("El resultado es: " + (numero1 * numero2));
        } else if (eleccion == 4) {
            System.out.println("Elije dos numeros que quieras dividir");
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();
            System.out.println("El resultado es: " + (numero1 / numero2));

        } else {
            System.out.println("Opcion no valida");
        }

    }
}
