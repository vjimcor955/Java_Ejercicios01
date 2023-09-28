import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas: ");
        float horas = Float.parseFloat(lectura.next());

        float salaraio = horas * 12;

        System.out.println("El salario que corresponde a las " + horas + " horas trabajadas a razon de 12 €/h es de " + salaraio + " euros.");
    }
}
