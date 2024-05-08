/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class LibretaNotas {

    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public LibretaNotas(String n, double c1, double c2, double c3) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public LibretaNotas(String n, double c1, double c2) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = 10;
    }

    public void establecerNombreEstudiante(String x) {
        nombreEstudiante = x;
    }

    public void establecerCalificacion1(double x) {
        calificacion1 = x;
    }

    public void establecerCalificacion2(double x) {
        calificacion2 = x;
    }

    public void establecerCalificacion3(double x) {
        calificacion3 = x;
    }

    public void establecerPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Libreta de Calificaciones\n"
                + "Nombre del Estudiante: %s\n"
                + "Calificacion 1: %.3f\n"
                + "Calificacion 2: %.3f\n"
                + "Calificacion 3: %.3f\n"
                + "Promedio: %.3f\n", nombreEstudiante, calificacion1,
                calificacion2, calificacion3, promedio);
        return cadena;
    }
}