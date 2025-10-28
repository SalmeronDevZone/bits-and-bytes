package PaqueteEjercicios;

import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;

public class Ejercicio3 {

    public static void Ejecutar() {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[7];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        System.out.println("\n=== EJERCICIO 3: Gestor de Temperaturas Semanales ===");


        for (int i = 0; i < temperaturas.length; i++) {
            boolean valido = false;

            do {
                System.out.print("Introduce la temperatura del " + dias[i] + ": ");
                String entrada = sc.nextLine();

                try {
                    temperaturas[i] = Double.parseDouble(entrada);
                    valido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Debe introducir un número (puede tener decimales).");
                }

            } while (!valido);
        }

        // Calcular media
        double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        double media = suma / temperaturas.length;

        System.out.printf("\nLa temperatura media semanal es: %.2f\n", media);
        System.out.println("Ejercicio 3 finalizado.\n");


        System.out.print("¿Desea abrir la página de https://www.eltiempo.es/? (sí/no): ");
        String respuesta = sc.nextLine().trim().toLowerCase();

        if (respuesta.equals("sí") || respuesta.equals("si")) {
            try {
                Desktop.getDesktop().browse(new URI("https://www.eltiempo.es/"));
                System.out.println("Abriendo la página...");
            } catch (Exception e) {
                System.out.println("No se pudo abrir la página web.");
            }
        } else {
            System.out.println("No se abrirá la página. Fin del programa.");
        }
    }
}
