
package tallerrecursividad;

import java.util.Random;

public class Ejercicio3 {
    public void ejecutar() {
        Random aleatorio = new Random();
        int n = aleatorio.nextInt(10) + 1; // 1 a 10

        System.out.println("\n--- Ejercicio 3: Sumatoria 1 + 1/2 + ... + 1/n ---");
        System.out.println("numero generado: " + n);

        double suma = 0;
        StringBuilder serie = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
            serie.append(i == 1 ? "1" : " + 1/" + i);
        }

        System.out.println("serie:     " + serie);
        System.out.printf("resultado: %.6f%n", suma);
    }
    
}
