package Interfaz; 
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import simuladorjp.*;
public class V_Carteras extends javax.swing.JFrame {

    Carteras carteras = new Carteras();
    Icon I = new ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"));
    
    public V_Carteras() {
        initComponents();
        setSize(824,484);      
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/UCA.logo.png")).getImage());//Para cambiarle el icono a la ventana
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Colones = new javax.swing.JButton();
        btn_Dolares = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carteras");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Colones.setBackground(new java.awt.Color(255, 255, 51));
        btn_Colones.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_Colones.setForeground(new java.awt.Color(0, 0, 0));
        btn_Colones.setText("Colones");
        btn_Colones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ColonesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Colones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 180, 140));

        btn_Dolares.setBackground(new java.awt.Color(255, 255, 51));
        btn_Dolares.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_Dolares.setForeground(new java.awt.Color(0, 0, 0));
        btn_Dolares.setText("Dolares");
        btn_Dolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DolaresActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Dolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 180, 140));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione el tipo de estimacion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CarterasI.JPG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 484));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ColonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ColonesActionPerformed
         
        JOptionPane.showMessageDialog(null, "**Calculo de ingreso por estimaciones en colones**"+
                "\n Monto Consumo: " +carteras.getConsumoc(WIDTH, WIDTH, WIDTH)+ 
                "\n Monto Hipotecario: " +carteras.getHipotecarioc(WIDTH, WIDTH, WIDTH)+
                "\n Monto Corporativo: " +carteras.getCorporativoc(WIDTH, WIDTH, WIDTH)+
                "\n Total de ingreso por estimacion en colones: " +carteras.getTotalc(),"Carteras",JOptionPane.INFORMATION_MESSAGE,I);
       
    }//GEN-LAST:event_btn_ColonesActionPerformed
  
    private void btn_DolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DolaresActionPerformed
         JOptionPane.showMessageDialog(null, "**Calculo de ingreso por estimaciones en dolares**"+
                "\n Monto Consumo: " +carteras.getConsumod(WIDTH, WIDTH, WIDTH)+ 
                "\n Monto Hipotecario: " +carteras.getHipotecariod(WIDTH, WIDTH, WIDTH)+
                "\n Monto Corporativo: " +carteras.getCorporativod(WIDTH, WIDTH, WIDTH)+
                "\n Total de ingreso por estimacion en dolares: " +carteras.getTotald(),"Carteras",JOptionPane.INFORMATION_MESSAGE,I);
    }//GEN-LAST:event_btn_DolaresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Colones;
    private javax.swing.JButton btn_Dolares;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
