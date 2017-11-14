
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
}
