
package tallerrecursividad;

import java.util.Random;


public class Ejercicio6 {
   public void ejecutar() {
        Random aleatorio = new Random();
        int n = aleatorio.nextInt(9000) + 1000; 

        System.out.println("\n--- Ejercicio 6: Suma de digitos ---");
        System.out.println("numero generado: " + n);

        int suma = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            suma += Character.getNumericValue(c);
        }

        System.out.println("suma de digitos: " + suma);
    }
}
