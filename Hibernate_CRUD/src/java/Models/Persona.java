package Models;
// Generated 13/11/2017 12:29:04 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private int personaId;
     private String nombres;
     private String apellidos;
     private String tipoDocumento;
     private String numDocumento;
     private String direccion;
     private String telefono;
     private String email;
     private Set trabajadoreses = new HashSet(0);
     private Set clienteses = new HashSet(0);

    public Persona() {
    }

	
    public Persona(int personaId) {
        this.personaId = personaId;
    }
    public Persona(int personaId, String nombres, String apellidos, String tipoDocumento, String numDocumento, String direccion, String telefono, String email, Set trabajadoreses, Set clienteses) {
       this.personaId = personaId;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.tipoDocumento = tipoDocumento;
       this.numDocumento = numDocumento;
       this.direccion = direccion;
       this.telefono = telefono;
       this.email = email;
       this.trabajadoreses = trabajadoreses;
       this.clienteses = clienteses;
    }
   
    public int getPersonaId() {
        return this.personaId;
    }
    
    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTipoDocumento() {
        return this.tipoDocumento;
    }
    
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getNumDocumento() {
        return this.numDocumento;
    }
    
    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getTrabajadoreses() {
        return this.trabajadoreses;
    }
    
    public void setTrabajadoreses(Set trabajadoreses) {
        this.trabajadoreses = trabajadoreses;
    }
    public Set getClienteses() {
        return this.clienteses;
    }
    
    public void setClienteses(Set clienteses) {
        this.clienteses = clienteses;
    }




}

