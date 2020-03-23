
package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import objetoNegocio.Categoria;
import objetoNegocio.Producto;
import objetoNegocio.Proveedor;

/**
 *
 * @author Estefanía Aguilar
 */
public class ProductoRepository extends BaseRepository<Producto>{

    /**
     * Constructor default de la clase
     */
    public ProductoRepository() {}
    
    /**
     * Método implementado de la clase BaseRepository para guardar un producto
     * @param producto 
     */
    @Override
    public void guardar(Producto producto) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(producto);
        entityManager.getTransaction().commit();   
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar un producto
     * por id
     * @param id 
     */
    @Override
    public void eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Producto producto = entityManager.find(Producto.class, id);
        if (producto != null){
            entityManager.remove(producto);
        }
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar un producto
     * @param productoActualizado 
     */
    @Override
    public void actualizar(Producto productoActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Producto productoGuardado = entityManager.find(Producto.class, productoActualizado.getId());
        if(productoGuardado != null){
            productoGuardado.setNombre(productoActualizado.getNombre());
            productoGuardado.setProveedor(productoActualizado.getProveedor());
            productoGuardado.setCategoria(productoActualizado.getCategoria());
            productoGuardado.setPrecioActual(productoActualizado.getPrecioActual());
            productoGuardado.setStock(productoActualizado.getStock());
            productoGuardado.setVentas(productoActualizado.getVentas());
            entityManager.merge(productoGuardado);
        }
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para buscar un producto
     * por id
     * @param id
     * @return 
     */
    @Override
    public Producto buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Producto producto = entityManager.find(Producto.class, id);
        entityManager.getTransaction().commit();
        return producto;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todos los productos
     * y regresa un ArrayList con ellos
     * @return 
     */
    @Override
    public ArrayList<Producto> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Producto.class));
        Query query = entityManager.createQuery(criteria);
        List<Producto> productos = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(productos);  
    }
    
    /**
     * Método para obtener un proveedor de un producto
     * @param idProveedor
     * @return 
     */
    public Proveedor obtenerProveedor(Long idProveedor) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Proveedor proveedor = entityManager.find(Proveedor.class, idProveedor);
        entityManager.getTransaction().commit();
        return proveedor;
    }
    
    /**
     * Método para obtener una categoría de un producto
     * @param idCategoria
     * @return 
     */
    public Categoria obtenerCategoria(Long idCategoria) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Categoria categoria = entityManager.find(Categoria.class, idCategoria);
        entityManager.getTransaction().commit();
        return categoria;
    }
}
