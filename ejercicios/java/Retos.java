import java.util.List;
import java.util.Map;

/** Los 8 retos. Ejercicios.java (tu versión) y Soluciones.java (la de referencia) los implementan. */
public interface Retos {

    record Venta(String categoria, double importe) {}

    record Registro(String id, String estado, long modificado) {}

    Map<String, Integer> contarPalabras(String texto);

    String normalizarEmail(String email);

    List<String> parsearLineaCsv(String linea);

    Map<String, Double> mediaPorCategoria(List<Venta> ventas);

    List<String> topN(Map<String, Integer> conteos, int n);

    List<int[]> fusionarIntervalos(List<int[]> intervalos);

    List<Registro> ultimaVersion(List<Registro> registros);

    double[] mediaMovil(double[] valores, int ventana);
}
