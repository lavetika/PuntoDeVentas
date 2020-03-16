
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Estefanía Aguilar
 */
@Entity
@Table (name = "Clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String rfc, nombre, direccion, telefono1, telefono2;
    private List<Venta> ventas;

    public Cliente() {
        this.ventas = new ArrayList<>();
    }

    public Cliente(String rfc, String nombre, String direccion, String telefono1, String telefono2) {
        this();
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }

    public Cliente(Long id, String rfc, String nombre, String direccion, String telefono1, String telefono2) {
        this();
        this.id = id;
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }
      
    @Id
    @Column (name = "IdCliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "RFC", nullable = false)
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Column (name = "Nombre", nullable = false)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column (name = "Dirección", nullable = false)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column (name = "Teléfono1", nullable = true)
    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    @Column (name = "Teléfono2", nullable = true)
    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetoNegocio.Cliente[ id=" + id + " ]";
    }
    
}
