
package GUImantenimientos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Categorias extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    int filas;
    int idp;
    public Categorias() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Categorias = new javax.swing.JPanel();
        IDproducto = new javax.swing.JLabel();
        NameProduct = new javax.swing.JLabel();
        Estado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        btnActivo = new javax.swing.JRadioButton();
        btnInactivo = new javax.swing.JRadioButton();
        btnAgregar = new javax.swing.JButton();
        Eliminar1 = new javax.swing.JButton();
        Editar1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimineto por Categorias");

        Categorias.setName("txtID"); // NOI18N

        IDproducto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        IDproducto.setText("ID producto");

        NameProduct.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        NameProduct.setText("Nombre del producto");

        Estado.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Estado.setText("Estado");

        TablaDetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TablaDetalle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre ", "Estado"
            }
        ));
        TablaDetalle.setColumnSelectionAllowed(true);
        TablaDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDetalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDetalle);

        btnActivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActivo.setText("Activo");
        btnActivo.setName("btnActivo"); // NOI18N
        btnActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivoActionPerformed(evt);
            }
        });

        btnInactivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInactivo.setText("Inactivo");
        btnInactivo.setName("btnInactivo"); // NOI18N
        btnInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivoActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.setName("btnAgregar"); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        Eliminar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Eliminar1.setText("Eliminar");
        Eliminar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar1ActionPerformed(evt);
            }
        });

        Editar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Editar1.setText("Editar");
        Editar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Editar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar1ActionPerformed(evt);
            }
        });

        txtId.setName("txtId"); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombre.setName("txtNombre"); // NOI18N

        javax.swing.GroupLayout CategoriasLayout = new javax.swing.GroupLayout(Categorias);
        Categorias.setLayout(CategoriasLayout);
        CategoriasLayout.setHorizontalGroup(
            CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(CategoriasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CategoriasLayout.createSequentialGroup()
                        .addComponent(IDproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CategoriasLayout.createSequentialGroup()
                        .addGroup(CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameProduct)
                            .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CategoriasLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CategoriasLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                .addGroup(CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CategoriasLayout.createSequentialGroup()
                        .addComponent(Editar1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CategoriasLayout.createSequentialGroup()
                        .addComponent(Eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(CategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        CategoriasLayout.setVerticalGroup(
            CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoriasLayout.createSequentialGroup()
                .addGroup(CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CategoriasLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Editar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CategoriasLayout.createSequentialGroup()
                        .addContainerGap(75, Short.MAX_VALUE)
                        .addGroup(CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addGroup(CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameProduct)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActivo)
                    .addComponent(btnInactivo))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Editar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editar1ActionPerformed
  String[]datos=new String[3];
        datos[0]= txtId.getText();
        datos [1] = txtNombre.getText();
 
      
                for (int i =  0; i <TablaDetalle.getColumnCount();i++){
              modelo.setValueAt(datos[i], filas, i);
           }        // TODO add your handling code here:       
    }//GEN-LAST:event_Editar1ActionPerformed
public void agregarCategoria(){
modelo = (DefaultTableModel)TablaDetalle.getModel();//Sustituir TablaDetalle por el nombre de la tabla. Descomentar cuando se tenga la tabla.
                  
    
//    idp = Integer.parseInt(p.getId());

    //Ahora vamos a capturar los valores que se encuentran actualmente insertados en la ventana.

    String nomp = this.txtNombre.getText(); //Esto se puede modificar en txtProducto.getText(). Si se quiere usar p.getnombreProducto()
                                         //Hay que sustituir los valores indicados en la ClsProducto. Y así para todos los demás.
   
    Boolean estadop = this.btnActivo.isSelected();

    ArrayList list = new ArrayList();

    list.add(idp);
    list.add(nomp);
    

       if (estadop == true) {
           list.add("Activo");
       } else{
           list.add("Inactivo");
       }

    //Entrar los valores a una lista.
    Object[] ob = new Object[3];
    
    ob[0] = list.get(0);
    ob[1] = list.get(1);
    ob[2] = list.get(2);
    
     modelo.addRow(ob);

    TablaDetalle.setModel(modelo); 
    
  idp = idp + 1;

}  
 
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
             agregarCategoria();
    }//GEN-LAST:event_btnAgregarActionPerformed

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

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void Eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar1ActionPerformed
       int      fila_seleccionada=TablaDetalle.getSelectedRow   ();
       if (fila_seleccionada>=0){
           modelo.removeRow(fila_seleccionada);
       }else{
       JOptionPane.showMessageDialog(null,"selecciona una fila");
       }         // TODO add your handling code here:
    }//GEN-LAST:event_Eliminar1ActionPerformed

    private void TablaDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDetalleMouseClicked
        int      fila_seleccionada=TablaDetalle.getSelectedRow   ();
        
        txtId.setText(TablaDetalle.getValueAt(fila_seleccionada,0).toString());
        txtNombre.setText(TablaDetalle.getValueAt(fila_seleccionada,2).toString());
          
          filas=fila_seleccionada;        // TODO add your handling code here:
    }//GEN-LAST:event_TablaDetalleMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Categorias;
    private javax.swing.JButton Editar1;
    private javax.swing.JButton Eliminar1;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel IDproducto;
    private javax.swing.JLabel NameProduct;
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JRadioButton btnActivo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JRadioButton btnInactivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
