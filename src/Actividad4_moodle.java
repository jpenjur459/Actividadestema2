import java.util.Scanner;

public class Actividad4_moodle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("inserte un numero ");
        int numero = entrada.nextInt();
        System.out.println("inserte la potencia del numero ");
        int potencia = entrada.nextInt();

        double resultado = Math.pow(numero,potencia);
        double exponente = Math.signum (numero);

        if (exponente == 1){
            System.out.println("el resultado es "+ resultado);
        }else
            if (exponente == 0){
                System.out.println("el resultado es 1");
            } //else
               // if (exponente != -1) {
                   // System.out.println("el resultado es " + resultado);
            //}

    }
}
