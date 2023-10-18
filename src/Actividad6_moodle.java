import java.util.Scanner;

public class Actividad6_moodle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("inserte los minutos de la llamada ");
        double minutos_llamada = entrada.nextDouble();
        System.out.println("inserte el dia de la llamada (correspondiendo a liner 1 martes 2 ...)");
        int dia = entrada.nextInt();
        System.out.println("inserte el el momento del dia (mañana (1) o tarde (2) ");
        int momento = entrada.nextInt();

        double coste = 0;
        ;

        if (minutos_llamada <=5){
            coste = 1;
        } else if (minutos_llamada <= 8) {
            coste = 1 + 0.8;
        }else if (minutos_llamada <= 10) {
             coste = 1 + 0.8 + 0.7;
        } else if (minutos_llamada > 10) {
            coste = 1 + 0.8 + 0.7 + 0.5;
        }
        if (dia == 7){
            coste = coste * 0.03;
        }
        if (momento == 1){
            coste = coste * 0.15;
        }else {
            coste = coste * 0.1;
        }

        System.out.println("la llamada te cuesta "+ coste + " euros");
    }



}
