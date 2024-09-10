/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vistas.VistaProductos;

/**
 *
 * @author moise
 */
public class ControladorProductos {
    public static VistaProductos vista= new VistaProductos();
     
        public static void mostrar() {
        System.out.println("Mostrar");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
}
