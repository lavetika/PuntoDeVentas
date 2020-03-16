
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

    private static final long serialVersionUID = 1L; 
    private Long id;
    private Producto producto;
    private Venta venta;
    private Float precio, montoFinal;
    private Integer cantidad;

    public rel_productosventas() {
    }

    public rel_productosventas(Producto producto, Venta venta, Float precio, Float montoFinal, Integer cantidad) {
        this.producto = producto;
        this.venta = venta;
        this.precio = precio;
        this.montoFinal = montoFinal;
        this.cantidad = cantidad;
    }

    public rel_productosventas(Long id, Producto producto, Venta venta, Float precio, Float montoFinal, Integer cantidad) {
        this.id = id;
        this.producto = producto;
        this.venta = venta;
        this.precio = precio;
        this.montoFinal = montoFinal;
        this.cantidad = cantidad;
    } 
    
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "IdProducto", nullable = false)
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    @ManyToOne
    @JoinColumn(name = "IdVenta", nullable = false)
    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Column (name = "Precio")
    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Column (name = "MontoFinal")
    public Float getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(Float montoFinal) {
        this.montoFinal = montoFinal;
    }

    @Column (name = "Cantidad")
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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
        if (!(object instanceof rel_productosventas)) {
            return false;
        }
        rel_productosventas other = (rel_productosventas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetoNegocio.rel_productosventas[ id=" + id + " ]";
    }
    
}
