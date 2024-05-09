/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author kevin
 */
public class Cheques {

    private String nombreCliente;
    private String nombreBanco;
    private double valor;
    private double comision;

    public Cheques(String c, String m, double a) {
        nombreCliente = c;
        nombreBanco = m;
        valor = a;
    }

    public Cheques(String c, String m) {
        nombreCliente = c;
        nombreBanco = m;
        valor = 10000;
    }

    public void establecerNombreCliente(String c) {
        nombreCliente = c;
    }

    public void establecerNombreBanco(String m) {
        nombreBanco = m;
    }

    public void establecerValor(double n) {
        valor = n;
    }

    public void establecerComision() {
        comision = valor * 0.00003;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del cliente: %s\nNombre del banco: "
                + "%s\nValor del cheque: %.2f\nComision: %.2f\n",
                 nombreCliente, nombreBanco, valor, comision);
        return cadena;
    }

}
