/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Automotor;

/**
 *
 * @author kevin
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automotor automotor1 = new Automotor(1105251746, "Mazda", 2006, 10000);
        automotor1.establecerValorMat();
        Automotor automotor2 = new Automotor(1104110272, "Toyota");
        automotor2.establecerValorMat();
        System.out.printf("%s", automotor1);
        System.out.println();
        System.out.printf("%s", automotor2);
    }

}
