package javaejercicio1;

/**
 *
 * @author Acer Aspire3
 */
import java.util.Scanner;

public class JavaEjercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        
        // Validación del número ingresado
        while (n < 0) {
            System.out.println("El número ingresado no es válido. Por favor, ingrese un número entero positivo.");
            n = scanner.nextInt();
        }
        
        // Cálculo del factorial
        int factorial = calcularFactorial(n);
        
        // Mostrar el resultado
        System.out.println("El factorial de " + n + " es: " + factorial);
        
        scanner.close();
    }
    
    // Método para calcular el factorial
    public static int calcularFactorial(int n) {
        int factorial = 1;
        
        // Bucle for para calcular el factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
}
