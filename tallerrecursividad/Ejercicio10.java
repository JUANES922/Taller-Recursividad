
package tallerrecursividad;

import java.util.Random;


public class Ejercicio10 {
    public void ejecutar() {
        Random aleatorio = new Random();
        int a = aleatorio.nextInt(20) + 1; 
        int b = aleatorio.nextInt(20) + 1;

        System.out.println("\n--- Ejercicio 10: Multiplicacion por sumas sucesivas ---");
        System.out.println("Numero 1: " + a);
        System.out.println("Numero 2: " + b);

        long resultado = 0;
        for (int i = 0; i < b; i++) resultado += a;

        System.out.println(a + " * " + b + " = " + resultado);
    }
}
