package ut7

public class Act_1 {


    abstract static class Mercedes {
        protected String modelo;
        protected int año;

        public Mercedes(String modelo, int año) {
            this.modelo = modelo;
            this.año = año;
        }

        public abstract double calcularImpuesto();

        public void mostrarInfo() {
            System.out.println("Modelo Mercedes: " + modelo + " | Año: " + año);
        }
    }

    static class Coche extends Mercedes {

        public Coche(String modelo, int año) {
            super(modelo, año);
        }

        @Override
        public double calcularImpuesto() {
            int edad = 2025 - año;

            if (edad <= 5) return 100;
            else if (edad <= 10) return 150;
            else if (edad <= 15) return 200;
            else return 350;
        }
    }


    static class Moto extends Mercedes {

        public Moto(String modelo, int año) {
            super(modelo, año);
        }

        @Override
        public double calcularImpuesto() {
            int edad = 2025 - año;

            if (edad <= 5) return 80;
            else if (edad <= 10) return 120;
            else if (edad <= 15) return 150;
            else return 200;
        }
    }


    public static void main(String[] args) {


        Mercedes coche1 = new Coche("C-Class W206 'Nebula Edition'", 2022);
        Mercedes coche2 = new Coche("AMG GT R 'ShadowBreak'", 2018);


        Mercedes moto1 = new Moto("Mercedes HyperCycle X-9 'StarFury'", 2023);
        Mercedes moto2 = new Moto("Mercedes AeroBlade S7 'Quantum Dash'", 2015);


        imprimirDatos(coche1);
        imprimirDatos(coche2);
        imprimirDatos(moto1);
        imprimirDatos(moto2);
    }

    private static void imprimirDatos(Mercedes v) {
        v.mostrarInfo();
        System.out.println("────────────────────────────────────────────────────────────────────────────");
        System.out.println("Tasa IMPOSITIVA: " + v.calcularImpuesto() + "€");
        System.out.println("────────────────────────────────────────────────────────────────────────────");
    }
}
