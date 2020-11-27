package vistas;

import java.awt.*;
import java.awt.print.*;
import javax.swing.JOptionPane;
import modelo.negocliente;
import modelo.nfactura;

public class factura extends javax.swing.JInternalFrame implements Printable
{

    public factura() {
        initComponents();
       
    }
    
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        recibo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        totalf = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cd = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        jLabel11.setText("jLabel11");

        setClosable(true);
        setTitle("FACTURA");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit-document.png"))); // NOI18N

        recibo.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cantidad", "Nombre del videojuego", "Codigo", "Precio por unidad"
            }
        ));
        jTable1.setAlignmentX(2.0F);
        jTable1.setAlignmentY(2.0F);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(360);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(160);
        }

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("FACTURA");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Cliente:");

        cc.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel6.setText("FACTURA A:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Fecha:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 204));
        jLabel8.setText("NO.");

        nf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nf.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("TOTAL FACTURA:");

        totalf.setBackground(new java.awt.Color(255, 0, 0));
        totalf.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        totalf.setForeground(new java.awt.Color(255, 255, 255));
        totalf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalfActionPerformed(evt);
            }
        });

        dia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("R.F.C. :");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("GASS991208M70");

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setText("Domicilio fiscal:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel13.setText("Calle: MADRID No. 101, Col. CASA BLANCA, CP:62620");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel14.setText("SAN NICOLAS DE LOS GARZA , NUEVO LOEN , MEXICO");

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel15.setText("Direccion:");

        cd.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        mes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });

        año.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        año.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cfdi (1) (1).jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/qr.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Este docunmento es una representacion impresa de un CFDI Ver 3.3");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("BANCOS: BANORTE CTA: 0876-73658-9  CLABE: 0983546545678765");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("BANAMEX CTA: 0635-74839-8  CLABE: 0936473654769086");

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel21.setText("Uso de CFDI:");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setText("(G01) Adqusision de");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setText("mercancías.");

        javax.swing.GroupLayout reciboLayout = new javax.swing.GroupLayout(recibo);
        recibo.setLayout(reciboLayout);
        reciboLayout.setHorizontalGroup(
            reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reciboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(reciboLayout.createSequentialGroup()
                        .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reciboLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(reciboLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)))
                            .addGroup(reciboLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, reciboLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, reciboLayout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(reciboLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel23))
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(reciboLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reciboLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(reciboLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reciboLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reciboLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalf, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(reciboLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel16)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reciboLayout.setVerticalGroup(
            reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reciboLayout.createSequentialGroup()
                .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reciboLayout.createSequentialGroup()
                        .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reciboLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(reciboLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(reciboLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(23, 23, 23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(totalf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(reciboLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(8, 8, 8))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(333, 333, 333)
                .addComponent(jLabel17)
                .addGap(328, 328, 328))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("IMPRIMIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(29, 25, 97));
        guardar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        try 
        {
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);
            boolean top = job.printDialog();
            if(top)
            {
                job.print();
            }
        } catch (PrinterException pex) 
        {
            JOptionPane.showMessageDialog(null, "IMPRESION CANCELADA", "Error\n", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void totalfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalfActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesActionPerformed

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String vcc, vcd, vdia, vmes,vaño,vnf, vtotalf, campos, valores;
        
        vcc=this.cc.getText();
        vcd=this.cd.getText();
        vdia=this.dia.getText();
        vmes=this.mes.getText();
        vaño=this.año.getText();
        vnf=this.nf.getText();
        vtotalf=this.totalf.getText();
        
        
        campos="cliente, direccion, dia, mes, año, nf, totalf";
        valores="'"+vcc+"','"+vcd+"','"+vdia+"','"+vmes+"','"+vaño+"','"+vnf+"','"+vtotalf+"'";
        nfactura nf=new nfactura();
        nf.guardar("factura", campos, valores);
        
       
        
    }//GEN-LAST:event_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField año;
    private javax.swing.JTextField cc;
    private javax.swing.JTextField cd;
    private javax.swing.JTextField dia;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField nf;
    private javax.swing.JPanel recibo;
    private javax.swing.JTextField totalf;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pagefor, int index) throws PrinterException 
    {
        if(index>0)
        {
            return NO_SUCH_PAGE;
            
        }
        
        Graphics2D gh = (Graphics2D) graf;
        gh.translate(pagefor.getImageableX() + 8, pagefor.getImageableY() + 8);
        gh.scale(1.0, 1.1);
        
        recibo.printAll(graf);
        return PAGE_EXISTS;
    }
}
