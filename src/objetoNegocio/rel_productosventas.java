
package objetoNegocio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Estefanía Aguilar
 */
@Entity
public class rel_productosventas implements Serializable {
    
    //Atributos de la clase rel_productosventas
    private static final long serialVersionUID = 1L; 
    private Long id;
    private Producto producto;
    private Venta venta;
    private Float precio, montoFinal;
    private Integer cantidad;

    /**
     * Constructor default de la clase
     */
    public rel_productosventas() {
    }

    /**
     * Constructor que inicializa los atributos producto, venta, precio, 
     * montoFinal y cantidad
     * @param producto
     * @param venta
     * @param precio
     * @param montoFinal
     * @param cantidad 
     */
    public rel_productosventas(Producto producto, Venta venta, Float precio, Float montoFinal, Integer cantidad) {
        this.producto = producto;
        this.venta = venta;
        this.precio = precio;
        this.montoFinal = montoFinal;
        this.cantidad = cantidad;
    }

    /**
     * Constructor que inicializa los atributos id, producto, venta, precio, 
     * montoFinal y cantidad
     * @param id
     * @param producto
     * @param venta
     * @param precio
     * @param montoFinal
     * @param cantidad 
     */
    public rel_productosventas(Long id, Producto producto, Venta venta, Float precio, Float montoFinal, Integer cantidad) {
        this.id = id;
        this.producto = producto;
        this.venta = venta;
        this.precio = precio;
        this.montoFinal = montoFinal;
        this.cantidad = cantidad;
    } 
    
    /**
     * Método que devuelve id de rel_productosventas
     * @return 
     */
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    /**
     * Método que modifica id de rel_productosventas
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Método que devuelve producto de rel_productosventas
     * @return 
     */
    @ManyToOne
    @JoinColumn(name = "IdProducto", nullable = false)
    public Producto getProducto() {
        return producto;
    }

    /**
     * Método que modifica producto de rel_productosventas
     * @param producto 
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    /**
     * Método que devuelve venta de rel_productosventas
     * @return 
     */
    @ManyToOne
    @JoinColumn(name = "IdVenta", nullable = false)
    public Venta getVenta() {
        return venta;
    }

    /**
     * Método que modifica venta de rel_productosventas
     * @param venta 
     */
    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    /**
    * Método que devuelve precio de rel_productosventas
    * @return 
    */ 
    @Column (name = "Precio")
    public Float getPrecio() {
        return precio;
    }

    /**
     * Método que modifica precio de rel_productosventas
     * @param precio 
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * Método que devuelve montoFinal de rel_productosventas
     * @return 
     */
    @Column (name = "MontoFinal")
    public Float getMontoFinal() {
        return montoFinal;
    }

    /**
     * Método que modifica montoFinal de rel_productosventas
     * @param montoFinal 
     */
    public void setMontoFinal(Float montoFinal) {
        this.montoFinal = montoFinal;
    }

    /**
     * Método que devuelve cantidad de rel_productosventas
     * @return 
     */
    @Column (name = "Cantidad")
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Método que modifica cantidad de rel_productosventas
     * @param cantidad 
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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
        if (!(object instanceof rel_productosventas)) {
            return false;
        }
        rel_productosventas other = (rel_productosventas) object;
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
        return "objetoNegocio.rel_productosventas[ id=" + id + " ]";
    }
    
}
