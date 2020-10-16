
package GUImantenimientos;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Lista extends javax.swing.JInternalFrame {
    
    
    DefaultTableModel modelo = new DefaultTableModel();
     int filas;
    int item = 0;
    public Lista() {
        initComponents();
    }
    
   
    //Esta parte se deberia llamar desde una clase.
    public void agregarLista(){  
        
        
        item = item + 1;
    modelo = (DefaultTableModel)TablaDetalle.getModel();//Sustituir TablaDetalle por el nombre de la tabla. Descomentar cuando se tenga la tabla.

    //Ahora vamos a capturar los valores que se encuentran actualmente insertados en la ventana.

    String nomp = this.txtNombre.getText(); //Esto se puede modificar en txtProducto.getText(). Si se quiere usar p.getnombreProducto()
                                         //Hay que sustituir los valores indicados en la ClsProducto. Y así para todos los demás.
    String codigop = this.txtCodigo.getText();
    String descp = this.txtDesc.getText();
    String vencp = this.txtVencimiento.getText();
    String categp = this.cbxCategoria.getSelectedItem().toString();
    Boolean estadop = this.btnActivo.isSelected();
    Boolean existep = this.btnExistente.isSelected();

    ArrayList list = new ArrayList();
    list.add(item);
    list.add(nomp);
     list.add(codigop);
     if (existep == true) {
           list.add("Existe");
       } else{
           list.add("No Existe");
       }
     
    list.add(vencp);
    list.add(descp);
    list.add(categp);
 
       if (estadop == true) {
           list.add("Activo");
       } else{
           list.add("Inactivo");
       }
    //Entrar los valores a una lista.
    Object[] ob = new Object[8];
    ob[0] = list.get(0);
    ob[1] = list.get(1);
    ob[2] = list.get(2);
    ob[3] = list.get(3);
    ob[4] = list.get(4);
    ob[5] = list.get(5);
    ob[6] = list.get(6);
    ob[7] = list.get(7);
    modelo.addRow(ob);
    TablaDetalle.setModel(modelo); 
    }

    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListaProductos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        Editar2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnInactivo = new javax.swing.JRadioButton();
        btnActivo = new javax.swing.JRadioButton();
        jEstado = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();
        JID = new javax.swing.JLabel();
        Buscar2 = new javax.swing.JButton();
        jCode = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jExistencia = new javax.swing.JLabel();
        btnExistente = new javax.swing.JRadioButton();
        btnNoExistente = new javax.swing.JRadioButton();
        jFecha = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jDescr = new javax.swing.JLabel();
        jCategoria = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        Eliminar3 = new javax.swing.JButton();
        txtVencimiento = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista");

        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NombreProducto", "Codigo", "Existencia", "Vencimiento", "Descripcion", "Categoria", "Estado"
            }
        ));
        TablaDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDetalleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaDetalle);

        Editar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Editar2.setText("Editar");
        Editar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Editar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar2ActionPerformed(evt);
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

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnInactivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInactivo.setText("Inactivo");
        btnInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivoActionPerformed(evt);
            }
        });

        btnActivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActivo.setText("Activo");
        btnActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivoActionPerformed(evt);
            }
        });

        jEstado.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jEstado.setText("Estado");

        jName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jName.setText("Nombre del producto");

        JID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        JID.setText("ID producto");

        Buscar2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Buscar2.setText("Buscar");

        jCode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jCode.setText("Codigo");

        jExistencia.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jExistencia.setText("Existencia");

        btnExistente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExistente.setText("Existente");
        btnExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExistenteActionPerformed(evt);
            }
        });

        btnNoExistente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNoExistente.setText("NoExistente");
        btnNoExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoExistenteActionPerformed(evt);
            }
        });

        jFecha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jFecha.setText("Vencimiento");

        txtDesc.setColumns(20);
        txtDesc.setLineWrap(true);
        txtDesc.setRows(5);
        txtDesc.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtDesc);

        jDescr.setText("Descripcion");
        jDescr.setMaximumSize(new java.awt.Dimension(60, 18));

        jCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCategoria.setText("Categoria");

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrodomestico", "Herramientas", "Utencilios", "Otros" }));
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });

        Eliminar3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Eliminar3.setText("Eliminar");
        Eliminar3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Eliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar3ActionPerformed(evt);
            }
        });

        txtVencimiento.setName("txtVencimiento"); // NOI18N
        txtVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVencimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListaProductosLayout = new javax.swing.GroupLayout(ListaProductos);
        ListaProductos.setLayout(ListaProductosLayout);
        ListaProductosLayout.setHorizontalGroup(
            ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(ListaProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListaProductosLayout.createSequentialGroup()
                        .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ListaProductosLayout.createSequentialGroup()
                                .addComponent(JID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCode)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ListaProductosLayout.createSequentialGroup()
                                .addComponent(jName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ListaProductosLayout.createSequentialGroup()
                                .addComponent(jFecha)
                                .addGap(20, 20, 20)
                                .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Eliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Editar2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(ListaProductosLayout.createSequentialGroup()
                        .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListaProductosLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ListaProductosLayout.createSequentialGroup()
                                        .addComponent(jCategoria)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ListaProductosLayout.createSequentialGroup()
                                        .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jExistencia)
                                            .addComponent(btnNoExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(54, 54, 54)
                                        .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ListaProductosLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ListaProductosLayout.createSequentialGroup()
                                        .addGap(174, 174, 174)
                                        .addComponent(jDescr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 317, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        ListaProductosLayout.setVerticalGroup(
            ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListaProductosLayout.createSequentialGroup()
                .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ListaProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCode)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jName)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListaProductosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Editar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFecha)
                    .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListaProductosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jDescr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ListaProductosLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCategoria)
                            .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jExistencia)
                            .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNoExistente)
                            .addComponent(btnActivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(ListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExistente)
                            .addComponent(btnInactivo))
                        .addGap(29, 29, 29)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 999, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(ListaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ListaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void botoneedit(){
    
     Boolean estado = this.btnActivo.isSelected();
    Boolean existe = this.btnExistente.isSelected();

    ArrayList list = new ArrayList();

     if (existe == true) {
           list.add("Existe");
       } else{
           list.add("No Existe");
       }
 
       if (estado == true) {
           list.add("Activo");
       } else{
           list.add("Inactivo");
       }
    
    }
    
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarLista();
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

    private void btnExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExistenteActionPerformed
        if(this.btnNoExistente.isSelected() == true || this.btnNoExistente.isEnabled() == false){
                   this.btnNoExistente.setSelected(false);
                   this.btnExistente.setSelected(true);
                   this.btnNoExistente.setContentAreaFilled(false);
                   this.btnExistente.setEnabled(false);
                    this.btnNoExistente.setEnabled(true);
                } else{
                   this.btnNoExistente.setEnabled(true);
               } 
    }//GEN-LAST:event_btnExistenteActionPerformed

    private void btnNoExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoExistenteActionPerformed
        if(this.btnExistente.isSelected() == true || this.btnExistente.isEnabled() == false){
                   this.btnExistente.setSelected(false);
                   this.btnNoExistente.setSelected(true);
                   this.btnExistente.setContentAreaFilled(false);
                   this.btnNoExistente.setEnabled(false);
                    this.btnExistente.setEnabled(true);
                } else{
                   this.btnExistente.setEnabled(true);
               } 
       
    }//GEN-LAST:event_btnNoExistenteActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void Editar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editar2ActionPerformed
        Boolean existencia = this.btnExistente.isSelected();
        String existir;
        if (existencia == true) {
           existir = ("Existente");
       } else{
          existir = ("No existente");
       }
        
        Boolean estado = this.btnActivo.isSelected();
        String valer;
        if (estado == true) {
           valer = ("Activo");
       } else{
          valer = ("Inactivo");
       }
        cbxCategoria.setEditable(true);
                
        String[]datos=new String[10];
        datos[0] = txtId.getText();
        datos[1] = txtNombre.getText();
        datos[2] = txtCodigo.getText();
        datos[3] = existir;
        datos[4] = txtVencimiento.getText();
        datos[5] = txtDesc.getText();
        datos[6] = cbxCategoria.getSelectedItem().toString();
        datos[7]= valer;
      
        
   
        
        for (int i =  0; i <= TablaDetalle.getColumnCount();i++){
        modelo.setValueAt(datos[i], filas, i);
        }


    }//GEN-LAST:event_Editar2ActionPerformed

    private void TablaDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDetalleMouseClicked
        // TODO add your handling code here:
        
        int fila_seleccionada=TablaDetalle.getSelectedRow();
        txtId.setText(TablaDetalle.getValueAt(fila_seleccionada,0).toString());
        txtCodigo.setText(TablaDetalle.getValueAt(fila_seleccionada,2).toString());
        txtNombre.setText(TablaDetalle.getValueAt(fila_seleccionada,1).toString());
        txtVencimiento.setText(TablaDetalle.getValueAt(fila_seleccionada,3).toString());
        txtDesc.setText(TablaDetalle.getValueAt(fila_seleccionada,5).toString());
        cbxCategoria.toString();
          
          filas=fila_seleccionada;
          
