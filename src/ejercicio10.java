import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca los Mb: ");
        float mb = Float.parseFloat(lectura.next());

        float kb = mb * 1000;

        System.out.println(mb + " Mb son " + kb + " Kb.");
    }
}
