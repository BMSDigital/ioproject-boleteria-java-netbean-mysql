package Presentacion;
import Presentacion.MenuPrincipal;
import EgoistSwing.Animator.Animator;
import EgoistSwing.Animator.Resize;
import EgoistSwing.Physics.Rect;
import EgoistSwing.Point.Point2d;
import EgoistSwing.Util.ButtonFlash;
import EgoistSwing.Util.ExpandOnFocus;
import EgoistSwing.Util.Background;
import Datos.vusuario;
import EgoistSwing.Util.TextFieldColorOnFocus;
import EgoistSwing.Util.TextFieldName;
import Logica.fusuario;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame
{
    private final int loginItemExtraWidth = 30;
    private final int loginItemWidth = 260;
    private java.awt.Image backImage;
    private Animator passwAnim;

    public Login()
    {
        initComponents();

        javax.swing.JPanel background = new Background(this, "10.jpg", false);
        background.setSize(getWidth(), getHeight());
        background.setLocation(0, 0);
        add(background);

        setSize(getPreferredSize());
        setLocationRelativeTo(null);

        setEgoistStyle();
    }

    private void entrarAlSistema()
    {
            dispose();
            Thread thread = new Thread()
            {
                @Override
                public void run()
                {
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch (Exception e)
                    {
                    }
                    
                   Ajustes.Aplicacion.loadScreen();
                }
            };
            thread.start(); 
    }
    
    public void setEgoistStyle()
    {
        // Creando animaciones para los campos de texto
        (new ExpandOnFocus(new java.awt.Dimension(loginItemWidth, 30), new java.awt.Dimension(loginItemExtraWidth, 0), 100, txtuser)).build();

        // Creando efecto de nombre de campo de texto
        (new TextFieldName("Usuario", txtuser)).build();

        // Creando efecto de cambio de color de campos de texto
        Color colorA = new Color(255, 255, 255, 255);
        Color colorB = new Color(255, 255, 255, 100);
        Color foregroundA = new Color(49, 152, 211);
        Color foregroundB = new Color(255, 255, 255);

        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtuser)).build();

        // Creando efecto de seleccion de boton
        (new ButtonFlash(btnlogin, new java.awt.Color(45, 164, 134, 0))).build();
        (new ButtonFlash(btnexit, new java.awt.Color(54, 54, 54, 0))).build();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtuser = new javax.swing.JTextField();
        txtpassw = new javax.swing.JTextField();
        passw = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        info1 = new javax.swing.JLabel();
        info2 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 596));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        txtuser.setBackground(new java.awt.Color( 255, 255, 255, 100 ));
        txtuser.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.setText("Usuario");
        txtuser.setBorder(null);
        txtuser.setName("1"); // NOI18N
        txtuser.setNextFocusableComponent(txtpassw);
        txtuser.setSelectionColor(new java.awt.Color(255, 183, 76));
        getContentPane().add(txtuser);
        txtuser.setBounds(70, 190, 260, 30);

        txtpassw.setBackground(new java.awt.Color( 255, 255, 255, 100 ));
        txtpassw.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtpassw.setForeground(new java.awt.Color(255, 255, 255));
        txtpassw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassw.setText("Contraseña");
        txtpassw.setBorder(null);
        txtpassw.setName(""); // NOI18N
        txtpassw.setNextFocusableComponent(passw);
        txtpassw.setSelectionColor(new java.awt.Color(255, 183, 76));
        txtpassw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswFocusGained(evt);
            }
        });
        getContentPane().add(txtpassw);
        txtpassw.setBounds(70, 230, 260, 30);

        passw.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        passw.setForeground(new java.awt.Color(89, 196, 189));
        passw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passw.setBorder(null);
        passw.setName(""); // NOI18N
        passw.setNextFocusableComponent(btnlogin);
        passw.setSelectionColor(new java.awt.Color(255, 183, 76));
        passw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwFocusLost(evt);
            }
        });
        getContentPane().add(passw);
        passw.setBounds(600, 230, 260, 30);

        btnlogin.setBackground(new java.awt.Color(255, 255, 255));
        btnlogin.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(49, 152, 211));
        btnlogin.setText("Iniciar sesión");
        btnlogin.setBorderPainted(false);
        btnlogin.setContentAreaFilled(false);
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnlogin.setNextFocusableComponent(btnexit);
        btnlogin.setOpaque(true);
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin);
        btnlogin.setBounds(205, 270, 125, 30);

        btnexit.setBackground(new java.awt.Color(255, 255, 255));
        btnexit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnexit.setForeground(new java.awt.Color(49, 152, 211));
        btnexit.setText("Salir");
        btnexit.setBorderPainted(false);
        btnexit.setContentAreaFilled(false);
        btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnexit.setNextFocusableComponent(txtuser);
        btnexit.setOpaque(true);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit);
        btnexit.setBounds(70, 270, 125, 30);

        info1.setBackground(new java.awt.Color( 255, 255, 255, 100));
        info1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        info1.setForeground(java.awt.SystemColor.text);
        info1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info1.setText("¿Olvidaste tu contraseña?");
        info1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info1.setRequestFocusEnabled(false);
        info1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(info1);
        info1.setBounds(0, 330, 400, 20);

        info2.setBackground(new java.awt.Color( 255, 255, 255, 100 ));
        info2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        info2.setForeground(new java.awt.Color(255, 255, 255));
        info2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info2.setText("<html><p>¿No tienes una cuenta? Ingresa</p><p>como invitado</p></html>");
        info2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info2.setRequestFocusEnabled(false);
        info2.setVerifyInputWhenFocusTarget(false);
        info2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                info2MouseClicked(evt);
            }
        });
        getContentPane().add(info2);
        info2.setBounds(0, 360, 400, 40);

        welcome.setBackground(new java.awt.Color(255, 255, 255));
        welcome.setFont(new java.awt.Font("CentraleSansCnd", 0, 40)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Bienvenido");
        welcome.setFocusable(false);
        welcome.setPreferredSize(new java.awt.Dimension(400, 45));
        welcome.setRequestFocusEnabled(false);
        welcome.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(welcome);
        welcome.setBounds(130, 70, 270, 60);

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablalistado);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 452, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtpasswFocusGained
    {//GEN-HEADEREND:event_txtpasswFocusGained
        txtpassw.setVisible(false);
        txtpassw.setSize(loginItemWidth + loginItemExtraWidth, txtuser.getHeight());
        txtpassw.setLocation(btnexit.getX() - loginItemExtraWidth / 2, txtpassw.getY());

        passw.setSize(loginItemWidth, txtuser.getHeight());
        passw.setLocation(btnexit.getX(), txtpassw.getY());
        passw.requestFocus();
    }//GEN-LAST:event_txtpasswFocusGained

    private void passwFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_passwFocusGained
    {//GEN-HEADEREND:event_passwFocusGained
        if (passwAnim != null)
            if (passwAnim.isRunning())
                passwAnim.kill();

        passwAnim = new Resize();
        passwAnim.create(new Point2d((loginItemWidth + loginItemExtraWidth) - passw.getWidth(), 0), new Rect(), 100, 10, passw);
        passwAnim.start();
    }//GEN-LAST:event_passwFocusGained

    private void passwFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_passwFocusLost
    {//GEN-HEADEREND:event_passwFocusLost
        if (txtpassw.isVisible() == true)
            return;

        if (passw.getPassword().length > 0)
        {
            String text = "";
            for (int i = 0; i < passw.getPassword().length; ++i)
                text += "*";
            txtpassw.setText(text);
        }
        else
            txtpassw.setText("Contraseña");

        passw.setLocation(passw.getX(), -getHeight());
        if (passwAnim != null)
            if (passwAnim.isRunning())
                passwAnim.kill();

        passw.setSize(loginItemWidth, txtuser.getHeight());
        passw.setLocation(btnexit.getX(), -getHeight());

        txtpassw.setSize(loginItemWidth + loginItemExtraWidth, txtuser.getHeight());
        txtpassw.setLocation(btnexit.getX() - loginItemExtraWidth / 2, txtpassw.getY());
        txtpassw.setVisible(true);

        passwAnim = new Resize();
        passwAnim.create(new Point2d(loginItemWidth - txtpassw.getWidth(), 0), new Rect(), 100, 10, txtpassw);
        passwAnim.start();
    }//GEN-LAST:event_passwFocusLost

    private void formMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseClicked
    {//GEN-HEADEREND:event_formMouseClicked
        requestFocus();
    }//GEN-LAST:event_formMouseClicked

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnexitActionPerformed
    {//GEN-HEADEREND:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void info2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_info2MouseClicked

    }//GEN-LAST:event_info2MouseClicked

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
       
        try
        {
            DefaultTableModel modelo;
            fusuario func = new fusuario();
            vusuario  dts  = new vusuario();
            
            dts.setUser(txtuser.getText());
            dts.setPass(passw.getText());
            
            modelo = func.login(dts.getUser(), dts.getPass());
            tablalistado.setModel(modelo);
            
            if(func.totalregistros > 0)
            {
             entrarAlSistema();
             //jLabel1.setText(tablalistado.getValueAt(0, 2).toString());
             //MenuPrincipal.lbusuario.setText(tablalistado.getValueAt(0, 2).toString());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Acceso denegado","Acceso al Sistema",JOptionPane.ERROR_MESSAGE);
            }
            Ajustes.Aplicacion.repaintScreen();
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_btnloginActionPerformed

     @Override
    public void setSize( int width, int height )
    {
        setPreferredSize( new java.awt.Dimension(width, height) );
        super.setSize(width, height);
    }
    public java.awt.Image getBackImage()
    {
        return(backImage);
    }
    public void setBackImage( java.awt.Image backImage )
    {
        this.backImage = backImage;
    }
    
    @Override
    public void paint(Graphics g)
    {
        repaint();
        super.paint(g);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel info1;
    private javax.swing.JLabel info2;
    public static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPasswordField passw;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtpassw;
    private javax.swing.JTextField txtuser;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

}
