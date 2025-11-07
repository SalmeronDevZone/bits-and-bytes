package ut4;

import java.util.Scanner;
import java.time.Year;

public class Act1 {
    String titulo, autor;
    int anio;

    Act1(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    void mostrarInfo() {
        System.out.println(titulo + " - " + autor + " (" + anio + ")");
    }

    void actualizarAnio(int nuevoAnio) {
        anio = nuevoAnio;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int anioActual = Year.now().getValue();

        Act1 Libro_IT = new Act1("It", "Stephen King", 1986);
        Act1 Libro_REDRUM  = new Act1("El resplandor", "Stephen King", 1977);

        System.out.println("Libros de Stephen King:");
        Libro_IT.mostrarInfo();
        Libro_REDRUM.mostrarInfo();

        System.out.print("\n¿Deseas cambiar el año de publicación de algún libro? (s/n): ");
        String respuesta = sc.nextLine().toLowerCase();

        if (respuesta.equals("s")) {
            System.out.print("¿Cuál libro deseas actualizar? (It / El resplandor): ");
            String libroElegido = sc.nextLine().toLowerCase();

            System.out.print("Ingresa el nuevo año: ");
            int nuevoAnio = sc.nextInt();

            if (nuevoAnio > anioActual) {
                System.out.println("Error: el año no puede ser superior al actual (" + anioActual + ").");
            } else if (libroElegido.equals("it")) {
                Libro_IT.actualizarAnio(nuevoAnio);
                System.out.println("Año actualizado para 'It'.");
            } else if (libroElegido.equals("el resplandor")) {
                Libro_REDRUM.actualizarAnio(nuevoAnio);
                System.out.println("Año actualizado para 'El resplandor'.");
            } else {
                System.out.println("Libro no reconocido.");
            }

            System.out.println("\nLibros actualizados:");
            Libro_IT.mostrarInfo();
            Libro_REDRUM.mostrarInfo();
        } else {
            System.out.println("No se realizaron cambios.");
        }

        sc.close();

    }
}
