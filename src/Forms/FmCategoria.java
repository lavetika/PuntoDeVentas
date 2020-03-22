
package Forms;

import imagenes.ImagenFondo;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import objetoNegocio.Categoria;
import objetoNegocio.Producto;
import objetoNegocio.Proveedor;
import repositories.CategoriaRepository;

/**
 *
 * @author Estefanía Aguilar
 */
public class FmCategoria extends javax.swing.JFrame {

    CategoriaRepository categoriaReposity;
    /**
     * Creates new form FmCategoria
     */
    public FmCategoria(JFrame padre) {
        initComponents();
        this.setTitle("Categoría");
        this.setLocationRelativeTo(null);
        this.categoriaReposity = new CategoriaRepository();
        this.cargarTabla();
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

        lblID = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lbRegistroCategorias = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCategorias = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblBlanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(638, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lblID.setText("ID");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lbNombre.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbNombre.setText("NOMBRE");
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lbDescripcion.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lbDescripcion.setText("DESCRIPCIÓN");
        getContentPane().add(lbDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtID.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 230, 30));

        txtNombre.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 230, 30));

        lbRegistroCategorias.setFont(new java.awt.Font("Calibri Light", 3, 24)); // NOI18N
        lbRegistroCategorias.setText("REGISTRO DE CATEGORIAS");
        getContentPane().add(lbRegistroCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        tbCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "DESCRICION"
            }
        ));
        tbCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCategoriasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbCategorias);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 560, 170));

        btnCancelar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 110, 30));

        btnGuardar.setBackground(new java.awt.Color(0, 102, 51));
        btnGuardar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 110, 30));

        txtDescripcion.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 230, 30));

        btnEliminar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 110, 30));

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita.jpg"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 600, 250));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 600, 210));

        jLabel5.setBackground(new java.awt.Color(255, 102, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unnamed.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 510, 50));

        lblBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blancosolido.jpg"))); // NOI18N
        getContentPane().add(lblBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tbCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCategoriasMouseClicked
        mostrarInfo();
        btnGuardar.setText("Editar");
    }//GEN-LAST:event_tbCategoriasMouseClicked

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu = new Menu();
        menu.show();
        setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (!String.valueOf(evt.getKeyChar()).matches("^[a-zA-Z]$")){            
            evt.consume();            
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if (!String.valueOf(evt.getKeyChar()).matches("^[a-zA-Z]$")){            
            evt.consume();            
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void limpiar(){
        txtID.setText("");
        txtNombre.setText("");;
        txtDescripcion.setText("");
        txtNombre.setEnabled(true);
        txtDescripcion.setEnabled(true);
        btnGuardar.setText("Guardar");
    }
    
    private void cargarTabla(){
        ArrayList<Categoria> categorias = categoriaReposity.buscarTodas();        
        DefaultTableModel modelo = (DefaultTableModel)tbCategorias.getModel();        
        modelo.setRowCount(0);
        for (Categoria categoria: categorias) {
            Object[] fila = new Object[8];
            fila[0] = categoria.getId();
            fila[1] = categoria.getNombre();
            fila[2] = categoria.getDescripcion();
            modelo.addRow(fila);
        }
    }
    private void eliminar(){
        int indiceFila = tbCategorias.getSelectedRow();
        if(indiceFila == -1){
            JOptionPane.showMessageDialog(this, "Debes seleccionar una categoría", "Información", JOptionPane.WARNING_MESSAGE);
        }else{
            Long proveedor = (Long)tbCategorias.getValueAt(indiceFila, 0);
            categoriaReposity.eliminar(proveedor);
            limpiar();
            cargarTabla();
        }
    }
    
    private void guardar(){
        if(btnGuardar.getText().equalsIgnoreCase("Editar")){
            btnGuardar.setText("Actualizar");
            txtNombre.setEnabled(true);
            txtDescripcion.setEnabled(true);
            
        }else if(btnGuardar.getText().equalsIgnoreCase("Actualizar") && !txtID.getText().isEmpty() && 
                !txtNombre.getText().isEmpty() && !txtDescripcion.getText().isEmpty()){
            
            //Se actualiza en la base de datos
            categoriaReposity.actualizar(new Categoria(Long.parseLong(txtID.getText()), txtNombre.getText(), 
                    txtDescripcion.getText()));
            limpiar();
            
            txtNombre.setBorder(txtID.getBorder());
            txtDescripcion.setBorder(txtID.getBorder());
            
        //Validar que todos los campos esten llenos    
        }else if(txtID.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtDescripcion.getText().isEmpty() ){
            
            //Guardar en la base de datos
            categoriaReposity.guardar(new Categoria(txtNombre.getText(), txtDescripcion.getText())); 
            limpiar();
            
            txtNombre.setBorder(txtID.getBorder());
            txtDescripcion.setBorder(txtID.getBorder());
        
        //If anidado para indicar los campos obligatorios que faltan por llenarse.
        }else{
            //Todos los campos son obligatorios
            JOptionPane.showMessageDialog(this, "Llenar campos obligatorios", "Alerta", JOptionPane.WARNING_MESSAGE);
            
            LineBorder border = new LineBorder(Color.red);   
            if(txtNombre.getText().isEmpty()){
                txtNombre.setBorder(border);
            }else{
                txtDescripcion.setBorder(border);
            }
        }
        cargarTabla();
    }
    private void mostrarInfo(){
        int indiceFila = tbCategorias.getSelectedRow();
        Long idCategoria = (Long)tbCategorias.getValueAt(indiceFila, 0);
            Categoria categoria = categoriaReposity.buscarPorId(idCategoria);
            
            txtID.setText(String.valueOf(categoria.getId()));
            txtNombre.setText(categoria.getNombre());
            txtDescripcion.setText(categoria.getDescripcion());
            
            txtID.setEnabled(false);
            txtNombre.setEnabled(false);
            txtDescripcion.setEnabled(false);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/categoriaa.png"));
        return retValue;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRegistroCategorias;
    private javax.swing.JLabel lblBlanco;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tbCategorias;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
