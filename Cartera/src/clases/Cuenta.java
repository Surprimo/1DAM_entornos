package clases;

public class Cuenta {
    private double saldo;
    public Cuenta() {
        saldo=0.0f;
    }
    public Cuenta(int saldo) {
        this.saldo=saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        if(cantidad <0 || cantidad>6000)
            saldo =0.0f;
        else {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad>0 && cantidad<saldo && cantidad<=6000){
            saldo -= cantidad;
        }

    }

    public void transferencia(Cuenta cuenta, double cantidad) {
        if (cantidad>0 && cantidad<=3000){
            retirar(cantidad);
            cuenta.ingresar(cantidad);
        }
    }
}
