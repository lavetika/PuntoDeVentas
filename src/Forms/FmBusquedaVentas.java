/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author Estefanía Aguilar
 */
public class FmBusquedaVentas extends javax.swing.JFrame {

    /**
     * Creates new form FmBusquedaVentas
     */
    public FmBusquedaVentas() {
        initComponents();
        this.setTitle("Búsqueda de venta");
        this.setLocationRelativeTo(null);
        
        txtCliente.setEnabled(false);
        txtDescuento.setEnabled(false);
        txtSubtotal.setEnabled(false);
        txtTotal.setEnabled(false);
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
        btnGuardar = new javax.swing.JButton();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1228, 550));
        setPreferredSize(new java.awt.Dimension(1228, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCliente.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbCliente.setText("CLIENTE");
        getContentPane().add(lbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        lbFecha.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbFecha.setText("FECHA");
        getContentPane().add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, -1));

        lbBuscadorVentas.setFont(new java.awt.Font("Calibri Light", 3, 24)); // NOI18N
        lbBuscadorVentas.setText("BUSCADOR DE VENTAS");
        getContentPane().add(lbBuscadorVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 250, -1));

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
        ));
        jScrollPane3.setViewportView(tbProducto);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 580, 180));

        btnCancelar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 220, 30));

        btnGuardar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnGuardar.setText("Buscar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 220, 30));

        txtFechaHasta.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 170, 30));

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
        ));
        jScrollPane4.setViewportView(TBVentas);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 500, 180));

        lbDetalleVenta.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbDetalleVenta.setText("DETALLES DE VENTA");
        getContentPane().add(lbDetalleVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        lbProductos.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbProductos.setText("PRODUCTOS ");
        getContentPane().add(lbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

        txtFechaDe.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtFechaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, 30));

        lbCliente1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbCliente1.setText("CLIENTE");
        getContentPane().add(lbCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 110, -1));

        lbSubtotal.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbSubtotal.setText("SUBTOTAL");
        getContentPane().add(lbSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 130, -1));

        lbDescuento.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbDescuento.setText("DESCUENTO");
        getContentPane().add(lbDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 150, -1));

        lbTotal.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbTotal.setText("TOTAL");
        getContentPane().add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 90, -1));

        txtTotal.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 310, 30));

        txtDescuento.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 310, 30));

        txtSubtotal.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 310, 30));

        txtCliente.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 310, 30));

        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 90));

        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 540, 420));

        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 640, 260));

        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 640, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FmBusquedaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmBusquedaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmBusquedaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmBusquedaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmBusquedaVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBVentas;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
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
    private javax.swing.JTable tbProducto;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFechaDe;
    private javax.swing.JTextField txtFechaHasta;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
