
package tallerrecursividad;

import java.util.Random;

public class Ejercicio8 {
    public void ejecutar() {
        Random aleatorio = new Random();
        int m = aleatorio.nextInt(100) + 1; 
        int n = aleatorio.nextInt(100) + 1;

        System.out.println("\n--- Ejercicio 8: Maximo Comun Divisor (MCD) ---");
        System.out.println("M generado: " + m);
        System.out.println("N generado: " + n);
        System.out.println("MCD(" + m + ", " + n + ") = " + mcd(m, n));
    }

    private int mcd(int m, int n) {
        if (n == 0) return m;
        return mcd(n, m % n);
    }
}
