
package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import objetoNegocio.Proveedor;

/**
 *
 * @author Estefanía Aguilar
 */
public class ProveedorRepository extends BaseRepository<Proveedor>{

    public ProveedorRepository() {}

    @Override
    public void guardar(Proveedor proveedor) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(proveedor);
        entityManager.getTransaction().commit();        
    }

    @Override
    public void eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Proveedor proveedor = entityManager.find(Proveedor.class, id);
        if (proveedor != null){
            entityManager.remove(proveedor);
        }
        entityManager.getTransaction().commit();        
    }

    @Override
    public void actualizar(Proveedor proveedorActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Proveedor proveedorGuardado = entityManager.find(Proveedor.class, proveedorActualizado.getId());
        if(proveedorGuardado != null){
            proveedorGuardado.setRfc(proveedorActualizado.getRfc());
            proveedorGuardado.setNombre(proveedorActualizado.getNombre());
            proveedorGuardado.setDireccion(proveedorActualizado.getDireccion());
            proveedorGuardado.setTelefono(proveedorActualizado.getTelefono());
            proveedorGuardado.setPaginaWeb(proveedorActualizado.getPaginaWeb());
            proveedorGuardado.setProductos(proveedorActualizado.getProductos());
            entityManager.merge(proveedorGuardado);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public Proveedor buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Proveedor proveedor = entityManager.find(Proveedor.class, id);
        entityManager.getTransaction().commit();
        return proveedor;
    }

    @Override
    public ArrayList<Proveedor> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Proveedor.class));
        Query query = entityManager.createQuery(criteria);
        List<Proveedor> proveedores = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(proveedores);
    }
    
}
