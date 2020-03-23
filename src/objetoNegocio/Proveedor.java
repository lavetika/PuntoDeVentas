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
@Table (name = "Proveedores")
public class Proveedor implements Serializable {

    //Atributos de la clase Proveedor
    private static final long serialVersionUID = 1L;
    private Long id;
    private String rfc, nombre, direccion, telefono, paginaWeb;
    private List<Producto> productos;

    /**
     * Constructor que crea la lista de productos
     */  
    public Proveedor() {
        this.productos = new ArrayList<>();
    }

    /**
     * Constructor que llama al contructor que crea la lista de productos, e 
     * inicializa los atributos rfc, nombre, direccion, telefono y paquinaWeb
     * @param rfc
     * @param nombre
     * @param direccion
     * @param telefono
     * @param paginaWeb 
     */
    public Proveedor(String rfc, String nombre, String direccion, String telefono, String paginaWeb) {
        this();
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;
    }

    /**
     * Constructor que llama al contructor que crea la lista de productos, e 
     * inicializa los atributos id, rfc, nombre, direccion, telefono y paquinaWeb
     * @param id
     * @param rfc
     * @param nombre
     * @param direccion
     * @param telefono
     * @param paginaWeb 
     */
    public Proveedor(Long id, String rfc, String nombre, String direccion, String telefono, String paginaWeb) {
        this();
        this.id = id;
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;
    }
    
    /**
     * Método que devuelve id de proveedor
     * @return 
     */
    @Id
    @Column (name = "IdProveedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    /**
     * Método que modifica id de proveedor
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Método que devuelve rfc de proveedor
     * @return 
     */
    @Column (name = "RFC", nullable = false)
    public String getRfc() {
        return rfc;
    }

    /**
     * Método que modifica rfc de proveedor
     * @param rfc 
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Método que devuelve nombre de proveedor
     * @return 
     */
    @Column (name = "Nombre", nullable = false)
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que modifica nombre de proveedor
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve direccion de proveedor
     * @return 
     */
    @Column (name = "Dirección", nullable = false)
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que modifica direccion de proveedor
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que devuelve telefono de proveedor
     * @return 
     */
    @Column(name = "Telefono", nullable = true)
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método que modifica telefono de proveedor
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método que devuelve paginaWeb de proveedor
     * @return 
     */
    @Column(name = "PáginaWeb", nullable = true)
    public String getPaginaWeb() {
        return paginaWeb;
    }

    /**
     * Método que modifica paginaWeb de proveedor
     * @param paginaWeb 
     */
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
    
    /**
     * Método que devuelve una ArrayList con las productos que tiene un proveedor
     * @return 
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedor")
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Método que modifica la lista de productos de proveedor
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
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
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
        return id + " - " + rfc + " - " + nombre;
    }
    
}
