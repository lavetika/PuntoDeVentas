/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import imagenes.ImagenFondo;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import objetoNegocio.Categoria;
import objetoNegocio.Producto;
import objetoNegocio.Proveedor;
import repositories.CategoriaRepository;
import repositories.ProductoRepository;
import repositories.ProveedorRepository;

/**
 *
 * @author Estefanía Aguilar
 */
public class FmProducto extends javax.swing.JFrame {
    
    ProductoRepository productoRepository;
    ProveedorRepository proveedorRepository;
    CategoriaRepository categoriaRepository;

    /**
     * Creates new form FmProducto
     */
    public FmProducto(JFrame padre) {
        initComponents();
        this.setTitle("Producto");
        this.setLocationRelativeTo(null);
        this.setSize(620,666);
        this.productoRepository = new ProductoRepository();
        this.proveedorRepository = new ProveedorRepository();
        this.categoriaRepository = new CategoriaRepository();
        this.cargarTabla();
        agregarCategorias();
        agregarProveedores();
        //Imagen de fondo
//        try {
//            ImagenFondo fondo = new ImagenFondo(ImageIO.read(new File("C:/Users/laura/PuntoDeVentas/src/imagenes/blancoconcuadros.jpg")));
//            JPanel panel = (JPanel) this.getContentPane();
//            panel.setBorder(fondo);
//        } catch (IOException ex) {
//            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
        
        txtID.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbProveedor = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lbStock = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox<>();
        cbProveedor = new javax.swing.JComboBox<>();
        lbRegistroProductos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lblID.setText("ID");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lbNombre.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbNombre.setText("NOMBRE");
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lbProveedor.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbProveedor.setText("PROVEEDOR");
        getContentPane().add(lbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lblCategoria.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lblCategoria.setText("CATEGORIA");
        getContentPane().add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lbStock.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbStock.setText("STOCK");
        getContentPane().add(lbStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        lbPrecio.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbPrecio.setText("PRECIO ACTUAL");
        getContentPane().add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        txtPrecio.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 230, 30));

        txtID.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 230, 30));

        txtNombre.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 230, 30));

        txtStock.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 230, 30));

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 230, 30));

        cbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 230, 30));

        lbRegistroProductos.setFont(new java.awt.Font("Calibri Light", 3, 24)); // NOI18N
        lbRegistroProductos.setText("REGISTRO DE PRODUCTOS");
        getContentPane().add(lbRegistroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "PROVEEDOR", "CATEGORIA", "STOCK", "PRECIO ACTUAL"
            }
        ));
        tbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbProductos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 540, 170));

        btnCancelar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 110, 30));

        btnGuardar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 110, 30));

        btnEliminar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 110, 30));

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita.jpg"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 580, 320));

        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 580, 210));

        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseClicked
        mostrarInfo();
        btnGuardar.setText("Editar");
    }//GEN-LAST:event_tbProductosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu = new Menu ();
        menu.show();
        setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed
    
    private void eliminar(){
        int indiceFila = tbProductos.getSelectedRow();
        if(indiceFila == -1){
            JOptionPane.showMessageDialog(this, "Debes seleccionar una producto", "Información", JOptionPane.ERROR_MESSAGE);
        }else{
            Long idProducto = (Long)tbProductos.getValueAt(indiceFila, 0);
            productoRepository.eliminar(idProducto);
            limpiar();
            cargarTabla();
        }
    }
            
    public void agregarProveedores(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<Proveedor> proveedores = proveedorRepository.buscarTodas();
        for (Proveedor proveedor: proveedores) {
            modelo.addElement(proveedor);
            
        }
        cbProveedor.setModel(modelo);
    }
    
    public void agregarCategorias(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<Categoria> categorias = categoriaRepository.buscarTodas();
        for (Categoria categoria: categorias) {
            modelo.addElement(categoria);
            
        }
        cbCategoria.setModel(modelo);
    }
    
    private void mostrarInfo(){
        int indiceFila = tbProductos.getSelectedRow();
        Long idProducto = (Long)tbProductos.getValueAt(indiceFila, 0);
            Producto producto = productoRepository.buscarPorId(idProducto);
            
            txtID.setText(String.valueOf(producto.getId()));
            txtNombre.setText(producto.getNombre());
            cbProveedor.setSelectedItem(productoRepository.obtenerProveedor(producto.getProveedor().getId())); 
            cbCategoria.setSelectedItem(productoRepository.obtenerCategoria(producto.getCategoria().getId()));
            txtStock.setText(String.valueOf(producto.getStock()));
            txtPrecio.setText(String.valueOf(producto.getPrecioActual()));
            
            txtID.setEnabled(false);
            txtPrecio.setEnabled(false);
            txtNombre.setEnabled(false);
            txtStock.setEnabled(false);
            cbCategoria.setEnabled(false);
            cbProveedor.setEnabled(false);
    }
    
    private void limpiar(){
        txtID.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtNombre.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtStock.setEnabled(true);
        cbCategoria.setEnabled(true);
        cbProveedor.setEnabled(true);
        btnGuardar.setText("Guardar");
    }    
    private void guardar(){
        //Boton para editar
        if(btnGuardar.getText().equalsIgnoreCase("Editar")){
            txtNombre.setEnabled(true);
            txtPrecio.setEnabled(true);
            txtStock.setEnabled(true);
            cbCategoria.setEnabled(true);
            cbProveedor.setEnabled(true);
            btnGuardar.setText("Actualizar");
            
        }else if(btnGuardar.getText().equalsIgnoreCase("Actualizar") && !txtID.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtPrecio.getText().isEmpty() 
                && !txtStock.getText().isEmpty()){
            Proveedor proveedor = (Proveedor)cbProveedor.getSelectedItem();
            Categoria categoria = (Categoria)cbCategoria.getSelectedItem();
            
            //Se actualiza en la base de datos
            productoRepository.actualizar(new Producto(Long.parseLong(txtID.getText()), txtNombre.getText(), proveedor, categoria, 
                    Integer.parseInt(txtStock.getText()), Float.valueOf(txtPrecio.getText())));
            limpiar();
            
            txtNombre.setBorder(txtID.getBorder());
            txtPrecio.setBorder(txtID.getBorder());
            txtStock.setBorder(txtID.getBorder());
         
        //Validar que todos los campos esten llenos
        }else if(txtID.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtPrecio.getText().isEmpty() && !txtStock.getText().isEmpty()){
            
            Proveedor proveedor = (Proveedor)cbProveedor.getSelectedItem();
            Categoria categoria = (Categoria)cbCategoria.getSelectedItem();
            
            //Guardar en la base de datos
            productoRepository.guardar(new Producto(txtNombre.getText(), proveedor, categoria, Integer.parseInt(txtStock.getText()), 
                    Float.valueOf(txtPrecio.getText())));
            limpiar();
            
            txtNombre.setBorder(txtID.getBorder());
            txtPrecio.setBorder(txtID.getBorder());
            txtStock.setBorder(txtID.getBorder());
            
        }else{
            //Todos los campos son obligatorios
            JOptionPane.showMessageDialog(this, "Llenar campos obligatorios", "Alerta", JOptionPane.WARNING_MESSAGE);
            LineBorder border = new LineBorder(Color.red);
            if(txtNombre.getText().isEmpty()){
                txtNombre.setBorder(border);
            }else if(txtPrecio.getText().isEmpty()){
                txtPrecio.setBorder(border);
            }else{
                txtStock.setBorder(border);
            } 
        }
        cargarTabla();
        
    }
    private void cargarTabla(){
        ArrayList<Producto> productos = productoRepository.buscarTodas();        
        DefaultTableModel modelo = (DefaultTableModel)tbProductos.getModel();        
        modelo.setRowCount(0);
        for (Producto producto: productos) {
            Object[] fila = new Object[8];
            fila[0] = producto.getId();
            fila[1] = producto.getNombre();
            fila[2] = producto.getProveedor().getId();
            fila[3] = producto.getCategoria().getId();
            fila[4] = producto.getStock();
            fila[5] = producto.getPrecioActual();
            modelo.addRow(fila);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbProveedor;
    private javax.swing.JLabel lbRegistroProductos;
    private javax.swing.JLabel lbStock;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

}
