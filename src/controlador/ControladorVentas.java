
package controlador;

import vistas.VistaVentas;


public class ControladorVentas {
    
    public static VistaVentas vista= new VistaVentas();
     
        public static void mostrar() {
        System.out.println("Mostrar");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
