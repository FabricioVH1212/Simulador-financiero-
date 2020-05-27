package Interfaz;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import simuladorjp.*;
import javax.swing.JOptionPane;

public class V_Fondeo extends javax.swing.JFrame {

    Fondeo fondeo = new Fondeo();
    Estructura estructura = new Estructura();
    Icon I = new ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"));
    
    public V_Fondeo() {
        initComponents();
        setSize(551,320);       
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/UCA.logo.png")).getImage());//Para cambiar el icono de la ventana
     
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_TasaDolares = new javax.swing.JTextField();
        lbl_PorcentajeDolares = new javax.swing.JLabel();
        txt_TasaColones = new javax.swing.JTextField();
        lbl_PorcentajeColones = new javax.swing.JLabel();
        btn_Procesar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fondeo");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));

        txt_TasaDolares.setToolTipText("Solo numeros");
        txt_TasaDolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TasaDolaresActionPerformed(evt);
            }
        });
        txt_TasaDolares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TasaDolaresKeyTyped(evt);
            }
        });

        lbl_PorcentajeDolares.setBackground(new java.awt.Color(0, 0, 0));
        lbl_PorcentajeDolares.setForeground(new java.awt.Color(0, 0, 0));
        lbl_PorcentajeDolares.setText("Porcentaje Tasa en Dolares");

        txt_TasaColones.setToolTipText("Solo numeros");
        txt_TasaColones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TasaColonesActionPerformed(evt);
            }
        });
        txt_TasaColones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TasaColonesKeyTyped(evt);
            }
        });

        lbl_PorcentajeColones.setBackground(new java.awt.Color(0, 0, 0));
        lbl_PorcentajeColones.setForeground(new java.awt.Color(0, 0, 0));
        lbl_PorcentajeColones.setText("Porcentaje Tasa en Colones ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_PorcentajeDolares)
                    .addComponent(lbl_PorcentajeColones))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_TasaDolares, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TasaColones, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TasaColones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_PorcentajeColones))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_PorcentajeDolares)
                    .addComponent(txt_TasaDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 330, 180));

        btn_Procesar.setBackground(new java.awt.Color(255, 255, 0));
        btn_Procesar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Procesar.setText("Procesar");
        btn_Procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Procesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondeo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProcesarActionPerformed
       
       try{ 
           fondeo.setTasaColones(Double.parseDouble(txt_TasaColones.getText()));
        fondeo.setTasaDolares(Double.parseDouble(txt_TasaDolares.getText()));
       JOptionPane.showMessageDialog(null, fondeo.getFondeo(estructura.getCalificacion(), estructura.getFinanciamiento()),"Fondeo",JOptionPane.INFORMATION_MESSAGE, I) ;
       }
       catch (Exception e) {
             
        JOptionPane.showMessageDialog(null, "Por favor no deje espacios en blanco","Simulador financiero", JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_btn_ProcesarActionPerformed
 
    private void txt_TasaDolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TasaDolaresActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_txt_TasaDolaresActionPerformed

    private void txt_TasaColonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TasaColonesActionPerformed
       
    }//GEN-LAST:event_txt_TasaColonesActionPerformed

    private void txt_TasaColonesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TasaColonesKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_TasaColonesKeyTyped

    private void txt_TasaDolaresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TasaDolaresKeyTyped
      char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_TasaDolaresKeyTyped

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Procesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_PorcentajeColones;
    private javax.swing.JLabel lbl_PorcentajeDolares;
    private javax.swing.JTextField txt_TasaColones;
    private javax.swing.JTextField txt_TasaDolares;
    // End of variables declaration//GEN-END:variables
}
