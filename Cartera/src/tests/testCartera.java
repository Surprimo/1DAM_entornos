package tests;

import clases.Cuenta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*1. Creación de cuentas.
        ◦ Las cuentas siempre se crean con saldo 0. Hay que hacer algún ingreso después si se quiere tener saldo:
        Al crear cuenta el saldo es cero
        2. Ingresos.
        1. Suman la cantidad ingresada al saldo.
        2. No hay comisiones ni nada por el estilo.
        1. Al ingresar 100 en cuenta vacía el saldo es 100
        2. Al ingresar 3000 en cuenta vacía el saldo es 3000
        3. Al ingresar 3000 en cuenta con 100 el saldo es 3100
        3. No se pueden hacer ingresos negativos
        1. Al ingresar -100 en cuenta vacía, el saldo sigue siendo 0
        4. Los ingresos admiten un máximo de 2 decimales de precisión
        1. Si ingreso 100.45 en una cuenta vacía, el saldo es de 100.45
        5. La cantidad máxima que se puede ingresar es de 6000
        1. Si ingreso 6000.00 en una cuenta vacía, el saldo es de 6000.00
        Si ingreso 6000.01 en una cuenta vacía, el saldo es de 0
        3. Retiradas.
        1. Restan la cantidad ingresada al saldo.
        2. No hay comisiones ni nada por el estilo.
        1. Al retirar 100 en cuenta con 500 el saldo es 400
        3. No se puede retirar una cantidad mayor a la del saldo disponible
        1. Si retiro 500 en cuenta con 200 no ocurre nada y el saldo sigue siendo 200
        4. No se pueden retirar cantidades negativas
        1. Si retiro -100 en cuenta con 500 no ocurre nada y el saldo sigue siendo 500
        5. Las cantidades admiten un máximo de 2 decimales de precisión
        1. Al retirar 100.45 en cuenta con 500 el saldo es 399.55
        6. La cantidad máxima que se puede retirar es de 6000
        1. Si retiro 6000.00 en una cuenta con 7000, el saldo es de 1000
        Si retiro 6000.01 en una cuenta con 7000, no ocurre nada y el saldo sigue siendo 7000
        4. Transferencias
        •Al hacer una transferencia de 100 desde una cuenta con 500 a una con 50, en la
        primera cuenta el saldo se quedará en 400 y en la segunda se quedará en 150.
        •No se pueden transferir cantidades negativas
        •Al hacer una transferencia de -100 desde una cuenta con 500 a una con 50, los
        saldos se quedan en 500 y 50 respectivamente
        •El límite de cantidad transferida es de 3000:
        •Al hacer una transferencia de 3000 desde una cuenta con 3500 a una con 50, en la primera
        cuenta el saldo se quedará en 500 y en la segunda se quedará en 3050.
        •Al hacer una transferencia de 3000.01 desde una cuenta con 3500 a una con 50, en la
        primera cuenta el saldo se quedará en 3500 y en la segunda se quedará en 50.
*/
public class testCartera {
    @Test
    public void testAlCrearUnaCuentaElSaldoEsCero(){
        Cuenta c1=new Cuenta();
        assertEquals(0,c1.getSaldo());
    }
    @Test
    public void testAlIngresar100EnCuentaVaciaElSaldoEs100(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(100);
        assertEquals(100,c1.getSaldo());
    }
    @Test
    public void testAlIngresar3000EnCuentaVaciaElSaldoEs3000(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(3000);
        assertEquals(3000,c1.getSaldo());
    }
    @Test
    public void testAlIngresar3000EnCuentaCon100ElSaldoEs3100(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(100);
        c1.ingresar(3000);
        assertEquals(3100,c1.getSaldo());
    }
    @Test
    public void testAlIngresarMenos100EnCuentaVaciaElSaldoEs0(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(-100);
        assertEquals(0,c1.getSaldo());
    }
    @Test
    public void testAlIngresarPuedeTener2Decimales(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(100.45);
        assertEquals(100.45,c1.getSaldo());
    }
    @Test
    public void testAlIngresar100coma45EnUnaCuentaVacia(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(100.45);
        assertEquals(100.45,c1.getSaldo());
    }
    @Test
    void testIngresoMaximoEsDe6000(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(6000);
        assertEquals(6000,c1.getSaldo());
    }
    @Test
    void testIngresoMasDe6000NoEsValido(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(6000.01);
        assertEquals(0,c1.getSaldo());
    }
    @Test
    void testRetirar(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(100.0);
        c1.retirar(50.0);
        assertEquals(50.0,c1.getSaldo());
    }
    @Test
    void testRetirar100Cuenta500(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(500.0);
        c1.retirar(100.0);
        assertEquals(400.0,c1.getSaldo());
    }
    @Test
    void testRetirar500Cuenta200(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(200.0);
        c1.retirar(500.0);
        assertEquals(200.0,c1.getSaldo());
    }
    @Test
    void testRetirarMenos100Cuenta500(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(500.0);
        c1.retirar(-100.0);
        assertEquals(500.0,c1.getSaldo());
    }
    @Test
    void testRetirarMenos100Coma45Cuenta500(){
        Cuenta c1 = new Cuenta();
        c1.ingresar(500.0);
        c1.retirar(100.45);
        assertEquals(399.55,c1.getSaldo());
    }
    @Test
    void testRetirarMenos6000Cuenta7000(){
        Cuenta c1 = new Cuenta(7000);
        c1.retirar(6000.0);
        assertEquals(1000.00,c1.getSaldo());
    }
    @Test
    void testRetirarMenos6001Cuenta7000(){
        Cuenta c1 = new Cuenta(7000);
        c1.retirar(6001.0);
        assertEquals(7000.00,c1.getSaldo());
    }
    @Test
    void testTransferencia100(){
        Cuenta c1 = new Cuenta(500);
        Cuenta c2 = new Cuenta(50);
        c1.transferencia(c2, 100);
        assertEquals(400.00,c1.getSaldo());
        assertEquals(150.00,c2.getSaldo());
    }
    @Test
    void testTransferenciaMenos100(){
        Cuenta c1 = new Cuenta(500);
        Cuenta c2 = new Cuenta(50);
        c1.transferencia(c2, -100);
        assertEquals(500.00,c1.getSaldo());
        assertEquals(50.00,c2.getSaldo());
    }
    @Test
    void testTransferencia3000(){
        Cuenta c1 = new Cuenta(3500);
        Cuenta c2 = new Cuenta(50);
        c1.transferencia(c2, 3000);
        assertEquals(500.00,c1.getSaldo());
        assertEquals(3050.00,c2.getSaldo());
    }
    @Test
    void testTransferencia3001(){
        Cuenta c1 = new Cuenta(3500);
        Cuenta c2 = new Cuenta(50);
        c1.transferencia(c2, 3001);
        assertEquals(3500.00,c1.getSaldo());
        assertEquals(50.00,c2.getSaldo());
    }
}
