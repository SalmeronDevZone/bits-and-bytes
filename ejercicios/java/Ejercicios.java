import java.util.List;
import java.util.Map;

/**
 * Java para datos: 8 ejercicios. Completa cada método y comprueba con:
 *
 *     java Pruebas.java
 *
 * (Java 22 o superior: compila y ejecuta sin Maven ni Gradle). Los métodos que sigan lanzando
 * UnsupportedOperationException salen como PENDIENTE.
 */
public class Ejercicios implements Retos {

    /**
     * 1 · Fácil. Frecuencia de cada palabra, en minúsculas y ordenadas alfabéticamente (TreeMap).
     * Una palabra es una secuencia de letras (incluidas las acentuadas).
     * "El dato, el modelo" -> {dato=1, el=2, modelo=1}
     */
    @Override
    public Map<String, Integer> contarPalabras(String texto) {
        throw new UnsupportedOperationException();
    }

    /**
     * 2 · Fácil. Email en minúsculas y sin espacios alrededor, o null si no es válido:
     * exactamente una '@', algo antes, y un dominio con al menos un punto que no esté al final.
     * "  Ana.Torres@Ejemplo.COM " -> "ana.torres@ejemplo.com"     "a@b" -> null     null -> null
     */
    @Override
    public String normalizarEmail(String email) {
        throw new UnsupportedOperationException();
    }

    /**
     * 3 · Medio. Separa una línea CSV respetando las comillas: dentro de un campo entre comillas
     * la coma no separa, y "" representa una comilla. Los campos vacíos se conservan.
     * 1,"Pérez, Ana","Dijo ""hola""",,fin -> [1, Pérez, Ana, Dijo "hola", , fin]
     */
    @Override
    public List<String> parsearLineaCsv(String linea) {
        throw new UnsupportedOperationException();
    }

    /** 4 · Medio. Importe medio por categoría, ordenado por categoría. Pista: Collectors.groupingBy. */
    @Override
    public Map<String, Double> mediaPorCategoria(List<Venta> ventas) {
        throw new UnsupportedOperationException();
    }

    /**
     * 5 · Medio. Las n claves con más apariciones, de mayor a menor. En caso de empate, en orden
     * alfabético. Si n es mayor que el número de claves, devuelve todas.
     */
    @Override
    public List<String> topN(Map<String, Integer> conteos, int n) {
        throw new UnsupportedOperationException();
    }

    /**
     * 6 · Medio. Fusiona intervalos [inicio, fin] que se solapan o se tocan (ventanas de tiempo,
     * rangos de IDs...) y devuélvelos ordenados por inicio. No modifiques la lista de entrada.
     * [1,3] [8,10] [2,6] [6,7] -> [1,7] [8,10]
     */
    @Override
    public List<int[]> fusionarIntervalos(List<int[]> intervalos) {
        throw new UnsupportedOperationException();
    }

    /**
     * 7 · Medio. Para cada id, el registro con el mayor 'modificado' (la versión más reciente).
     * Devuelve la lista ordenada por id.
     */
    @Override
    public List<Registro> ultimaVersion(List<Registro> registros) {
        throw new UnsupportedOperationException();
    }

    /**
     * 8 · Difícil. Media móvil: la media de cada bloque de 'ventana' valores consecutivos, en una sola
     * pasada (suma deslizante, sin recalcular cada bloque). Si la ventana es mayor que el número de
     * valores, array vacío. IllegalArgumentException si ventana < 1.
     * [1, 2, 3, 4, 5] con ventana 3 -> [2.0, 3.0, 4.0]
     */
    @Override
    public double[] mediaMovil(double[] valores, int ventana) {
        throw new UnsupportedOperationException();
    }
}
