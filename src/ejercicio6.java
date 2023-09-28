import java.util.Scanner;

public class ejercicio6 {
    // suponiendo que es un triangulo rectangulo
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca la base de triangulo: ");
        float base = Float.parseFloat(lectura.next());
        System.out.println("Introduzca la altura de triangulo: ");
        float altura = Float.parseFloat(lectura.next());

        float area = base*altura/2;

        System.out.println("El area de un triangulo rectangulo de " + base + " de base y " + altura + " de altura es " + area);
    }
}
