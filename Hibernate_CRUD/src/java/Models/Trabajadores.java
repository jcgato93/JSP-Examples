package Models;
// Generated 13/11/2017 12:29:04 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Trabajadores generated by hbm2java
 */
public class Trabajadores  implements java.io.Serializable {


     private int tabajadoresId;
     private Persona persona;
     private String sueldo;
     private String rol;
     private String login;
     private String password;
     private Set reservas = new HashSet(0);

    public Trabajadores() {
    }

	
    public Trabajadores(int tabajadoresId) {
        this.tabajadoresId = tabajadoresId;
    }
    public Trabajadores(int tabajadoresId, Persona persona, String sueldo, String rol, String login, String password, Set reservas) {
       this.tabajadoresId = tabajadoresId;
       this.persona = persona;
       this.sueldo = sueldo;
       this.rol = rol;
       this.login = login;
       this.password = password;
       this.reservas = reservas;
    }
   
    public int getTabajadoresId() {
        return this.tabajadoresId;
    }
    
    public void setTabajadoresId(int tabajadoresId) {
        this.tabajadoresId = tabajadoresId;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    public String getRol() {
        return this.rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set getReservas() {
        return this.reservas;
    }
    
    public void setReservas(Set reservas) {
        this.reservas = reservas;
    }




}


