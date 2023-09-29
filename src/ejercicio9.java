import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner medidaInput = new Scanner(System.in);
        System.out.println("Introduzca radio del cono");
        double radio = parseDouble(medidaInput.nextLine());
        medidaInput = new Scanner(System.in);
        System.out.println("Introduzca altura del cono");
        double altura = parseDouble(medidaInput.nextLine());
        System.out.println((double) 1/3*Math.PI*(radio*radio)*altura);
    }
}
