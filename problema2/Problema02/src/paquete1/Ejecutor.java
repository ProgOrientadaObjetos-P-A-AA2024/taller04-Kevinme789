/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Profesores;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Profesores profesor1 = new Profesores("Franco", "Aguilar", 1105749223,
                950.50);
        profesor1.establecerSueldoTotal();
        Profesores profesor2 = new Profesores(1102317683, 1500);
        profesor2.establecerSueldoTotal();
        System.out.printf("%s", profesor1);
        System.out.printf("%s", profesor2);
    }

}
