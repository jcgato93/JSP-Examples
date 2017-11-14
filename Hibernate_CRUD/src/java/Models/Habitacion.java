package Models;
// Generated 13/11/2017 12:29:04 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Habitacion generated by hbm2java
 */
public class Habitacion  implements java.io.Serializable {


     private int habitacionId;
     private String numero;
     private String piso;
     private String descripcion;
     private String caracteristicas;
     private String precioDiario;
     private String habitacioncol;
     private String estado;
     private String tipoHabitacion;
     private Set reservas = new HashSet(0);

    public Habitacion() {
    }

	
    public Habitacion(int habitacionId) {
        this.habitacionId = habitacionId;
    }
    public Habitacion(int habitacionId, String numero, String piso, String descripcion, String caracteristicas, String precioDiario, String habitacioncol, String estado, String tipoHabitacion, Set reservas) {
       this.habitacionId = habitacionId;
       this.numero = numero;
       this.piso = piso;
       this.descripcion = descripcion;
       this.caracteristicas = caracteristicas;
       this.precioDiario = precioDiario;
       this.habitacioncol = habitacioncol;
       this.estado = estado;
       this.tipoHabitacion = tipoHabitacion;
       this.reservas = reservas;
    }
   
    public int getHabitacionId() {
        return this.habitacionId;
    }
    
    public void setHabitacionId(int habitacionId) {
        this.habitacionId = habitacionId;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getPiso() {
        return this.piso;
    }
    
    public void setPiso(String piso) {
        this.piso = piso;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCaracteristicas() {
        return this.caracteristicas;
    }
    
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public String getPrecioDiario() {
        return this.precioDiario;
    }
    
    public void setPrecioDiario(String precioDiario) {
        this.precioDiario = precioDiario;
    }
    public String getHabitacioncol() {
        return this.habitacioncol;
    }
    
    public void setHabitacioncol(String habitacioncol) {
        this.habitacioncol = habitacioncol;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTipoHabitacion() {
        return this.tipoHabitacion;
    }
    
    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    public Set getReservas() {
        return this.reservas;
    }
    
    public void setReservas(Set reservas) {
        this.reservas = reservas;
    }




}


