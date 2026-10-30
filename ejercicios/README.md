# Java para datos: 8 ejercicios

Problemas clásicos del tratamiento de datos resueltos en Java moderno (records, streams, `Collectors`). No hace falta Maven ni Gradle: desde Java 22, `java` compila y ejecuta los ficheros fuente directamente.

```bash
cd ejercicios/java
# Completa los métodos de Ejercicios.java y comprueba:
java Pruebas.java
```

```
OK         1 contarPalabras
FALLO      3 parsearLineaCsv -> se esperaba [a, b, ] y se obtuvo [a, b]
PENDIENTE  8 mediaMovil
```

| # | Método | Nivel | Qué practicas |
| --- | --- | --- | --- |
| 1 | `contarPalabras` | 🟢 | Expresiones regulares Unicode (`\P{L}`), `Map.merge`, `TreeMap` |
| 2 | `normalizarEmail` | 🟢 | Limpieza y validación de entradas |
| 3 | `parsearLineaCsv` | 🟡 | Un parser de verdad: comillas, comas dentro de campos, `""` escapadas |
| 4 | `mediaPorCategoria` | 🟡 | `Collectors.groupingBy` + `averagingDouble` |
| 5 | `topN` | 🟡 | Ordenación con comparadores encadenados |
| 6 | `fusionarIntervalos` | 🟡 | Fusionar ventanas de tiempo o rangos solapados sin mutar la entrada |
| 7 | `ultimaVersion` | 🟡 | Deduplicación: la versión más reciente de cada registro |
| 8 | `mediaMovil` | 🔴 | Ventana deslizante en una sola pasada |

- [`Retos.java`](java/Retos.java): la interfaz común, con los records `Venta` y `Registro`.
- [`Soluciones.java`](java/Soluciones.java): las soluciones de referencia. Inténtalo antes de mirarlas.
- La CI de GitHub Actions comprueba en cada push que las soluciones pasan las pruebas (`java Pruebas.java --soluciones`).
