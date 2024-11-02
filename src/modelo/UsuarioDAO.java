package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    Connection conexion;
    String query;
    PreparedStatement preparedStatement;
    ResultSet resultSet;    
    
    public UsuarioDAO(){
        conexion = new Conexion().getConection();
    }
    
    public Usuario getUsuarioById(int id){
        var usuario = new Usuario();
        try{
            query = "SELECT id, usuario FROM usuarios where id=?;";
            preparedStatement=conexion.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                usuario.setId(resultSet.getInt(1));
                usuario.setUsuario(resultSet.getString(2));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return usuario;
    }

    public void registrar(Usuario usuario) {
        
    }
    
}
