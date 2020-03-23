
package repositories;

/**
 *
 * @author Estefanía Aguilar
 */
public class Control {
    
    /**
     * Esta clase funciona como intermediaria entre la capa de repositorios y la 
     * presentación, se retornan los objetos repository si estos existen y su
     * valor es diferente a null, de no ser así se crea uno nuevo y se retorna.
     **/
    
    //Atributos de la clase Control
     private ClienteRepository clienteRepository;
     private CategoriaRepository categoriaRepository;
     private ProductoRepository productoRepository;
     private ProveedorRepository proveedorRepository;
     private VentaRepository ventaRepository;
    
    public ClienteRepository getClienteRepository(){
        if(this.clienteRepository != null){
            return this.clienteRepository;
        }else{
            this.clienteRepository = new ClienteRepository();
            return this.clienteRepository;
        }
    }   
    
    public CategoriaRepository getCategoriaRepository(){
        if(this.categoriaRepository != null){
            return this.categoriaRepository;
        }else{
            this.categoriaRepository = new CategoriaRepository();
            return this.categoriaRepository;
        }
    }
    
    public ProductoRepository getProductoRepository(){
        if(this.productoRepository != null){
            return this.productoRepository;
        }else{
            this.productoRepository = new ProductoRepository();
            return this.productoRepository;
        }
    }
    
    public ProveedorRepository getProveedorRepository (){
        if(this.proveedorRepository != null){
            return this.proveedorRepository;
        }else{
            this.proveedorRepository = new ProveedorRepository();
            return this.proveedorRepository;
        }
    }
    
    public VentaRepository getVentaRepository(){
        if(this.ventaRepository != null){
            return this.ventaRepository;
        }else{
            this.ventaRepository = new VentaRepository();
            return this.ventaRepository;
        }
    }
    
}
