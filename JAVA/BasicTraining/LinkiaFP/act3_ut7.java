package act7

import java.util.ArrayList;

public class Act_3 {

    abstract static class Mercedes {
        protected String modelo;
        protected int año;

        public Mercedes(String modelo, int año) {
            this.modelo = modelo;
            this.año = año;
        }

        public abstract double calcularImpuesto();

        @Override
        public String toString() {
            return "Mercedes " + modelo + " (" + año + ")";
        }
    }


    interface Electrico {
        void cargarBateria();
    }


    static class Coche extends Mercedes {

        public Coche(String modelo, int año) {
            super(modelo, año);
        }

        @Override
        public double calcularImpuesto() {
            int edad = 2025 - año;
            if (edad <= 5) return 350;
            else if (edad <= 10) return 250;
            else if (edad <= 15) return 150;
            else return 100;
        }

        @Override
        public String toString() {
            return "Coche '" + modelo + "' (" + año + ") | Impuesto: " + calcularImpuesto() + "€";
        }
    }


    static class CocheElectrico extends Coche implements Electrico {

        public CocheElectrico(String modelo, int año) {
            super(modelo, año);
        }

        @Override
        public void cargarBateria() {
            System.out.println("El coche eléctrico '" + modelo + "' está cargando su batería... 100% Batería lista..");
        }

        @Override
        public String toString() {
            return "Coche Eléctrico '" + modelo + "' (" + año + ") | Impuesto: " + calcularImpuesto() + "€";
        }
    }


    static class Moto extends Mercedes {

        public Moto(String modelo, int año) {
            super(modelo, año);
        }

        @Override
        public double calcularImpuesto() {
            int edad = 2025 - año;
            if (edad <= 5) return 200;
            else if (edad <= 10) return 150;
            else if (edad <= 15) return 120;
            else return 80;
        }

        @Override
        public String toString() {
            return "Moto '" + modelo + "' (" + año + ") | Impuesto: " + calcularImpuesto() + "€";
        }
    }

    public static void main(String[] args) {

        ArrayList<Mercedes> lista = new ArrayList<>();

        lista.add(new Coche("C-Class W206 'Nebula Edition'", 2022));
        lista.add(new Moto("AeroBlade S7 'Quantum Dash'", 2015));
        lista.add(new CocheElectrico("EQX-900 'Photon Strike'", 2024));

        System.out.println("📦 LISTA DE VEHÍCULOS (Polimorfismo activado)");
        System.out.println("──────────────────────────────────────────────");

        for (Mercedes v : lista) {
            System.out.println(v);

            if (v instanceof Electrico) {
                ((Electrico) v).cargarBateria();
            }

            System.out.println("──────────────────────────────────────────────");
        }
    }
}
