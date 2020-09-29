package vistas;

import modelo.TextPrompt;
import modelo.nego;
import modelo.negogenerarventa;


public class GenerarVenta extends javax.swing.JInternalFrame {
    public GenerarVenta() {
        initComponents();
        generar.setEnabled(true);
        TextPrompt nuevo2 =new TextPrompt(" Codigo", ccod);
        TextPrompt nuevo3 =new TextPrompt(" Cantidad", ccan);
        TextPrompt nuevo4 =new TextPrompt(" Precio", cprecio1);
    }
    
    public void limpiar(){
        ccan.setText("");
        ccod.setText("");
        totalpagar.setText("");
        cprecio1.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ccod = new javax.swing.JTextField();
        ccan = new javax.swing.JTextField();
        totalpagar = new javax.swing.JTextField();
        generar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cprecio1 = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        ccod.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ccod.setToolTipText("Codigo");
        ccod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccodActionPerformed(evt);
            }
        });
        ccod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ccodKeyTyped(evt);
            }
        });

        ccan.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ccan.setToolTipText("Cantidad");
        ccan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccanActionPerformed(evt);
            }
        });
        ccan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ccanKeyTyped(evt);
            }
        });

        totalpagar.setEditable(false);
        totalpagar.setBackground(new java.awt.Color(35, 202, 35));
        totalpagar.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        totalpagar.setForeground(new java.awt.Color(255, 255, 255));
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

        generar.setBackground(new java.awt.Color(29, 25, 97));
        generar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        generar.setForeground(new java.awt.Color(255, 255, 255));
        generar.setText("GENERAR");
        generar.setToolTipText("Generar venta");
        generar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagar (2).png"))); // NOI18N
        jLabel5.setText(" TOTAL A PAGAR");

        cprecio1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cprecio1.setToolTipText("Precio");
        cprecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cprecio1KeyTyped(evt);
            }
        });

        calcular.setBackground(new java.awt.Color(35, 202, 35));
        calcular.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        calcular.setForeground(new java.awt.Color(255, 255, 255));
        calcular.setText("CALCULAR PRECIO");
        calcular.setToolTipText("Calcular");
        calcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ccod, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                .addComponent(ccan)
                                .addComponent(cprecio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ccod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ccan)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cprecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generar)
                    .addComponent(calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
    

        
        String vccod, vccan, vcprecio, campos, valores, vtotal;
        
        vccod=this.ccod.getText();
        vccan=this.ccan.getText();
        vcprecio=this.cprecio1.getText();
        vtotal=this.totalpagar.getText();
       
        campos="Codigo_producto, Cantidad, Precio, Total_pagar";
        valores="'"+vccod+"','"+vccan+"','"+vcprecio+"','"+vtotal+"'";
        negogenerarventa n=new negogenerarventa();
        n.guardar("Detalle", campos, valores);
        
        limpiar();
           generar.setEnabled(true);
          
    }//GEN-LAST:event_generarActionPerformed

    private void ccodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccodKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_ccodKeyTyped

    private void ccanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccanKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_ccanKeyTyped

    private void ccodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccodActionPerformed

    private void cprecio1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cprecio1KeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_cprecio1KeyTyped

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        double cantidad;
        double precio;
        double totalapagar;
        
        cantidad=Double.parseDouble(ccan.getText());
        precio=Double.parseDouble(cprecio1.getText());
        
        totalapagar=precio*cantidad;
        totalpagar.setText(" "+totalapagar);
        
    }//GEN-LAST:event_calcularActionPerformed

    private void ccanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccanActionPerformed

    private void totalpagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalpagarKeyTyped

    }//GEN-LAST:event_totalpagarKeyTyped

    private void totalpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalpagarActionPerformed
        
    }//GEN-LAST:event_totalpagarActionPerformed

    private void totalpagarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_totalpagarPropertyChange
        totalpagar.setHorizontalAlignment(0);
    }//GEN-LAST:event_totalpagarPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JTextField ccan;
    private javax.swing.JTextField ccod;
    private javax.swing.JTextField cprecio1;
    private javax.swing.JButton generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField totalpagar;
    // End of variables declaration//GEN-END:variables
}
   
