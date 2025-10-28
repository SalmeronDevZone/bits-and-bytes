package PaqueteEjercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean controlFlujo = true;

        while (controlFlujo) {

            System.out.println("\n──────────────────────────────────────────────");
            System.out.println(" -           MENÚ DE EJERCICIOS           - ");
            System.out.println("──────────────────────────────────────────────");
            System.out.println("  1️⃣  Ejecutar Ejercicio 1");
            System.out.println("  2️⃣  Ejecutar Ejercicio 2");
            System.out.println("  3️⃣  Ejecutar Ejercicio 3");
            System.out.println("──────────────────────────────────────────────");
            System.out.println("  🔚  Cualquier otra tecla: Salir");
            System.out.println("──────────────────────────────────────────────");
            System.out.print("Selecciona una opción: ");

            String End = sc.nextLine();

            switch (End) {

                case "1":
                    CodigoEjercicio1();
                    break;

                case "2":
                    CodigoEjercicio2();
                    break;

                case "3":
                    CodigoEjercicio3();
                    break;

                default:
                    System.out.println("No ha seleccionado ningún ejercicio." + "\n FIN DEL PROGRAMA, USUARIO");
                    controlFlujo = false;


            }

        }
        sc.close();

    }

    public static void CodigoEjercicio1(){
        Ejercicio1.Ejecutar();
    }

    public static void CodigoEjercicio2(){
        Ejercicio2.Ejecutar();
    }

    public static void CodigoEjercicio3(){
        Ejercicio3.Ejecutar();
    }


}
