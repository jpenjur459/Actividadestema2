import java.util.Scanner;

public class Actividad3_moodle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("inserte un numero entero ");
        int numero1 = entrada.nextInt();
        System.out.println("inserte otro numero entero ");
        int numero2 = entrada.nextInt();

        if (numero2 == 0){
            System.out.println("esta división no se puede hacer ");
        }
        else {
            System.out.println("el resultado de la división es " + numero1  /  numero2 );
        }
    }
}
