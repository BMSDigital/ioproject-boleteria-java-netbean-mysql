/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Ajustes.ConfiguracionRutas;
import Ajustes.Validaciones;
import Datos.vprecio_rutas;
import Datos.vrutas;
import Datos.vtrenes;
import Logica.fprecio_rutas;
import Logica.frutas;
import Logica.ftrenes;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerDateModel;
/**
 *
 * @author FRAIBERT-BRACHO
 */
public class adm_boletos extends javax.swing.JPanel {

    /**
     * Creates new form adm_boletos
     */
    public adm_boletos() {
        
        initComponents();
        inhabilitar1();
        inhabilitar2();
        inhabilitar3();
    }
    ConfiguracionRutas cnf = new ConfiguracionRutas();
    vrutas dts = new vrutas();
    frutas func = new frutas();
    vprecio_rutas dts1 = new vprecio_rutas();
    fprecio_rutas func1 = new fprecio_rutas();
    vtrenes dts2 = new vtrenes();
    ftrenes func2 = new ftrenes();
    private String accion = "activar";
    private String accion1= "activar2";
    private String accion2= "activar3";
    

    Validaciones val = new Validaciones();
    public void habilitar1(){
       idrutas.setEnabled(false);
       cboorigen.setEnabled(true);
       cbodestino.setEnabled(true);
       jslimite.setEnabled(true);
       btactivar1.setEnabled(true);
    }
    
    public void inhabilitar1(){
       idrutas.setVisible(false);
       cboorigen.setEnabled(false);
       cbodestino.setEnabled(false);
       jslimite.setEnabled(false);
       btactivar1.setEnabled(false);
    }
    
    public void habilitar2(){
        idprecio_rutas.setVisible(false);
        cboorigen2.setEnabled(true);
        cbodestino2.setEnabled(true);
        cbotipo_pasaje.setEnabled(true);
        txtprecio.setEnabled(true);
        dcfecha_reserva.setEnabled(true);
        dcfecha_reserva1.setEnabled(true);
        jButton2.setEnabled(true);
        txtprecio.setText("");
    }
    
    public void inhabilitar2(){
        idprecio_rutas.setVisible(false);
        cboorigen2.setEnabled(false);
        cbodestino2.setEnabled(false);
        cbotipo_pasaje.setEnabled(false);
        txtprecio.setEnabled(false);
        dcfecha_reserva.setEnabled(false);
        dcfecha_reserva1.setEnabled(false);
        jButton2.setEnabled(false);
        txtprecio.setText("");
    }
    
    public void habilitar3(){
        idtrenes.setVisible(false);
        txtconductores.setEnabled(true);
        txtmodelo.setEnabled(true);
        cbosalida.setEnabled(true);
        txtnormal.setEnabled(true);
        txtpreferencial.setEnabled(true);
        
        txtconductores.setText("");
        txtmodelo.setText("");
        txtnormal.setText("");
        txtpreferencial.setText("");
        
        btactivar.setEnabled(true);
    }
    
