package vistas;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.negostock;
import modelo.render3;

public class verstock extends javax.swing.JInternalFrame {
    DefaultTableModel m;
    render3 r = new render3();
    
    public verstock() {
        initComponents();
        PrepararTabla();
        verDatos();
        desabilitar();
        tabla.setDefaultRenderer(Object.class, r);
    }
    
    public void limpiar()
    {
        codprod.setText(" ");
        nomprod.setText(" ");
        ex.setText(" ");
        cpp.setText(" ");
    }
    
    public void desabilitar(){
        codprod.setEnabled(false);
        nomprod.setEnabled(false);
        ex.setEnabled(false);
        cpp.setEnabled(false);
    }
    
    public void habilitar(){
        codprod.setEnabled(false);
        nomprod.setEnabled(true);
        ex.setEnabled(true);
        cpp.setEnabled(true);
    }
    
    public void vaciarTabla(){
        DefaultTableModel Modelo = (DefaultTableModel) tabla.getModel();
        String titulos[] = {"Codigo","Nombre","Existencia","Precio unitario"};
        Modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(Modelo);
    }
    
    
    
    public void verDatos(){
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) tabla.getModel();
            Conexion conect1 = new Conexion();
            con1 = conect1.getConnection();
            String dts[] = new String[5];
            String sql = "select * from Stock";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dts[0] = rs.getString("Codigo_producto");
                dts[1] = rs.getString("Nombre_producto");
                dts[2] = rs.getString("Existencia");
                dts[3] = rs.getString("precio_publico");
                miModelo.addRow(dts);
            }
            tabla.setModel(miModelo);
        } catch (SQLException e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        editar = new javax.swing.JButton();
        cpp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        codprod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomprod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ex = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("EDITAR STOCK");
        setToolTipText("Stock disponible");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barcode-verifying.png"))); // NOI18N

        tabla.setAutoCreateRowSorter(true);
        tabla.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setAutoscrolls(false);
        tabla.setRowHeight(28);
        tabla.setRowMargin(0);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        editar.setBackground(new java.awt.Color(208, 0, 0));
        editar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        editar.setForeground(new java.awt.Color(255, 255, 255));
        editar.setText("EDITAR");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        cpp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(208, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barcode.png"))); // NOI18N
        jLabel2.setText(" CODIGO DEL PRODUCTO");

        codprod.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        codprod.setToolTipText("Codigo");
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

        nomprod.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nomprod.setToolTipText("Nombre");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 25, 97));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario2 (1) (1).png"))); // NOI18N
        jLabel4.setText(" EXISTENCIA");

        ex.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ex.setForeground(new java.awt.Color(208, 0, 0));
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

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(29, 25, 97));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/precio.png"))); // NOI18N
        jLabel5.setText(" PRECIO AL PUBLICO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nomprod, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                                .addComponent(codprod)
                                .addComponent(ex))
                            .addComponent(cpp)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try
        {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();
            String sql = "update Stock set  Nombre_producto = ?, Existencia = ?, Precio_publico = ? where Codigo_producto = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, nomprod.getText());
            pst.setString(2, ex.getText());
            pst.setString(3, cpp.getText());
            pst.setInt(4, Integer.parseInt(codprod.getText()));
            
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS CORRECTAMENTE");
                limpiar();
                vaciarTabla();
                verDatos();
                guardar.setEnabled(false);
                editar.setEnabled(false);
                desabilitar();
            }
        } catch (SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UNA FILA PARA EDITARLA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editarActionPerformed

    private void cppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cppActionPerformed

    private void cppKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cppKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_cppKeyTyped

    private void codprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codprodActionPerformed
        // TODO add your handling code here:
        codprod.transferFocus();
    }//GEN-LAST:event_codprodActionPerformed

    private void codprodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codprodKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_codprodKeyTyped

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exActionPerformed

    private void exKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_exKeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        try
        {
            int fila = tabla.getSelectedRow();
            
            codprod.setText(tabla.getValueAt(fila, 0).toString());
            nomprod.setText(tabla.getValueAt(fila, 1).toString());
            ex.setText(tabla.getValueAt(fila, 2).toString());
            cpp.setText(tabla.getValueAt(fila, 3).toString());
           
          
            guardar.setEnabled(false);
            editar.setEnabled(true);
            
            habilitar();
        } catch (Exception ex)
        {
            
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        if (codprod.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "¡SOLO SE PUEDE EDITAR!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            codprod.requestFocus();
        }
        else if (nomprod.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, " ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            nomprod.requestFocus();
        }
        else if (ex.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, " ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            ex.requestFocus();
        }
        else if (cpp.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, " ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            cpp.requestFocus();
        }
        else
        {
            try
            {
                Connection con = null;
                Conexion conect = new Conexion();
                con = conect.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Stock (Codigo_producto,Nombre_producto,Existencia,precio_publico) values (?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, codprod.getText());
                pst.setString(2, nomprod.getText());
                pst.setString(3, ex.getText());
                pst.setString(4, cpp.getText());

                int n = pst.executeUpdate();
                if (n > 0)
                {
                    JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");

                    vaciarTabla();

                    guardar.setEnabled(true);
                    editar.setEnabled(false);

                    editar.setEnabled(false);

                }
            } catch (SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(this, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codprod;
    private javax.swing.JTextField cpp;
    private javax.swing.JButton editar;
    private javax.swing.JTextField ex;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomprod;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void PrepararTabla() {
        String titulos[] = {"Codigo", "Nombre", "Existencia", "Precio unitario"};
        m = new DefaultTableModel(null,titulos);
        tabla.setModel(m);
        
        
    }
}
