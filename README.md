# 💾 Bits and Bytes

**Fundamentos de ingeniería de software en C#, Java y Kotlin**: aplicaciones de escritorio con arquitectura en capas, acceso a bases de datos con procedimientos almacenados, programación orientada a objetos y **8 ejercicios de Java para datos con pruebas automáticas**.

[![ejercicios](https://github.com/SalmeronDevZone/bits-and-bytes/actions/workflows/ejercicios.yml/badge.svg)](https://github.com/SalmeronDevZone/bits-and-bytes/actions/workflows/ejercicios.yml)
![C#](https://img.shields.io/badge/C%23-.NET%20Framework%204.7.2-512BD4?logo=dotnet&logoColor=white)
![Java](https://img.shields.io/badge/Java-25-ED8B00?logo=openjdk&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?logo=kotlin&logoColor=white)

## Proyectos

| Proyecto | Qué es | Lo interesante |
| --- | --- | --- |
| [**CRUD con SQL Server**](C%23/CRUD/) | Gestión de productos (alta, consulta, modificación y baja) en Windows Forms | Arquitectura en **tres capas** (Datos, Entidades, Presentación), **procedimientos almacenados**, singleton de conexión e informes RDLC |
| [**Magic Bank**](C%23/BasicProjects/MagicBank/) | Simulador de banco: préstamos, depósitos y saldo | Cálculo de intereses según las condiciones, validación de formularios |
| [**C# básico**](C%23/SimpleSamples/Basic/) | Ejercicios básicos e intermedios de C# y .NET | Primeros pasos con el lenguaje |
| [**Java (LinkiaFP)**](JAVA/BasicTraining/LinkiaFP/) | Prácticas del ciclo formativo | POO, herencia, colecciones, una tienda online y un **CRUD con JDBC y MySQL** |
| [**Kotlin**](KOTLIN/SimpleSamples/) | Ejemplos de clases | Herencia con `open class`, propiedades y métodos |

## Ejercicios: Java para datos

```bash
cd ejercicios/java
java Pruebas.java        # Java 22+: sin Maven ni Gradle
```

Contar palabras con Unicode, validar emails, un **parser de CSV** con comillas, agregaciones con streams, top-N, fusión de intervalos, deduplicación por versión y media móvil en una sola pasada. Detalles en [`ejercicios/`](ejercicios/README.md).

## Abrir los proyectos de C#

Los proyectos de C# usan **.NET Framework 4.7.2** y Windows Forms: ábrelos con Visual Studio en Windows (`.sln` o `.csproj`). El CRUD necesita SQL Server: crea las tablas con `Script_Tablas.sql`, los procedimientos con `Procedimientos_almacenados.sql` y pon tu servidor y tus credenciales en `App.config`. Nunca subas credenciales reales al repositorio.

Las carpetas `bin/`, `obj/` y `.vs/` se generan al compilar y no se versionan (ver [`.gitignore`](.gitignore)).

---

**Jesús Salmerón** · [GitHub](https://github.com/SalmeronDevZone) · [LinkedIn](https://www.linkedin.com/in/jesussalmeronarmario/) · Licencia MIT
