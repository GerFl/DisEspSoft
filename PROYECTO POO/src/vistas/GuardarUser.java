package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;


public class GuardarUser extends javax.swing.JFrame {
    
    private Timer timer;
    
    
    public class cronometro implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
            GregorianCalendar tiempo = new GregorianCalendar();
            int hora,minutos,segundos;
            hora=tiempo.get(Calendar.HOUR);
            minutos=tiempo.get(Calendar.MINUTE);
            segundos=tiempo.get(Calendar.SECOND);
            txtHora1.setText(String.valueOf(hora));
            txtMinutos1.setText(String.valueOf(minutos));
            txtSegundos1.setText(String.valueOf(segundos));
        }
    }

    public GuardarUser() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("SISTEMA DE VENTAS");
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
        this.JLB_Fecha1.setText(fecha);
    }

    private static class Interfaz {

        public Interfaz() {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        txtHora1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMinutos1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSegundos1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JLB_Fecha1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Ventas1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        GenerarVentas = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        VentanaPrincipal.setToolTipText("MENU");
        VentanaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VentanaPrincipal.setFocusTraversalPolicyProvider(true);

        txtHora1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        txtHora1.setForeground(new java.awt.Color(255, 255, 255));
        txtHora1.setText("00");

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(":");

        txtMinutos1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        txtMinutos1.setForeground(new java.awt.Color(255, 255, 255));
        txtMinutos1.setText("00");

        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(":");

        txtSegundos1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        txtSegundos1.setForeground(new java.awt.Color(255, 255, 255));
        txtSegundos1.setText("00");

        jLabel8.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HORA:");
        jLabel8.setToolTipText("HORA ");

        jLabel9.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FECHA:");
        jLabel9.setToolTipText("FECHA ACTUAL");

        JLB_Fecha1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 26)); // NOI18N
        JLB_Fecha1.setForeground(new java.awt.Color(255, 255, 255));
        JLB_Fecha1.setText("00/00/00");

        jButton1.setBackground(new java.awt.Color(208, 0, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda (3).png"))); // NOI18N
        jButton1.setToolTipText("HELP");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setOpaque(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo 3 (1).png"))); // NOI18N

        VentanaPrincipal.setLayer(txtHora1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        VentanaPrincipal.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        VentanaPrincipal.setLayer(txtMinutos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        VentanaPrincipal.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        VentanaPrincipal.setLayer(txtSegundos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        VentanaPrincipal.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        VentanaPrincipal.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        VentanaPrincipal.setLayer(JLB_Fecha1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        VentanaPrincipal.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        VentanaPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaPrincipalLayout.createSequentialGroup()
                .addGroup(VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(VentanaPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHora1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMinutos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSegundos1))
                    .addGroup(VentanaPrincipalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLB_Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaPrincipalLayout.createSequentialGroup()
                .addGap(0, 395, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora1)
                    .addComponent(jLabel6)
                    .addComponent(txtMinutos1)
                    .addComponent(jLabel7)
                    .addComponent(txtSegundos1)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addGroup(VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaPrincipalLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLB_Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        jMenuBar1.setForeground(new java.awt.Color(240, 240, 240));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setOpaque(false);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        jMenu1.setText("Menu    ");
        jMenu1.setToolTipText("Menu");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calcular (1).png"))); // NOI18N
        jMenuItem10.setText(" Calculadora");
        jMenuItem10.setToolTipText("Calculadora");
        jMenuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x (2).png"))); // NOI18N
        jMenuItem1.setText(" EXIT");
        jMenuItem1.setToolTipText("EXIT");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        Ventas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas icono (1) (1).png"))); // NOI18N
        Ventas1.setText("Ventas    ");
        Ventas1.setToolTipText("Ventas");
        Ventas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ventas1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente (1) (1).png"))); // NOI18N
        jMenuItem2.setText("Clientes");
        jMenuItem2.setToolTipText("Nuevo cliente");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Ventas1.add(jMenuItem2);

        GenerarVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        GenerarVentas.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        GenerarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit-document.png"))); // NOI18N
        GenerarVentas.setText("Generar Venta");
        GenerarVentas.setToolTipText("Nueva venta");
        GenerarVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GenerarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarVentasActionPerformed(evt);
            }
        });
        Ventas1.add(GenerarVentas);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario2 (1) (1).png"))); // NOI18N
        jMenuItem11.setText("Detalle Ventas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        Ventas1.add(jMenuItem11);

        jMenuBar1.add(Ventas1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/factura.png"))); // NOI18N
        jMenu2.setText("Factura    ");
        jMenu2.setToolTipText("Factura");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        jMenuItem3.setText(" Generar Factura");
        jMenuItem3.setToolTipText("Generar factura");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        jMenuItem7.setText("Reporte Facturas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vendedor.png"))); // NOI18N
        jMenu3.setText("Vendedor    ");
        jMenu3.setToolTipText("Vendedor");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        jMenuItem4.setText(" Nuevo vendedor");
        jMenuItem4.setToolTipText("Cerar usuario");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.png"))); // NOI18N
        jMenu5.setText("Reportes     ");
        jMenu5.setToolTipText("Reportes");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        jMenuItem6.setText("Generar reporte de ventas");
        jMenuItem6.setToolTipText("Reporte de ventas");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario2 (1).png"))); // NOI18N
        jMenu7.setText("Inventario ");
        jMenu7.setToolTipText("Inventario ");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barcode.png"))); // NOI18N
        jMenuItem9.setText("Editar Stock");
        jMenuItem9.setToolTipText("Revisar Stock");
        jMenuItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit-document.png"))); // NOI18N
        jMenuItem5.setText("Agregar a Stock");
        jMenuItem5.setToolTipText("Agregar");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem5);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      
      ayuda a= new ayuda();
      a.setVisible(true);
      this.dispose();  
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer=new Timer(1000,new cronometro());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void GenerarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarVentasActionPerformed
        GenerarVenta obj = new GenerarVenta();
        VentanaPrincipal.add(obj);
        obj.toFront();
        obj.setLocation(VentanaPrincipal.getWidth() / 2 - obj.getWidth() / 2, VentanaPrincipal.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(false);
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_GenerarVentasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Clientes obj = new Clientes();
        VentanaPrincipal.add(obj);
        obj.toFront();
        obj.setLocation(VentanaPrincipal.getWidth() / 2 - obj.getWidth() / 2, VentanaPrincipal.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(false);
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        reporteventas obj = new reporteventas();
        VentanaPrincipal.add(obj);
        obj.toFront();
        obj.setLocation(VentanaPrincipal.getWidth() / 2 - obj.getWidth() / 2, VentanaPrincipal.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(false);
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        verstock objeto = new verstock();
        VentanaPrincipal.add(objeto);
        objeto.toFront();
        objeto.setLocation(VentanaPrincipal.getWidth() / 2 - objeto.getWidth() / 2, VentanaPrincipal.getHeight() / 2 - objeto.getHeight() / 2);
        try {
            objeto.setMaximum(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Stock.Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
     
        Stock objeto = new Stock();
        VentanaPrincipal.add(objeto);
        objeto.toFront();
        objeto.setLocation(VentanaPrincipal.getWidth() / 2 - objeto.getWidth() / 2, VentanaPrincipal.getHeight() / 2 - objeto.getHeight() / 2);
        try {
            objeto.setMaximum(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Stock.Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        nuevovendedor objeto = new nuevovendedor();
        VentanaPrincipal.add(objeto);
        objeto.toFront();
        objeto.setLocation(VentanaPrincipal.getWidth() / 2 - objeto.getWidth() / 2, VentanaPrincipal.getHeight() / 2 - objeto.getHeight() / 2);
        try {
            objeto.setMaximum(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Stock.Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        calculadora obj = new calculadora();
        VentanaPrincipal.add(obj);
        obj.toFront();
        obj.setLocation(VentanaPrincipal.getWidth() / 2 - obj.getWidth() / 2, VentanaPrincipal.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(false);
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        factura obj = new factura();
        VentanaPrincipal.add(obj);
        obj.toFront();
        obj.setLocation(VentanaPrincipal.getWidth() / 2 - obj.getWidth() / 2, VentanaPrincipal.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(false);
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        detalleventas obj = new detalleventas();
        VentanaPrincipal.add(obj);
        obj.toFront();
        obj.setLocation(VentanaPrincipal.getWidth() / 2 - obj.getWidth() / 2, VentanaPrincipal.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(false);
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        gfactura obj = new gfactura();
        VentanaPrincipal.add(obj);
        obj.toFront();
        obj.setLocation(VentanaPrincipal.getWidth() / 2 - obj.getWidth() / 2, VentanaPrincipal.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(false);
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuardarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GuardarUser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GenerarVentas;
    private javax.swing.JLabel JLB_Fecha1;
    private javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenu Ventas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel txtHora1;
    private javax.swing.JLabel txtMinutos1;
    private javax.swing.JLabel txtSegundos1;
    // End of variables declaration//GEN-END:variables
}
