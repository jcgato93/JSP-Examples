package modelos;
// Generated 12/11/2017 05:59:15 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Reserva generated by hbm2java
 */
public class Reserva  implements java.io.Serializable {


     private int reservaId;
     private Clientes clientes;
     private Habitacion habitacion;
     private Trabajadores trabajadores;
     private String tipoReserva;
     private Date fechaReserva;
     private Date fechaIngreso;
     private Date fechaSalida;
     private String costoAlojamiento;
     private String estado;
     private Set consumos = new HashSet(0);
     private Set pagos = new HashSet(0);

    public Reserva() {
    }

	
    public Reserva(int reservaId) {
        this.reservaId = reservaId;
    }
    public Reserva(int reservaId, Clientes clientes, Habitacion habitacion, Trabajadores trabajadores, String tipoReserva, Date fechaReserva, Date fechaIngreso, Date fechaSalida, String costoAlojamiento, String estado, Set consumos, Set pagos) {
       this.reservaId = reservaId;
       this.clientes = clientes;
       this.habitacion = habitacion;
       this.trabajadores = trabajadores;
       this.tipoReserva = tipoReserva;
       this.fechaReserva = fechaReserva;
       this.fechaIngreso = fechaIngreso;
       this.fechaSalida = fechaSalida;
       this.costoAlojamiento = costoAlojamiento;
       this.estado = estado;
       this.consumos = consumos;
       this.pagos = pagos;
    }
   
    public int getReservaId() {
        return this.reservaId;
    }
    
    public void setReservaId(int reservaId) {
        this.reservaId = reservaId;
    }
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    public Habitacion getHabitacion() {
        return this.habitacion;
    }
    
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public Trabajadores getTrabajadores() {
        return this.trabajadores;
    }
    
    public void setTrabajadores(Trabajadores trabajadores) {
        this.trabajadores = trabajadores;
    }
    public String getTipoReserva() {
        return this.tipoReserva;
    }
    
    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }
    public Date getFechaReserva() {
        return this.fechaReserva;
    }
    
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Date getFechaSalida() {
        return this.fechaSalida;
    }
    
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public String getCostoAlojamiento() {
        return this.costoAlojamiento;
    }
    
    public void setCostoAlojamiento(String costoAlojamiento) {
        this.costoAlojamiento = costoAlojamiento;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getConsumos() {
        return this.consumos;
    }
    
    public void setConsumos(Set consumos) {
        this.consumos = consumos;
    }
    public Set getPagos() {
        return this.pagos;
    }
    
    public void setPagos(Set pagos) {
        this.pagos = pagos;
    }




}


