package Interfaz; 
import java.awt.HeadlessException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import simuladorjp.*;
 
public class V_Coberturas extends javax.swing.JFrame {
    Coberturas cobertura = new Coberturas();
    Estructura estructura = new Estructura();
    Icon I = new ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"));
     
    public V_Coberturas() {
        initComponents();
        setSize(550,325); 
        setLocationRelativeTo(null);    
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/UCA.logo.png")).getImage());//Para cambiarle el icono a la ventana  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        lbl_contratos1 = new javax.swing.JLabel();
        lbl_preciofuturo1 = new javax.swing.JLabel();
        lbl_costooperativo1 = new javax.swing.JLabel();
        txt_contratos1 = new javax.swing.JTextField();
        txt_preciofuturo1 = new javax.swing.JTextField();
        txt_costooperativo1 = new javax.swing.JTextField();
        lbl_contratoadquiridos1 = new javax.swing.JLabel();
        txt_contratoadquiridos1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_contratos2 = new javax.swing.JLabel();
        txt_contratos2 = new javax.swing.JTextField();
        txt_preciofuturo2 = new javax.swing.JTextField();
        lbl_preciofuturo2 = new javax.swing.JLabel();
        lbl_costooperativo2 = new javax.swing.JLabel();
        txt_costooperativo2 = new javax.swing.JTextField();
        txt_contratoadquiridos2 = new javax.swing.JTextField();
        lbl_contratoadquiros2 = new javax.swing.JLabel();
        btn_Procesar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Coberturas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setForeground(new java.awt.Color(255, 255, 51));

        lbl_contratos1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_contratos1.setText("Contratos");

        lbl_preciofuturo1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_preciofuturo1.setText("Precio del futuro");

        lbl_costooperativo1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_costooperativo1.setText("Costo operativo del futuro");

        txt_contratos1.setToolTipText("Solo numeros");
        txt_contratos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contratos1KeyTyped(evt);
            }
        });

        txt_preciofuturo1.setToolTipText("Solo numeros");
        txt_preciofuturo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_preciofuturo1KeyTyped(evt);
            }
        });

        txt_costooperativo1.setToolTipText("Solo numeros");
        txt_costooperativo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_costooperativo1KeyTyped(evt);
            }
        });

        lbl_contratoadquiridos1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_contratoadquiridos1.setText("Numero de contratos adquiridos");

        txt_contratoadquiridos1.setToolTipText("Solo numeros");
        txt_contratoadquiridos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contratoadquiridos1KeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Futuro de tasa de intereses 6 meses");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_contratoadquiridos1)
                            .addComponent(lbl_costooperativo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_costooperativo1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(txt_contratoadquiridos1)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_preciofuturo1)
                            .addComponent(lbl_contratos1))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_preciofuturo1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(txt_contratos1))))
                .addGap(63, 63, 63))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contratos1)
                    .addComponent(txt_contratos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_preciofuturo1)
                    .addComponent(txt_preciofuturo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_costooperativo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_costooperativo1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contratoadquiridos1)
                    .addComponent(txt_contratoadquiridos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Tasas de interes", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 51));
        jPanel5.setForeground(new java.awt.Color(255, 255, 51));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Futuro de tasa de intereses 3 meses");

        lbl_contratos2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_contratos2.setText("Contratos");

        txt_contratos2.setToolTipText("Solo numeros");
        txt_contratos2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contratos2KeyTyped(evt);
            }
        });

        txt_preciofuturo2.setToolTipText("Solo numeros");
        txt_preciofuturo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_preciofuturo2KeyTyped(evt);
            }
        });

        lbl_preciofuturo2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_preciofuturo2.setText("Precio del futuro");

        lbl_costooperativo2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_costooperativo2.setText("Costo operativo del futuro");

        txt_costooperativo2.setToolTipText("Solo numeros");
        txt_costooperativo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_costooperativo2KeyTyped(evt);
            }
        });

        txt_contratoadquiridos2.setToolTipText("Solo numeros");
        txt_contratoadquiridos2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contratoadquiridos2KeyTyped(evt);
            }
        });

        lbl_contratoadquiros2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_contratoadquiros2.setText("Numero de contratos adquiridos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_costooperativo2)
                            .addComponent(lbl_contratoadquiros2))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_costooperativo2)
                            .addComponent(txt_contratoadquiridos2)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_contratos2)
                            .addComponent(lbl_preciofuturo2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_preciofuturo2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(txt_contratos2))))
                .addGap(53, 53, 53))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contratos2)
                    .addComponent(txt_contratos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_preciofuturo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_preciofuturo2))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_costooperativo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_costooperativo2))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contratoadquiros2)
                    .addComponent(txt_contratoadquiridos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Tasas de cambio", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        btn_Procesar.setBackground(new java.awt.Color(255, 255, 51));
        btn_Procesar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Procesar.setText("Procesar");
        btn_Procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Procesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Monedas.jpg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProcesarActionPerformed

        try{
//Tasas de interes 
        cobertura.getTasasInteres();
        
        cobertura.contratos1S = txt_contratos1.getText();
        cobertura.contratos1 = Double.parseDouble(cobertura.contratos1S);
        
        cobertura.preciofuturo1S = txt_preciofuturo1.getText();
        cobertura.preciofuturo1 = Double.parseDouble(cobertura.preciofuturo1S);
      
        cobertura.costooperativo1S = txt_costooperativo1.getText();
        cobertura.costooperativo1 = Double.parseDouble(cobertura.costooperativo1S);
        
        cobertura.contratosadquiridos1S = txt_contratoadquiridos1.getText();
        cobertura.contratosadquiridos1 = Double.parseDouble(cobertura.contratosadquiridos1S);
       
        cobertura.futurointeres = cobertura.getFuturointeres();
       JOptionPane.showMessageDialog(null, "Futuros de Tasa de Ínteres: "+cobertura.getFuturointeres(),"Coberturas",JOptionPane.INFORMATION_MESSAGE, I);
        
//Tasas de cambio
       cobertura.getTasasCambio();
        
        cobertura.contratos2S = txt_contratos2.getText();
        cobertura.contratos2 = Double.parseDouble(cobertura.contratos2S);
        
        cobertura.preciofuturo2S = txt_preciofuturo2.getText();
        cobertura.preciofuturo2 = Double.parseDouble(cobertura.preciofuturo2S);
        
        cobertura.costooperativo2S = txt_costooperativo1.getText();
        cobertura.costooperativo2 = Double.parseDouble(cobertura.costooperativo2S);
        
        cobertura.contratosadquiridos2S = txt_contratoadquiridos1.getText();
        cobertura.contratosadquiridos2 = Double.parseDouble(cobertura.contratosadquiridos2S);
        
        cobertura.futurocambio = cobertura.getFuturocambio(); 
          JOptionPane.showMessageDialog(null, "Futuro Tipo de cambio: "+cobertura.getFuturocambio(),"Coberturas",JOptionPane.INFORMATION_MESSAGE, I);
        }
        catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Por favor no deje espacios en blanco","Simulador financiero", JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_btn_ProcesarActionPerformed

    private void txt_contratos1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contratos1KeyTyped
           char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_contratos1KeyTyped

    private void txt_preciofuturo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_preciofuturo1KeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_preciofuturo1KeyTyped

    private void txt_costooperativo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_costooperativo1KeyTyped
       char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_costooperativo1KeyTyped

    private void txt_contratoadquiridos1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contratoadquiridos1KeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_contratoadquiridos1KeyTyped

    private void txt_contratos2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contratos2KeyTyped
       char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_contratos2KeyTyped

    private void txt_preciofuturo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_preciofuturo2KeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_preciofuturo2KeyTyped

    private void txt_costooperativo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_costooperativo2KeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_costooperativo2KeyTyped

    private void txt_contratoadquiridos2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contratoadquiridos2KeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_contratoadquiridos2KeyTyped

    public void main(String args[]) {    
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Coberturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new V_Coberturas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Procesar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_contratoadquiridos1;
    private javax.swing.JLabel lbl_contratoadquiros2;
    private javax.swing.JLabel lbl_contratos1;
    private javax.swing.JLabel lbl_contratos2;
    private javax.swing.JLabel lbl_costooperativo1;
    private javax.swing.JLabel lbl_costooperativo2;
    private javax.swing.JLabel lbl_preciofuturo1;
    private javax.swing.JLabel lbl_preciofuturo2;
    private javax.swing.JTextField txt_contratoadquiridos1;
    private javax.swing.JTextField txt_contratoadquiridos2;
    private javax.swing.JTextField txt_contratos1;
    private javax.swing.JTextField txt_contratos2;
    private javax.swing.JTextField txt_costooperativo1;
    private javax.swing.JTextField txt_costooperativo2;
    private javax.swing.JTextField txt_preciofuturo1;
    private javax.swing.JTextField txt_preciofuturo2;
    // End of variables declaration//GEN-END:variables
}
