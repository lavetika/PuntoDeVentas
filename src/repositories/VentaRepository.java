
package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import objetoNegocio.Venta;

/**
 *
 * @author Estefanía Aguilar
 */
public class VentaRepository extends BaseRepository<Venta>{

    public VentaRepository() {}
    
    @Override
    public void guardar(Venta venta) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(venta);
        entityManager.getTransaction().commit();
    }

    @Override
    public void eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Venta venta = entityManager.find(Venta.class, id);
        if (venta != null){
            entityManager.remove(venta);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public void actualizar(Venta ventaActualizada) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Venta ventaGuardada = entityManager.find(Venta.class, ventaActualizada.getId());
        if(ventaGuardada != null){
            ventaGuardada.setCliente(ventaActualizada.getCliente());
            ventaGuardada.setDescuento(ventaActualizada.getDescuento());
            ventaGuardada.setFecha(ventaActualizada.getFecha());
            ventaGuardada.setMontoFinal(ventaActualizada.getMontoFinal());
            ventaActualizada.setProductos(ventaActualizada.getProductos());
            entityManager.merge(ventaGuardada);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public Venta buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Venta venta = entityManager.find(Venta.class, id);
        entityManager.getTransaction().commit();
        return venta;
    }

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
    
}
