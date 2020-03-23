
package objetoNegocio;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
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

    //Atributos de la clase Venta
    private static final long serialVersionUID = 1L;
    private Long id;
    private Date fecha;
    private Cliente cliente;
    private Float descuento, montoFinal;
    private List<rel_productosventas> productos;

    //Constructor que crea la lista de productos
    public Venta() {
        this.productos = new ArrayList<>();
    }

    /**
     * Constructor que llama al constructor que crea la lista de productos, e
     * inicializa los atributos de fecha, cliente, descuento y montoFinal
     * @param fecha
     * @param cliente
     * @param descuento
     * @param montoFinal 
     */
    public Venta(Date fecha, Cliente cliente, Float descuento, Float montoFinal) {
        this();
        this.fecha = fecha;
        this.cliente = cliente;
        this.descuento = descuento;
        this.montoFinal = montoFinal;
    }

    /**
     * Constructor que llama al constructor que crea la lista de productos, e
     * inicializa los atributos de id, fecha, cliente, descuento y montoFinal
     * @param id
     * @param fecha
     * @param cliente
     * @param descuento
     * @param montoFinal 
     */
    public Venta(Long id, Date fecha, Cliente cliente, Float descuento, Float montoFinal) {
        this();
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.descuento = descuento;
        this.montoFinal = montoFinal;
    }        

    /**
     * Método que devuelve id de venta
     * @return 
     */
    @Id
    @Column(name = "IdVenta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    /**
     * Método que modifica id de venta
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Método que devuelve fecha de venta
     * @return 
     */
    @Column(name = "Fecha", nullable = false)
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método que modifica fecha de venta
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Método que devuelve cliente de venta
     * @return 
     */
    @ManyToOne
    @JoinColumn(name = "IdCliente", nullable = false)
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Método que modifica cliente de venta
     * @param cliente 
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Método que devuelve descuento de venta
     * @return 
     */
    @Column (name = "Descuento", nullable = false)
    public Float getDescuento() {
        return descuento;
    }

    /**
     * Método que modifica descuento de venta
     * @param descuento 
     */
    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    /**
     * Método que devuelve montoFinal de venta
     * @return 
     */
    @Column (name = "MontoFinal", nullable = false)
    public Float getMontoFinal() {
        return montoFinal;
    }

    /**
     * Método que modifica montoFinal de venta
     * @param montoFinal 
     */
    public void setMontoFinal(Float montoFinal) {
        this.montoFinal = montoFinal;
    }

    /**
     * Método que devuelve una ArrayList con los productos que contiene una venta
     * @return 
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "venta")
    public List<rel_productosventas> getProductos() {
        return productos;
    }

    /**
     * Método que modifica la lista de productos de venta
     * @param productos 
     */
    public void setProductos(List<rel_productosventas> productos) {
        this.productos = productos;
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
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
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
        return "objetoNegocio.Venta[ id=" + id + " ]";
    }
    
}
