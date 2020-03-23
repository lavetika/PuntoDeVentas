
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

    /**
     * Constructor default de la clase
     */
    public CategoriaRepository() {}
    
    /**
     * Método implementado de la clase BaseRepository para guardar una categoría
     * @param categoria 
     */
    @Override
    public void guardar(Categoria categoria) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();        
        entityManager.persist(categoria);
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar una categoría
     * por id
     * @param id 
     */
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

    /**
     * Método implementado de la clase BaseRepository para actualizar una categoría
     * @param categoriaActualizada 
     */
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

    /**
     * Método implementado de la clase BaseRepository para buscar una categoría
     * por id
     * @param id
     * @return 
     */
    @Override
    public Categoria buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Categoria categoria = entityManager.find(Categoria.class, id);
        entityManager.getTransaction().commit();
        return categoria;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todas las categorías
     * y que regresa un ArrayList con ellas
     * @return 
     */
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
