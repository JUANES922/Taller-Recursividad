
package tallerrecursividad;

import java.util.Random;

public class Ejercicio9 {
    public void ejecutar() {
        Random aleatorio = new Random();
        int dividendo = aleatorio.nextInt(90) + 10; 
        int divisor   = aleatorio.nextInt(9)  + 1; 

        System.out.println("\n--- Ejercicio 9: cociente por restas sucesivas ---");
        System.out.println("dividendo: " + dividendo);
        System.out.println("divisor:   " + divisor);

        int cociente = 0;
        int residuo  = dividendo;
        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }

        System.out.println(dividendo + " / " + divisor + " = " + cociente + "  (residuo: " + residuo + ")");
    }
}
