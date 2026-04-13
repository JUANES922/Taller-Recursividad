
package tallerrecursividad;

import java.util.Random;

public class Ejercicio5 {
     public void ejecutar() {
        Random aleatorio = new Random();
        int n = aleatorio.nextInt(9000) + 1000;

        System.out.println("\n--- Ejercicio 5: Suma de digitos ---");
        System.out.println("numero generado: " + n);

        int suma = 0;
        int temp = n;
        while (temp != 0) {
            suma += temp % 10;
            temp /= 10;
        }

        System.out.println("Suma de digitos: " + suma);
    }
}
