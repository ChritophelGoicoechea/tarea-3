package GUImantenimientos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import negocio.Productos.AgregarProducto;
import negocio.Productos.ClsProducto;

public class Productos extends javax.swing.JInternalFrame {
    int item = 0; //Contador para los datos presentados en la tabla.
    DefaultTableModel modelo = new DefaultTableModel();
    int idp;
    int filas;

    public Productos() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnActivo = new javax.swing.JRadioButton();
        btnInactivo = new javax.swing.JRadioButton();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        txtVencimiento = new javax.swing.JTextField();
        JID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manteniminetos de Productos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Fecha de vencimiento");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Descripcion");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Categoria");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Estado");

        btnActivo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnActivo.setText("Activa");
        btnActivo.setName("btnActivo"); // NOI18N
        btnActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivoActionPerformed(evt);
            }
        });

        btnInactivo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnInactivo.setText("Inactivo");
        btnInactivo.setName("btnInactivo"); // NOI18N
        btnInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivoActionPerformed(evt);
            }
        });

        txtNombre.setName("txtNombre"); // NOI18N

        txtCodigo.setName("txtCodigo"); // NOI18N

        txtCategoria.setName("txtCateg"); // NOI18N

        txtDesc.setName("txtDesc"); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Editar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.setToolTipText("");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Codigo", "Fecha de vencimiento", "Categoria", "Estado", "Descripcion"
            }
        ));
        TablaDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDetalleMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaDetalle);

        txtVencimiento.setName("txtVencimiento"); // NOI18N
        txtVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVencimientoActionPerformed(evt);
            }
        });

        JID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        JID.setText("ID producto");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MainLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(97, 97, 97)
                                        .addComponent(btnActivo)
                                        .addGap(99, 99, 99)
                                        .addComponent(btnInactivo))
                                    .addGroup(MainLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(MainLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MainLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MainLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MainLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MainLayout.createSequentialGroup()
                                        .addComponent(JID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MainLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel4))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)))
                        .addGap(0, 217, Short.MAX_VALUE))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addComponent(jScrollPane4))))
                .addContainerGap())
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(btnActivo)
                            .addComponent(btnInactivo)))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 999, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivoActionPerformed
        if(this.btnInactivo.isSelected() == true || this.btnInactivo.isEnabled() == false){
                   this.btnInactivo.setSelected(false);
                    this.btnActivo.setSelected(true);
                   this.btnInactivo.setContentAreaFilled(false);
                   this.btnActivo.setEnabled(false);
                   this.btnInactivo.setEnabled(true);
                } else{
                   this.btnInactivo.setEnabled(true);
               }    

    }//GEN-LAST:event_btnActivoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Boolean estado = this.btnActivo.isSelected();
        String valer;
        if (estado == true) {
           valer = ("Activo");
       } else{
          valer = ("Inactivo");
       }
                
        String[]datos = new String[7];
        datos[0]= txtId.getText();
        datos[1]= txtNombre.getText();
        datos[2] = txtCodigo.getText();
        datos[3] = txtVencimiento.getText();
        datos[4] = txtCategoria.getText();
        datos[5] = valer;
        datos[6] = txtDesc.getText();
      
                for (int i =  0; i <= TablaDetalle.getColumnCount();i++){
              modelo.setValueAt(datos[i], filas, i);
           }
        
   
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   public void agregarProducto(){  
  
                   /*<-- IMPORTANTE -->*/
    modelo = (DefaultTableModel)TablaDetalle.getModel();//Sustituir TablaDetalle por el nombre de la tabla. Descomentar cuando se tenga la tabla.
                  
    item =  item + 1; //elevar a uno el contador.
//    idp = Integer.parseInt(p.getId());
   
    //Ahora vamos a capturar los valores que se encuentran actualmente insertados en la ventana.

    String nomp = this.txtNombre.getText(); //Esto se puede modificar en txtProducto.getText(). Si se quiere usar p.getnombreProducto()
                                         //Hay que sustituir los valores indicados en la ClsProducto. Y así para todos los demás.
    String codigop = this.txtCodigo.getText();
    String descp = this.txtDesc.getText();
    String vencp = this.txtVencimiento.getText();
    String categp = this.txtCategoria.getText();
    Boolean estadop = this.btnActivo.isSelected();

    ArrayList list = new ArrayList();
    list.add(item);
    list.add(nomp);
    list.add(codigop);
    list.add(vencp);
    list.add(categp);
       if (estadop == true) {
           list.add("Activo");
       } else{
           list.add("Inactivo");
       }
    list.add(descp);
    //Entrar los valores a una lista.
    Object[] ob = new Object[7];
    ob[0] = list.get(0);
    ob[1] = list.get(1);
    ob[2] = list.get(2);
    ob[3] = list.get(3);
    ob[4] = list.get(4);
    ob[5] = list.get(5);
    ob[6] = list.get(6);
    modelo.addRow(ob);
    TablaDetalle.setModel(modelo); 
    }
                                            
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarProducto();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivoActionPerformed
               if(this.btnActivo.isSelected() == true || this.btnActivo.isEnabled() == false){
                   this.btnActivo.setSelected(false);
                   this.btnInactivo.setSelected(true);
                   this.btnActivo.setContentAreaFilled(false);
                   this.btnInactivo.setEnabled(false);
                    this.btnActivo.setEnabled(true);
                } else{
                   this.btnActivo.setEnabled(true);
               }                    
    }//GEN-LAST:event_btnInactivoActionPerformed

    private void txtVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVencimientoActionPerformed

    private void TablaDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDetalleMouseClicked
 
        Boolean estado = this.btnActivo.isSelected();

        int fila_seleccionada=TablaDetalle.getSelectedRow();
        txtId.setText(TablaDetalle.getValueAt(fila_seleccionada,0).toString());
        txtCodigo.setText(TablaDetalle.getValueAt(fila_seleccionada,2).toString());
        txtNombre.setText(TablaDetalle.getValueAt(fila_seleccionada,1).toString());
        txtVencimiento.setText(TablaDetalle.getValueAt(fila_seleccionada,3).toString());
        txtDesc.setText(TablaDetalle.getValueAt(fila_seleccionada,6).toString());
        txtCategoria.setText(TablaDetalle.getValueAt(fila_seleccionada,4).toString());
          
          filas=fila_seleccionada;
          
          
    }//GEN-LAST:event_TablaDetalleMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           int      fila_seleccionada=TablaDetalle.getSelectedRow   ();
       if (fila_seleccionada>=0){
           modelo.removeRow(fila_seleccionada);
       }else{
       JOptionPane.showMessageDialog(null,"selecciona una fila");
       }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JID;
    private javax.swing.JPanel Main;
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JRadioButton btnActivo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JRadioButton btnInactivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables
}
