/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vistas.VistaBitacora;

/**
 *
 * @author moise
 */
public class ControladorBitacora {
    public static VistaBitacora vista= new VistaBitacora();
     
        public static void mostrar() {
        System.out.println("Mostrar");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
