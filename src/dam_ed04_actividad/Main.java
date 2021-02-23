/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


public class Main {
    float cantidad;
    
    public static void main(String[] args) {
        Main main = new Main();
        main.operaciones_cuenta(300);
    }
    public void operaciones_cuenta(float cantidad){
        this.cantidad = cantidad;
        
        CCuenta cuentaDAM;
        double saldoActual;

        cuentaDAM = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaDAM.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuentaDAM.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaDAM.ingresar(695);
            System.out.println("Ingreso + cantidad");
            cuentaDAM.ingresar(cantidad);
            System.out.println("El saldo de la cuenta es: "+cuentaDAM.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
