package controlador;

import vistas.VistaSistema;

public class ControladorSistema {

    public static VistaSistema vista = new VistaSistema();

    public static void mostrar() {
        System.out.println("Mostrar");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    public static void iniciarLogin(){
        ControladorLogin.mostrar();
        System.out.println("Iniciar login");
    }

    public static void iniciarVentas() {
        System.out.println("Inica Ventas desde el controlador");
        ControladorVentas.mostrar();
    }

    public static void iniciarUsuarios() {
        System.out.println("Inicar Usuarios desde el controlador");
        ControladorUsuarios.mostrar();
    }

    public static void iniciarBitacora() {
        System.out.println("Inicar Bitacoras desde el controlador");
        ControladorBitacora.mostrar();

    }
    public static void iniciarProductos(){
        System.out.println("Iniciar Productos desde el controlador");
        ControladorProductos.mostrar();
    }
}
