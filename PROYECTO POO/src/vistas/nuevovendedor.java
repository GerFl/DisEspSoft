package vistas;

import modelo.TextPrompt;
import modelo.nego;
import modelo.nuevouser;

public class nuevovendedor extends javax.swing.JInternalFrame {

    
    public nuevovendedor() {
        initComponents();
        TextPrompt nuevo =new TextPrompt(" Nombre del vendedor", cnuevouser);
        TextPrompt nuevo2 =new TextPrompt(" Generar contraseña", ccontra);
    }
    
        public void limpiar(){
        ccontra.setText("");
        cnuevouser.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cnuevouser = new javax.swing.JTextField();
        ccontra = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("NUEVO VENDEDOR");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N

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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 25, 97));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente (1) (1).png"))); // NOI18N
        jLabel1.setText(" NUEVO USUARIO");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 25, 97));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña (3).png"))); // NOI18N
        jLabel2.setText(" CONTRASEÑA");

        cnuevouser.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cnuevouser.setToolTipText("Nuevo usuario");
        cnuevouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnuevouserActionPerformed(evt);
            }
        });

        ccontra.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ccontra.setToolTipText("Contraseña");
        ccontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccontraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ccontra, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(cnuevouser))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnuevouser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccontra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        String cnuevouser, ccontra, campos, valores;
        cnuevouser=this.cnuevouser.getText();
        ccontra=this.ccontra.getText();
        campos="Usuario, contraseña";
        valores="'"+cnuevouser+"','"+ccontra+"'";
        nuevouser n=new nuevouser();
        n.guardar("login", campos, valores);
        
        limpiar();
           ;
           guardar.setEnabled(true);
        
    }//GEN-LAST:event_guardarActionPerformed

    private void cnuevouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnuevouserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnuevouserActionPerformed

    private void ccontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccontraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ccontra;
    private javax.swing.JTextField cnuevouser;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
