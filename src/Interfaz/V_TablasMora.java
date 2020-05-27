package Interfaz;
import java.awt.HeadlessException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import simuladorjp.TablasMora;


public class V_TablasMora extends javax.swing.JFrame {
    TablasMora tablasMora;
    Icon I = new ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"));
    
    public V_TablasMora() {
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/UCA.logo.png")).getImage());//Para cambiarle el icono a la ventana        
        initComponents();
        setSize(336,307); 
        setLocationRelativeTo(null); 
        tablasMora = new TablasMora();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Mostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_TipoCambio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tablas mora");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Mostrar.setBackground(new java.awt.Color(0, 0, 0));
        btn_Mostrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Mostrar.setText("Mostrar Tabla");
        btn_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de Cambio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 56, -1, -1));

        txt_TipoCambio.setToolTipText("Solo numeros");
        txt_TipoCambio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TipoCambioKeyTyped(evt);
            }
        });
        getContentPane().add(txt_TipoCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 52, 102, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TabladeMora.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarActionPerformed

       try{
            tablasMora.setTipodeCambio(Double.parseDouble(txt_TipoCambio.getText()));

        JOptionPane.showMessageDialog(null, new JScrollPane(tablasMora.getobtenertmora(WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null)),"Tabla de mora",JOptionPane.INFORMATION_MESSAGE,I);
       }
       catch(NumberFormatException | HeadlessException ex){
           JOptionPane.showMessageDialog(null, "Por favor no deje espacios en blanco","Simulador financiero", JOptionPane.INFORMATION_MESSAGE, I);
       }
    }//GEN-LAST:event_btn_MostrarActionPerformed
 
    private void txt_TipoCambioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TipoCambioKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_TipoCambioKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_TipoCambio;
    // End of variables declaration//GEN-END:variables
}
