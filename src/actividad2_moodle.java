import java.util.Scanner;

public class actividad2_moodle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("inserte un año");
        int anio = entrada.nextInt();

        if (anio % 4 == 0){
            System.out.println("el año "+ anio + " es bisiesto ");
        }else {
            System.out.println("el año "+ anio + " no es bisiesto ");
        }


    }
}
