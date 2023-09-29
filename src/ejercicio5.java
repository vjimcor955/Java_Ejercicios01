import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner ladoInput = new Scanner(System.in);
        System.out.println("Introduzca base del rectangulo");
        double base = parseDouble(ladoInput.nextLine());
        ladoInput = new Scanner(System.in);
        System.out.println("Introduzca altura del rectangulo");
        double altura = parseDouble(ladoInput.nextLine());
        System.out.println(base*altura);
    }
}
