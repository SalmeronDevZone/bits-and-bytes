package PaqueteEjercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static String[] asignaturas;
    public static double[]notas;

    public static void Ejecutar() {

        Scanner sc = new Scanner (System.in);

        System.out.println("\nAdministración de LINKIA.\nNotas de Exdepiente.");

        asignaturas = new String[] {
                "Programación", "Bases de Datos", "Desarrollo de Interfaces", "Empleabilidad"
        };

        notas = new double[asignaturas.length];


        for (int i=0; i< asignaturas.length; i++){

            double nota = -1;

            do {
                System.out.print("Introduce la nota de " + asignaturas[i] + "  del 0 al 10: ");
                String entrada = sc.nextLine();

                try {
                    nota = Double.parseDouble(entrada);

                    if (nota < 0 || nota > 10) {
                        System.out.println("El sistema de evaluación comprende del 0 al 10.");
                        nota = -1;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("ERROR. --- HA INTRODUCIDO UN TIPO DE DATO ERRONEO. SELECCIONE UN NÚMERO DEL 0 AL 10. ---");
                }

            } while (nota < 0);

            notas[i] = nota;
        }

        System.out.println("\n RESULTADOS:");

        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println(asignaturas[i] + ": " + obtenerCalificacion(notas[i]));
        }

        System.out.println("\nPara mas información escriba un mail a : info@linkiafp.es.\n");
    }

    public static String obtenerCalificacion(double nota) {

        if (nota < 5) return "Suspenso";

        else if (nota < 7) return "Aprobado";

        else if (nota < 9) return "Notable";

        else return "Sobresaliente";
    }
}
