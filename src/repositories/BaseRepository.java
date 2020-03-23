
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
    /**
     * Método abstracto para guardar entidad
     * @param entidad 
     */
    public abstract void guardar(T entidad);
    
    /**
     * Método abstracto para eliminar entidad por id
     * @param id 
     */
    public abstract void eliminar(long id);
    
    /**
     * Método abstracto para actualizar entidad
     * @param entidad 
     */
    public abstract void actualizar(T entidad);
    
    /**
     * Método abstracto para buscar entidad por id
     * @param id
     * @return 
     */
    public abstract T buscarPorId(long id);
    
    /**
     * Método abstracto para buscar entidaded y devuelve un ArrayList
     * @return 
     */
    public abstract ArrayList<T> buscarTodas();
    
    /**
     * Método que crea un EntityManagerFactory para conectar con la persistencia
     * @return 
     */
    public EntityManager createEntityManager(){
        EntityManagerFactory emFactory = 
                Persistence.createEntityManagerFactory("PuntoDeVentasPU");
        EntityManager entityManager = emFactory.createEntityManager();
        return entityManager;       
    }
}
