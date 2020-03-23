
package objetoNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author laura
 */
@Entity
@Table (name = "Categorías")
public class Categoria implements Serializable {

    //Atributos de la clase Categoría
    private static final long serialVersionUID = 1L;   
    private Long id;
    private String nombre, descripcion;
    private List<Producto> productos;

    /**
     * Constructor que crea la lista de productos
     */
    public Categoria() {
        this.productos = new ArrayList<>();
    }

   /**
    * Construtor que llama al otro constructor que crea la lista de productos,
    * e inicializa los atributos nombre y descripcion.
    * @param nombre
    * @param descripcion 
    */
    public Categoria(String nombre, String descripcion) {
        this();
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Construtor que llama al otro constructor que crea la lista de productos,
     * e inicializa los atributos id, nombre y descripcion.
     * @param id
     * @param nombre
     * @param descripcion 
     */
    public Categoria(Long id, String nombre, String descripcion) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    } 
    /**
     * Método que devuelve id de categoría
     * @return 
     */
    @Id
    @Column(name = "IdCategoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    /**
     * Método que modifica id de categoría
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Método que devuelve nombre de categoría
     * @return 
     */
    @Column (name = "Nombre", nullable = false)
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que modifica nombre de categoría
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve descripcion de categoría
     * @return 
     */
    @Column(name = "Descripción", nullable = false)
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que modifica descripcion de categoría
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Método que devuelve un ArrayList de productos de categoría
     * @return 
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Método que modifica la lista de productos de categoría
     * @param productos 
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    /**
     * Método que añade producto nuevo a la lista de productos
     * @param producto 
     */
    public void addProductos(Producto... producto){
        this.productos.addAll(Arrays.asList(producto));        
    }

    /**
     * Método hash que devuelve un entero
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * Método equals que obtiene un Object lo compara y regresa un booleano
     * @param object
     * @return 
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Método toString que da formato al String
     * @return 
     */
    @Override
    public String toString() {
        return id + " - " + nombre ;
    }
    
}
