package vistas;

import modelo.nego;
import modelo.Conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.TextPrompt;
import modelo.negocliente;
import modelo.render;

public class Clientes extends javax.swing.JInternalFrame {
    DefaultTableModel m;
    render r = new render();

    
    
    public Clientes(){
        initComponents();
        guardar.setEnabled(true);
        verDatos();
        limpiar();
        TextPrompt nuevo2 =new TextPrompt(" Crear ID", cid);
        TextPrompt nuevo3 =new TextPrompt(" Ingrese los nombres", cnom);
        TextPrompt nuevo4 =new TextPrompt(" Ingrese una direccion", cdire);
        TextPrompt nuevo5 =new TextPrompt(" Ingrese un Teléfono", ctel);
        tabla2.setDefaultRenderer(Object.class, r);
    }

    public void limpiar(){
        cdire.setText("");
        cid.setText("");
        cnom.setText("");
        ctel.setText("");
       
    }
    
    public void vaciarTabla(){
        DefaultTableModel Modelo = (DefaultTableModel) tabla2.getModel();
        String titulos[] = {"Id Cliente", "Nombre del cliente", "Direccion", "Telefono"};
        Modelo = new DefaultTableModel(null,titulos);
        tabla2.setModel(Modelo);
    }
    
    public void verDatos(){
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) tabla2.getModel();
            Conexion conect1 = new Conexion();
            con1 = conect1.getConnection();
            String dts[] = new String[4];
            String sql = "select * from Cliente";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dts[0] = rs.getString("Id_cliente");
                dts[1] = rs.getString("nom_cliente");
                dts[2] = rs.getString("dire_cliente");
                dts[3] = rs.getString("tel_cliente");
                miModelo.addRow(dts);
            }
            tabla2.setModel(miModelo);
        } catch (SQLException e) {
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        cnom = new javax.swing.JTextField();
        cdire = new javax.swing.JTextField();
        ctel = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("AGREGAR NUEVO CLIENTE");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 25, 97));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente (1) (1).png"))); // NOI18N
        jLabel1.setText(" NOMBRE");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(208, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/id (1).png"))); // NOI18N
        jLabel2.setText(" ID CLIENTE");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 25, 97));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dire.png"))); // NOI18N
        jLabel3.setText(" DIRECCION");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 29)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 25, 97));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tel.png"))); // NOI18N
        jLabel4.setText(" TELEFONO");

        cid.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cid.setToolTipText("GENERADA POR LA BASE DE DATOS");
        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });
        cid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cidKeyTyped(evt);
            }
        });

        cnom.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cnom.setToolTipText("Nombre");
        cnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnomKeyTyped(evt);
            }
        });

        cdire.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cdire.setToolTipText("Direccion");
        cdire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdireActionPerformed(evt);
            }
        });
        cdire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cdireKeyTyped(evt);
            }
        });

        ctel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ctel.setToolTipText("Teléfono");
        ctel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctelActionPerformed(evt);
            }
        });
        ctel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ctelKeyTyped(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(29, 25, 97));
        guardar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("GUARDAR");
        guardar.setToolTipText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        tabla2.setAutoCreateRowSorter(true);
        tabla2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cliente", "Nombres del cliente", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla2.setColumnSelectionAllowed(true);
        tabla2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla2.setEnabled(false);
        tabla2.setFillsViewportHeight(true);
        tabla2.setFocusCycleRoot(true);
        tabla2.setGridColor(new java.awt.Color(27, 164, 27));
        tabla2.setName("STOCK"); // NOI18N
        tabla2.setRowHeight(28);
        tabla2.setRowMargin(4);
        tabla2.setSelectionBackground(new java.awt.Color(23, 146, 23));
        tabla2.setUpdateSelectionOnSort(false);
        tabla2.setVerifyInputWhenFocusTarget(false);
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla2);
        tabla2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cnom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cdire, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(guardar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidActionPerformed
        
    }//GEN-LAST:event_cidActionPerformed

    private void cdireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdireActionPerformed
        
    }//GEN-LAST:event_cdireActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String vnom, vidcliente, vdire, vtel, campos, valores;
        
        vnom=this.cnom.getText();
        vidcliente=this.cid.getText();
        vdire=this.cdire.getText();
        vtel=this.ctel.getText();
        
        campos="Id_cliente, nom_cliente, dire_cliente, tel_cliente";
        valores="'"+vidcliente+"','"+vnom+"','"+vdire+"','"+vtel+"'";
        negocliente nc=new negocliente();
        nc.guardar("Cliente", campos, valores);
        
        limpiar();
           guardar.setEnabled(true);
           
    }//GEN-LAST:event_guardarActionPerformed

    private void ctelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctelActionPerformed
        
    }//GEN-LAST:event_ctelActionPerformed

    private void cidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cidKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_cidKeyTyped

    private void cnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnomKeyTyped
        
    }//GEN-LAST:event_cnomKeyTyped

    private void cdireKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cdireKeyTyped
        
    }//GEN-LAST:event_cdireKeyTyped

    private void ctelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctelKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_ctelKeyTyped

    private void tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cdire;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cnom;
    private javax.swing.JTextField ctel;
    private javax.swing.JButton guardar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables

}
