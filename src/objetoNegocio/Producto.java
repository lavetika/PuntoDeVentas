
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author laura
 */
@Entity
@Table(name = "Productos")
public class Producto implements Serializable {

    //Atributos de la clase Producto
    private static final long serialVersionUID = 1L;    
    private Long id;
    private String nombre;
    private Proveedor proveedor;
    private Categoria categoria;
    private Integer stock;
    private Float precioActual;
    private List<rel_productosventas> ventas;    

    /**
     * Constructor que crea la lista ventas
     */
    public Producto() {
        this.ventas = new ArrayList<>();
    }

    /**
     * Constructor que llama al constructor que crea la lista de ventas, e
     * inicializa los atributos de nombre, proveedor, categoria, stock y precioActual
     * @param nombre
     * @param proveedor
     * @param categoria
     * @param stock
     * @param precioActual 
     */
    public Producto(String nombre, Proveedor proveedor, Categoria categoria, Integer stock, Float precioActual) {
        this();
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.stock = stock;
        this.precioActual = precioActual;
    }

    /**
     * Constructor que llama al constructor que crea la lista de ventas, e
     * inicializa los atributos de id, nombre, proveedor, categoria, stock y precioActual
     * @param id
     * @param nombre
     * @param proveedor
     * @param categoria
     * @param stock
     * @param precioActual 
     */
    public Producto(Long id, String nombre, Proveedor proveedor, Categoria categoria, Integer stock, Float precioActual) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.stock = stock;
        this.precioActual = precioActual;
    }       
    
    /**
     * Método que devuelve id de producto
     * @return 
     */
    @Id
    @Column (name = "IdProducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    /**
     * Método que modifica id de producto
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Método que devuelve nombre de producto
     * @return 
     */
    @Column (name = "Nombre", nullable = false)
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que modifica nombre de producto
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método que devuelve proveedor de producto
     * @return 
     */
    @ManyToOne()
    @JoinColumn(name = "IdProveedor", nullable = false)
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * Método que modifica proveedor de producto
     * @param proveedor 
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    /**
     * Método que devuelve categoria de producto
     * @return 
     */
    @ManyToOne
    @JoinColumn(name = "IdCategoria", nullable = false)
    public Categoria getCategoria() {
        return categoria;
    }
    
    /**
     * Método que modifica categoria de producto
     * @param categoria 
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Método que devuelve stock de producto
     * @return 
     */
    @Column (name = "Stock", nullable = false)
    public Integer getStock() {
        return stock;
    }

    /**
     * Método que modifica stock de producto
     * @param stock 
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * Método que devuelve precioActual de producto
     * @return 
     */
    @Column (name = "PrecioActual", nullable = false)
    public Float getPrecioActual() {
        return precioActual;
    }

    /**
     * Método que modifica precioActual de producto
     * @param precioActual 
     */
    public void setPrecioActual(Float precioActual) {
        this.precioActual = precioActual;
    } 

    /**
     * Método que devuelve una ArrayList con las ventas de un producto
     * @return 
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    public List<rel_productosventas> getVentas() {
        return ventas;
    }

    /**
     * Método que modifica la lista de ventas de producto
     * @param ventas 
     */
    public void setVentas(List<rel_productosventas> ventas) {
        this.ventas = ventas;
    }
    
    /**
     * Método que añade venta nueva a la lista de ventas
     * @param venta 
     */
    public void addVentas(rel_productosventas... venta){
        this.ventas.addAll(Arrays.asList(venta));        
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
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
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
        return id + " - " + nombre;
    }
    
}
