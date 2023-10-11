import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduzca el primer numero entero");
        int numero1 = entrada.nextInt();
        System.out.println("introduzca el segundo numero entero");
        int numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.println("el numero mayos es " + numero1);
        }else {
            System.out.println("el numero mayor es " + numero2);
        }
    }
}
