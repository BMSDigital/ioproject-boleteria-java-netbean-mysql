
package Presentacion;

import Ajustes.Validaciones;
import Datos.vusuario;
import EgoistSwing.Util.AppView;
import EgoistSwing.Util.ButtonFlash;
import EgoistSwing.Util.ExpandOnFocus;
import EgoistSwing.Util.TextFieldColorOnFocus;
import EgoistSwing.Util.ToolTip;
import Logica.fusuario;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class registrar_usuario extends javax.swing.JPanel {

    public registrar_usuario() {
        initComponents();
        inhabilitar();
        setEgoistStyle();
    }
    Validaciones val = new Validaciones();
    vusuario dts  = new vusuario();
    fusuario func = new fusuario();
    private String accion="registrar";
    
    Color colorA=new Color(255,255,255,255);
    Color colorB=new Color(255,255,255,100);
    Color foregroundA=new Color(49,152,211);
    Color foregroundB=new Color(255,255,255);
    
    public void setEgoistStyle(){
        (new ExpandOnFocus(new java.awt.Dimension(165,50), new java.awt.Dimension(30,0), 100, txtnombre)).build();
        (new ExpandOnFocus(new java.awt.Dimension(165,50), new java.awt.Dimension(30,0), 100, txtapellido)).build();
        (new ExpandOnFocus(new java.awt.Dimension(165,50), new java.awt.Dimension(30,0), 100, txtusuario)).build();
        (new ExpandOnFocus(new java.awt.Dimension(165,50), new java.awt.Dimension(30,0), 100, txtpasword)).build();
        (new ExpandOnFocus(new java.awt.Dimension(77,50), new java.awt.Dimension(8,0), 100, txtemail)).build();
        (new ExpandOnFocus(new java.awt.Dimension(77,50), new java.awt.Dimension(13,0), 100, txttelefono)).build();
        (new ButtonFlash(btregistrar, new java.awt.Color(183,103,103,0))).build();
        (new ButtonFlash(btnuevo, new java.awt.Color(183,103,103,0))).build();

        (new ToolTip(AppView.loadImage("tooltip.png"),txtnombre, "<html><left>Introduzca el nombre completo en letra mayúscula. No se permiten números ni caracteres especiales.</left></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtapellido, "<html><lef>Introduzca el apellido completo en letra mayúscula. No se permiten números ni caracteres especiales.</lef></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtusuario, "<html><lef>Introduzca una cuenta que sea legible y recordable. Para iniciar sesion en el sistema.</lef></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtpasword,"<html><lef>Contraceñas deben tener 8 caracteres como minimo. y contener mayuscula y minuscula.</lef></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtemail,"<html><lef>Introduzca una direccion de correo electronico favorita. Para iniciar sesion</lef></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txttelefono,"<html><lef>Introduzca su numero de telefono ya que nos ayuda a mantener tu cuenta segura</lef></html>",200)).build();
        
        //(new ToolTip(AppView.loadImage("tooltip.png"),txtusuario,"<html><lef>Introduzca un nombre de usuario que sea legible y recordable. Ya que le permitira iniciar sesion durante el sistema de boleteria.</lef></html>",200)).build();
        //(new ToolTip(AppView.loadImage("tooltip.png"), txtnombre, "Introduzca el nombre completo en letra mayúscula. No se permiten números ni caracteres especiales.", 200)).build();
        //(new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtnombre)).build();
    }
    public void habilitar(){
        txtidpersona.setVisible(false);
        txtnombre.setEnabled(true);
        txtapellido.setEnabled(true);
        txtusuario.setEnabled(true);
        txtpasword.setEnabled(true);
        txtemail.setEnabled(true);
        txttelefono.setEnabled(true);
        cboemail.setEnabled(true);
        cboestado.setEnabled(true);
        cbotelefono.setEnabled(true);
        slidernivel.setEnabled(true);
        
        btregistrar.setEnabled(true);
        /*cboemail.setSelectedIndex(0);
        cbotelefono.setSelectedIndex(0);
        cboestado.setSelectedIndex(0);*/
        txtnombre.setText("");
        txtapellido.setText("");
        txtusuario.setText("");
        txtpasword.setText("");
        txtemail.setText("");
        txttelefono.setText("");
    }
    
    public void inhabilitar(){
        txtidpersona.setVisible(false);
        txtnombre.setEnabled(false);
        txtapellido.setEnabled(false);
        txtusuario.setEnabled(false);
        txtpasword.setEnabled(false);
        txtemail.setEnabled(false);
        txttelefono.setEnabled(false);
        cboemail.setEnabled(false);
        cboestado.setEnabled(false);
        cbotelefono.setEnabled(false);
        slidernivel.setEnabled(false);
        
        btregistrar.setEnabled(false);
        
        txtnombre.setText("");
        txtapellido.setText("");
        txtusuario.setText("");
        txtpasword.setText("");
        txtemail.setText("");
        txttelefono.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtidpersona = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboemail = new javax.swing.JComboBox<>();
        txtemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        cbotelefono = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtpasword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        slidernivel = new javax.swing.JSlider();
        slidertext = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<>();
        btregistrar = new javax.swing.JButton();
        btnuevo = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(354, 520));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(354, 520));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Nuevo usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnombreFocusLost(evt);
            }
        });
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");

        txtapellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtapellidoFocusLost(evt);
            }
        });
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");

        txtusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusuarioFocusLost(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        cboemail.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cboemail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Gmail.com", "Hotmail.com", "Yahoo.com", "Otro" }));
        cboemail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboemailActionPerformed(evt);
            }
        });

        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");

        txttelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttelefonoFocusLost(evt);
            }
        });
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        cbotelefono.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cbotelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0416", "0426", "0412", "0251", "0253", "Otro" }));
        cbotelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbotelefono.setOpaque(false);
        cbotelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotelefonoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pasword");

        txtpasword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpaswordFocusLost(evt);
            }
        });
        txtpasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaswordActionPerformed(evt);
            }
        });
        txtpasword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpaswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpaswordKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nivel de acceso");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(214, 128, 0));
        jLabel45.setText("*");

        slidernivel.setForeground(new java.awt.Color(255, 255, 255));
        slidernivel.setMajorTickSpacing(1);
        slidernivel.setMaximum(2);
        slidernivel.setPaintLabels(true);
        slidernivel.setPaintTicks(true);
        slidernivel.setValue(1);
        slidernivel.setOpaque(false);
        slidernivel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slidernivelStateChanged(evt);
            }
        });

        slidertext.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        slidertext.setForeground(new java.awt.Color(255, 255, 255));
        slidertext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slidertext.setText("Moderador");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado");

        cboestado.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Activado", "Desactivado" }));
        cboestado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboestado.setOpaque(false);
        cboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttelefono))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(slidertext, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slidernivel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtidpersona, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboemail, 0, 1, Short.MAX_VALUE))
                            .addComponent(txtpasword, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(cboestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtpasword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cboemail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(2, 2, 2)
                .addComponent(slidernivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slidertext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btregistrar.setBackground(new java.awt.Color(190, 74, 77));
        btregistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btregistrar.setForeground(new java.awt.Color(255, 255, 255));
        btregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ok_24px.png"))); // NOI18N
        btregistrar.setText("Registrar");
        btregistrar.setContentAreaFilled(false);
        btregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btregistrar.setOpaque(true);
        btregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregistrarActionPerformed(evt);
            }
        });

        btnuevo.setBackground(new java.awt.Color(190, 74, 77));
        btnuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Plus_24px.png"))); // NOI18N
        btnuevo.setText("Nuevo");
        btnuevo.setContentAreaFilled(false);
        btnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnuevo.setOpaque(true);
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
       val.teclasEspeciales(evt, txtnombre);
    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
       val.letras(evt);
       val.espacioMaximo(txtnombre, evt, 11);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyPressed
       val.teclasEspeciales(evt, txtapellido);
    }//GEN-LAST:event_txtapellidoKeyPressed

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
       val.letras(evt);
       val.espacioMaximo(txtapellido, evt, 11);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyPressed
       val.teclasEspeciales(evt, txtusuario);
    }//GEN-LAST:event_txtusuarioKeyPressed

    private void txtpaswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaswordKeyPressed
       val.teclasEspeciales(evt, txtpasword);
    }//GEN-LAST:event_txtpaswordKeyPressed

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
       val.espacioMaximo(txtemail, evt, 25);
    }//GEN-LAST:event_txtemailKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
       val.digitos(evt);
       val.espacioMaximo(txttelefono, evt, 8);
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
       val.espacioMaximo(txtusuario, evt, 25);
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void txtpaswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaswordKeyTyped
       val.espacioMaximo(txtpasword, evt, 20);
    }//GEN-LAST:event_txtpaswordKeyTyped

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
       txtnombre.transferFocus();
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
       txtnombre.transferFocus();
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
       txtusuario.transferFocus();
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtpaswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaswordActionPerformed
       txtpasword.transferFocus();
    }//GEN-LAST:event_txtpaswordActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
       txtemail.transferFocus();
    }//GEN-LAST:event_txtemailActionPerformed

    private void cboemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboemailActionPerformed
       val.valEsp(cboemail);
       cboemail.transferFocus();
    }//GEN-LAST:event_cboemailActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
       txttelefono.transferFocus();
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void cbotelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotelefonoActionPerformed
       val.valEsp(cbotelefono);
       cbotelefono.transferFocus();
    }//GEN-LAST:event_cbotelefonoActionPerformed

    private void btregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregistrarActionPerformed
        int selecionado = cbotelefono.getSelectedIndex();
        selecionado = cboemail.getSelectedIndex();
        selecionado = cboestado.getSelectedIndex();
        dts.setNombre(txtnombre.getText());
        dts.setApellido(txtapellido.getText());
        dts.setTelf((String)cbotelefono.getSelectedItem().toString().concat(txttelefono.getText()));
        dts.setEmail(txtemail.getText().concat(" "+(String)cboemail.getSelectedItem().toString()));
        dts.setUser(txtusuario.getText());
        dts.setPass(txtpasword.getText());
        dts.setNivel(slidertext.getText());
        dts.setPrivilegio((String)cboestado.getSelectedItem().toString());
        
        if(cboestado.getSelectedItem().equals("--")){
           val.valEsp(txtnombre);
           val.valEsp(txtapellido);
           val.valEsp(txtusuario);
           val.valEsp(txtpasword);
           val.valEsp(cboemail);
           val.valEsp(txtemail);
           val.valEsp(cbotelefono);
           val.valEsp(txttelefono);
           val.valEsp(cboestado);
        }else{
            if(accion.equals("registrar")){
          if(func.insertar(dts)){
              Ajustes.Aplicacion.showMessageDialog( "El usuario fue registrado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
              inhabilitar();
          }
        }
        }
        
    }//GEN-LAST:event_btregistrarActionPerformed

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
        val.valEsp(cboestado);
    }//GEN-LAST:event_cboestadoActionPerformed

    private void slidernivelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slidernivelStateChanged
        switch(slidernivel.getValue()){
            case 0:
            {
                slidertext.setText("Usuario");
            }
            break;
            
            case 1:
            {
                slidertext.setText("Moderador");
            }
            break;
            
            case 2:
            {
                slidertext.setText("Administrador");
            }
        }    
    }//GEN-LAST:event_slidernivelStateChanged

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
        btregistrar.setText("Registrar");
        accion = "registrar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        val.teclasEspeciales(evt, txttelefono);
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txtnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusLost
        if(txtnombre.getText().equals("")){
           txtnombre.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
           
        }else{
            txtnombre.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        }
    }//GEN-LAST:event_txtnombreFocusLost

    private void txtapellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapellidoFocusLost
        if(txtapellido.getText().equals("")){
           txtapellido.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
          
        }else{
            txtapellido.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        }
    }//GEN-LAST:event_txtapellidoFocusLost

    private void txtusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusLost
        if(txtusuario.getText().equals("")){
           txtusuario.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
           
        }else{
           txtusuario.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        }
    }//GEN-LAST:event_txtusuarioFocusLost

    private void txtpaswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpaswordFocusLost
        if(txtpasword.getText().equals("")){
           txtpasword.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
           
        }else{
           txtpasword.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        }
    }//GEN-LAST:event_txtpaswordFocusLost

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
       if(txtemail.getText().equals("")){
           txtemail.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
           
        }else{
           txtemail.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        }
    }//GEN-LAST:event_txtemailFocusLost

    private void txttelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttelefonoFocusLost
         if(txttelefono.getText().equals("")){
           txttelefono.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
           
        }else{
           txttelefono.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        }
    }//GEN-LAST:event_txttelefonoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btregistrar;
    private javax.swing.JComboBox<String> cboemail;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JComboBox<String> cbotelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider slidernivel;
    private javax.swing.JLabel slidertext;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtidpersona;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpasword;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
