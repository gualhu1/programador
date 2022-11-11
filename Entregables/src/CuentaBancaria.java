public class CuentaBancaria {
    public static void main(String[] args) {
        double saldo = 1000.75;
        double cantidadAretirar = 250;
        double saldoActualizado;
        saldoActualizado = saldo - cantidadAretirar;
        double cantidadPorCadaAmigo = saldoActualizado / 3;

        boolean puedeComprar = cantidadAretirar >= 250 ? true : false;



        System.out.println(puedeComprar);
        System.out.println( "Le di a cada amigo " + cantidadPorCadaAmigo);
    }
}
