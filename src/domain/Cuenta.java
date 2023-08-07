package domain;

public class Cuenta {
    public Integer cuenta;
    public String nombre;
    public double saldo;

    public Cuenta() {
    }

    public Cuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

    public Cuenta(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta(Integer cuenta, String nombre, double saldo) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return  cuenta + "  " + nombre + "  " + saldo;
    }
    
    
}
