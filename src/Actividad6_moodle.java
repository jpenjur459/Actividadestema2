import java.util.Scanner;

public class Actividad6_moodle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("inserte los minutos de la llamada ");
        double minutos_llamada = entrada.nextDouble();
        System.out.println("inserte el dia de la llamada ");
        int dia = entrada.nextInt();
        System.out.println("inserte el el momento del dia (mañana o tarde) ");
        int momento = entrada.nextInt();

        double cinco_minutos = 1;
        double ocho_minutos = cinco_minutos + 0.8;
        double diez_minutos = ocho_minutos + 0.7;
        double mayor_diez_minutos = diez_minutos + 0.5;

        if (minutos_llamada <=5){
            System.out.println("la llamada cuesta "+ cinco_minutos + "euros ");
        } else if (minutos_llamada <= 8) {
            System.out.println("la llamda cuesta "+ ocho_minutos + "euros");
        }else if (minutos_llamada <= 10) {
            System.out.println("la llamada cuesta "+ diez_minutos + "euros");
        } else if (minutos_llamada > 10) {
            System.out.println("la llamada cuesta "+ mayor_diez_minutos + "euros");
        }

    }



}
