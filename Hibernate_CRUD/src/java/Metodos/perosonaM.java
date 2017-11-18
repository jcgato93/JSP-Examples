
package Metodos;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import Models.HibernateUtil;
import Models.Persona;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class  perosonaM {
   
    /**
     * Retorna la lista de todas las personas
     * @return 
     */       
    public ArrayList<Persona> getPersona()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session con=sesion.openSession();
        Transaction tx=con.beginTransaction();//abrir conexion
        
        //=======operaciones en la base de datos
        ArrayList<Persona> persona=new ArrayList<>();
        Query query=con.createQuery("from Persona");//haciendo referencia a la entidad de modelos
        List<Persona> lista=query.list();//se puede retornar esta lista
        Iterator<Persona> iter=lista.iterator();                
        //========
        tx.commit();//confirmar transaccion
        con.close();//serrar conexion
        
        
        //se toma la lista y se parsea a un ArrayList
        while(iter.hasNext())
        {
            Persona noti=(Persona)iter.next();
            persona.add(noti);
        }
        
        return persona;
    }
    
    /**
     * Retorna una persona segun el Id
     * @param id
     * @return 
     */
    public Persona getPersonaPorId(int id)
    {
     SessionFactory factory=HibernateUtil.getSessionFactory();
     Session con=factory.openSession();
     Transaction tx=con.beginTransaction();
     
     Persona persona=(Persona)con.get(Persona.class,id);
     
     tx.commit();
     con.close();
     
     return persona;
    }
    
    
    /**
     * Actualiza una persona por id
     * @param id 
     * @param p 
     */
    public void updatePersona(int id,Persona p)
    {
     SessionFactory factory=HibernateUtil.getSessionFactory();
     Session con=factory.openSession();
     Transaction tx=con.beginTransaction();
     
     Persona persona=(Persona)con.get(Persona.class,id);
     
     persona.setNombres(p.getNombres());
     persona.setApellidos(p.getApellidos());
     
     con.update(persona);
     
     tx.commit();
     con.close();
     
     
    }
    
    
    /**
     * Borra una persona por Id
     * @param id 
     */
    public void deletePersona(int id)
    {
        SessionFactory factory=HibernateUtil.getSessionFactory();
     Session con=factory.openSession();
     Transaction tx=con.beginTransaction();
     
     Persona persona=(Persona)con.get(Persona.class,id);
     
     con.delete(persona);
     
     tx.commit();
     con.close();
    }
    
    
    /**
     * Inserta un nuevo registro en la tabla Persona
     * @param persona 
     */
    public void InsertarPersona(Persona persona)
    {
     SessionFactory factory=HibernateUtil.getSessionFactory();
     Session con=factory.openSession();
     Transaction tx=con.beginTransaction();
  
     con.save(persona);
     
     tx.commit();
     con.close();
    }
    
}
