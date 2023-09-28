import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        float num1 = Float.parseFloat(lectura.next());
        System.out.println("Escriba otro numero: ");
        float num2 = Float.parseFloat(lectura.next());

        var suma = num1 + num2;
        var resta = num1 - num2;
        var producto = num1 * num2;
        var division = num1 / num2;

        System.out.println("Los resultados de esos numeros son\nSuma: " + suma + "\nResta: " + resta + "\nProducto: " + producto + "\nDivision: " + division);
    }
}
