import java.util.Scanner;

public class Actividad7_moodle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("inserte el peso del paquete ");
        int peso_del_pequete = entrada.nextInt();

        System.out.println("inserte las iniciales del pais (america del norte amn, europa eu ...)");
        String pais = entrada.nextLine();

        int amn = 24;
        int amc = 20;
        int ams = 21;
        int eu = 10;
        int as = 18;

        if (peso_del_pequete > 5) {
            System.out.println("Tu entrega ha sido rechazada");
        }

    }
}
