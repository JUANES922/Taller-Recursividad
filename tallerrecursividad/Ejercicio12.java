
package tallerrecursividad;

import java.util.Random;


public class Ejercicio12 {
    public void ejecutar() {
        Random aleatorio = new Random();
        int m = aleatorio.nextInt(3) + 2;
        int n = aleatorio.nextInt(3) + 2;
        int[][] matriz = new int[m][n];

        System.out.println("\n--- Ejercicio 12: suma de elementos de una matriz ---");
        System.out.println("tamaño: " + m + " x " + n);

        long suma = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                matriz[i][j] = aleatorio.nextInt(20) + 1; 
                suma += matriz[i][j];
            }

        System.out.println("matriz generada:");
        for (int i = 0; i < m; i++) {
            System.out.print("  [ ");
            for (int j = 0; j < n; j++)
                System.out.printf("%4d ", matriz[i][j]);
            System.out.println("]");
        }
        System.out.println("suma total: " + suma);
    }
}
