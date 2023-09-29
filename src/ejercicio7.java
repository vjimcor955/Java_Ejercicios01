import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner ivaInput = new Scanner(System.in);
        System.out.println("Introduzca importe de IVA de su factura");
        double iva = parseDouble(ivaInput.nextLine());
        System.out.println(iva+iva/0.21); //Asumiendo que el IVA del producto es del 21%
    }
}
