
package tallerrecursividad;

import java.util.Random;

public class Ejercicio4 {
   public void ejecutar() {
        Random aleatorio = new Random();
        int n = aleatorio.nextInt(9000) + 1000; // 1000 a 9999

        System.out.println("\n--- Ejercicio 4: invertir numero ---");
        System.out.println("numero generado: " + n);

        long invertido = 0;
        long temp = n;
        while (temp != 0) {
            invertido = invertido * 10 + (temp % 10);
            temp /= 10;
        }

        System.out.println("numero invertido: " + invertido);
    } 
}