    public void inhabilitar3(){
        idtrenes.setVisible(false);
        txtconductores.setEnabled(false);
        txtmodelo.setEnabled(false);
        cbosalida.setEnabled(false);
        txtnormal.setEnabled(false);
        txtpreferencial.setEnabled(false);
        
        btactivar.setEnabled(false);
        
        txtconductores.setText("");
        txtmodelo.setText("");
        txtnormal.setText("");
        txtpreferencial.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboorigen = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbodestino = new javax.swing.JComboBox<>();
        btactivar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jslimite = new javax.swing.JSpinner();
        btactivar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboorigen2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        dcfecha_reserva = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        dcfecha_reserva1 = new com.toedter.calendar.JDateChooser();
        cbodestino2 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        cbotipo_pasaje = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btactivar3 = new javax.swing.JButton();
        idprecio_rutas = new javax.swing.JButton();
        idrutas = new javax.swing.JButton();
        idtrenes = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btactivar = new javax.swing.JButton();
        btactivar4 = new javax.swing.JButton();
        txtmodelo = new javax.swing.JTextField();
        txtconductores = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnormal = new javax.swing.JTextField();
        txtpreferencial = new javax.swing.JTextField();
        cbosalida = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(432, 646));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(432, 646));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Destinos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Origen");

        cboorigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "BARQUISIMETO", "AP.SJ", "YARITAGUA", "AP.SP", "CHIVACOA", "AP.TAR", "AP.BO", "SAN FELIPE", "AP.TA", "URAMA", "AP.AL", "MORON", "AP.EP", "PUERTO CABELLO" }));
        cboorigen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboorigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboorigenItemStateChanged(evt);
            }
        });
        cboorigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboorigenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Destino");

        cbodestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cbodestino.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbodestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbodestinoActionPerformed(evt);
            }
        });

        btactivar1.setBackground(new java.awt.Color(190, 74, 77));
        btactivar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btactivar1.setForeground(new java.awt.Color(255, 255, 255));
        btactivar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ok_24px.png"))); // NOI18N
        btactivar1.setText("Activar");
        btactivar1.setContentAreaFilled(false);
        btactivar1.setMaximumSize(new java.awt.Dimension(105, 33));
        btactivar1.setMinimumSize(new java.awt.Dimension(105, 33));
        btactivar1.setOpaque(true);
        btactivar1.setPreferredSize(new java.awt.Dimension(105, 33));
        btactivar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactivar1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Limite");

        jslimite.setModel(new javax.swing.SpinnerNumberModel(0, 0, 300, 1));
        jslimite.setEditor(new javax.swing.JSpinner.NumberEditor(jslimite, ""));

        btactivar2.setBackground(new java.awt.Color(190, 74, 77));
        btactivar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btactivar2.setForeground(new java.awt.Color(255, 255, 255));
        btactivar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Plus_24px.png"))); // NOI18N
        btactivar2.setText("Nuevo");
        btactivar2.setContentAreaFilled(false);
        btactivar2.setMaximumSize(new java.awt.Dimension(105, 33));
        btactivar2.setMinimumSize(new java.awt.Dimension(105, 33));
        btactivar2.setOpaque(true);
        btactivar2.setPreferredSize(new java.awt.Dimension(105, 33));
        btactivar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactivar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbodestino, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jslimite, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btactivar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btactivar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbodestino, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jslimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btactivar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btactivar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Precios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Precio");

        txtprecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtprecioFocusLost(evt);
            }
        });
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprecioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Rutas");

        cboorigen2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "BARQUISIMETO", "AP.SJ", "YARITAGUA", "AP.SP", "CHIVACOA", "AP.TAR", "AP.BO", "SAN FELIPE", "AP.TA", "URAMA", "AP.AL", "MORON", "AP.EP", "PUERTO CABELLO" }));
        cboorigen2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboorigen2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboorigen2ItemStateChanged(evt);
            }
        });
        cboorigen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboorigen2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Desde");

        dcfecha_reserva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dcfecha_reservaFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Hasta");

        dcfecha_reserva1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dcfecha_reserva1FocusLost(evt);
            }
        });

        cbodestino2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cbodestino2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbodestino2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbodestino2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jRadioButton1.setText("Ida ");
        jRadioButton1.setOpaque(false);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jRadioButton2.setText("Ida/Vuelta");
        jRadioButton2.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Tipo pasaje");

        cbotipo_pasaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "3ra Edad + 60", "Adultos + 26", "Joven 12-25", "Menores 4- 11", "Discapacitado" }));
        cbotipo_pasaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbotipo_pasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipo_pasajeActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Destino");

        jButton2.setBackground(new java.awt.Color(190, 74, 77));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ok_24px.png"))); // NOI18N
        jButton2.setText("Activar");
        jButton2.setContentAreaFilled(false);
        jButton2.setMaximumSize(new java.awt.Dimension(105, 33));
        jButton2.setMinimumSize(new java.awt.Dimension(105, 33));
        jButton2.setOpaque(true);
        jButton2.setPreferredSize(new java.awt.Dimension(105, 33));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btactivar3.setBackground(new java.awt.Color(190, 74, 77));
        btactivar3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btactivar3.setForeground(new java.awt.Color(255, 255, 255));
        btactivar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Plus_24px.png"))); // NOI18N
        btactivar3.setText("Nuevo");
        btactivar3.setContentAreaFilled(false);
        btactivar3.setMaximumSize(new java.awt.Dimension(105, 33));
        btactivar3.setMinimumSize(new java.awt.Dimension(105, 33));
        btactivar3.setOpaque(true);
        btactivar3.setPreferredSize(new java.awt.Dimension(105, 33));
        btactivar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactivar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtprecio)
                    .addComponent(cboorigen2, 0, 152, Short.MAX_VALUE)
                    .addComponent(dcfecha_reserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcfecha_reserva1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbodestino2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbotipo_pasaje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jRadioButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(idrutas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 44, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(idtrenes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(idprecio_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btactivar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboorigen2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbodestino2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel16))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbotipo_pasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(idrutas))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(dcfecha_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(dcfecha_reserva1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idtrenes)
                            .addComponent(idprecio_rutas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btactivar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Modelo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel4.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Conductores");

        btactivar.setBackground(new java.awt.Color(190, 74, 77));
        btactivar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btactivar.setForeground(new java.awt.Color(255, 255, 255));
        btactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ok_24px.png"))); // NOI18N
        btactivar.setText("Activar");
        btactivar.setContentAreaFilled(false);
        btactivar.setMaximumSize(new java.awt.Dimension(105, 33));
        btactivar.setMinimumSize(new java.awt.Dimension(105, 33));
        btactivar.setOpaque(true);
        btactivar.setPreferredSize(new java.awt.Dimension(105, 33));
        btactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactivarActionPerformed(evt);
            }
        });

        btactivar4.setBackground(new java.awt.Color(190, 74, 77));
        btactivar4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btactivar4.setForeground(new java.awt.Color(255, 255, 255));
        btactivar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Plus_24px.png"))); // NOI18N
        btactivar4.setText("Nuevo");
        btactivar4.setContentAreaFilled(false);
        btactivar4.setMaximumSize(new java.awt.Dimension(105, 33));
        btactivar4.setMinimumSize(new java.awt.Dimension(105, 33));
        btactivar4.setOpaque(true);
        btactivar4.setPreferredSize(new java.awt.Dimension(105, 33));
        btactivar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactivar4ActionPerformed(evt);
            }
        });

        txtmodelo.setMinimumSize(new java.awt.Dimension(6, 25));
        txtmodelo.setPreferredSize(new java.awt.Dimension(6, 25));
        txtmodelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmodeloFocusLost(evt);
            }
        });
        txtmodelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmodeloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmodeloKeyTyped(evt);
            }
        });

        txtconductores.setMinimumSize(new java.awt.Dimension(6, 25));
        txtconductores.setPreferredSize(new java.awt.Dimension(6, 25));
        txtconductores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtconductoresFocusLost(evt);
            }
        });
        txtconductores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtconductoresKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtconductoresKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Modelo tren");

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Hora salida");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Asientos"));
        jPanel1.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Normal");

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Preferencial");

        txtnormal.setMinimumSize(new java.awt.Dimension(6, 25));
        txtnormal.setPreferredSize(new java.awt.Dimension(59, 25));
        txtnormal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnormalKeyTyped(evt);
            }
        });

        txtpreferencial.setMinimumSize(new java.awt.Dimension(6, 25));
        txtpreferencial.setPreferredSize(new java.awt.Dimension(59, 25));
        txtpreferencial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpreferencialKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnormal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtpreferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtnormal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtpreferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        cbosalida.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cbosalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "5:00", "5:30 ", "6:30 ", "7:00", "7:30", "8:00", "8:30", "9:00", "otro" }));
        cbosalida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbosalida.setMinimumSize(new java.awt.Dimension(51, 25));
        cbosalida.setOpaque(false);
        cbosalida.setPreferredSize(new java.awt.Dimension(51, 25));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmodelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbosalida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btactivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btactivar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(15, 15, 15)
                        .addComponent(txtconductores, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btactivar4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtconductores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbosalida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtprecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyPressed
        val.teclasEspeciales(evt, txtprecio);
    }//GEN-LAST:event_txtprecioKeyPressed

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        val.espacioMaximo(txtprecio, evt, 5);
        val.digitos(evt);
    }//GEN-LAST:event_txtprecioKeyTyped

    private void cboorigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboorigenActionPerformed
        val.valEsp(cboorigen);
        cboorigen.transferFocus();
    }//GEN-LAST:event_cboorigenActionPerformed

    private void cbodestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbodestinoActionPerformed
        val.valEsp(cbodestino);
        cbodestino.transferFocus();
    }//GEN-LAST:event_cbodestinoActionPerformed

    private void btactivar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactivar1ActionPerformed
        btactivar1.transferFocus();
        int selecionado = cboorigen.getSelectedIndex();
        dts.setOrigen((String)cboorigen.getItemAt(selecionado));
        selecionado = cbodestino.getSelectedIndex();
        dts.setDestino((String)cbodestino.getItemAt(selecionado));
        dts.setLimite(jslimite.getValue().toString());
        
        if(jslimite.getValue().equals(0)){
           val.valEsp(cboorigen);
           val.valEsp(cbodestino);
        }else if(accion.equals("activar")){
           if(func.insertar(dts)){
              Ajustes.Aplicacion.showMessageDialog( "El destino fue registrado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
              inhabilitar1();
           }
        }
        
    }//GEN-LAST:event_btactivar1ActionPerformed

    private void cboorigen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboorigen2ActionPerformed
        val.valEsp(cboorigen2);
        cboorigen2.transferFocus();
    }//GEN-LAST:event_cboorigen2ActionPerformed

    private void cbodestino2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbodestino2ActionPerformed
        val.valEsp(cbodestino2);
        cbodestino2.transferFocus();
    }//GEN-LAST:event_cbodestino2ActionPerformed

    private void cbotipo_pasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipo_pasajeActionPerformed
        val.valEsp(cbotipo_pasaje);
        cbotipo_pasaje.transferFocus();
    }//GEN-LAST:event_cbotipo_pasajeActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        txtprecio.transferFocus();
    }//GEN-LAST:event_txtprecioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.transferFocus();
        
        if(dcfecha_reserva.getDate() == null || dcfecha_reserva.getDate() == null){
           val.valEsp(cboorigen2);
           val.valEsp(cbodestino2);
           val.valEsp(cbotipo_pasaje);
           val.valEsp(txtprecio);
           val.valEsp(dcfecha_reserva);
           val.valEsp(dcfecha_reserva1);
        }else    
        if(accion1.equals("activar2")){
            if(func1.insertar(dts1)){
                Ajustes.Aplicacion.showMessageDialog( "El precio del pasaje fue registrado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
                inhabilitar1();
            }
        }
        
        int selecionado = cboorigen2.getSelectedIndex();
        dts1.setRutas((String)cboorigen2.getItemAt(selecionado));
        selecionado = cbodestino2.getSelectedIndex();
        dts1.setDestino((String)cbodestino2.getItemAt(selecionado));
        selecionado = cbotipo_pasaje.getSelectedIndex();
        dts1.setTipo_pasaje((String)cbotipo_pasaje.getItemAt(selecionado));
        dts1.setPrecio(Double.parseDouble(txtprecio.getText()));

        Calendar cal;
        int d,m,a;
        cal =dcfecha_reserva.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) -1900;
        dts1.setDesde(new Date(a,m,d));
       
        cal = dcfecha_reserva1.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) -1900;
        dts1.setHasta(new Date(a,m,d));
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactivarActionPerformed
        btactivar.transferFocus();
        int selecionado = cbosalida.getSelectedIndex();
        
        dts2.setConductores(txtconductores.getText());
        dts2.setCod_tren(txtmodelo.getText());
        dts2.setTiempo_salida((String)cbosalida.getItemAt(selecionado).toString());
        dts2.setAsientos_normal(txtnormal.getText());
        dts2.setAsientos_prefe(txtpreferencial.getText());
        
        if(txtpreferencial.getText().equals("")){
           val.valEsp(txtconductores);
           val.valEsp(txtmodelo);
           val.valEsp(cbosalida);
           val.valEsp(txtnormal);
           val.valEsp(txtpreferencial);
        }else
        if(accion2.equals("activar3")){
           if(func2.insertar(dts2)){
              Ajustes.Aplicacion.showMessageDialog( "Los detalles del tren fue registrado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
              inhabilitar1();
           }
        }
    }//GEN-LAST:event_btactivarActionPerformed

    private void btactivar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactivar2ActionPerformed
        habilitar1();
        btactivar1.setText("Activar");
        accion = "activar";
    }//GEN-LAST:event_btactivar2ActionPerformed

    private void btactivar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactivar3ActionPerformed
        habilitar2();
        jButton2.setText("Activar");
        accion1 = "activar2";
    }//GEN-LAST:event_btactivar3ActionPerformed

    private void btactivar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactivar4ActionPerformed
        habilitar3();
        btactivar.setText("Activar");
        accion2 = "activar3";
    }//GEN-LAST:event_btactivar4ActionPerformed

    private void txtmodeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmodeloKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodeloKeyPressed

    private void txtmodeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmodeloKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodeloKeyTyped

    private void txtconductoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconductoresKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconductoresKeyPressed

    private void txtconductoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconductoresKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtconductores, evt, 25);
    }//GEN-LAST:event_txtconductoresKeyTyped

    private void txtconductoresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtconductoresFocusLost
        if (txtconductores.getText().equals("")) {
            txtconductores.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
        } else {
            txtconductores.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }//GEN-LAST:event_txtconductoresFocusLost

    private void txtmodeloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmodeloFocusLost
        if (txtmodelo.getText().equals("")) {
            txtmodelo.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
        } else {
            txtmodelo.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }//GEN-LAST:event_txtmodeloFocusLost

    private void txtnormalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnormalKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtnormal, evt, 3);
    }//GEN-LAST:event_txtnormalKeyTyped

    private void txtpreferencialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreferencialKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtpreferencial, evt, 3);
    }//GEN-LAST:event_txtpreferencialKeyTyped

    private void cboorigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboorigenItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(cboorigen.getSelectedIndex()>=0)
            {
                this.cbodestino.setModel(new DefaultComboBoxModel(this.cnf.getCiudades(this.cboorigen.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_cboorigenItemStateChanged

    private void txtprecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtprecioFocusLost
        if (txtprecio.getText().equals("")) {
            txtprecio.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
        } else {
            txtprecio.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }//GEN-LAST:event_txtprecioFocusLost

    private void dcfecha_reservaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcfecha_reservaFocusLost
        if (dcfecha_reserva.getDate() == null) {
            dcfecha_reserva.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
        }else{
            dcfecha_reserva.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }//GEN-LAST:event_dcfecha_reservaFocusLost

    private void dcfecha_reserva1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcfecha_reserva1FocusLost
        if (dcfecha_reserva1.getDate() == null) {
            dcfecha_reserva1.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
        }else{
            dcfecha_reserva1.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }//GEN-LAST:event_dcfecha_reserva1FocusLost

    private void cboorigen2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboorigen2ItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(cboorigen2.getSelectedIndex()>=0)
            {
                this.cbodestino2.setModel(new DefaultComboBoxModel(this.cnf.getCiudades(this.cboorigen2.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_cboorigen2ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btactivar;
    private javax.swing.JButton btactivar1;
    private javax.swing.JButton btactivar2;
    private javax.swing.JButton btactivar3;
    private javax.swing.JButton btactivar4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbodestino;
    private javax.swing.JComboBox<String> cbodestino2;
    private javax.swing.JComboBox<String> cboorigen;
    private javax.swing.JComboBox<String> cboorigen2;
    private javax.swing.JComboBox<String> cbosalida;
    private javax.swing.JComboBox<String> cbotipo_pasaje;
    private com.toedter.calendar.JDateChooser dcfecha_reserva;
    private com.toedter.calendar.JDateChooser dcfecha_reserva1;
    private javax.swing.JButton idprecio_rutas;
    private javax.swing.JButton idrutas;
    private javax.swing.JButton idtrenes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    public static javax.swing.JSpinner jslimite;
    private javax.swing.JTextField txtconductores;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnormal;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtpreferencial;
    // End of variables declaration//GEN-END:variables
}
