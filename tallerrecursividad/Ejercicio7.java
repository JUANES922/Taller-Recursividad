
package tallerrecursividad;

import java.util.Random;

public class Ejercicio7 {
    public void ejecutar() {
        Random aleatorio = new Random();
        int base = aleatorio.nextInt(10) + 1;  
        int exponente = aleatorio.nextInt(6) + 1; 

        System.out.println("\n--- Ejercicio 7: Potencia ---");
        System.out.println("base generada:      " + base);
        System.out.println("exponente generado: " + exponente);
        System.out.println(base + " ^ " + exponente + " = " + calcularPotencia(base, exponente));
    }

    private long calcularPotencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * calcularPotencia(base, exp - 1);
    }
}
