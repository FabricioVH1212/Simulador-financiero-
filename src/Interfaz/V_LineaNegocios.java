package Interfaz;
import java.awt.HeadlessException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import simuladorjp.*;

public class V_LineaNegocios extends javax.swing.JFrame {
    LineaDeNegocio lineasDeNegocio;
    Estructura estructura;
    Fondeo fondeo;
    Icon I = new ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"));
     
    public V_LineaNegocios() { 
        initComponents();
        setSize(740, 457);
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/UCA.logo.png")).getImage());//Para cambiarle el icono a la ventana 
        lineasDeNegocio = new LineaDeNegocio();
        estructura = new Estructura();
        fondeo = new Fondeo();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Procesar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_TipoCambio = new javax.swing.JTextField();
        pnl_SpreedDolares = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_SpreedConsumoDolares = new javax.swing.JTextField();
        txt_SpreedHipotecarioDolares = new javax.swing.JTextField();
        txt_SpreedCorporativoDolares = new javax.swing.JTextField();
        pnl_SpreedColones = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_SpreedConsumoColones = new javax.swing.JTextField();
        txt_SpreedHipotecarioColones = new javax.swing.JTextField();
        txt_SpreedCorporativoColones = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_PorcentajeCons = new javax.swing.JTextField();
        txt_PorcentajeHipo = new javax.swing.JTextField();
        txt_PorcentajeCorp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_Cp = new javax.swing.JTextField();
        txt_Mp = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_MHMes = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_TesoroMes = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_MHAño = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_TesoroAño = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_MH5años = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_Tesoro5años = new javax.swing.JTextField();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Linea de Negocios");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Procesar.setBackground(new java.awt.Color(255, 255, 51));
        btn_Procesar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Procesar.setText("Procesar");
        btn_Procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Procesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de Cambio");

        txt_TipoCambio.setToolTipText("Solo numeros");
        txt_TipoCambio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TipoCambioKeyTyped(evt);
            }
        });

        pnl_SpreedDolares.setBackground(new java.awt.Color(255, 255, 51));
        pnl_SpreedDolares.setForeground(new java.awt.Color(255, 255, 51));

        jLabel2.setBackground(new java.awt.Color(255, 255, 51));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Spreeds en Dolares");

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Spreed Consumo");

        jLabel4.setBackground(new java.awt.Color(255, 255, 51));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Spreed Hipotecario");

        jLabel5.setBackground(new java.awt.Color(255, 255, 51));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Spreed Corporativo");

        txt_SpreedConsumoDolares.setToolTipText("Solo numeros");
        txt_SpreedConsumoDolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SpreedConsumoDolaresActionPerformed(evt);
            }
        });
        txt_SpreedConsumoDolares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SpreedConsumoDolaresKeyTyped(evt);
            }
        });

        txt_SpreedHipotecarioDolares.setToolTipText("Solo numeros");
        txt_SpreedHipotecarioDolares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SpreedHipotecarioDolaresKeyTyped(evt);
            }
        });

        txt_SpreedCorporativoDolares.setToolTipText("Solo numeros");
        txt_SpreedCorporativoDolares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SpreedCorporativoDolaresKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnl_SpreedDolaresLayout = new javax.swing.GroupLayout(pnl_SpreedDolares);
        pnl_SpreedDolares.setLayout(pnl_SpreedDolaresLayout);
        pnl_SpreedDolaresLayout.setHorizontalGroup(
            pnl_SpreedDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SpreedDolaresLayout.createSequentialGroup()
                .addGroup(pnl_SpreedDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_SpreedDolaresLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addGroup(pnl_SpreedDolaresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_SpreedDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_SpreedDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_SpreedDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_SpreedCorporativoDolares)
                            .addComponent(txt_SpreedConsumoDolares)
                            .addComponent(txt_SpreedHipotecarioDolares))))
                .addContainerGap())
        );
        pnl_SpreedDolaresLayout.setVerticalGroup(
            pnl_SpreedDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SpreedDolaresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(pnl_SpreedDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_SpreedConsumoDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_SpreedDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_SpreedHipotecarioDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_SpreedDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_SpreedCorporativoDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pnl_SpreedColones.setBackground(new java.awt.Color(255, 255, 51));
        pnl_SpreedColones.setForeground(new java.awt.Color(255, 255, 51));

        jLabel6.setBackground(new java.awt.Color(255, 255, 51));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Spreeds en Colones");

        jLabel7.setBackground(new java.awt.Color(255, 255, 51));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Spreed Consumo");

        jLabel8.setBackground(new java.awt.Color(255, 255, 51));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Spreed Hipotecario");

        jLabel9.setBackground(new java.awt.Color(255, 255, 51));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Spreed Corporativo");

        txt_SpreedConsumoColones.setToolTipText("Solo numeros");
        txt_SpreedConsumoColones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SpreedConsumoColonesKeyTyped(evt);
            }
        });

        txt_SpreedHipotecarioColones.setToolTipText("Solo numeros");
        txt_SpreedHipotecarioColones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SpreedHipotecarioColonesKeyTyped(evt);
            }
        });

        txt_SpreedCorporativoColones.setToolTipText("Solo numeros");
        txt_SpreedCorporativoColones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SpreedCorporativoColonesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnl_SpreedColonesLayout = new javax.swing.GroupLayout(pnl_SpreedColones);
        pnl_SpreedColones.setLayout(pnl_SpreedColonesLayout);
        pnl_SpreedColonesLayout.setHorizontalGroup(
            pnl_SpreedColonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SpreedColonesLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel6)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(pnl_SpreedColonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_SpreedColonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(pnl_SpreedColonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_SpreedHipotecarioColones)
                    .addComponent(txt_SpreedConsumoColones)))
            .addGroup(pnl_SpreedColonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(16, 16, 16)
                .addComponent(txt_SpreedCorporativoColones))
        );
        pnl_SpreedColonesLayout.setVerticalGroup(
            pnl_SpreedColonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SpreedColonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(pnl_SpreedColonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_SpreedConsumoColones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_SpreedColonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_SpreedHipotecarioColones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_SpreedColonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_SpreedCorporativoColones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(pnl_SpreedDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(pnl_SpreedColones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_TipoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_TipoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_SpreedDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_SpreedColones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Tasas Activas", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setBackground(new java.awt.Color(255, 255, 51));
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Porcentaje de Consumo");

        jLabel11.setBackground(new java.awt.Color(255, 255, 51));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Porcentaje Hipotecario");

        jLabel12.setBackground(new java.awt.Color(255, 255, 51));
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Porcentaje Corporativo");

        txt_PorcentajeCons.setToolTipText("Solo numeros");
        txt_PorcentajeCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PorcentajeConsActionPerformed(evt);
            }
        });
        txt_PorcentajeCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PorcentajeConsKeyTyped(evt);
            }
        });

        txt_PorcentajeHipo.setToolTipText("Solo numeros");
        txt_PorcentajeHipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PorcentajeHipoActionPerformed(evt);
            }
        });
        txt_PorcentajeHipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PorcentajeHipoKeyTyped(evt);
            }
        });

        txt_PorcentajeCorp.setToolTipText("Solo numeros");
        txt_PorcentajeCorp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PorcentajeCorpActionPerformed(evt);
            }
        });
        txt_PorcentajeCorp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PorcentajeCorpKeyTyped(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 51));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("%");

        jLabel14.setBackground(new java.awt.Color(255, 255, 51));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("%");

        jLabel15.setBackground(new java.awt.Color(255, 255, 51));
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("%");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel12))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_PorcentajeCons, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_PorcentajeHipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_PorcentajeCorp, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_PorcentajeCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_PorcentajeHipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_PorcentajeCorp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("%Consumo/ %Hipotecario/ %Corporativo", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 51));

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setForeground(new java.awt.Color(255, 255, 51));

        jLabel16.setBackground(new java.awt.Color(255, 255, 51));
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Valor porcentual del corto plazo");

        jLabel17.setBackground(new java.awt.Color(255, 255, 51));
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Valor porcentual del mediano plazo");

        txt_Cp.setToolTipText("Solo numeros");
        txt_Cp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CpKeyTyped(evt);
            }
        });

        txt_Mp.setToolTipText("Solo numeros");
        txt_Mp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_MpKeyTyped(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 51));
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("%");

        jLabel19.setBackground(new java.awt.Color(255, 255, 51));
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("%");

        jLabel20.setBackground(new java.awt.Color(255, 255, 51));
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Inversiones");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel20)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Mp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Cp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_Cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_Mp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 51));
        jPanel5.setForeground(new java.awt.Color(255, 255, 51));

        jLabel21.setBackground(new java.awt.Color(255, 255, 51));
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Otros");

        jLabel22.setBackground(new java.awt.Color(255, 255, 51));
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Bonos MH 1 mes");

        txt_MHMes.setToolTipText("Solo numeros");
        txt_MHMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_MHMesKeyTyped(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(255, 255, 51));
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Bonos Tesoro 1 mes");

        txt_TesoroMes.setToolTipText("Solo numeros");
        txt_TesoroMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TesoroMesActionPerformed(evt);
            }
        });
        txt_TesoroMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TesoroMesKeyTyped(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(255, 255, 51));
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Bonos MH 1 año");

        txt_MHAño.setToolTipText("Solo numeros");
        txt_MHAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_MHAñoKeyTyped(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 51));
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Bonos Tesoro 1 año");

        txt_TesoroAño.setToolTipText("Solo numeros");
        txt_TesoroAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TesoroAñoKeyTyped(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(255, 255, 51));
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Bonos MH 5 años");

        txt_MH5años.setToolTipText("Solo numeros");
        txt_MH5años.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_MH5añosKeyTyped(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 51));
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Bonos Tesoro 5 años");

        txt_Tesoro5años.setToolTipText("Solo numeros");
        txt_Tesoro5años.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Tesoro5añosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(124, 124, 124))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_TesoroMes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MHMes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel24))
                                .addComponent(jLabel25)
                                .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Tesoro5años, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MH5años, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MHAño, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TesoroAño, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txt_MHMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txt_TesoroMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txt_MHAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txt_TesoroAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txt_MH5años, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txt_Tesoro5años, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        jTabbedPane1.addTab("Inversiones  / Otros", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 641, 349));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lineadenegocios.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 750, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProcesarActionPerformed
     
        try{
            
        //setters tasas activas 
        lineasDeNegocio.setTipodecambio(Double.parseDouble(txt_TipoCambio.getText()));
        lineasDeNegocio.setSpreedcd(Double.parseDouble(txt_SpreedConsumoDolares.getText()));
        lineasDeNegocio.setSpreedhd(Double.parseDouble(txt_SpreedHipotecarioDolares.getText()));
        lineasDeNegocio.setSpreedcorpd(Double.parseDouble(txt_SpreedCorporativoDolares.getText()));
        lineasDeNegocio.setSpreedcc(Double.parseDouble(txt_SpreedConsumoColones.getText()));
        lineasDeNegocio.setSpreedhc(Double.parseDouble(txt_SpreedHipotecarioColones.getText()));
        lineasDeNegocio.setSpreedcorpc(Double.parseDouble(txt_SpreedCorporativoColones.getText()));
        //setters porcentajes consumo,hipotecario,corporativo
        lineasDeNegocio.setConsumo(Double.parseDouble(txt_PorcentajeCons.getText()));
        lineasDeNegocio.setHipotecario(Double.parseDouble(txt_PorcentajeHipo.getText()));
        lineasDeNegocio.setCorporativo(Double.parseDouble(txt_PorcentajeCorp.getText()));
        //setters inversiones/otros
        lineasDeNegocio.setCp(Double.parseDouble(txt_Cp.getText()));
        lineasDeNegocio.setMp(Double.parseDouble(txt_Mp.getText()));
        lineasDeNegocio.setMHMes(Double.parseDouble(txt_MHMes.getText()));
        lineasDeNegocio.setMHAño(Double.parseDouble(txt_MHAño.getText()));
        lineasDeNegocio.setTesoroMes(Double.parseDouble(txt_TesoroMes.getText()));
        lineasDeNegocio.setTesoroAño(Double.parseDouble(txt_TesoroAño.getText()));
        lineasDeNegocio.setTesoro5años(Double.parseDouble(txt_Tesoro5años.getText()));
        //fin de los setter
 
        lineasDeNegocio.getTasasActivas(estructura.getFinanciamiento(), fondeo.getRequerimiento(), estructura.getCapital());
        
        JOptionPane.showMessageDialog(null,lineasDeNegocio.getest(estructura.getCapital(), estructura.getApalancamiento(), estructura.getFinanciamiento(),
        estructura.getCalificacion(), estructura.ApetitoRiesgo(estructura.getConsumo()))+"\n"+lineasDeNegocio.getConsumo(HIDE_ON_CLOSE, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH)+"\n"+lineasDeNegocio.getHipotecario(HIDE_ON_CLOSE, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH)
        +"\n"+lineasDeNegocio.getCorporativo(HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, WIDTH, WIDTH, WIDTH, HIDE_ON_CLOSE)+"\n Inversiones: "+lineasDeNegocio.getInversiones(estructura.getInversiones()),"Linea de negocios", JOptionPane.INFORMATION_MESSAGE, I);
            JOptionPane.showMessageDialog(null,"el valor que tiene la variable riesgo es: "+estructura.getRiesgo(),"Linea de negocios",JOptionPane.INFORMATION_MESSAGE,I);
        
     }
      catch (NumberFormatException | HeadlessException e) {
             
            JOptionPane.showMessageDialog(null, "Por favor no deje espacios en blanco","Simulador financiero", JOptionPane.INFORMATION_MESSAGE, I);
        }  
           
         
    }//GEN-LAST:event_btn_ProcesarActionPerformed

    private void txt_PorcentajeCorpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PorcentajeCorpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PorcentajeCorpActionPerformed

    private void txt_PorcentajeHipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PorcentajeHipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PorcentajeHipoActionPerformed

    private void txt_PorcentajeConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PorcentajeConsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PorcentajeConsActionPerformed

    private void txt_TesoroMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TesoroMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TesoroMesActionPerformed
 
    private void txt_TipoCambioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TipoCambioKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_TipoCambioKeyTyped

    private void txt_SpreedConsumoDolaresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SpreedConsumoDolaresKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_SpreedConsumoDolaresKeyTyped

    private void txt_SpreedHipotecarioDolaresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SpreedHipotecarioDolaresKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_SpreedHipotecarioDolaresKeyTyped

    private void txt_SpreedCorporativoDolaresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SpreedCorporativoDolaresKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_SpreedCorporativoDolaresKeyTyped

    private void txt_SpreedConsumoColonesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SpreedConsumoColonesKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_SpreedConsumoColonesKeyTyped

    private void txt_SpreedHipotecarioColonesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SpreedHipotecarioColonesKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_SpreedHipotecarioColonesKeyTyped

    private void txt_SpreedCorporativoColonesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SpreedCorporativoColonesKeyTyped
           char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_SpreedCorporativoColonesKeyTyped

    private void txt_PorcentajeConsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PorcentajeConsKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_PorcentajeConsKeyTyped

    private void txt_PorcentajeHipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PorcentajeHipoKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_PorcentajeHipoKeyTyped

    private void txt_PorcentajeCorpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PorcentajeCorpKeyTyped
           char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_PorcentajeCorpKeyTyped

    private void txt_CpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CpKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_CpKeyTyped

    private void txt_MpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MpKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_MpKeyTyped

    private void txt_MHMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MHMesKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_MHMesKeyTyped

    private void txt_TesoroMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TesoroMesKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_TesoroMesKeyTyped

    private void txt_MHAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MHAñoKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_MHAñoKeyTyped

    private void txt_TesoroAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TesoroAñoKeyTyped
          char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_TesoroAñoKeyTyped

    private void txt_MH5añosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MH5añosKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_MH5añosKeyTyped

    private void txt_Tesoro5añosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Tesoro5añosKeyTyped
           char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_Tesoro5añosKeyTyped

    private void txt_SpreedConsumoDolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SpreedConsumoDolaresActionPerformed
   
    }//GEN-LAST:event_txt_SpreedConsumoDolaresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Procesar;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JPanel pnl_SpreedColones;
    private javax.swing.JPanel pnl_SpreedDolares;
    private javax.swing.JTextField txt_Cp;
    private javax.swing.JTextField txt_MH5años;
    private javax.swing.JTextField txt_MHAño;
    private javax.swing.JTextField txt_MHMes;
    private javax.swing.JTextField txt_Mp;
    private javax.swing.JTextField txt_PorcentajeCons;
    private javax.swing.JTextField txt_PorcentajeCorp;
    private javax.swing.JTextField txt_PorcentajeHipo;
    private javax.swing.JTextField txt_SpreedConsumoColones;
    private javax.swing.JTextField txt_SpreedConsumoDolares;
    private javax.swing.JTextField txt_SpreedCorporativoColones;
    private javax.swing.JTextField txt_SpreedCorporativoDolares;
    private javax.swing.JTextField txt_SpreedHipotecarioColones;
    private javax.swing.JTextField txt_SpreedHipotecarioDolares;
    private javax.swing.JTextField txt_Tesoro5años;
    private javax.swing.JTextField txt_TesoroAño;
    private javax.swing.JTextField txt_TesoroMes;
    private javax.swing.JTextField txt_TipoCambio;
    // End of variables declaration//GEN-END:variables
}
