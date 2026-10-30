import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 * Pruebas de los ejercicios, sin librerías externas.
 *
 *     java Pruebas.java                 prueba tu versión (Ejercicios.java)
 *     java Pruebas.java --soluciones    prueba las soluciones de referencia (lo usa la CI)
 */
public class Pruebas {

    private static int correctos;
    private static int pendientes;
    private static int fallos;

    private static void prueba(String nombre, Runnable cuerpo) {
        try {
            cuerpo.run();
            correctos++;
            System.out.println("OK         " + nombre);
        } catch (UnsupportedOperationException e) {
            pendientes++;
            System.out.println("PENDIENTE  " + nombre);
        } catch (AssertionError | RuntimeException e) {
            fallos++;
            System.out.println("FALLO      " + nombre + " -> " + e.getMessage());
        }
    }

    private static void igual(Object esperado, Object obtenido) {
        if (!Objects.equals(esperado, obtenido)) {
            throw new AssertionError("se esperaba " + esperado + " y se obtuvo " + obtenido);
        }
    }

    private static List<String> texto(List<int[]> intervalos) {
        return intervalos.stream().map(Arrays::toString).toList();
    }

    public static void main(String[] args) {
        boolean soluciones = args.length > 0 && args[0].equals("--soluciones");
        Retos r = soluciones ? new Soluciones() : new Ejercicios();
        System.out.println("Probando " + (soluciones ? "las soluciones de referencia" : "tus ejercicios") + "\n");

        prueba("1 contarPalabras", () -> {
            igual(new TreeMap<>(Map.of("dato", 1, "el", 3, "modelo", 1, "pipeline", 1, "y", 1)),
                    r.contarPalabras("El pipeline, el dato y EL modelo."));
            igual(Map.of("análisis", 2, "fácil", 1), r.contarPalabras("Análisis fácil: ¡análisis!"));
            igual(new TreeMap<>(), r.contarPalabras(" ... "));
        });

        prueba("2 normalizarEmail", () -> {
            igual("ana.torres@ejemplo.com", r.normalizarEmail("  Ana.Torres@Ejemplo.COM "));
            igual(null, r.normalizarEmail("sin-arroba.com"));
            igual(null, r.normalizarEmail("a@b"));
            igual(null, r.normalizarEmail("a@@b.com"));
            igual(null, r.normalizarEmail("a@b."));
            igual(null, r.normalizarEmail(null));
        });

        prueba("3 parsearLineaCsv", () -> {
            igual(List.of("1", "Pérez, Ana", "Dijo \"hola\"", "", "fin"), r.parsearLineaCsv("1,\"Pérez, Ana\",\"Dijo \"\"hola\"\"\",,fin"));
            igual(List.of("a", "b", ""), r.parsearLineaCsv("a,b,"));
            igual(List.of(""), r.parsearLineaCsv(""));
        });

        prueba("4 mediaPorCategoria", () -> {
            List<Retos.Venta> ventas = List.of(new Retos.Venta("Audio", 10), new Retos.Venta("Libros", 20), new Retos.Venta("Audio", 30));
            Map<String, Double> medias = r.mediaPorCategoria(ventas);
            igual(new TreeMap<>(Map.of("Audio", 20.0, "Libros", 20.0)), medias);
            igual(List.of("Audio", "Libros"), new ArrayList<>(medias.keySet()));
            igual(Map.of(), r.mediaPorCategoria(List.of()));
        });

        prueba("5 topN", () -> {
            Map<String, Integer> conteos = Map.of("a", 3, "b", 5, "c", 3, "d", 1);
            igual(List.of("b", "a", "c"), r.topN(conteos, 3));
            igual(List.of("b", "a", "c", "d"), r.topN(conteos, 10));
        });

        prueba("6 fusionarIntervalos", () -> {
            List<int[]> entrada = new ArrayList<>(List.of(new int[] {1, 3}, new int[] {8, 10}, new int[] {2, 6}, new int[] {15, 18}, new int[] {17, 20}, new int[] {6, 7}));
            List<String> antes = texto(entrada);
            igual(List.of("[1, 7]", "[8, 10]", "[15, 20]"), texto(r.fusionarIntervalos(entrada)));
            igual(antes, texto(entrada));
            igual(List.of(), texto(r.fusionarIntervalos(List.of())));
        });

        prueba("7 ultimaVersion", () -> {
            List<Retos.Registro> registros = List.of(
                    new Retos.Registro("2", "cancelado", 2),
                    new Retos.Registro("1", "pendiente", 1),
                    new Retos.Registro("1", "entregado", 3),
                    new Retos.Registro("1", "enviado", 2));
            igual(List.of(new Retos.Registro("1", "entregado", 3), new Retos.Registro("2", "cancelado", 2)), r.ultimaVersion(registros));
        });

        prueba("8 mediaMovil", () -> {
            igual("[2.0, 3.0, 4.0]", Arrays.toString(r.mediaMovil(new double[] {1, 2, 3, 4, 5}, 3)));
            igual("[1.5, 2.5]", Arrays.toString(r.mediaMovil(new double[] {1, 2, 3}, 2)));
            igual("[]", Arrays.toString(r.mediaMovil(new double[] {1, 2}, 5)));
            try {
                r.mediaMovil(new double[] {1}, 0);
                throw new AssertionError("con ventana 0 debería lanzar IllegalArgumentException");
            } catch (IllegalArgumentException esperado) {
                // correcto
            }
        });

        System.out.printf("%n%d correctos · %d pendientes · %d con fallos%n", correctos, pendientes, fallos);
        if (fallos > 0 || (soluciones && pendientes > 0)) {
            System.exit(1);
        }
    }
}
