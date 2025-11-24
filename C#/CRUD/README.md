# Aplicación CRUD con SQL Server

Este proyecto es una aplicación de escritorio en C# (.NET) que implementa un sistema **CRUD (Create, Read, Update, Delete)** para la gestión de productos utilizando **SQL Server** como motor de base de datos.

## 🛠️ Funcionalidades principales
- Ingresar productos
- Actualizar productos
- Eliminar productos
- Consultar la lista de productos

La aplicación se conecta a SQL Server mediante procedimientos almacenados con el fin de asegurar seguridad, estabilidad y un manejo adecuado de la información.

## 📄 Reportes (en desarrollo)
La sección de reportes **no está finalizada** debido a un problema de compatibilidad entre versiones del componente ReportViewer y el entorno del proyecto. Esta funcionalidad será completada en futuras actualizaciones.

## 🗂️ Base de datos
Dentro del archivo **info_sql.sql** se incluirán todos los procedimientos almacenados necesarios para el correcto funcionamiento del CRUD, incluyendo:

- `sp_InsertProducto`
- `sp_UpdateProducto`
- `sp_DeleteProducto`
- `sp_GetProductos`
- Otros procedimientos necesarios para la gestión de datos

## ✔️ Requisitos del proyecto
- SQL Server o SQL Server Express  
- Visual Studio  
- .NET Framework / .NET (dependiendo de la versión utilizada en el proyecto)  
- Driver de conexión SQL Server (System.Data.SqlClient o Microsoft.Data.SqlClient)

---

Si quieres agregar una sección de instalación, capturas de pantalla o una guía rápida de uso, puedo ampliarlo sin problema.
