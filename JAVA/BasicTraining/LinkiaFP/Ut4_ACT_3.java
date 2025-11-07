package ut4;

import java.util.Scanner;

public class Act3 {

    static class Emp {
        private String nombre;
        private String puesto;
        private double salario;

        public Emp(String nombre, String puesto) {
            this.nombre = nombre;
            this.puesto = puesto;
            this.salario = convenio(puesto);
        }

        private double convenio(String puesto) {
            switch (puesto.toLowerCase()) {
                case "empleado":
                    return 2000;
                case "manager1":
                    return 2500;
                case "manager2":
                    return 3000;
                case "jefe de equipo":
                    return 4000;
                default:
                    System.out.println("Puesto no reconocido. Se asignará salario base (2000).");
                    return 2000;
            }
        }

        public void cambiarPuesto(String nuevoPuesto) {
            this.puesto = nuevoPuesto;
            this.salario = convenio(nuevoPuesto);
            System.out.println("Puesto actualizado a " + nuevoPuesto + ". Nuevo salario mensual: " + salario);
        }

        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre + ", puesto: " + puesto + ", salario mensual: " + salario);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Emp emp1 = new Emp("Antonio Lobato!!!!", "Manager1");
        System.out.println("Empleado inicial:");
        emp1.mostrarInfo();

        System.out.print("\n¿Deseas agregar un nuevo empleado? (s/n): ");
        String respuesta = sc.nextLine().toLowerCase();

        if (respuesta.equals("s")) {
            System.out.print("Introduce el nombre del empleado: ");
            String nombre = sc.nextLine();

            System.out.print("Introduce el puesto (empleado / manager1 / manager2 / jefe de equipo): ");
            String puesto = sc.nextLine();

            Emp nuevoEmp = new Emp(nombre, puesto);
            System.out.println("\nNuevo empleado añadido:");
            nuevoEmp.mostrarInfo();
        } else {
            System.out.println("No se añadió ningún empleado nuevo.");
        }

        sc.close();
    }
}
