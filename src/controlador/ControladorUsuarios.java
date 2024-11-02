
package controlador;

import modelo.UsuarioDAO;
import modelo.Usuario;
import vistas.VistaUsuarios;

public class ControladorUsuarios {
    public static VistaUsuarios vista= new VistaUsuarios();
     
        public static void mostrar() {
        System.out.println("Mostrar");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
            getUsuarioById(1001);
    }
        
   public static Usuario getUsuarioById(int id){
       return new UsuarioDAO().getUsuarioById(id);
   }

    public static void registrar() {
        var errores = new StringBuilder();
        var usuario = new Usuario();
        if (vista.getTxtUsuariosNombre().getText().trim().length() > 0) {
            usuario.setNombre(vista.getTxtUsuariosNombre().getText().trim());
        } else {
            errores.append("El campo nombre no debe ser vacio");
        }
        if (!vista.getTxtUsuariosApellidoPaterno().getText().trim().equals("")) {
            usuario.setApellidoPaterno(vista.getTxtUsuariosApellidoPaterno().getText().trim());
        } else {
            errores.append("El campo apellido paterno no debe ser vacio");
        }
        if (!vista.getTxtUsuariosApellidoMaterno().getText().trim().equals("")) {
            usuario.setApellidoMaterno(vista.getTxtUsuariosApellidoMaterno().getText());
        } else {
            errores.append("El campo apellido materno no debe ser vacio");
        }
        if (!vista.getTxtUsuariosUsuario().getText().trim().equals("")) {
            usuario.setUsuario(vista.getTxtUsuariosUsuario().getText());
        } else {
            errores.append("El campo usuario no debe ser vacio");
        }
        if (!vista.getTxtUsuariosPassword().getText().trim().equals("")) {
            usuario.setContrasena(vista.getTxtUsuariosPassword().getText());
        } else {
            errores.append("El campo contraseña no debe ser vacio");
        }

        new UsuarioDAO().registrar(usuario);

    }
    
}
