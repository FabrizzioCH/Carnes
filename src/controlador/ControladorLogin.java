/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vistas.VistaLogin;

/**
 *
 * @author neto-
 */
public class ControladorLogin {
    public static VistaLogin vista= new VistaLogin();
     
        public static void mostrar() {
        System.out.println("Mostrar");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    public static void login() {
        var nombreUsuario = vista.getTextLoginUsername().getText().trim();
        var passwordUsuario = vista.getTextLoginPassword().getText().trim();
        System.out.println("Usuario: "+nombreUsuario+"\nContraseña: "+passwordUsuario);
    }
}
