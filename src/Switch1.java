import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);

        
        int x = entrada.nextInt();
        switch (x)
        {
            case 0:
                System.out.println("cero");
            case 1:
                System.out.println("uno");
            case 2:
                System.out.println("Dos");
                break;
            default:
                System.out.println("Fuera de rango");
        }
        switch (x)
        {
            case 0:
            case 1:
            case 2:
                System.out.println("Menor que 3!");
                break;
            case 3:
                System.out.println("Igual a 3!");
                break;
            default:
                System.out.println("Mayor que 3!");
        }

    }

}
