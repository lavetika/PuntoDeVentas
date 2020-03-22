/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Operaciones.Operaciones;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetoNegocio.Cliente;
import objetoNegocio.Producto;
import objetoNegocio.Venta;
import objetoNegocio.rel_productosventas;
import objetosServicio.Fecha;
import repositories.ClienteRepository;
import repositories.ProductoRepository;
import repositories.VentaRepository;

/**
 *
 * @author Estefanía Aguilar
 */
public class FmRegistroVentas extends javax.swing.JFrame {
    VentaRepository ventaRepository;
    ClienteRepository clienteRepository;
    ProductoRepository productoRepository;
    List<Producto> carrito;
    List<Producto> mostrador;
    DefaultTableModel modeloCarrito;
    Operaciones caja;
    /**
     * Creates new form FmVenta
     */
    
    public FmRegistroVentas(JFrame padre) {
        initComponents();
        this.setTitle("Registro de venta");
        this.setLocationRelativeTo(null);
        this.ventaRepository = new VentaRepository();
        this.carrito = new ArrayList<>();
        this.productoRepository = new ProductoRepository();
        this.clienteRepository = new ClienteRepository();
        modeloCarrito = (DefaultTableModel) tbCarrito.getModel();
        modeloCarrito.setRowCount(0);
        mostrador = new ArrayList<>();
        caja = new Operaciones();
        agregarClientes();
        
        txtSubtotal.setEnabled(false);
        txtTotal.setEnabled(false);
       
        //Imagen de fondo
//        try {
//            ImagenFondo fondo = new ImagenFondo(ImageIO.read(new File("C:/Users/laura/PuntoDeVentas/src/imagenes/blancoconcuadros.jpg")));
//            JPanel panel = (JPanel) this.getContentPane();
//            panel.setBorder(fondo);
//        } catch (IOException ex) {
//            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
        cargarTablaProductos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        lbCliente = new javax.swing.JLabel();
        lbSubtotal = new javax.swing.JLabel();
        lbDescuento = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCarrito = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnDescuento = new javax.swing.JButton();
        txtDescuento = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        cbCliente = new javax.swing.JComboBox<>();
        lbBuscador = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        lbBuscador1 = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        lbProductos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1270, 598));
        setPreferredSize(new java.awt.Dimension(1270, 598));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCliente.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbCliente.setText("CLIENTE");
        getContentPane().add(lbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, -1));

        lbSubtotal.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbSubtotal.setText("SUBTOTAL     $");
        getContentPane().add(lbSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, -1));

        lbDescuento.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbDescuento.setText("DESCUENTO %");
        getContentPane().add(lbDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, -1));

        lbTotal.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbTotal.setText("TOTAL");
        getContentPane().add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 90, -1));

        txtTotal.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 270, 30));

        tbCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "PRECIO ACTUAL", "CANTIDAD", "MONTO TOTAL"
            }
        ));
        tbCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCarritoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbCarrito);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 710, 170));

        btnCancelar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 190, 30));

        btnDescuento.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnDescuento.setText("Aplicar");
        btnDescuento.setToolTipText("");
        btnDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 120, 30));

        txtDescuento.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        txtDescuento.setText("0");
        txtDescuento.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtDescuentoComponentAdded(evt);
            }
        });
        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyTyped(evt);
            }
        });
        getContentPane().add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 140, 30));

        txtSubtotal.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 270, 30));

        cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 270, 30));

        lbBuscador.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbBuscador.setText("BUSCADOR DE PRODUCTOS");
        getContentPane().add(lbBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, 30));

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "Precio Actual", "Stock"
            }
        ));
        tbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbProductos);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 710, 170));

        lbBuscador1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbBuscador1.setText("BUSCADOR DE PRODUCTOS");
        getContentPane().add(lbBuscador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));
        getContentPane().add(txtBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 290, 30));

        btnBuscar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 110, 30));

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita.jpg"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

        lbProductos.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbProductos.setText("CARRITO DE COMPRAS");
        getContentPane().add(lbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 3, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE VENTAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 250, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 750, 250));

        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 90));

        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 750, 270));

        btnGuardar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnGuardar.setText("Registrar");
        btnGuardar.setToolTipText("");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 200, 30));

        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 470, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoActionPerformed
        txtTotal.setText(String.valueOf(caja.montoFinal(Float.parseFloat(txtSubtotal.getText()), Float.parseFloat(txtDescuento.getText()))));
    }//GEN-LAST:event_btnDescuentoActionPerformed

    private void tbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseClicked
     
        cargarTablaCarrito();
        actualizarSubtotal();
    }//GEN-LAST:event_tbProductosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Producto producto = productoRepository.buscarPorId(Long.parseLong(txtBuscador.getText()));
        //ventaRepository.obtenerProducto(Long.parseLong(txtBuscador.getText()));
        if ((Integer) tbProductos.getValueAt(mostrador.indexOf(producto), 3) > 0) {
            
            //Se añade producto al carrito por primera vez
            Object[] fila = new Object[5];
            
            if (carrito.contains(producto) == false) {
                carrito.add(producto);
                fila[0] = producto.getId();
                fila[1] = producto.getNombre();
                fila[2] = producto.getPrecioActual();
                fila[3] = 1;
                fila[4] = producto.getPrecioActual();
                modeloCarrito.addRow(fila);
                
                //Si ya hay un producto igual en el carrito
            } else if (carrito.contains(producto)) {
                
                //Se obtiene la cantidad de producto que ya hay en el carrito.
                int cantidad = (Integer) modeloCarrito.getValueAt(carrito.indexOf(producto), 3);
                
                //Validacion del stock
                if ((cantidad + 1) <= producto.getStock()) {
                    
                    //Se modifican las celdas de cantidad y monto total
                    modeloCarrito.setValueAt((cantidad + 1), carrito.indexOf(producto), 3);
                    modeloCarrito.setValueAt(producto.getPrecioActual() * cantidad, carrito.indexOf(producto), 4);
                }
            }
            
            //Actualizar las celdas de stock de productos, sin modificar la base de datos hasta que se guarde.
            int cantidad = (Integer) tbProductos.getValueAt(mostrador.indexOf(producto), 3);
            tbProductos.setValueAt((cantidad-1), mostrador.indexOf(producto), 3);
                        
            }       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu = new Menu ();
        menu.show();
        setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
