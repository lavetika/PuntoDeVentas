
package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import objetoNegocio.Producto;
import objetoNegocio.Venta;

/**
 *
 * @author Estefanía Aguilar
 */
public class VentaRepository extends BaseRepository<Venta>{

    /**
     * Constructor default de la clase
     */
    public VentaRepository() {}
    
    /**
     * Método implementado de la clase BaseRepository para guardar una venta
     * @param venta 
     */
    @Override
    public void guardar(Venta venta) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(venta);
        entityManager.getTransaction().commit();
    }
    
    /**
     * Método heredado de la clase BaseRepository, no implementado para su función
     * principal ya que una venta no puede ser eliminada
     * @param id 
     */
    @Override
    public void eliminar(long id) {
        throw new UnsupportedOperationException("No es posible eliminar una venta"); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Método heredado de la clase BaseRepository, no implementado para su función
     * principal ya que una venta no puede ser actualizada
     * @param entidad 
     */
    @Override
    public void actualizar(Venta entidad) {
        throw new UnsupportedOperationException("No es posible actualizar una venta."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Método implementado de la clase BaseRepository para buscar una venta
     * por id
     * @param id
     * @return 
     */
    @Override
    public Venta buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Venta venta = entityManager.find(Venta.class, id);
        entityManager.getTransaction().commit();
        return venta;
    }
    
    /**
     * Método para buscar la fecha de una venta
     */
    public Venta buscarPorFecha(String fecha) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Venta venta = entityManager.find(Venta.class, fecha);
        entityManager.getTransaction().commit();
        return venta;
    }
    
    /**
     * Método implementado de la clase BaseRepository para buscar todas las ventas
     * y regresa un ArrayList con ellas
     * @return 
     */
    @Override
    public ArrayList<Venta> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Venta.class));
        Query query = entityManager.createQuery(criteria);
        List<Venta> ventas = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(ventas);        
    }

    /**
     * Método para obtener un producto de una venta
     * @param idProducto
     * @return 
     */
    public Producto obtenerProducto(Long idProducto) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Producto producto = entityManager.find(Producto.class, idProducto);
        entityManager.getTransaction().commit();
        return producto;
    }
    
    
    
}
