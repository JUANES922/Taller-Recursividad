
package tallerrecursividad;

import java.util.Random;


public class Ejercicio11 {
    public void ejecutar() {
        Random aleatorio = new Random();
        int n = aleatorio.nextInt(6) + 3;
        int[] arreglo = new int[n];

        System.out.println("\n---Ejercicio 11: suma de elementos de un arreglo ---");
        System.out.print("Arreglo generado: [ ");
        long suma = 0;
        for (int i = 0; i < n; i++) {
            arreglo[i] = aleatorio.nextInt(50) + 1; 
            System.out.print(arreglo[i] + " ");
            suma += arreglo[i];
        }
        System.out.println("]");
        System.out.println("Suma de elementos: " + suma);
    }
}
