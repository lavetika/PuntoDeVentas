
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
 * @author Estefanía Aguilar
 */
@Entity
@Table (name = "Clientes")
public class Cliente implements Serializable {

    //Atributos de la clase Cliente
    private static final long serialVersionUID = 1L;
    private Long id;
    private String rfc, nombre, direccion, telefono1, telefono2;
    private List<Venta> ventas;    

    /**
     * Constructor que crea la lista de ventas 
     */
    public Cliente() {
        this.ventas = new ArrayList<>();
    }

    /**
     * Constructor que llama al contructor que crea la lista de ventas, e 
     * inicializa los atributos rfc, nombre, direccion, telefono1 y telefono2
     * @param rfc
     * @param nombre
     * @param direccion
     * @param telefono1
     * @param telefono2 
     */
    public Cliente(String rfc, String nombre, String direccion, String telefono1, String telefono2) {
        this();
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }

    /**
     * Constructor que llama al contructor que crea la lista de ventas, e 
     * inicializa los atributos id, rfc, nombre, direccion, telefono1 y telefono2
     * @param id
     * @param rfc
     * @param nombre
     * @param direccion
     * @param telefono1
     * @param telefono2 
     */
    public Cliente(Long id, String rfc, String nombre, String direccion, String telefono1, String telefono2) {
        this();
        this.id = id;
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }
    
    /**
     * Método que devuelve id de cliente
     * @return 
     */
    @Id
    @Column (name = "IdCliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    /**
     * Método que modifica id de cliente
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Método que devuelve rfc de cliente
     * @return 
     */
    @Column(name = "RFC", nullable = false)
    public String getRfc() {
        return rfc;
    }

    /**
     * Método que modifica rfc de cliente
     * @param rfc 
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Método que devuelve nombre de cliente
     * @return 
     */
    @Column (name = "Nombre", nullable = false)
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que modifica nombre de cliente
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve direccion de cliente
     * @return 
     */
    @Column (name = "Dirección", nullable = false)
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que modifica direccion de cliente
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que devuelve telefono1 de cliente
     * @return 
     */
    @Column (name = "Teléfono1", nullable = true)
    public String getTelefono1() {
        return telefono1;
    }

    /**
     * Método que modifica telefono1 de cliente
     * @param telefono1 
     */
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    /**
     * Método que devuelve telefono2 de cliente
     * @return 
     */
    @Column (name = "Teléfono2", nullable = true)
    public String getTelefono2() {
        return telefono2;
    }

    /**
     * Método que modifica telefono2 de cliente
     * @param telefono2 
     */
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    
    /**
     * Método que devuelve una ArrayList con las ventas que realizó un cliente
     * @return 
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    public List<Venta> getVentas() {
        return ventas;
    }

    /**
     * Método que modifica la lista de ventas de cliente
     * @param ventas 
     */
    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
    
    /**
     * Método que añade venta nueva a la lista de ventas
     * @param venta 
     */
    public void addVentas(Venta... venta){
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
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
