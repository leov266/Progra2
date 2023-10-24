/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejercicio2;


import java.util.ArrayList;
import java.util.Scanner;

public class JavaEjercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        int[] divisoresPrimos = obtenerDivisoresPrimos(numero);
        
        System.out.println("Divisores primos de " + numero + ":");
        for (int divisor : divisoresPrimos) {
            System.out.println(divisor);
        }
        
        scanner.close();
    }
    
    public static int[] obtenerDivisoresPrimos(int numero) {
        ArrayList<Integer> divisoresPrimos = new ArrayList<>();
        
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0 && esPrimo(i)) {
                divisoresPrimos.add(i);
            }
        }
        
        // Convertir el ArrayList a un array
        int[] resultado = new int[divisoresPrimos.size()];
        for (int i = 0; i < divisoresPrimos.size(); i++) {
            resultado[i] = divisoresPrimos.get(i);
        }
        
        return resultado;
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}