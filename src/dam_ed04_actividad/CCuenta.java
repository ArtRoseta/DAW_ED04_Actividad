/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


public class CCuenta {
    /**
     * Atributos de la clase CCuenta
     * String nombre, String cuenta, Double saldo, Double tipoInterés
     * 
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método constructor sin parámetros de la clase CCuenta
     */
    public CCuenta()
    {
    }
    /**
     * Método constructor de la clase CCuenta con parámetros
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        /**
         * Inicializamos la variables mediante sus métodos Setter
         * setNombre, setCuenta, setSaldo, setTipoInterés
         */
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInterés(tipo);
    }
    /**
     * Método asignarNombre, recibe un parámetro de tipo String que hace
     * referencia al nombre
     * @param nom 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método obtenerNombre, nos devuelve un dato de tipo String, en éste caso
     * hace nos devuelve el nombre.
     * @return getNombre()
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método estado, nos devuelve un dato de tipo double.
     * En éste caso nos devuelve el saldo.
     * @return 
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Método ingresar, es el método que se encarga de hacer la operación
     * de ingresar el dinero en la cuenta.
     * Recibe un parámetro de tipo double que hace referencia a la cantidad.
     * Nos devuelve una excepción si intentamos pasar un número negativo.
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método retirar, es el método que se encarga de hacer la operación de 
     * retirar el dinero de la cuenta.
     * Recibe un parámetro de tipo double que hace referencia a la cantidad que 
     * se va a retirar.
     * Nos devuelve una excepción e caso de querer retirar una cantidad negativa
     * y nos devuelve otra excepción si no hay suficiente saldo.
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método obtener cuenta, nos devuelve un dato de tipo String.
     * Llama a el método getCuenta.
     * @return getCuenta()
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Método getNombre, retorna un dato de tipo String que hace referencia al nombre.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre, recibe cómo parámetro un dato de tipo String.
     * Inicializa la variable nombre con el valor del parametro que se le pase.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getTipoInterés, nos devuelve un dato de tipo double.
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método setTipoInterés, recibe cómo parámetro un dato de tipo double.
     * Inicializa la variable tipoInterés.
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    /**
     * Método getCuenta, nos devuelve un dato de tipo String.
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método setCuenta, recibe cómo parámetro un dato de tipo String.
     * Inicializa la variable cuenta.
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Método getSaldo, nos devuelve un dato de tipo double.
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método setSaldo, recibe cómo parámetro un dato de tipo dobule.
     * Inicializa la variable saldo.
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
