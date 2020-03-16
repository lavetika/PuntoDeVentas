
package objetoNegocio;

import java.io.Serializable;
import java.util.ArrayList;
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

    private static final long serialVersionUID = 1L;    
    private Long id;
    private String nombre;
    private Proveedor proveedor;
    private Categoria categoria;
    private Integer stock;
    private Float precioActual;
    private List<rel_productosventas> ventas;    

    public Producto() {
        this.ventas = new ArrayList<>();
    }

    public Producto(String nombre, Proveedor proveedor, Categoria categoria, Integer stock, Float precioActual) {
        this();
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.stock = stock;
        this.precioActual = precioActual;
    }

    public Producto(Long id, String nombre, Proveedor proveedor, Categoria categoria, Integer stock, Float precioActual) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.stock = stock;
        this.precioActual = precioActual;
    }       
    
    @Id
    @Column (name = "IdProducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column (name = "Nombre", nullable = false)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @ManyToOne()
    @JoinColumn(name = "IdProveedor", nullable = false)
    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    @ManyToOne
    @JoinColumn(name = "IdCategoria", nullable = false)
    public Categoria getCategoria() {
        return categoria;
    }
    
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Column (name = "Stock", nullable = false)
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Column (name = "PrecioActual", nullable = false)
    public Float getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(Float precioActual) {
        this.precioActual = precioActual;
    } 

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    public List<rel_productosventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<rel_productosventas> ventas) {
        this.ventas = ventas;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

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

    @Override
    public String toString() {
        return "objetoNegocio.Producto[ id=" + id + " ]";
    }
    
}
