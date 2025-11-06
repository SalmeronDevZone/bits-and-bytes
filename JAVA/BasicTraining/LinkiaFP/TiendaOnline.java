import java.util.*;

class Producto {

    private String nombre;
    private int cantidad;
    private double precio;

    private static int contadorProductos = 0;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre.toUpperCase();
        this.cantidad = cantidad;
        this.precio = precio;
        contadorProductos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println(" Producto: " + nombre + " --- Cantidad: " + cantidad + " --- Precio: " + precio + "€.");
    }

    public static void mostrarTotalProductos() {
        System.out.println("Total de productos creados: " + contadorProductos);
    }
}


class Almacen {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado correctamente: " + p.getNombre());
    }

    public void eliminarProducto(String nombre) {
        boolean encontrado = false;

        nombre = nombre.toUpperCase();

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equals(nombre)) {
                productos.remove(i);
                System.out.println("Producto eliminado: " + nombre);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el producto con nombre: " + nombre);
        }
    }

    public Producto buscarProducto(String nombre) {

        nombre = nombre.toUpperCase();
        for (Producto p : productos) {
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el almacén.");
        } else {
            System.out.println("Lista de productos en el almacén:");
            for (Producto p : productos) {
                p.mostrarInfo();
            }
        }
    }
}

// MAIN
public class TiendaOnline {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Almacen almacen = new Almacen();
        int opcion = -1;

        do {
            System.out.println("\n---------------- SISTEMA DE GESTIÓN DE INVENTARIO ----------------");
            System.out.println(" 1 - Añadir producto");
            System.out.println(" 2 - Eliminar producto");
            System.out.println(" 3 - Buscar producto");
            System.out.println(" 4 - Mostrar todos los productos");
            System.out.println(" 5 - Mostrar total de productos creados (método estático)");
            System.out.println(" 0 - Salir");
            System.out.print("Elige una opción: ");


            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Debes ingresar un número, no texto.");
                sc.nextLine();
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    Producto nuevo = new Producto(nombre, cantidad, precio);
                    almacen.agregarProducto(nuevo);
                    break;

                case 2:
                    System.out.print("Nombre del producto a eliminar: ");
                    String eliminar = sc.nextLine();
                    almacen.eliminarProducto(eliminar);
                    break;

                case 3:
                    System.out.print("Nombre del producto a buscar: ");
                    String buscar = sc.nextLine();
                    Producto encontrado = almacen.buscarProducto(buscar);
                    if (encontrado != null) {
                        System.out.println("Producto encontrado:");
                        encontrado.mostrarInfo();
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    almacen.mostrarProductos();
                    break;

                case 5:
                    Producto.mostrarTotalProductos();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
