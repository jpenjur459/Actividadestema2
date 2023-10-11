import java.util.Scanner;

public class PrecioElado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("tamaño del helado pequeño(P), mediano (M), grande (G): ");
        char tamano = entrada.nextLine().charAt(0);

        System.out.println("Topping sin topping (S) KitKat (K) Brounie (B) Lacasitos (L): ");
        char topping = entrada.nextLine().charAt(0);

        float precio = 0.0f;

        if (tamano == 'P'){
            precio = 1;
       }else
           if (tamano == 'M') {
               precio = 2;
           }else
               if (tamano == 'G'){
               precio = 3;
           }
       //if (topping != 'S')
        //if{
            //(topping == 'K')
            precio = precio + 1;
        //}else
          //  if{
            //(topping == 'B')
           // precio = precio + 1, 5f;
        //}else{
          //  precio = precio + 0, 5f;
        }
    }
//}
