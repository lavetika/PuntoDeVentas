
package objetoNegocio;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Estefanía Aguilar
 */
@Entity
@Table (name = "Ventas")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Date fecha;
    private Cliente cliente;
    private Float descuento, montoFinal;
    private List<rel_productosventas> productos;

    public Venta() {
        this.productos = new ArrayList<>();
    }

    public Venta(Date fecha, Cliente cliente, Float descuento, Float montoFinal) {
        this();
        this.fecha = fecha;
        this.cliente = cliente;
        this.descuento = descuento;
        this.montoFinal = montoFinal;
    }

    public Venta(Long id, Date fecha, Cliente cliente, Float descuento, Float montoFinal) {
        this();
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.descuento = descuento;
        this.montoFinal = montoFinal;
    }        

    @Id
    @Column(name = "IdVenta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "Fecha", nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @ManyToOne
    @JoinColumn(name = "IdCliente", nullable = false)
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Column (name = "Descuento", nullable = false)
    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    @Column (name = "MontoFinal", nullable = false)
    public Float getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(Float montoFinal) {
        this.montoFinal = montoFinal;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "venta")
    public List<rel_productosventas> getProductos() {
        return productos;
    }

    public void setProductos(List<rel_productosventas> productos) {
        this.productos = productos;
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
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetoNegocio.Venta[ id=" + id + " ]";
    }
    
}
