
package repositories;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Estefanía Aguilar
 */
public abstract class BaseRepository <T>{
    public abstract void guardar(T entidad);
    public abstract void eliminar(long id);
    public abstract void actualizar(T entidad);
    public abstract T buscarPorId(long id);
    public abstract ArrayList<T> buscarTodas();
    
    public EntityManager createEntityManager(){
        EntityManagerFactory emFactory = 
                Persistence.createEntityManagerFactory("PuntoDeVentasPU");
        EntityManager entityManager = emFactory.createEntityManager();
        return entityManager;
    }
}
