
package tallerrecursividad;

import java.util.Random;


public class Ejercicio1 {
    

    public void ejecutar() {
        Random aleatorio = new Random();
        int n = aleatorio.nextInt(12) + 1; 

        System.out.println("\n--- Ejercicio 1: Factorial ---");
        System.out.println("numero generado: " + n);
        System.out.println("factorial de " + n + " = " + calcularFactorial(n));
    }

    private long calcularFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * calcularFactorial(n - 1);
    }
}

