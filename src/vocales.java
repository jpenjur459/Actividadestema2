import java.util.Scanner;

public class vocales {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char car = entrada.nextLine().charAt(0);

        if ((car == 'a') || (car == 'A'))
            System.out.println(car + " es una vocal");

        else if ((car == 'e') || (car == 'E'))
            System.out.println(car + " es una vocal");

        else if ((car == 'i') || (car == 'I'))
            System.out.println(car + " es una vocal");

        else if ((car == 'o') || (car == 'O'))
            System.out.println(car + " es una vocal");

        else if ((car == 'u') || (car == 'U'))
            System.out.println(car + " es una vocal");

        else
            System.out.println(car + " no es una vocal");

        switch (car)
        {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
            System.out.println(car + " es una vocal");
            break;
            default:
            System.out.println(car + " no es una vocal");
        }
    }
}
