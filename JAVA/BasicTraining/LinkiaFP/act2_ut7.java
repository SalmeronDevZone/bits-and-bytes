package ut7

public class ACT_2 {


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
            return "[Mercedes " + modelo + " - Año " + año + "]";
        }
    }


    static class Coche extends Mercedes {

        public Coche(String modelo, int año) {
            super(modelo, año);
        }

        @Override
        public double calcularImpuesto() {
            int edad = 2025 - año;

            if (edad <= 5) return 180;
            else if (edad <= 10) return 200;
            else if (edad <= 15) return 250;
            else return 350;
        }

        @Override
        public String toString() {
            return "Coche Mercedes '" + modelo + "' (" + año + ") → Tasa: "
                    + calcularImpuesto() + "€";
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

        @Override
        public String toString() {
            return "Moto Mercedes '" + modelo + "' (" + año + ") → Tasa: " + calcularImpuesto() + "€";
        }
    }


    public static void main(String[] args) {


        Mercedes coche1 = new Coche("C-Class W206 'Nebula Edition'", 2022);
        Mercedes coche2 = new Coche("AMG GT R 'ShadowBreak'", 2018);

        Mercedes moto1 = new Moto("HyperCycle X-9 'StarFury'", 2023);
        Mercedes moto2 = new Moto("AeroBlade S7 'Quantum Dash'", 2015);

        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(moto1);
        System.out.println(moto2);
    }
}
