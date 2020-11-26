package vistas;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.TextPrompt;
import modelo.negostock;

public class Stock extends javax.swing.JInternalFrame {
    
    public Stock() 
    {
        initComponents();
        guardar.setEnabled(false);
        nuevo.setEnabled(true);
        desabilitar();
        
        
    }
    
  
    public void limpiar()
    {
        
        nombrevideojuego.setText("");
        existencia.setText("");
        preciopublico.setText("");
       
    }
    
    public void desabilitar(){
        
        nombrevideojuego.setEnabled(false);
        existencia.setEnabled(false);
        preciopublico.setEnabled(false);
        
        
    }
    
    public void habilitar(){
        
        nombrevideojuego.setEnabled(true);
        existencia.setEnabled(true);
        preciopublico.setEnabled(true);
        
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        codigo_producto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombrevideojuego = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        existencia = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        preciopublico = new javax.swing.JTextField();

        setClosable(true);
        setForeground(java.awt.Color.black);
        setIconifiable(true);
        setTitle("AGREGAR AL STOCK");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(208, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barcode.png"))); // NOI18N
        jLabel2.setText(" CODIGO DEL PRODUCTO");

        codigo_producto.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        codigo_producto.setToolTipText("Codigo generado por la base de datos");
        codigo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_productoActionPerformed(evt);
            }
        });
        codigo_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigo_productoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 25, 97));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit-document.png"))); // NOI18N
        jLabel3.setText(" NOMBRE DEL VIDEOJUEGO");

        nombrevideojuego.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        nombrevideojuego.setToolTipText("Nombre");
        nombrevideojuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrevideojuegoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 25, 97));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario2 (1) (1).png"))); // NOI18N
        jLabel4.setText(" EXISTENCIA");

        existencia.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        existencia.setToolTipText("Stock");
        existencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existenciaActionPerformed(evt);
            }
        });
        existencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                existenciaKeyTyped(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(29, 25, 97));
        guardar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("GUARDAR ");
        guardar.setToolTipText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        nuevo.setBackground(new java.awt.Color(208, 0, 0));
        nuevo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        nuevo.setForeground(new java.awt.Color(255, 255, 255));
        nuevo.setText("NUEVO PRODUCTO");
        nuevo.setToolTipText("Nuevo");
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(29, 25, 97));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/precio.png"))); // NOI18N
        jLabel5.setText(" PRECIO AL PUBLICO");

        preciopublico.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        preciopublico.setToolTipText("Precio");
        preciopublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preciopublicoActionPerformed(evt);
            }
        });
        preciopublico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                preciopublicoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombrevideojuego)
                            .addComponent(codigo_producto)
                            .addComponent(existencia, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preciopublico, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codigo_producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombrevideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(existencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(preciopublico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuevo)
                            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        String vcodprod, vnomprod, vex, vpreciop, campos, valores, vcod;
        
        vnomprod=this.nombrevideojuego.getText();
        vex=this.existencia.getText();
        vpreciop=this.preciopublico.getText();
        
        Connection con=null;
        PreparedStatement pst=null;
        ResultSet rs=null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con=DriverManager.getConnection("jdbc:ucanaccess://Base de datos\\Database1.accdb");
            String setcosto="INSERT INTO Stock (codigo_producto,nombre_producto,existencia,precio_publico) VALUES (?,?,?,?)";
            pst=con.prepareStatement(setcosto);
            pst.setString(1, codigo_producto.getText());
            pst.setString(2, nombrevideojuego.getText());
            pst.setString(3, existencia.getText());
            pst.setString(4, preciopublico.getText());
            int res = pst.executeUpdate();
            if (rs.next()){
                JOptionPane.showMessageDialog(null,"Producto guardado.");
            }else{
                JOptionPane.showMessageDialog(this, "¡USUARIO O CONTRASEÑA INCORRECTOS!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
      
        
        limpiar();
        desabilitar();
        habilitar();
        
    }//GEN-LAST:event_guardarActionPerformed

    
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        limpiar();
        habilitar();
        nuevo.setEnabled(false);
        guardar.setEnabled(true);
    }//GEN-LAST:event_nuevoActionPerformed

    private void existenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_existenciaActionPerformed

    private void existenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_existenciaKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_existenciaKeyTyped

    private void preciopublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preciopublicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preciopublicoActionPerformed

    private void preciopublicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_preciopublicoKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_preciopublicoKeyTyped

    private void nombrevideojuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrevideojuegoActionPerformed
    }/*
    }                 guardar//GEN-LAST:event_nombrevideojuegoActionPerformed
*/
    private void codigo_productoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo_productoKeyTyped
        
    }//GEN-LAST:event_codigo_productoKeyTyped

    private void codigo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_productoActionPerformed
        codigo_producto.transferFocus();
    }//GEN-LAST:event_codigo_productoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo_producto;
    private javax.swing.JTextField existencia;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombrevideojuego;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField preciopublico;
    // End of variables declaration//GEN-END:variables

    static class Interfaz {

        public Interfaz() {
        }
    }

    }

