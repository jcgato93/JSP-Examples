
package Models;

import java.sql.*;
import java.util.*;
import java.util.List;
import javax.sql.DataSource;


public class persona {

  
    
    private int personaId;
    private String nombres;
    private String apellidos;
    private String tipo_documento;
    private String num_documento;
    private String direccion;
    private String telefono;
    private String email;
    
    
    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //constructor
      public persona() {
      personaId=-1;
      nombres="";
      apellidos="";
      tipo_documento="";
      num_documento="";
      direccion="";
      telefono="";
      email="";
      
      }
    
   
   
    
    
}
