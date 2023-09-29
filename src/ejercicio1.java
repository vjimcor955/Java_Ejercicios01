import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio1 {
        public static void main(String[] args) {
            Scanner numeroInput = new Scanner(System.in);
            System.out.println("Introduzca primer numero");
            double numero1 = parseDouble(numeroInput.nextLine());
            numeroInput = new Scanner(System.in);
            System.out.println("Introduzca segundo numero");
            double numero2 = parseDouble(numeroInput.nextLine());
            System.out.println(numero1*numero2);
        }
}
