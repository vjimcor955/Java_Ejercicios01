import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Introduzca cantidad de Kb");
        double kb = parseDouble(kbInput.nextLine());
        System.out.println(kb*0.001);
    }
}
