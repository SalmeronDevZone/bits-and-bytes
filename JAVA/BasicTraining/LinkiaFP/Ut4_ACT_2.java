package ut4;


public class Act2 {


    static class CuentaBancaria {
        private String titular;
        private double saldo;


        public CuentaBancaria(String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        public void depositar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                System.out.println("Ha ingresado: " + saldo + "€.");
            } else {
                System.out.println("ERROR, Eligió INGRESO.");
            }
        }


        public void retirar(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
            } else {
                System.out.println("Fondos insuficientes o cantidad inválida.");
            }
        }


        public void consultarSaldo() {
            System.out.println("Saldo actual de " + titular + ": " + saldo);
        }
    }


    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 500.0);

        cuenta1.consultarSaldo();
        cuenta1.depositar(200);
        cuenta1.retirar(100);
        cuenta1.retirar(700);
    }
}