//        txtTotal.setText(String.valueOf(caja.montoFinal(Float.parseFloat(txtSubtotal.getText()), Float.parseFloat(txtDescuento.getText()))));
    
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void txtDescuentoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtDescuentoComponentAdded
    }//GEN-LAST:event_txtDescuentoComponentAdded

    private void tbCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCarritoMouseClicked
         //Obtego el producto seleccionado de la tabla
        int indiceFila = tbCarrito.getSelectedRow();
        Long idProducto = (Long) tbCarrito.getValueAt(indiceFila, 0);
        Producto producto = productoRepository.buscarPorId(idProducto);
        
        //Se obtiene la cantidad de producto que ya hay en el carrito a devolver.
        int cantidad = (Integer) tbProductos.getValueAt(mostrador.indexOf(producto), 3);

        //Validacion del stock
        if (((Integer)(tbProductos.getValueAt(mostrador.indexOf(producto), 3))) < producto.getStock()) {

            //Se modifican las celdas de cantidad
            tbProductos.setValueAt((cantidad + 1), mostrador.indexOf(producto), 3);
            
            //Actualizar las celdas de cantidad de carrito.
            int cantidadCarrito = (Integer) modeloCarrito.getValueAt(carrito.indexOf(producto), 3);
            modeloCarrito.setValueAt((cantidadCarrito-1), carrito.indexOf(producto), 3);
            
            //Se elimina el producto del carrito si ya se regresaron todas las cantidades que tenian
            if(((Integer)modeloCarrito.getValueAt(carrito.indexOf(producto), 3)) == 0){
                modeloCarrito.removeRow(carrito.indexOf(producto));
                carrito.remove(producto);
            }
        }
        actualizarSubtotal();
            
    }//GEN-LAST:event_tbCarritoMouseClicked

    private void txtDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyTyped

    }//GEN-LAST:event_txtDescuentoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed
    private void actualizarSubtotal(){
        //Actualizar precios
        List<Float> montosTotales = new ArrayList<>();
        for (int i = 0; i < modeloCarrito.getRowCount(); i++) {

            //Se obtiene todos los precios totales del carrito
            montosTotales.add((Float) modeloCarrito.getValueAt(i, 4));
        }
            //Se muestra los calculos en el campo
            txtSubtotal.setText(String.valueOf(caja.subtotal(montosTotales)));
    }
    
    private void cancelar(){
        DefaultTableModel tb = (DefaultTableModel) tbCarrito.getModel();
        int a = tbCarrito.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
        
        cargarTablaProductos();
        carrito.clear();
        
        txtDescuento.setText("");
        txtSubtotal.setText("");
        txtTotal.setText("");
    }
    
    private void cargarTablaProductos(){
        mostrador = productoRepository.buscarTodas();        
        DefaultTableModel modelo1 = (DefaultTableModel)tbProductos.getModel();        
        modelo1.setRowCount(0);
        for (Producto producto: mostrador) {
            Object[] fila = new Object[4];
            fila[0] = producto.getId();
            fila[1] = producto.getNombre();
            fila[2] = producto.getPrecioActual();
            fila[3] = producto.getStock();
            modelo1.addRow(fila);
        }
    }
    
    private void cargarTablaCarrito(){
        
        //Obtego el producto seleccionado de la tabla
        int indiceFila = tbProductos.getSelectedRow();
        Long idProducto = (Long) tbProductos.getValueAt(indiceFila, 0);
        Producto producto = productoRepository.buscarPorId(idProducto);
        
        if ((Integer) tbProductos.getValueAt(mostrador.indexOf(producto), 3) > 0) {
            
            //Se añade producto al carrito por primera vez
            Object[] fila = new Object[5];
            
            if (carrito.contains(producto) == false) {
                carrito.add(producto);
                fila[0] = producto.getId();
                fila[1] = producto.getNombre();
                fila[2] = producto.getPrecioActual();
                fila[3] = 1;
                fila[4] = producto.getPrecioActual();
                modeloCarrito.addRow(fila);
                
                //Si ya hay un producto igual en el carrito
            } else if (carrito.contains(producto)) {
                
                //Se obtiene la cantidad de producto que ya hay en el carrito.
                int cantidad = (Integer) modeloCarrito.getValueAt(carrito.indexOf(producto), 3);
                
                //Validacion del stock
                cantidad = cantidad + 1;
                if ((cantidad) <= producto.getStock()) {
                    
                    //Se modifican las celdas de cantidad y monto total
                    modeloCarrito.setValueAt((cantidad), carrito.indexOf(producto), 3);
                    modeloCarrito.setValueAt(producto.getPrecioActual() * cantidad, carrito.indexOf(producto), 4);
                }
            }
            
            //Actualizar las celdas de stock de productos, sin modificar la base de datos hasta que se guarde.
            int cantidad = (Integer) tbProductos.getValueAt(mostrador.indexOf(producto), 3);
            tbProductos.setValueAt((cantidad-1), mostrador.indexOf(producto), 3);
            }
        }
    
    public void guardar(){
        Cliente cliente = (Cliente)cbCliente.getSelectedItem();   
        
        //Fecha actual
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        Fecha fechaActual = new Fecha();
        
        Venta venta;
        
        try{
        venta = new Venta(new java.sql.Date(formater.parse(fechaActual.toString()).getTime()),
                cliente, Float.parseFloat(txtDescuento.getText()),Float.parseFloat(txtTotal.getText()));
        
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(this, "Fecha incorrecta", "Alerta", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        List<rel_productosventas> productoVentas = new ArrayList<>();
        
        //Relacion entre productos y ventas
        for (Producto producto : carrito) {
            
            //Actualizar la base de datos de los productos
            producto.setStock(((Integer)(tbProductos.getValueAt(mostrador.indexOf(producto), 3))));
            productoRepository.actualizar(producto);
            
            productoVentas.add(new rel_productosventas(producto, venta, producto.getPrecioActual(),((Float)(modeloCarrito.getValueAt(carrito.indexOf(producto), 4))), ((Integer)(modeloCarrito.getValueAt(carrito.indexOf(producto), 3)))));
        }
        
        //Guardar la venta en la base de datos
        venta.setProductos(productoVentas);
        ventaRepository.guardar(venta);
        
        //Se ha realizado una venta exitosa.
        JOptionPane.showMessageDialog(null, "Venta exitosa");
        
        //Limpiar todo
        cancelar();
    }
    
    //Solucionar agregacion (toString)
    public void agregarClientes(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<Cliente> clientes = clienteRepository.buscarTodas();
        for (Cliente cliente: clientes) {
            modelo.addElement(cliente);            
        }
        cbCliente.setModel(modelo);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/caja.png"));
        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDescuento;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbBuscador;
    private javax.swing.JLabel lbBuscador1;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbDescuento;
    private javax.swing.JLabel lbProductos;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tbCarrito;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
