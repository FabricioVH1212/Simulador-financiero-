package Interfaz;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;
import simuladorjp.*;
   
/**
 *
 * @authors:
 * Diego Barboza Coto
 * Jean Paul Mata Alarcon
 * Fabricio Vindas Hernandez
 */

public final class Principal extends javax.swing.JFrame {

       //Instancias a las ventanas
    V_Fondeo VF = new V_Fondeo();
    V_LineaNegocios LN = new V_LineaNegocios();
    V_Carteras CA = new V_Carteras();
    V_TablasMora TM = new V_TablasMora();
    V_Liquidez VL = new V_Liquidez();
    V_Suficiencia VS = new V_Suficiencia();
    V_Coberturas C = new V_Coberturas();
    V_Solvencia SO = new V_Solvencia();
   
       //Instancias a las clases
    Estructura estructura = new Estructura();
    Fondeo fondeo = new Fondeo();
    
      //Instancias para el JOptionPane
    Icon I = new ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"));
    UIManager UI= new UIManager(); 
  
    
     
    public Principal() {
   
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/UCA.logo.png")).getImage());//Para cambiarle el icono a la ventana
        UIManager.put("OptionPane.background",new ColorUIResource(153,153,153)); 
        Object Object; 
        Object = UIManager.put("Panel.background",new ColorUIResource(153,153,153));     
        initComponents();
        Ventanainicio();
        setLocationRelativeTo(null);  
    }
    
