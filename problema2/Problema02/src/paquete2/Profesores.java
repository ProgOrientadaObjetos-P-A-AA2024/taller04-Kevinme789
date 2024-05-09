/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author kevin
 */
public class Profesores {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private int cedula;

    public Profesores(String n, String a, int c, double s) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldoBasico = s;
    }

    public Profesores(int c, double s) {
        nombre = "Julio";
        apellido = "Ordoñez";
        cedula = c;
        sueldoBasico = s;
    }

    public void establecerSueldoBasico(double x) {
        sueldoBasico = x;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerApellido(String x) {
        apellido = x;
    }

    public void establecerSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    }

    public void establecerCedula(int x) {
        cedula = x;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenersueldoTotal() {
        return sueldoTotal;
    }

    public int obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\nApellido: %s\n"
                + "Cedula: %d\n"
                + "Sueldo Basico: %.2f\nSueldo Total: %.2f\n", nombre, apellido,
                cedula, sueldoBasico, sueldoTotal);
        return cadena;
    }
}
