/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.LibretaNotas;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {
        LibretaNotas libreta1 = new LibretaNotas("Kevin Robles", 10, 7, 8);
        libreta1.establecerPromedio();
        LibretaNotas libreta2 = new LibretaNotas("Mateo Granda", 5, 5);
        libreta2.establecerPromedio();
        System.out.printf("%s", libreta1);
        System.out.printf("%s", libreta2);
    }
}
