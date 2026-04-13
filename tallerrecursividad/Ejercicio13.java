
package tallerrecursividad;

import java.util.Random;



public class Ejercicio13 {
   public void ejecutar() {
        Random aleatorio = new Random();
        int limite = aleatorio.nextInt(200) + 50; 

        System.out.println("\n--- Ejercicio 13: serie de Fibonacci ---");
        System.out.println("limite generado: " + limite);
        System.out.print("serie: ");

        int i = 0;
        boolean primero = true;
        while (true) {
            long fib = fibonacci(i);
            if (fib > limite) break;
            if (!primero) System.out.print(", ");
            System.out.print(fib);
            primero = false;
            i++;
        }
        System.out.println();
    }

    private long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    } 
}
