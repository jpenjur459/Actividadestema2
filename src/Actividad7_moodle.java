import java.util.Scanner;

public class Actividad7_moodle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("inserte el peso del paquete ");
        int peso_del_pequete = entrada.nextInt();

        System.out.println("inserte el numero del pais (america del norte (1), america central (2) america del sur (3) europa (4) asia (5)");
        int pais = entrada.nextInt();

        int amn = 24;
        int amc = 20;
        int ams = 21;
        int eu = 10;
        int as = 18;

        if (peso_del_pequete >5) {
            System.out.println("Tu entrega ha sido rechazada");
        } else if (pais == 1) {
            System.out.println("el precio del paquete es: "+ peso_del_pequete * amn);
        }else if (pais == 2) {
            System.out.println("el precio del paquete es: "+ peso_del_pequete * amc);
        }else if (pais == 3) {
            System.out.println("el precio del paquete es: "+ peso_del_pequete * ams);
        }else if (pais == 4) {
            System.out.println("el precio del paquete es: "+ peso_del_pequete * eu);
        }else if (pais == 5) {
            System.out.println("el precio del paquete es: "+ peso_del_pequete * as);
        }

    }
}
