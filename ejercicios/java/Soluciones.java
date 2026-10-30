import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/** Soluciones de referencia. Inténtalo antes de mirarlas. */
public class Soluciones implements Retos {

    @Override
    public Map<String, Integer> contarPalabras(String texto) {
        Map<String, Integer> conteo = new TreeMap<>();
        for (String palabra : texto.toLowerCase().split("\\P{L}+")) {
            if (!palabra.isEmpty()) {
                conteo.merge(palabra, 1, Integer::sum);
            }
        }
        return conteo;
    }

    @Override
    public String normalizarEmail(String email) {
        if (email == null) {
            return null;
        }
        String limpio = email.trim().toLowerCase();
        return limpio.matches("[^@\\s]+@[^@\\s]+\\.[^@\\s.]+") ? limpio : null;
    }

    @Override
    public List<String> parsearLineaCsv(String linea) {
        List<String> campos = new ArrayList<>();
        StringBuilder actual = new StringBuilder();
        boolean entreComillas = false;
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            if (entreComillas) {
                if (c == '"' && i + 1 < linea.length() && linea.charAt(i + 1) == '"') {
                    actual.append('"');
                    i++;
                } else if (c == '"') {
                    entreComillas = false;
                } else {
                    actual.append(c);
                }
            } else if (c == '"') {
                entreComillas = true;
            } else if (c == ',') {
                campos.add(actual.toString());
                actual.setLength(0);
            } else {
                actual.append(c);
            }
        }
        campos.add(actual.toString());
        return campos;
    }

    @Override
    public Map<String, Double> mediaPorCategoria(List<Venta> ventas) {
        return ventas.stream()
                .collect(Collectors.groupingBy(Venta::categoria, TreeMap::new, Collectors.averagingDouble(Venta::importe)));
    }

    @Override
    public List<String> topN(Map<String, Integer> conteos, int n) {
        return conteos.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .limit(n)
                .map(Map.Entry::getKey)
                .toList();
    }

    @Override
    public List<int[]> fusionarIntervalos(List<int[]> intervalos) {
        List<int[]> ordenados = new ArrayList<>(intervalos);
        ordenados.sort(Comparator.comparingInt(a -> a[0]));
        List<int[]> resultado = new ArrayList<>();
        for (int[] intervalo : ordenados) {
            int[] ultimo = resultado.isEmpty() ? null : resultado.get(resultado.size() - 1);
            if (ultimo != null && intervalo[0] <= ultimo[1]) {
                ultimo[1] = Math.max(ultimo[1], intervalo[1]);
            } else {
                resultado.add(new int[] {intervalo[0], intervalo[1]});
            }
        }
        return resultado;
    }

    @Override
    public List<Registro> ultimaVersion(List<Registro> registros) {
        Map<String, Registro> ultimos = new HashMap<>();
        for (Registro r : registros) {
            ultimos.merge(r.id(), r, (actual, nuevo) -> nuevo.modificado() >= actual.modificado() ? nuevo : actual);
        }
        return ultimos.values().stream().sorted(Comparator.comparing(Registro::id)).toList();
    }

    @Override
    public double[] mediaMovil(double[] valores, int ventana) {
        if (ventana < 1) {
            throw new IllegalArgumentException("la ventana debe ser al menos 1");
        }
        if (ventana > valores.length) {
            return new double[0];
        }
        double[] medias = new double[valores.length - ventana + 1];
        double suma = 0;
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
            if (i >= ventana) {
                suma -= valores[i - ventana];
            }
            if (i >= ventana - 1) {
                medias[i - ventana + 1] = suma / ventana;
            }
        }
        return medias;
    }
}
