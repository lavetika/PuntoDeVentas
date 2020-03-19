
package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import objetoNegocio.Categoria;

/**
 *
 * @author Estefanía Aguilar
 */
public class CategoriaRepository extends BaseRepository<Categoria>{

    public CategoriaRepository() {}
    
    @Override
    public void guardar(Categoria categoria) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();        
        entityManager.persist(categoria);
        entityManager.getTransaction().commit();
    }

    @Override
    public void eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Categoria categoria = entityManager.find(Categoria.class, id);
        if(categoria != null){
            entityManager.remove(categoria);
        }        
        entityManager.getTransaction().commit();
    }

    @Override
    public void actualizar(Categoria categoriaActualizada) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Categoria categoriaGuardada = entityManager.find(Categoria.class, categoriaActualizada.getId());
        if(categoriaGuardada != null){
            categoriaGuardada.setNombre(categoriaActualizada.getNombre());
            categoriaGuardada.setDescripcion(categoriaActualizada.getDescripcion());
            categoriaGuardada.setProductos(categoriaActualizada.getProductos());
            entityManager.merge(categoriaGuardada);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public Categoria buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Categoria categoria = entityManager.find(Categoria.class, id);
        entityManager.getTransaction().commit();
        return categoria;
    }

    @Override
    public ArrayList<Categoria> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Categoria.class));
        Query query = entityManager.createQuery(criteria);
        List<Categoria> categorias = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(categorias);
    }
    
}
