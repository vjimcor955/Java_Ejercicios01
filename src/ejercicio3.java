import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner pesetasInput = new Scanner(System.in);
        System.out.println("Introduzca cantidad de pesetas");
        double pesetas = parseDouble(pesetasInput.nextLine());
        double euros = pesetas*0.006;
        System.out.println(pesetas + " pesetas son " + euros + " euros");
    }
}