//    Boolean estado = this.btnActivo.isSelected();
//    Boolean existe = this.btnExistente.isSelected();
//
//    ArrayList list = new ArrayList();
//
//  String txtExiste =
//     if (existe == true) {
//           setText(TablaDetalle.getValueAt(fila_seleccionada,6).toString());("Existe");
//       } else{
//           list.add("No Existe");
//       }
// 
//       if (estado == true) {
//           list.add("Activo");
//       } else{
//           list.add("Inactivo");
//       }
//
//          filas=fila_seleccionada;
    }//GEN-LAST:event_TablaDetalleMouseClicked

    private void Eliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar3ActionPerformed
       int      fila_seleccionada=TablaDetalle.getSelectedRow   ();
       if (fila_seleccionada>=0){
           modelo.removeRow(fila_seleccionada);
       }else{
       JOptionPane.showMessageDialog(null,"selecciona una fila");
       }        // TODO add your handling code here:
    }//GEN-LAST:event_Eliminar3ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVencimientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar2;
    private javax.swing.JButton Editar2;
    private javax.swing.JButton Eliminar3;
    private javax.swing.JLabel JID;
    private javax.swing.JPanel ListaProductos;
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JRadioButton btnActivo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JRadioButton btnExistente;
    private javax.swing.JRadioButton btnInactivo;
    private javax.swing.JRadioButton btnNoExistente;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jCategoria;
    private javax.swing.JLabel jCode;
    private javax.swing.JLabel jDescr;
    private javax.swing.JLabel jEstado;
    private javax.swing.JLabel jExistencia;
    private javax.swing.JLabel jFecha;
    private javax.swing.JLabel jName;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables
}
