import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba una cantidad de euros: ");
        float euros = Float.parseFloat(lectura.next());

        var pesetas = euros * 166.3860;

        System.out.println(euros + " euros son " + pesetas + " pesetas.");
    }
}