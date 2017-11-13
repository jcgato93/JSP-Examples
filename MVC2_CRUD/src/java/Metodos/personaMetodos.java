
package Metodos;

import Models.persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;


public class personaMetodos {
    
    private DataSource dataSource;
    
    
    /**
     * Retorna una lista de todas laspersonas
     * @return
     * @throws Exception 
     */
    public List<persona> getPersonas() throws Exception
    {
      persona p=new persona();
      List<persona> personas=new ArrayList<persona>();
      
      Connection con=null;
      Statement st=null;
      ResultSet rs=null;
                 
      //--------establecer conexion
      con=dataSource.getConnection();
      
      //--------crear consulta y Statement
      String query="SELECT * FROM persona";
      
      st=con.createStatement();
      
      //---------ejecutar consulta
      
      rs=st.executeQuery(query);
      
      //------recorrer resultset obtenido
      
        while (rs.next()) 
        {            
           p.setPersonaId(rs.getInt("personaId"));
           p.setNombres(rs.getString("nombres"));
           p.setApellidos(rs.getString("apellido"));
           p.setNum_documento(rs.getString("num_documento"));
           p.setTipo_documento(rs.getString("tipo_documento"));
           p.setTelefono(rs.getString("telefono"));
           p.setDireccion(rs.getString("direccion"));
           p.setEmail(rs.getString("email"));
           
           
           personas.add(p);
        }
      
      
      return personas;
    } 
    
    
}
