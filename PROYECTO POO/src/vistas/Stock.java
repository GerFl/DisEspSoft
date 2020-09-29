package vistas;

import java.sql.Connection;
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
        TextPrompt nuevo =new TextPrompt(" ", codprod);
        
    }
    
  
    public void limpiar()
    {
        codprod.setText("");
        nomprod.setText("");
        ex.setText("");
        cpp.setText("");
       
    }
    
    public void desabilitar(){
        codprod.setEnabled(false);
        nomprod.setEnabled(false);
        ex.setEnabled(false);
        cpp.setEnabled(false);
        
        
    }
    
    public void habilitar(){
        codprod.setEnabled(true);
        nomprod.setEnabled(true);
        ex.setEnabled(true);
        cpp.setEnabled(true);
        
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        codprod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomprod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ex = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cpp = new javax.swing.JTextField();

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

        codprod.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        codprod.setToolTipText("Codigo generado por la base de datos");
        codprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codprodActionPerformed(evt);
            }
        });
        codprod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codprodKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 25, 97));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit-document.png"))); // NOI18N
        jLabel3.setText(" NOMBRE DEL VIDEOJUEGO");

        nomprod.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        nomprod.setToolTipText("Nombre");
        nomprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomprodActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 25, 97));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario2 (1) (1).png"))); // NOI18N
        jLabel4.setText(" EXISTENCIA");

        ex.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ex.setToolTipText("Stock");
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        ex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                exKeyTyped(evt);
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

        cpp.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cpp.setToolTipText("Precio");
        cpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cppActionPerformed(evt);
            }
        });
        cpp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cppKeyTyped(evt);
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
                            .addComponent(nomprod)
                            .addComponent(codprod)
                            .addComponent(ex, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpp, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codprod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        vnomprod=this.nomprod.getText();
        vex=this.ex.getText();
        vpreciop=this.cpp.getText();
        vcod=this.codprod.getText();
        
        campos="Codigo_producto, Nombre_producto, Existencia, precio_publico";
        valores="'"+vcod+"','"+vnomprod+"','"+vex+"','"+vpreciop+"'";
        negostock ns=new negostock();
        ns.guardar("Stock", campos, valores);
      
        
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

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exActionPerformed

    private void exKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_exKeyTyped

    private void cppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cppActionPerformed

    private void cppKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cppKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_cppKeyTyped

    private void nomprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomprodActionPerformed
        
    }//GEN-LAST:event_nomprodActionPerformed

    private void codprodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codprodKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_codprodKeyTyped

    private void codprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codprodActionPerformed
       codprod.transferFocus();
    }//GEN-LAST:event_codprodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codprod;
    private javax.swing.JTextField cpp;
    private javax.swing.JTextField ex;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomprod;
    private javax.swing.JButton nuevo;
    // End of variables declaration//GEN-END:variables

    static class Interfaz {

        public Interfaz() {
        }
    }

    }