    //Elementos para el archivo
    JFileChooser seleccionar = new JFileChooser();
        File archivo;
        FileInputStream entrada;
        FileOutputStream salida;
        public String AbrirArchivo(File archivo){
     String documento = "";
        try{
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci=entrada.read())!=-1) {                
                char caracter = (char) ascci;
                documento+=caracter; }   
        }
        catch(Exception ex){
        }
        return documento;      
       }
         public String GuardarArchivo(File archivo, String documento){
             String mensaje = null;
              try{
                  salida = new FileOutputStream(archivo);
                  byte[] bytxt = documento.getBytes(); //Para pasar el texto a bytes
                  salida.write(bytxt);
                  mensaje="Archivo guardado";
              }
              catch(Exception ex){
              }
            return mensaje;
         }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        aNTLRInputStream1 = new org.eclipse.persistence.internal.libraries.antlr.runtime.ANTLRInputStream();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lbl_Capital = new javax.swing.JLabel();
        lbl_Apalancamiento = new javax.swing.JLabel();
        txt_Capital = new javax.swing.JTextField();
        txt_Apalancamiento = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbl_Consumo = new javax.swing.JLabel();
        lbl_Hipotecario = new javax.swing.JLabel();
        lbl_Corporativo = new javax.swing.JLabel();
        txt_Consumo = new javax.swing.JTextField();
        txt_Hipotecario = new javax.swing.JTextField();
        txt_Corporativo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbl_PInver = new javax.swing.JLabel();
        txt_PInver = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_Operaciones = new javax.swing.JLabel();
        cbo_Operaciones = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        lbl_Capital1 = new javax.swing.JLabel();
        btn_Procesar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jM_Abrir = new javax.swing.JMenuItem();
        jM_Guardar = new javax.swing.JMenuItem();
        jM_calcular = new javax.swing.JMenu();
        jM_Fondeo = new javax.swing.JMenuItem();
        jM_Lineadenegocios = new javax.swing.JMenuItem();
        jM_Carteras = new javax.swing.JMenuItem();
        jM_TabladeMora = new javax.swing.JMenuItem();
        jM_Liquidez = new javax.swing.JMenuItem();
        jM_Suficiencia = new javax.swing.JMenuItem();
        jM_Coberturas = new javax.swing.JMenuItem();
        jM_Solvencias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jM_Acerca = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador financiero");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setName("lbl_Capital"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 51));

        lbl_Capital.setText("Capital");
        lbl_Capital.setToolTipText("");

        lbl_Apalancamiento.setText("Apalancamiento");
        lbl_Apalancamiento.setToolTipText("");

        txt_Capital.setToolTipText("Solo numeros");
        txt_Capital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CapitalKeyTyped(evt);
            }
        });

        txt_Apalancamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ApalancamientoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Capital, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Apalancamiento, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Capital, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Apalancamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Capital)
                    .addComponent(txt_Capital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Apalancamiento)
                    .addComponent(txt_Apalancamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Capital / Apalancamiento", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setForeground(new java.awt.Color(255, 255, 51));

        lbl_Consumo.setText("Consumo");

        lbl_Hipotecario.setText("Hipotecario");

        lbl_Corporativo.setText("Corporativo");

        txt_Consumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ConsumoActionPerformed(evt);
            }
        });
        txt_Consumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ConsumoKeyTyped(evt);
            }
        });

        txt_Hipotecario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_HipotecarioKeyTyped(evt);
            }
        });

        txt_Corporativo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CorporativoKeyTyped(evt);
            }
        });

        jLabel3.setText("%");

        jLabel4.setText("%");

        jLabel5.setText("%");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Corporativo)
                            .addComponent(lbl_Hipotecario)
                            .addComponent(lbl_Consumo))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txt_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5))
                            .addComponent(txt_Hipotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txt_Corporativo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4)))))
                .addContainerGap(388, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Consumo)
                    .addComponent(txt_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Hipotecario)
                    .addComponent(txt_Hipotecario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Corporativo)
                    .addComponent(txt_Corporativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cartera", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 51));
        jPanel5.setForeground(new java.awt.Color(255, 255, 51));

        lbl_PInver.setText("Porcentaje de Inversión");

        txt_PInver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PInverActionPerformed(evt);
            }
        });
        txt_PInver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PInverKeyTyped(evt);
            }
        });

        jLabel6.setText("%");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lbl_PInver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_PInver, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_PInver)
                    .addComponent(txt_PInver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inversión", jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 51));

        lbl_Operaciones.setText("Porcentaje de Operaciones");

        cbo_Operaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15" }));
        cbo_Operaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_OperacionesActionPerformed(evt);
            }
        });

        jLabel7.setText("%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbl_Operaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbo_Operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel7)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Operaciones)
                    .addComponent(cbo_Operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Operaciones", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 51));
        jPanel6.setForeground(new java.awt.Color(255, 255, 51));

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        lbl_Capital1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_Capital1.setText("Resumen");
        lbl_Capital1.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(lbl_Capital1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(lbl_Capital1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Detalles", jPanel6);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        btn_Procesar.setBackground(new java.awt.Color(255, 255, 51));
        btn_Procesar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Procesar.setText("Procesar");
        btn_Procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProcesarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Procesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 600, 112, 67));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UCA.logo2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1149, 1, 211, 191));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-280, 0, 1830, 790));

        jMenu1.setBorder(null);
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jM_Abrir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jM_Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/open-folder-with-document.png"))); // NOI18N
        jM_Abrir.setText("Abrir");
        jM_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_AbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jM_Abrir);

        jM_Guardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jM_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/save(1).png"))); // NOI18N
        jM_Guardar.setText("Guardar");
        jM_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_GuardarActionPerformed(evt);
            }
        });
        jMenu1.add(jM_Guardar);

        jMenuBar1.add(jMenu1);

        jM_calcular.setText("Calcular");
        jM_calcular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jM_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_calcularActionPerformed(evt);
            }
        });

        jM_Fondeo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jM_Fondeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/marketing.png"))); // NOI18N
        jM_Fondeo.setText("Fondeo");
        jM_Fondeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_FondeoActionPerformed(evt);
            }
        });
        jM_calcular.add(jM_Fondeo);

        jM_Lineadenegocios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jM_Lineadenegocios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/dollar-business-search.png"))); // NOI18N
        jM_Lineadenegocios.setText("Linea de negocios");
        jM_Lineadenegocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_LineadenegociosActionPerformed(evt);
            }
        });
        jM_calcular.add(jM_Lineadenegocios);

        jM_Carteras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jM_Carteras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/dollar-banknotes-stack.png"))); // NOI18N
        jM_Carteras.setText("Carteras");
        jM_Carteras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_CarterasActionPerformed(evt);
            }
        });
        jM_calcular.add(jM_Carteras);

        jM_TabladeMora.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jM_TabladeMora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/checked-filled-list.png"))); // NOI18N
        jM_TabladeMora.setText("Tabla de mora");
        jM_TabladeMora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_TabladeMoraActionPerformed(evt);
            }
        });
        jM_calcular.add(jM_TabladeMora);

        jM_Liquidez.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jM_Liquidez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/three-databases-symbol.png"))); // NOI18N
        jM_Liquidez.setText("Liquidez");
        jM_Liquidez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_LiquidezActionPerformed(evt);
            }
        });
        jM_calcular.add(jM_Liquidez);

        jM_Suficiencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jM_Suficiencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/discount-label-interface-commercial-symbol-with-percentage-sign.png"))); // NOI18N
        jM_Suficiencia.setText("Suficiencia");
        jM_Suficiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_SuficienciaActionPerformed(evt);
            }
        });
        jM_calcular.add(jM_Suficiencia);

        jM_Coberturas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jM_Coberturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/job-search.png"))); // NOI18N
        jM_Coberturas.setText("Coberturas");
        jM_Coberturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_CoberturasActionPerformed(evt);
            }
        });
        jM_calcular.add(jM_Coberturas);

        jM_Solvencias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jM_Solvencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/download-business-statistics-symbol-of-a-graphic(2).png"))); // NOI18N
        jM_Solvencias.setText("Solvencias");
        jM_Solvencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_SolvenciasActionPerformed(evt);
            }
        });
        jM_calcular.add(jM_Solvencias);

        jMenuBar1.add(jM_calcular);

        jMenu3.setMnemonic('H');
        jMenu3.setText("Ayuda");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/faq-circular-filled-button.png"))); // NOI18N
        jMenuItem2.setText("Uso del simulador");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jM_Acerca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jM_Acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/information-circle.png"))); // NOI18N
        jM_Acerca.setText("Acerca");
        jM_Acerca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jM_Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_AcercaActionPerformed(evt);
            }
        });
        jMenu3.add(jM_Acerca);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 272, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void btn_ProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProcesarActionPerformed
      
        try {
            estructura.setCap(Long.parseLong(txt_Capital.getText() ));
        estructura.setApa(Integer.parseInt(txt_Apalancamiento.getText()));
        estructura.setCons(Double.parseDouble(txt_Consumo.getText()));
        estructura.setHipo(Double.parseDouble(txt_Hipotecario.getText()));
        estructura.setCorp(Double.parseDouble(txt_Corporativo.getText()));
        estructura.setInver(Double.parseDouble(txt_PInver.getText()));
        estructura.setOper(cbo_Seleccion());
        estructura.getEstructura();
       
        JOptionPane.showMessageDialog(null, estructura.getEstructura() ,"Simulador financiero", JOptionPane.INFORMATION_MESSAGE,I); 
     
        } catch (NumberFormatException | HeadlessException e) {
          
         JOptionPane.showMessageDialog(null, "Por favor no deje espacios en blanco","Simulador financiero", JOptionPane.INFORMATION_MESSAGE, I);
        }
         
    	
    }//GEN-LAST:event_btn_ProcesarActionPerformed

    private void cbo_OperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_OperacionesActionPerformed
        
    }//GEN-LAST:event_cbo_OperacionesActionPerformed

    private void jM_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_GuardarActionPerformed
     JLabel ui = new JLabel("Esta sesion de código es para heredarlo y asi asignar un icono al FileChooser");
    JFrame f = new JFrame("Mostrar file chooser icono");
    f.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/UCA.logo.png")).getImage());
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    f.setContentPane(ui);
    f.pack();
    f.setLocationByPlatform(true);
    f.setVisible(false);
        JFileChooser seleccionar = new JFileChooser(); 
       
         if(seleccionar.showSaveDialog(f)==JFileChooser.APPROVE_OPTION){
           archivo = seleccionar.getSelectedFile();
        if(archivo.getName().endsWith("txt")){
            String documento = "Simulador financiero " +"\n "
                    +estructura.getEstructura()+        
                    "\n Consumo: " +txt_Consumo.getText()+ 
                    "\n Hipotecario: " +txt_Corporativo.getText()+
                    "\n Porcentaje de inversión: " +txt_PInver.getText()+
                    "\n" + "\n Fondeo \n " +VF.fondeo.getFondeo(null, HIDE_ON_CLOSE)+
                    "\n" + "\n Linea de negocios \n " 
                    +LN.lineasDeNegocio.getest(estructura.getCapital(), estructura.getApalancamiento(), estructura.getFinanciamiento(),
                    estructura.getCalificacion(), estructura.ApetitoRiesgo(estructura.getConsumo()))+
                    "\n"+LN.lineasDeNegocio.getConsumo(HIDE_ON_CLOSE, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH)+
                    "\n"+LN.lineasDeNegocio.getHipotecario(HIDE_ON_CLOSE, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH)+
                    "\n"+LN.lineasDeNegocio.getCorporativo(HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, WIDTH, WIDTH, WIDTH, HIDE_ON_CLOSE)+
                    "\n Inversiones: "+LN.lineasDeNegocio.getInversiones(estructura.getInversiones())+
                    "\n" + "\n Carteras \n " + 
                    "\n Total de ingreso por estimacion en colones: " +CA.carteras.getTotalc()+
                    "\n Total de ingreso por estimacion en dolares: " +CA.carteras.getTotald()+
                    "\n" + "\n Tablas de mora \n " +TM.tablasMora.getobtenertmora(WIDTH, HIDE_ON_CLOSE, WIDTH, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, HIDE_ON_CLOSE, WIDTH, WIDTH, WIDTH, WIDTH, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null)+
                    "\n" + "\n Liquidez \n " + 
                    "\n El total de bonos hacienda es: " +VL.liquidez.getTotalhacienda()+
                    "\n El total de bonos tesoro es: " +VL.liquidez.getTotaltesoro()+
                    "\n *Fondos Activos Liquidos* " +VL.liquidez.getFondoactivol(WIDTH)+
                    "\n *Requerimiento de Liquidez* " +VL.liquidez.getReqLiquidez(WIDTH)+
                    "\n *Índice de Cobertura de Liquidez (ICL)*" +VL.liquidez.getIcl(WIDTH, WIDTH)+
                    "\n El total de ingresos es: " +VL.liquidez.getTotal1()+
                    "\n" + "\n Suficiencia \n " +
                    "\n Riesgos " + 
                    "\n El Riesgo de credito es: " +VS.suficiencia.getRiesgocredito(WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH)+
                    "\n El Riesgo de precio es: " +VS.suficiencia.getRiesgoprecio(HIDE_ON_CLOSE, WIDTH, WIDTH, HIDE_ON_CLOSE, HIDE_ON_CLOSE, WIDTH)+
                    "\n El Riesgo de tipo de cambio es: " +VS.suficiencia.getRiesgodetipocambio(WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, HIDE_ON_CLOSE, WIDTH, HIDE_ON_CLOSE, TOP_ALIGNMENT, WIDTH)+
                    "\n" + "\n Coberturas \n " +
                    "\n Futuros de Tasa de Ínteres: " +C.cobertura.getFuturointeres()+
                    "\n Futuro Tipo de cambio: " +C.cobertura.getFuturocambio()+
                    "\n" + "\n Solvencias \n "  + 
                    "\n Estado resultados" +  
                        "\n Las Inversiones MH/ Tesoro: " + SO.solvencia.getInversionesMH(WIDTH, WIDTH) + 
                        "\n Las disponibilidades son: "+ SO.solvencia.getDisponibilidades(WIDTH)+ 
                        "\n Las inversiones son: " +SO.solvencia.getInversiones(WIDTH, DISPOSE_ON_CLOSE)+ 
                        "\n El consumo es: " +SO.solvencia.getConsumo2(WIDTH, WIDTH, WIDTH)+
                        "\n El valor hipotecario es: "+SO.solvencia.getHipotecario2(WIDTH, WIDTH, WIDTH)+ 
                        "\n El corporativo es: " +SO.solvencia.getCorporativo2(WIDTH, WIDTH, WIDTH)+ 
                        "\n La cartera de credito es: " +SO.solvencia.getCartCred(WIDTH, HEIGHT, WIDTH)+ 
                        "\n Los ingresos financieros son: " +SO.solvencia.getIngresosFi(ICONIFIED, WIDTH)+
                        "\n El encaje minimo legal es:" +SO.solvencia.getEncMinL(WIDTH, WIDTH)+ 
                        "\n Los ingresos operativos son:" +SO.solvencia.getIngOp(WIDTH, ICONIFIED)+ 
                        "\n El total de otros ingresos es: " +SO.solvencia.getOtrosIngresos(NORMAL, ERROR)+
                        "\n El total de ingresos es: " +SO.solvencia.getIngresos(ICONIFIED, WIDTH)+
                    "\n Balance general" + 
                        "\n Inversiones: " +SO.solvencia.getInversiones11(WIDTH, WIDTH)+ 
                        "\n Bonos de MH: " +SO.solvencia.getBonosMH(WIDTH, WIDTH, WIDTH)+ 
                        "\n Bonos del Tesoro: " +SO.solvencia.getBonosTesoro(WIDTH, WIDTH, WIDTH, WIDTH)+ 
                        "\n Cartera de credito: " +SO.solvencia.getCarteraCredito(WIDTH, HEIGHT, WIDTH)+ 
                        "\n Consumo: " +SO.solvencia.getConsumo1(WIDTH, WIDTH, WIDTH)+ 
                        "\n Hipotecario: " +SO.solvencia.getHipotecario1(WIDTH, WIDTH, WIDTH)+ 
                        "\n Corporativo: " +SO.solvencia.getCorporativo1(WIDTH, WIDTH, WIDTH)+ 
                        "\n Otros Activos: " +SO.solvencia.getOtrosActivos(ERROR, ABORT, WIDTH)+ 
                        "\n Derivados Financieros: " +SO.solvencia.getDerivadosF(WIDTH, WIDTH, WIDTH, WIDTH)+
                        "\n" +SO.solvencia.getEncajeML(WIDTH)+
                        "\n Estimaciones por Deterioro: " +SO.solvencia.getEstxDet(WIDTH)+
                        "\n Activos Operativos: " +SO.solvencia.getActOperativos(WIDTH, WIDTH)+ 
                        "\n Estimaciones por Deterioro: " +SO.solvencia.getEstxDet(WIDTH)+
                        "\n Pasivos: " +SO.solvencia.getPasivos(WIDTH, WIDTH, PROPERTIES)+
                        "\n Captaciones con el Publico: " +SO.solvencia.getCapPub1(WIDTH, ALLBITS, NORMAL)+
                        "\n"+SO.solvencia.getPasPatri(WIDTH, PROPERTIES)+
                        "\n Cuenta de Corretaje: " +SO.solvencia.getCuentaC(DO_NOTHING_ON_CLOSE, DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, HIDE_ON_CLOSE)+
                        "\n Pasivo + Patrimonio: " +SO.solvencia.getPasPatri(WIDTH, PROPERTIES)+
                        "\n"+SO.solvencia.getCapCons(WIDTH); 
         
            
            String mensaje = GuardarArchivo(archivo, documento);
            if(mensaje != null){
                JOptionPane.showMessageDialog(this, mensaje,"Guardar",JOptionPane.INFORMATION_MESSAGE,I);
            }
            else{
                JOptionPane.showMessageDialog(this,"Archivo no compatible","Guardar",JOptionPane.INFORMATION_MESSAGE,I);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Por favor guardar documentos de texto","Guardar",JOptionPane.INFORMATION_MESSAGE,I);
        }  
        }    
    }//GEN-LAST:event_jM_GuardarActionPerformed
  
    private void jM_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_AbrirActionPerformed
    JLabel ui = new JLabel("Esta sesion de código es para heredarlo y asi asignar un icono al FileChooser");
    JFrame f = new JFrame("Mostrar file chooser icono");
    f.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/UCA.logo.png")).getImage());
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    f.setContentPane(ui);
    f.pack();
    f.setLocationByPlatform(true);
    f.setVisible(false);

        JFileChooser JFileChooser = new JFileChooser();
        if(JFileChooser.showOpenDialog(f)==JFileChooser.APPROVE_OPTION){
            archivo=JFileChooser.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    String documento = AbrirArchivo(archivo);
                    txt_area.setText(documento);                   
                }
                else{
                    JOptionPane.showMessageDialog(null, "Archivo no compatible","Abrir",JOptionPane.INFORMATION_MESSAGE,I );
                }
            }
        }
    }//GEN-LAST:event_jM_AbrirActionPerformed

    private void txt_CapitalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CapitalKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_CapitalKeyTyped

    private void txt_ApalancamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ApalancamientoKeyTyped
         char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_ApalancamientoKeyTyped

    private void txt_ConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ConsumoActionPerformed
        
    }//GEN-LAST:event_txt_ConsumoActionPerformed

    private void txt_ConsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ConsumoKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_ConsumoKeyTyped

    private void txt_HipotecarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HipotecarioKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_HipotecarioKeyTyped

    private void txt_CorporativoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CorporativoKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_CorporativoKeyTyped
 
    private void txt_PInverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PInverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PInverActionPerformed
 
    private void txt_PInverKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PInverKeyTyped
            char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Por favor digite solo numeros","Simulador financiero",JOptionPane.INFORMATION_MESSAGE, I);
        }
    }//GEN-LAST:event_txt_PInverKeyTyped

    private void jM_AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_AcercaActionPerformed
        JOptionPane.showMessageDialog(this, "Simulador financiero" + "\n Pertenece a: " 
                + "\n Fabricio Vindas Hernandez " + "\n Diego Barboza Coto " + "\n Jean Paul Mata Alarcon" 
                +"\n El simulador financiero es un programa que fue creado para realizar calculos economicos, presenta "
                +"\n una importancia fundamental en el proceso de adopción de decisiones financieras. Los simuladores "
                +"\n permiten conocer inmediatamente el resultado de las operaciones consideradas y llevar a cabo simulaciones"
                +"\n alterando el valor de las variables relevantes. "
                +"\n Version del producto: Simulador Financiero 03.12.19 (Build 121903140219)"
                +"\n Licencia: 4hlhKVLFzZyzYreEvywsQe7ldwrn74UU7IMPxSv/3hf3aGFkJV0BOBaFZu/tj1IWUU","Simulador financiero",JOptionPane.INFORMATION_MESSAGE,I);
    }//GEN-LAST:event_jM_AcercaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     JOptionPane.showMessageDialog(this, "Para el uso del simulador" 
             +"\n Primero llene todos los espacios disponibles en la ventana principal del programa y"
             +"\n luego de completar los espacios haz click en procesar para luego ya despues en la "
             +"\n ventana de calcular van a haber varias opciones seleccione la que desea analizar"
             +"\n Es indispensable llenar la ventana principal porque puede influir en los resultados"
             +"\n y podria efectuar malos calculos, se pueden guardar archivos y abrirlos en la pestaña detalles.","Simulador financiero",JOptionPane.INFORMATION_MESSAGE,I);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jM_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_calcularActionPerformed

    }//GEN-LAST:event_jM_calcularActionPerformed

    private void jM_SolvenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_SolvenciasActionPerformed
        SO.setVisible(true);
    }//GEN-LAST:event_jM_SolvenciasActionPerformed

    private void jM_CoberturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_CoberturasActionPerformed
        C.setVisible(true);
    }//GEN-LAST:event_jM_CoberturasActionPerformed

    private void jM_SuficienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_SuficienciaActionPerformed
        VS.setVisible(true);
    }//GEN-LAST:event_jM_SuficienciaActionPerformed

    private void jM_LiquidezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_LiquidezActionPerformed
        VL.setVisible(true);
    }//GEN-LAST:event_jM_LiquidezActionPerformed

    private void jM_TabladeMoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_TabladeMoraActionPerformed
        TM.setVisible(true);
    }//GEN-LAST:event_jM_TabladeMoraActionPerformed

    private void jM_CarterasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_CarterasActionPerformed
        CA.setVisible(true);
    }//GEN-LAST:event_jM_CarterasActionPerformed

    private void jM_LineadenegociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_LineadenegociosActionPerformed
        LN.setVisible(true);
    }//GEN-LAST:event_jM_LineadenegociosActionPerformed

    private void jM_FondeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_FondeoActionPerformed
        VF.setVisible(true);
    }//GEN-LAST:event_jM_FondeoActionPerformed
 
    //método para sacar la selección que se hizo en el combobox
    public int cbo_Seleccion(){
        if(cbo_Operaciones.getSelectedItem().equals("5")){
            return 1;
        }else if(cbo_Operaciones.getSelectedItem().equals("10")){
            return 2;
        }else if(cbo_Operaciones.getSelectedItem().equals("5")){
            return 3;
        }else{
            return 0;
        }     
    } 
    public void Ventanainicio(){     
    Icon Inicio = new ImageIcon(getClass().getResource("/Imagenes/UCA.logo.png"));
     UIManager.put("OptionPane.okButtonText","Procesar");
    JOptionPane.showMessageDialog(null,"" , "Simulador financiero", JOptionPane.INFORMATION_MESSAGE, Inicio);
    ImageIcon Ipanel = new ImageIcon(getClass().getResource("/Imagenes/UCA.Sede.png"));
    ImageIcon icono = new ImageIcon(Ipanel.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_DEFAULT));
     jLabel2.setIcon(icono);
    
    }
    public void main(String args[]) {   
        try {
          
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } 
            } 
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Principal().setVisible(true);  
            } 
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.eclipse.persistence.internal.libraries.antlr.runtime.ANTLRInputStream aNTLRInputStream1;
    private javax.swing.JButton btn_Procesar;
    private javax.swing.JComboBox<String> cbo_Operaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jM_Abrir;
    private javax.swing.JMenuItem jM_Acerca;
    private javax.swing.JMenuItem jM_Carteras;
    private javax.swing.JMenuItem jM_Coberturas;
    private javax.swing.JMenuItem jM_Fondeo;
    private javax.swing.JMenuItem jM_Guardar;
    private javax.swing.JMenuItem jM_Lineadenegocios;
    private javax.swing.JMenuItem jM_Liquidez;
    private javax.swing.JMenuItem jM_Solvencias;
    private javax.swing.JMenuItem jM_Suficiencia;
    private javax.swing.JMenuItem jM_TabladeMora;
    private javax.swing.JMenu jM_calcular;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_Apalancamiento;
    private javax.swing.JLabel lbl_Capital;
    private javax.swing.JLabel lbl_Capital1;
    private javax.swing.JLabel lbl_Consumo;
    private javax.swing.JLabel lbl_Corporativo;
    private javax.swing.JLabel lbl_Hipotecario;
    private javax.swing.JLabel lbl_Operaciones;
    private javax.swing.JLabel lbl_PInver;
    private javax.swing.JTextField txt_Apalancamiento;
    private javax.swing.JTextField txt_Capital;
    private javax.swing.JTextField txt_Consumo;
    private javax.swing.JTextField txt_Corporativo;
    private javax.swing.JTextField txt_Hipotecario;
    private javax.swing.JTextField txt_PInver;
    private javax.swing.JTextArea txt_area;
    // End of variables declaration//GEN-END:variables
}