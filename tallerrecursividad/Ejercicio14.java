
package tallerrecursividad;

import java.util.Random;


public class Ejercicio14 {
   public void ejecutar() {
        Random aleatorio = new Random();
        int m = aleatorio.nextInt(3) + 1;
        int n = aleatorio.nextInt(4) + 1; 

        System.out.println("\n--- Ejercicio 14: funcion de Ackermann ---");
        System.out.println("m generado: " + m);
        System.out.println("n generado: " + n);
        System.out.println("Ackermann(" + m + ", " + n + ") = " + ackermann(m, n));
    }

    private long ackermann(long m, long n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    } 
}
