import java.util.Objects;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca la base imponible: ");
        float base = Float.parseFloat(lectura.next());
        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        var iva = lectura.next();
        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        var codigo = lectura.next();

        float iva_num = 0.0f;
        if (Objects.equals(iva, "general")) {
            iva_num = 0.21f;
        } else if (Objects.equals(iva, "reducido")) {
            iva_num = 0.10f;
        } else if (Objects.equals(iva, "superreducido)")) {
            iva_num = 0.4f;
        }

        System.out.println("Base imponible\n" + base + "\nIVA (" + iva_num*100 + "%)\n" + codigo);

        float precio = base + base * iva_num;
        System.out.println("Precio con IVA\n" + precio);

        var descuento = 0.0f;
        if (Objects.equals(codigo, "nopro")) {
            descuento = 0.0f; // pass(?
        } else if (Objects.equals(codigo, "mitad")) {
            descuento = precio/2;
            precio = precio-descuento;
        } else if (Objects.equals(codigo, "meno5)")) {
            descuento = 5;
            precio = precio-descuento;
        } else if (Objects.equals(codigo, "5porc)")) {
            descuento = 0.05f;
            precio = precio-precio*descuento;
        }

        System.out.println("Cód. promo. (" + codigo + "): -" + descuento);
        System.out.println("TOTAL\n" + precio);
    }
}
