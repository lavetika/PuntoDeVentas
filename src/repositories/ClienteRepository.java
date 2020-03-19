
package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import objetoNegocio.Cliente;

/**
 *
 * @author Estefanía Aguilar
 */
public class ClienteRepository extends BaseRepository<Cliente>{

    public ClienteRepository() {}
    
    @Override
    public void guardar(Cliente cliente) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();        
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
    }

    @Override
    public void eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cliente = entityManager.find(Cliente.class, id);
        if(cliente != null){
            entityManager.remove(cliente);
        }        
        entityManager.getTransaction().commit();   
    }

    @Override
    public void actualizar(Cliente clienteActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente clienteGuardado = entityManager.find(Cliente.class, clienteActualizado.getId());
        if(clienteGuardado != null){
            clienteGuardado.setRfc(clienteActualizado.getRfc());
            clienteGuardado.setNombre(clienteActualizado.getNombre());
            clienteGuardado.setDireccion(clienteActualizado.getDireccion());
            clienteGuardado.setTelefono1(clienteActualizado.getTelefono1());
            clienteGuardado.setTelefono2(clienteActualizado.getTelefono2());
            clienteGuardado.setVentas(clienteActualizado.getVentas());
            entityManager.merge(clienteGuardado);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public Cliente buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cliente = entityManager.find(Cliente.class, id);
        entityManager.getTransaction().commit();
        return cliente;
    }

    @Override
    public ArrayList<Cliente> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Cliente.class));
        Query query = entityManager.createQuery(criteria);
        List<Cliente> clientes = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(clientes);     
    }
    
}
