import java.util.Scanner;

public class Actividad5_moodle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce el numero de alumnos");
        int alumnos = entrada.nextInt();
        
        int precio_bus = 4000;
        
        if (alumnos >= 100){
            System.out.println("cada niño tiene que pagar 65 euros");
        } else if (alumnos <= 29) {
            System.out.println("cada niño tiene que pagar " + precio_bus / alumnos + " euros");
        } else if (alumnos <= 49){
            System.out.println("cada niño tiene que pagar 95 euros");
        }else if (alumnos <= 99){
            System.out.println("cada niño tiene que pagar 70 euros");
        }

    }
}
