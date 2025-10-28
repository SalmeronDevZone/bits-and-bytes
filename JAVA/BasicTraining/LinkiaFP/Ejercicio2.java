package PaqueteEjercicios;

public class Ejercicio2 {

    public static void Ejecutar() {
        System.out.println("\n=== EJERCICIO 2: " +
                "QUE NOTAS SON PARES ===");


        if (Ejercicio1.notas == null || Ejercicio1.notas.length == 0) {
            System.out.println("ERROR! ERROR! \n-Debe ejecutar primero el Ejercicio 1 para introducir las notas.\nNo hay información en la memoria caché.");
            return;
        }

        System.out.println(" Notas enteras pares:");

        for (int i = 0; i < Ejercicio1.notas.length; i++) {
            int notaEntera = (int) Math.floor(Ejercicio1.notas[i]);

            if (notaEntera % 2 != 0) {
                continue;
            }

            System.out.println(Ejercicio1.asignaturas[i] + ": " + notaEntera);
        }

        System.out.println("Ejercicio 2 finalizado.\nElija su nueva opción.");
    }

}
