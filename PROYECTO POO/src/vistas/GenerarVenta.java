package vistas;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.TextPrompt;



public class GenerarVenta extends javax.swing.JInternalFrame {
    public GenerarVenta() {
        initComponents();
        btngenerar.setEnabled(true);
    }
    
    public void limpiar(){
        cantidadproducto.setText("");
        codigoproducto.setText("");
        totalpagar.setText("");
        precioproducto.setText("");
        subtotal.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigoproducto = new javax.swing.JTextField();
        cantidadproducto = new javax.swing.JTextField();
        totalpagar = new javax.swing.JTextField();
        btngenerar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        precioproducto = new javax.swing.JTextField();
        btncalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaventa = new javax.swing.JTable();
        btnbuscar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        btncalculartotal = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        campoPruebasCosto = new javax.swing.JTextField();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setTitle("GENERAR VENTAS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit-document.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 25, 97));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barcode.png"))); // NOI18N
        jLabel2.setText(" CODIGO DEL PRODUCTO");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 25, 97));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito.png"))); // NOI18N
        jLabel3.setText(" CANTIDAD");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 25, 97));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/precio.png"))); // NOI18N
        jLabel4.setText(" PRECIO POR UNIDAD");

        codigoproducto.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        codigoproducto.setToolTipText("Codigo");
        codigoproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoproductoActionPerformed(evt);
            }
        });
        codigoproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoproductoKeyTyped(evt);
            }
        });

        cantidadproducto.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cantidadproducto.setToolTipText("Cantidad");
        cantidadproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadproductoActionPerformed(evt);
            }
        });
        cantidadproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadproductoKeyTyped(evt);
            }
        });

        totalpagar.setEditable(false);
        totalpagar.setBackground(new java.awt.Color(255, 255, 255));
        totalpagar.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        totalpagar.setForeground(new java.awt.Color(0, 255, 0));
        totalpagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalpagar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        totalpagar.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        totalpagar.setFocusable(false);
        totalpagar.setRequestFocusEnabled(false);
        totalpagar.setSelectionColor(new java.awt.Color(255, 255, 255));
        totalpagar.setVerifyInputWhenFocusTarget(false);
        totalpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalpagarActionPerformed(evt);
            }
        });
        totalpagar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                totalpagarPropertyChange(evt);
            }
        });
        totalpagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalpagarKeyTyped(evt);
            }
        });

        btngenerar.setBackground(new java.awt.Color(29, 25, 97));
        btngenerar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btngenerar.setForeground(new java.awt.Color(255, 255, 255));
        btngenerar.setText("GENERAR");
        btngenerar.setToolTipText("Generar venta");
        btngenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagar (2).png"))); // NOI18N
        jLabel5.setText(" TOTAL A PAGAR");

        precioproducto.setEditable(false);
        precioproducto.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        precioproducto.setToolTipText("Precio");
        precioproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioproductoActionPerformed(evt);
            }
        });
        precioproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioproductoKeyTyped(evt);
            }
        });

        btncalcular.setBackground(new java.awt.Color(35, 202, 35));
        btncalcular.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btncalcular.setForeground(new java.awt.Color(255, 255, 255));
        btncalcular.setText("CALCULAR SUBTOTAL");
        btncalcular.setToolTipText("Calcular");
        btncalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(35, 202, 35));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 202, 35));
        jLabel6.setText("MXN");

        jLabel7.setBackground(new java.awt.Color(35, 202, 35));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 202, 35));
        jLabel7.setText("$");

        tablaventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tablaventa);

        btnbuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnbuscar.setText("BUSCAR PRODUCTO");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        agregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagar (2).png"))); // NOI18N
        jLabel8.setText("SUBTOTAL");

        subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalActionPerformed(evt);
            }
        });

        btncalculartotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btncalculartotal.setText("CALCULAR TOTAL");
        btncalculartotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculartotalActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        campoPruebasCosto.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                        .addGap(82, 82, 82)
                        .addComponent(btncalculartotal)
                        .addGap(72, 72, 72)
                        .addComponent(btngenerar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(precioproducto)
                                            .addComponent(cantidadproducto)
                                            .addComponent(codigoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnbuscar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(164, 164, 164)
                                                .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addComponent(campoPruebasCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btncalcular))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(totalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btneliminar)
                                        .addGap(18, 18, 18)))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(codigoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantidadproducto)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(subtotal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btncalcular, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(campoPruebasCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btngenerar)
                            .addComponent(btncalculartotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
          
    }//GEN-LAST:event_btngenerarActionPerformed

    private void codigoproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoproductoKeyTyped
        
    }//GEN-LAST:event_codigoproductoKeyTyped

    private void cantidadproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadproductoKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_cantidadproductoKeyTyped

    private void codigoproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoproductoActionPerformed

    private void precioproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioproductoKeyTyped
    }//GEN-LAST:event_precioproductoKeyTyped

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
    String valorcodigo = codigoproducto.getText();
    String valorcantidad = cantidadproducto.getText();
    if("0".equals(valorcantidad) || "0".equals(valorcantidad)){
        System.out.println("El valor es 0");
    } else{
        int valorcantidaddos=(Integer.parseInt(cantidadproducto.getText()));
        int precioproductodos=(Integer.parseInt(precioproducto.getText()));
        int total = valorcantidaddos*precioproductodos;
        subtotal.setText(Integer.toString(total));
        
    }
    }//GEN-LAST:event_btncalcularActionPerformed

    private void cantidadproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadproductoActionPerformed

    }//GEN-LAST:event_cantidadproductoActionPerformed

    private void totalpagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalpagarKeyTyped

    }//GEN-LAST:event_totalpagarKeyTyped

    private void totalpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalpagarActionPerformed
        
    }//GEN-LAST:event_totalpagarActionPerformed

    private void totalpagarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_totalpagarPropertyChange
        totalpagar.setHorizontalAlignment(0);
    }//GEN-LAST:event_totalpagarPropertyChange

    private void precioproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioproductoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        Connection con=null;
        PreparedStatement pst=null;
        ResultSet rs=null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con=DriverManager.getConnection("jdbc:ucanaccess://Base de datos\\Database1.accdb");
            String setcosto="select precio_publico from Stock where codigo_producto=?";
            pst=con.prepareStatement(setcosto);
            pst.setString(1, codigoproducto.getText());
            rs=pst.executeQuery();
            if (rs.next()){
                precioproducto.setText(rs.getString("precio_publico"));
            }else{
                JOptionPane.showMessageDialog(this, "¡USUARIO O CONTRASEÑA INCORRECTOS!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaventa.getModel();        
        model.addRow(new Object[]{codigoproducto.getText(), cantidadproducto.getText(), subtotal.getText()});
        limpiar();
    }//GEN-LAST:event_agregarActionPerformed

    private void subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalActionPerformed

    private void btncalculartotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculartotalActionPerformed
        campoPruebasCosto.setText("0");
        for(int i=0;i<tablaventa.getRowCount();i++){
            String valor=(String) tablaventa.getValueAt(i,2);
            int valordos=(Integer.parseInt(valor));
            int suma = (Integer.parseInt(campoPruebasCosto.getText()));
            campoPruebasCosto.setText(Integer.toString(suma+valordos));
            System.out.println(valor);
            System.out.println(valordos);
            System.out.println(suma);
        }
        
        totalpagar.setText(campoPruebasCosto.getText());
    }//GEN-LAST:event_btncalculartotalActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        DefaultTableModel model = (DefaultTableModel) this.tablaventa.getModel();
        int[] rows = tablaventa.getSelectedRows();
        for(int i=0;i<rows.length;i++){
            String valor=(String) model.getValueAt(rows[i]-i,1);
            model.removeRow(rows[i]-i);
            }
    }//GEN-LAST:event_btneliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btncalculartotal;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btngenerar;
    private javax.swing.JTextField campoPruebasCosto;
    public javax.swing.JTextField cantidadproducto;
    private javax.swing.JTextField codigoproducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField precioproducto;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tablaventa;
    private javax.swing.JTextField totalpagar;
    // End of variables declaration//GEN-END:variables
}
   
