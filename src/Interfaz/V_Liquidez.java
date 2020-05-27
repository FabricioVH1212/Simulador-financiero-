package Interfaz;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import simuladorjp.*;

public class V_Liquidez extends javax.swing.JFrame {
      Liquidez liquidez = new Liquidez();
      Icon I = new ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"));
     
    public V_Liquidez() {
        initComponents();
        setSize(770,488);      
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/UCA.logo.png")).getImage());//Para cambiarle el icono a la ventana     
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        cbo_opcion = new javax.swing.JComboBox();
        txt_largoplazo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Liquidez");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame2.setBackground(new java.awt.Color(255, 255, 51));
        jInternalFrame2.setForeground(new java.awt.Color(0, 0, 0));
        jInternalFrame2.setTitle("Seleccione una opcion");
        jInternalFrame2.setToolTipText("");
        jInternalFrame2.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"))); // NOI18N
        jInternalFrame2.setName(""); // NOI18N
        jInternalFrame2.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setForeground(new java.awt.Color(255, 204, 0));

        cbo_opcion.setBackground(new java.awt.Color(255, 255, 255));
        cbo_opcion.setForeground(new java.awt.Color(0, 0, 0));
        cbo_opcion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bonos hacienda", "Bonos tesoro", "Activos liquidos", "Requerimiento liquidez", "Cobertura liquidez", "Ingresos colones", "", "" }));
        cbo_opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_opcionActionPerformed(evt);
            }
        });

        txt_largoplazo.setToolTipText("Solo numeros");
        txt_largoplazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_largoplazoActionPerformed(evt);
            }
        });
        txt_largoplazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_largoplazoKeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese el bono a largo plazo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbo_opcion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_largoplazo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_largoplazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(cbo_opcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jInternalFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 340, 280));
        try {
            jInternalFrame2.setIcon(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Liquidez.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 488));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_opcionActionPerformed
         String opcion = "";
         opcion = opcion+cbo_opcion.getSelectedItem().toString();
         liquidez.setTotalhacienda(Double.parseDouble(txt_largoplazo.getText()));
         liquidez.setTotal1(Double.parseDouble(txt_largoplazo.getText()));
         liquidez.setTotaltesoro(Double.parseDouble(txt_largoplazo.getText()));
         
          switch (opcion) {
              case "Bonos hacienda":
                  JOptionPane.showMessageDialog(null,"*Bonos Ministerio hacienda* " +
                          "\n Bono a corto plazo" +liquidez.getCortoplazo1(WIDTH, WIDTH, WIDTH)+
                          "\n Bono a mediano plazo:" +liquidez.getMedianoplazo2(WIDTH, WIDTH, WIDTH)+
                          "\n Bono a largo plazo:" +liquidez.getLargoplazo3(WIDTH, WIDTH, WIDTH)+
                          "\n  El total de bonos hacienda es: " +liquidez.getTotalhacienda(),"Liquidez",JOptionPane.INFORMATION_MESSAGE,I);
                  break;
              case "Bonos tesoro":
                  JOptionPane.showMessageDialog(null,"*Bonos tesoro* " +
                          "\n Bono a corto plazo" +liquidez.getCortoplazo4(WIDTH, WIDTH, WIDTH, WIDTH)+
                          "\n Bono a mediano plazo:" +liquidez.getMedioplazo5(WIDTH, WIDTH, WIDTH, WIDTH)+
                          "\n Bono a largo plazo:" +liquidez.getLargoplazo6(WIDTH, WIDTH, WIDTH, WIDTH)+
                          "\n  El total de bonos tesoro es: " +liquidez.getTotaltesoro(),"Liquidez",JOptionPane.INFORMATION_MESSAGE,I);
                  break;
              case "Activos liquidos":
                  JOptionPane.showMessageDialog(null,"*Fondos Activos Liquidos* \n" +liquidez.getFondoactivol(WIDTH),"Liquidez",JOptionPane.INFORMATION_MESSAGE,I);
                  break;
              case "Requerimiento liquidez":
                  JOptionPane.showMessageDialog(null,"*Requerimiento de Liquidez* \n" +liquidez.getReqLiquidez(WIDTH),"Liquidez",JOptionPane.INFORMATION_MESSAGE,I);
                  break;
              case "Cobertura liquidez":
                  JOptionPane.showMessageDialog(null,"*Índice de Cobertura de Liquidez (ICL)* \n" +liquidez.getIcl(WIDTH, WIDTH), "Liquidez",JOptionPane.INFORMATION_MESSAGE,I);
                  break;
              case "Ingresos colones":
                  JOptionPane.showMessageDialog(null,"*Bonos tesoro* " +
                          "\n Bono a corto plazo " +liquidez.getCortoplazo7(WIDTH, NORMAL, WIDTH)+
                          "\n Bono a mediano plazo: " +liquidez.getMedioplazo8(WIDTH, NORMAL, WIDTH)+
                          "\n Bono a largo plazo: " +liquidez.getLargoplazo9(HEIGHT, TEXT_CURSOR, WIDTH)+
                          "\n  El total de ingresos es: " +liquidez.getTotal1(),"Liquidez",JOptionPane.INFORMATION_MESSAGE,I);
                  break;
          }
    }//GEN-LAST:event_cbo_opcionActionPerformed

    private void txt_largoplazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_largoplazoActionPerformed

    }//GEN-LAST:event_txt_largoplazoActionPerformed

    private void txt_largoplazoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_largoplazoKeyTyped
          char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_largoplazoKeyTyped

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbo_opcion;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_largoplazo;
    // End of variables declaration//GEN-END:variables
}
