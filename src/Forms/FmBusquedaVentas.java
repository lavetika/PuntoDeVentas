/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Operaciones.Operaciones;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import objetoNegocio.Cliente;
import objetoNegocio.Producto;
import objetoNegocio.Venta;
import objetoNegocio.rel_productosventas;
import objetosServicio.Fecha;
import objetosServicio.Periodo;
import repositories.ClienteRepository;
import repositories.ProductoRepository;
import repositories.VentaRepository;

/**
 *
 * @author Estefanía Aguilar
 */
public class FmBusquedaVentas extends javax.swing.JFrame {
    ClienteRepository clienteRepository;
    ProductoRepository productoRepository;
    VentaRepository ventaRepository;
    Operaciones caja;
    
    Periodo periodoBusqueda;

    /**
     * Creates new form FmBusquedaVentas
     */
    public FmBusquedaVentas(JFrame padre) {
        initComponents();
        this.setTitle("Búsqueda de venta");
        this.setLocationRelativeTo(null);
        this.clienteRepository = new ClienteRepository();
        this.productoRepository = new ProductoRepository();
        this.ventaRepository = new VentaRepository();
        this.caja = new Operaciones();
        
        txtCliente.setEnabled(false);
        txtDescuento.setEnabled(false);
        txtSubtotal.setEnabled(false);
        txtTotal.setEnabled(false);
        
       agregarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCliente = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbBuscadorVentas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProducto = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtFechaHasta = new javax.swing.JTextField();
        cbCliente = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBVentas = new javax.swing.JTable();
        lbDetalleVenta = new javax.swing.JLabel();
        lbProductos = new javax.swing.JLabel();
        txtFechaDe = new javax.swing.JTextField();
        lbCliente1 = new javax.swing.JLabel();
        lbSubtotal = new javax.swing.JLabel();
        lbDescuento = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();
        lblDetalle = new javax.swing.JLabel();
        lblLupa = new javax.swing.JLabel();
        lblCarritoIcono = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblBlanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1228, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCliente.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbCliente.setText("CLIENTE");
        getContentPane().add(lbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 100, -1));

