package Interfaz;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import simuladorjp.*;

public class V_Solvencia extends javax.swing.JFrame {

    Solvencia solvencia = new Solvencia();
    Icon I = new ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"));
    public V_Solvencia() {
        initComponents();
        setSize(825,510); 
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/UCA.logo.png")).getImage());//Para cambiarle el icono a la ventana    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Procesar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solvencia");
        setFocusCycleRoot(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Procesar.setBackground(new java.awt.Color(255, 255, 51));
        btn_Procesar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Procesar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Procesar.setText("Procesar");
        btn_Procesar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btn_Procesar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Procesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 240, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Solvencia.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProcesarActionPerformed

        //Estado resultados       
        JOptionPane.showMessageDialog(null,"Estado resultados" + 
                "\n Las Inversiones MH/ Tesoro: " + solvencia.getInversionesMH(WIDTH, WIDTH) + 
                "\n Las disponibilidades son: "+ solvencia.getDisponibilidades(WIDTH)+ 
                "\n Las inversiones son: " +solvencia.getInversiones(WIDTH, DISPOSE_ON_CLOSE)+ 
                "\n El consumo es: " +solvencia.getConsumo2(WIDTH, WIDTH, WIDTH)+
                "\n El valor hipotecario es: "+solvencia.getHipotecario2(WIDTH, WIDTH, WIDTH)+ 
                "\n El corporativo es: " +solvencia.getCorporativo2(WIDTH, WIDTH, WIDTH)+ 
                "\n La cartera de credito es: " +solvencia.getCartCred(WIDTH, HEIGHT, WIDTH)+ 
                "\n Los ingresos financieros son: " +solvencia.getIngresosFi(ICONIFIED, WIDTH)+
                "\n El encaje minimo legal es:" +solvencia.getEncMinL(WIDTH, WIDTH)+ 
                "\n Los ingresos operativos son:" +solvencia.getIngOp(WIDTH, ICONIFIED)+ 
                "\n El total de otros ingresos es: " +solvencia.getOtrosIngresos(NORMAL, ERROR)+
                "\n El total de ingresos es: " +solvencia.getIngresos(ICONIFIED, WIDTH),"Solvencia",JOptionPane.INFORMATION_MESSAGE, I);
          
        //Balance general
        
                JOptionPane.showMessageDialog(null,"Balance general" + 
                        "\n Inversiones: " +solvencia.getInversiones11(WIDTH, WIDTH)+ 
                        "\n Bonos de MH: " +solvencia.getBonosMH(WIDTH, WIDTH, WIDTH)+ 
                        "\n Bonos del Tesoro: " +solvencia.getBonosTesoro(WIDTH, WIDTH, WIDTH, WIDTH)+ 
                        "\n Cartera de credito: " +solvencia.getCarteraCredito(WIDTH, HEIGHT, WIDTH)+ 
                        "\n Consumo: " +solvencia.getConsumo1(WIDTH, WIDTH, WIDTH)+ 
                        "\n Hipotecario: " +solvencia.getHipotecario1(WIDTH, WIDTH, WIDTH)+ 
                        "\n Corporativo: " +solvencia.getCorporativo1(WIDTH, WIDTH, WIDTH)+ 
                        "\n Otros Activos: " +solvencia.getOtrosActivos(ERROR, ABORT, WIDTH)+ 
                        "\n Derivados Financieros: " +solvencia.getDerivadosF(WIDTH, WIDTH, WIDTH, WIDTH)+
                        "\n" +solvencia.getEncajeML(WIDTH)+
                        "\n Estimaciones por Deterioro: " +solvencia.getEstxDet(WIDTH)+
                        "\n Activos Operativos: " +solvencia.getActOperativos(WIDTH, WIDTH)+ 
                        "\n Estimaciones por Deterioro: " +solvencia.getEstxDet(WIDTH)+
                        "\n Pasivos: " +solvencia.getPasivos(WIDTH, WIDTH, PROPERTIES)+
                        "\n Captaciones con el Publico: " +solvencia.getCapPub1(WIDTH, ALLBITS, NORMAL)+
                        "\n"+solvencia.getPasPatri(WIDTH, PROPERTIES)+
                        "\n Cuenta de Corretaje: " +solvencia.getCuentaC(WIDTH, WIDTH, WIDTH, WIDTH)+
                        "\n Pasivo + Patrimonio: " +solvencia.getPasPatri(WIDTH, PROPERTIES)+
                        "\n"+solvencia.getCapCons(WIDTH),"Solvencia",JOptionPane.INFORMATION_MESSAGE, I);
            
    }//GEN-LAST:event_btn_ProcesarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Procesar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
