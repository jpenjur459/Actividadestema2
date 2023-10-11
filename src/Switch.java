public class Switch {
    public static void main(String[] args) {
        int opcion = 10;
        switch (opcion)
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
