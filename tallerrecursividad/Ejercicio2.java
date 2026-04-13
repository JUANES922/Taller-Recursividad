
package tallerrecursividad;

import java.util.Random;


public class Ejercicio2 {
    public void ejecutar(){
      Random aleatorio = new Random();
        int n = aleatorio.nextInt(20) + 1; 

        System.out.println("\n--- Ejercicio 2: sumatoria de 1 hasta n ---");
        System.out.println("numero generado: " + n);

        long suma = 0;
        for (int i = 1; i <= n; i++) suma += i;

        System.out.println("sumatoria(1.." + n + ") = " + suma);
    }
}
