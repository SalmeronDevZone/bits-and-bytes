package ut4;


public class Act4 {

    static class Vehiculo {
        String marca;
        String modelo;
        int anio;

        Vehiculo(String marca, String modelo, int anio) {
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
        }

        void mostrarInfo() {
            System.out.println(anio + " " + marca + " " + modelo);
        }
    }


    static class Coche extends Vehiculo {
        String tipoCombustible;

        Coche(String marca, String modelo, int anio, String tipoCombustible) {
            super(marca, modelo, anio);
            this.tipoCombustible = tipoCombustible;
        }

        void mostrarInfoCoche() {
            System.out.println(anio + " " + marca + " " + modelo + " - Combustible: " + tipoCombustible);
        }
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Ford", "Mustang", 1969, "Gasolina");
        coche1.mostrarInfoCoche();
    }
}
