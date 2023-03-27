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
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
