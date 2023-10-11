import java.util.Scanner;

public class actividad1_moodle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Inserte un numro entero ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("el numero " + numero + " es par");
        } else {
            System.out.println("el numero " + numero + " es impar");
        }


    }
}
