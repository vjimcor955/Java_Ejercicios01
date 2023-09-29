import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduzca nota del primer examen");
        double primerExamen = parseDouble(userInput.nextLine());
        userInput = new Scanner(System.in);
        System.out.println("Introduzca nota que quiere sacar en el curso");
        double notaDeseada = parseDouble(userInput.nextLine());
        System.out.println("Necesita sacar un " + Math.abs(primerExamen*0.4-notaDeseada)/0.6);
    }
}