        lbFecha.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbFecha.setText("FECHA");
        getContentPane().add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, -1));

        lbBuscadorVentas.setFont(new java.awt.Font("Calibri Light", 3, 24)); // NOI18N
        lbBuscadorVentas.setText("BUSCADOR DE VENTAS");
        getContentPane().add(lbBuscadorVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 250, -1));

        tbProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "PRODUCTO", "PRECIO ACTUAL", "CANTIDAD", "MONTO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbProducto);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 580, 180));

        btnCancelar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 150, 40));

        btnBuscar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 150, 40));

        txtFechaHasta.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        txtFechaHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaHastaKeyTyped(evt);
            }
        });
        getContentPane().add(txtFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 170, 30));

        cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 380, 30));

        TBVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CLIENTE", "FECHA", "SUBTOTAL", "DESCUENTO", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBVentasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TBVentas);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 500, 180));

        lbDetalleVenta.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbDetalleVenta.setText("DETALLES DE VENTA");
        getContentPane().add(lbDetalleVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, 40));

        lbProductos.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbProductos.setText("PRODUCTOS ");
        getContentPane().add(lbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        txtFechaDe.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        txtFechaDe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaDeKeyTyped(evt);
            }
        });
        getContentPane().add(txtFechaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, 30));

        lbCliente1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbCliente1.setText("CLIENTE");
        getContentPane().add(lbCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 130, -1));

        lbSubtotal.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbSubtotal.setText("SUBTOTAL        $");
        getContentPane().add(lbSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 180, -1));

        lbDescuento.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbDescuento.setText("DESCUENTO    %");
        getContentPane().add(lbDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 180, -1));

        lbTotal.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbTotal.setText("TOTAL               $");
        getContentPane().add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 180, -1));

        txtTotal.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 280, 30));

        txtDescuento.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 280, 30));

        txtSubtotal.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 280, 30));

        txtCliente.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 280, 30));

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita.jpg"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 30, -1, -1));

        lblDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/detalle_opt.png"))); // NOI18N
        getContentPane().add(lblDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 30, 30));

        lblLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarcliente_opt.png"))); // NOI18N
        getContentPane().add(lblLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        lblCarritoIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos_opt.png"))); // NOI18N
        getContentPane().add(lblCarritoIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 40, 40));

        jLabel5.setBackground(new java.awt.Color(255, 102, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unnamed.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 90));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 520, 420));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 640, 260));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 640, 250));

        lblBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blancosolido.jpg"))); // NOI18N
        getContentPane().add(lblBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu = new Menu ();
        menu.show();
        setVisible(false);        
    }//GEN-LAST:event_btnMenuActionPerformed

    private void TBVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBVentasMouseClicked
        mostrarInfo();
        
    }//GEN-LAST:event_TBVentasMouseClicked

    private void txtFechaDeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaDeKeyTyped
        if (!String.valueOf(evt.getKeyChar()).matches("^[0-9 /]$")){            
            evt.consume();            
        }
    }//GEN-LAST:event_txtFechaDeKeyTyped

    private void txtFechaHastaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaHastaKeyTyped
        if (!String.valueOf(evt.getKeyChar()).matches("^[0-9 /]$")){            
            evt.consume();            
        }
    }//GEN-LAST:event_txtFechaHastaKeyTyped
    
    private void cancelar() {
        DefaultTableModel tb = (DefaultTableModel) TBVentas.getModel();
        int a = TBVentas.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
        
        DefaultTableModel modeloProducto = (DefaultTableModel) tbProducto.getModel();
        int b = tbProducto.getRowCount() - 1;
        for (int i = b; i >= 0; i--) {          
        modeloProducto.removeRow(modeloProducto.getRowCount()-1);
        }
        
        txtFechaDe.setText("");
        txtFechaHasta.setText("");
        txtCliente.setText("");
        txtDescuento.setText("");
        txtSubtotal.setText("");
        txtTotal.setText("");
    }
    private void mostrarInfo() {

        //Se muestra la informacion en los campos de textos.
        int indiceFila = TBVentas.getSelectedRow();
        Long idVentas = (Long) TBVentas.getValueAt(indiceFila, 0);
        Venta venta = ventaRepository.buscarPorId(idVentas);
        
        txtCliente.setText(venta.getCliente().getNombre());
        txtSubtotal.setText(String.valueOf(caja.descuentoInverso(venta.getMontoFinal(), venta.getDescuento())));
        txtDescuento.setText(String.valueOf(venta.getDescuento()));
        txtTotal.setText(String.valueOf(venta.getMontoFinal()));

        //Se muestra la informacion de la venta
        
        DefaultTableModel tablaProductosVenta = (DefaultTableModel) tbProducto.getModel();
        tablaProductosVenta.setRowCount(0);
        Object[] fila = new Object[5];
        
        for (rel_productosventas productoVenta : venta.getProductos()) {
            
            fila[0] = productoVenta.getProducto().getId();
            fila[1] = productoVenta.getProducto().getNombre();
            fila[2] = productoVenta.getPrecio();
            fila[3] = productoVenta.getCantidad();
            fila[4] = productoVenta.getMontoFinal();
            
            tablaProductosVenta.addRow(fila);
        }
    }
    
    public void buscar(){
        if(!txtFechaDe.getText().isEmpty() && !txtFechaHasta.getText().isEmpty()){
            if(txtFechaDe.getText().matches("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$") &&
                    txtFechaHasta.getText().matches("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$")){
                //^[0-3]{1}[0-9]{1}/[0-1]{1}[1-2]{1}/[1-9]{1}[0-9]{3}$
                //^([0-2][0-9]|3[0-1])(\/|-)(0[1-9]|1[0-2])\2(\d{4})$
            Cliente cliente = (Cliente)cbCliente.getSelectedItem();

        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaD, fechaH;
        
        try {
            fechaD = new java.sql.Date(formater.parse(txtFechaDe.getText()).getTime());
            fechaH = new java.sql.Date(formater.parse(txtFechaHasta.getText()).getTime());

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Fecha incorrecta", "Alerta", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        periodoBusqueda = new Periodo(new Fecha(fechaD.getDay(), fechaD.getMonth(), fechaD.getYear()), 
                new Fecha(fechaH.getDay(), fechaH.getMonth(), fechaH.getYear()));

        List<Venta> ventas = new ArrayList<>();
        
        ventas = ventaRepository.buscarTodas();
        DefaultTableModel tablaVentas = (DefaultTableModel) TBVentas.getModel();
        tablaVentas.setRowCount(0);
        Object[] fila = new Object[6];
        
        for (Venta venta : ventas) {

            Date fecha = venta.getFecha();
            if (periodoBusqueda.contiene(new Fecha(fecha.getDay(), fecha.getMonth(), fecha.getYear()))
                    && venta.getCliente().getId().equals(cliente.getId())) {

                fila[0] = venta.getId();
                fila[1] = venta.getCliente().getId();
                fila[2] = venta.getFecha();
                fila[3] = caja.descuentoInverso(venta.getMontoFinal(), venta.getDescuento());
                fila[4] = "%" + venta.getDescuento();
                fila[5] = venta.getMontoFinal();
                tablaVentas.addRow(fila);
            }
        }
        }
//            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto. dd/mm/yyyy", "Alerta", JOptionPane.WARNING_MESSAGE);
        }else{
            //Todos los campos son obligatorios
            JOptionPane.showMessageDialog(this, "Llenar campos obligatorios", "Alerta", JOptionPane.WARNING_MESSAGE);
            LineBorder border = new LineBorder(Color.red);
            if (txtFechaDe.getText().isEmpty()) {
                txtFechaDe.setBorder(border);
            } 
            if (txtFechaHasta.getText().isEmpty()) {
                txtFechaHasta.setBorder(border);
            }
        }
    
        
    }
    
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
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/etiquetaventa.png"));
        return retValue;
    }
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBVentas;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbBuscadorVentas;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbCliente1;
    private javax.swing.JLabel lbDescuento;
    private javax.swing.JLabel lbDetalleVenta;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbProductos;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lblBlanco;
    private javax.swing.JLabel lblCarritoIcono;
    private javax.swing.JLabel lblDetalle;
    private javax.swing.JLabel lblLupa;
    private javax.swing.JTable tbProducto;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFechaDe;
    private javax.swing.JTextField txtFechaHasta;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
