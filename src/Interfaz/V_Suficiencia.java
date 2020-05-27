package Interfaz;
import javax.swing.Icon;
import simuladorjp.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class V_Suficiencia extends javax.swing.JFrame {
     Suficiencia suficiencia = new Suficiencia();      
   
    public V_Suficiencia() {
        initComponents();
        setSize(770,520);      
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/UCA.logo.png")).getImage()); Icon I = new ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"));  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Riesgos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Suficiencia");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Riesgos.setBackground(new java.awt.Color(255, 255, 51));
        btn_Riesgos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_Riesgos.setForeground(new java.awt.Color(0, 0, 0));
        btn_Riesgos.setText("Ver los riesgos");
        btn_Riesgos.setToolTipText("Click para ver los riesgos");
        btn_Riesgos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RiesgosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Riesgos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 270, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Suficiencia.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 950, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btn_RiesgosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RiesgosActionPerformed
    Icon I = new ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"));
    JOptionPane.showMessageDialog(null,"\n Riesgos" + 
                "\n El Riesgo de credito es: " +suficiencia.getRiesgocredito(WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH)+ 
                "\n El Riesgo de precio es: " +suficiencia.getRiesgoprecio(WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH)+
                "\n El Riesgo de tipo de cambio es: " +suficiencia.getRiesgodetipocambio(WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, HIDE_ON_CLOSE, WIDTH, ALLBITS, TOP_ALIGNMENT, WIDTH),"Suficiencia",JOptionPane.INFORMATION_MESSAGE,I );       
    }//GEN-LAST:event_btn_RiesgosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Riesgos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
