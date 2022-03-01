
package Presentacion;
import Egoist.Swing.Animator;
import EgoistSwing.Util.ButtonFlash;
import Logica.fusuario;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JPanel;

public class MenuPrincipal extends javax.swing.JFrame {
    boolean boletos_der, boletos_iz,redes_sociales;
    
    fusuario func = new fusuario();

    private java.awt.Image backImage;
    
    private JPanel content;
    
    private Dimension dim;
    /**
     * Formulario principal
     */
    public MenuPrincipal() {
        // Pintar Background
        javax.swing.JPanel contentPane = new javax.swing.JPanel()
        {
            @Override
            public void paintComponent( java.awt.Graphics g )
            {
                super.paintComponent(g); 
                if( backImage != null )
                    g.drawImage(backImage, 0, 0, this);
            }
        };
        setContentPane(contentPane);
       
        initComponents();
        this.setLocationRelativeTo(null);
        redes_sociales = false;
        boletos_der = false;
        func.mostrarLogin(lbusuario);

        //Ventana();
        //this.setSize(new Dimension(1366,768));
        this.setSize(new Dimension(1000,734));
        //this.setLocationRelativeTo(null);
        setEgoistStyle();
    }

    
        public void Ventana(){

        //con esto obtienes en tamano en en x y y de tu monitor

        dim=super.getToolkit().getScreenSize();

        super.setSize(dim);

        super.setUndecorated(true);

        super.setVisible(true);
    }
        
    public void setEgoistStyle(){
       // (new ButtonFlash(btnlogin, new java.awt.Color(45, 164, 134, 0))).build();
       (new ButtonFlash(btusuario, new java.awt.Color(121,41,44,0))).build();
       (new ButtonFlash(btticket, new java.awt.Color(121,41,44,0))).build();
       (new ButtonFlash(btpagar, new java.awt.Color(121,41,44,0))).build();
       (new ButtonFlash(btadm, new java.awt.Color(121,41,44,0))).build();
       (new ButtonFlash(btregresar, new java.awt.Color(121,41,44,0))).build();
    }
    
    // escribe o reemplaza el contenido de un articulo con contenido nuevo
    public void setContent(JPanel n_content){
        int n_contentWidth = n_content.getMaximumSize().width; //devueve el ancho de dimension en doble presicion
        int n_contentHeight = n_content.getMaximumSize().height; //devueve la altura de dimension en doble presicion
        int n_contentX = (int)(getWidth() *1.6); //devuelve la parte horizontal
        int n_contentY = (int)(getHeight() * 0.6f-n_contentHeight * 0.5 - 50);
        int disA = -(int) (getWidth())-8;
        int disB = -(int) (n_contentWidth*0.5f);
        
        // animaciones
        if( this.content != null){
           class postMethod extends Egoist.Swing.Animator
           {
              //se utiliza para indicar que el valor de una variable sera modificada
               volatile JPanel o_content = content;

                @Override
                public Egoist.Swing.Animator init(Object o, int i, long l, Animator.BEHAVIOUR bhvr, Object o1) {return(null);}

                @Override
                public void load() {
                   //devuelve los datos predefinido
                   MenuPrincipal menuPrincipal = Ajustes.Aplicacion.getScreen();
                   
                   if( menuPrincipal != null){
                      //el nuevo panel es diferente de null
                      if(o_content != null){
                         //elimina todos los elementos de una lista que se contienen en la coleccion especifica
                         o_content.removeAll();
                         //elimina el componente especificado desde el recipiente
                         menuPrincipal.getContentPane().remove(o_content);
                      }
                      //el formulario se ajusta al tamaño
                      menuPrincipal.pack();
                      //vuelve a pintar el rectangulo en tiempo milisegundo
                      menuPrincipal.repaint();
                   }
                       
                }

                @Override
                public void render() {}
                @Override
                public void finish() {}
                @Override
                public boolean isBroken() {
                   return (false);
                }
           }
           
           Egoist.Swing.Animator.build( Egoist.Swing.Animator.ANIMATION.Transition ).
                    init( new java.awt.Point( disA, 0 ), 20, 700, Egoist.Swing.Animator.BEHAVIOUR.AccelUp, this.content ).
                        enqueue( Egoist.Swing.Animator.build(Egoist.Swing.Animator.ANIMATION.Transition).
                            init( new java.awt.Point( disB, 0 ), 20, 600, Egoist.Swing.Animator.BEHAVIOUR.Rect, this.content ).
                                enqueue( new postMethod() ) ).
                                    start();
        }
        
        if( n_content != null ){
           this.content = n_content;
           this.content.setSize( n_contentWidth, n_contentHeight );
           this.content.setLocation( n_contentX, n_contentY);
           this.getContentPane().add(this.content, 0);
           
           Egoist.Swing.Animator.build( Egoist.Swing.Animator.ANIMATION.Transition).
                    init( new java.awt.Point( disA, 0 ), 20, 600, Egoist.Swing.Animator.BEHAVIOUR.Rect, this.content ).
                        enqueue( Egoist.Swing.Animator.build(Egoist.Swing.Animator.ANIMATION.Transition).
                                init( new java.awt.Point( disB, 0 ), 20, 700, Egoist.Swing.Animator.BEHAVIOUR.AccelDown, this.content ) ).
                                    start();
        }
        //se ajusta al tamaño
        pack();
        //vuelve a pintar el rectangulo
        repaint();
    
    }
    
    //reversion de la animacion
    public void setReverseContent( JPanel n_content )
    {
        
    }
    public void setImmediatelyContent( JPanel n_content )
    {
        if(n_content!=null)
        {
            
        }
        else
        {
            this.content.removeAll();
            remove(this.content);
            
            this.pack();
            this.repaint();
        }
    }
    //message
    public void setContentVisible( boolean contentState )
    {
        this.content.setVisible(contentState);
    }
    
   
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btboletos = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        panel_redes = new javax.swing.JLabel();
        lbusuario = new javax.swing.JLabel();
        btusuario = new javax.swing.JButton();
        panel_menu = new javax.swing.JPanel();
        btregresar = new javax.swing.JButton();
        btadm = new javax.swing.JButton();
        btpagar = new javax.swing.JButton();
        btticket = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar4.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar4.add(jMenu11);

        jMenu13.setText("File");
        jMenuBar5.add(jMenu13);

        jMenu14.setText("Edit");
        jMenuBar5.add(jMenu14);

        jMenu16.setText("File");
        jMenuBar6.add(jMenu16);

        jMenu17.setText("Edit");
        jMenuBar6.add(jMenu17);

        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/01_1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/02.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 194, 254, 38);

        btboletos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/boletos.png"))); // NOI18N
        btboletos.setBorder(null);
        btboletos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/boletos1.png"))); // NOI18N
        btboletos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btboletosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btboletosMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btboletosMouseReleased(evt);
            }
        });
        jPanel1.add(btboletos);
        btboletos.setBounds(0, 234, 254, 38);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscar.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscar1.png"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(0, 274, 254, 38);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/ayuda.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/ayuda1.png"))); // NOI18N
        jPanel1.add(jButton7);
        jButton7.setBounds(0, 620, 254, 38);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/cerrar.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/cerrar1.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(0, 662, 254, 38);

        panel_redes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/panel_redes_1.png"))); // NOI18N
        panel_redes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_redesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_redesMouseExited(evt);
            }
        });
        jPanel1.add(panel_redes);
        panel_redes.setBounds(980, 194, 100, 300);

        lbusuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbusuario.setForeground(new java.awt.Color(255, 255, 255));
        lbusuario.setText("Usuario");
        jPanel1.add(lbusuario);
        lbusuario.setBounds(890, 50, 80, 20);

        btusuario.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        btusuario.setForeground(new java.awt.Color(255, 255, 255));
        btusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Contacts_25px.png"))); // NOI18N
        btusuario.setBorder(null);
        btusuario.setBorderPainted(false);
        btusuario.setContentAreaFilled(false);
        btusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btusuario.setFocusPainted(false);
        jPanel1.add(btusuario);
        btusuario.setBounds(850, 42, 41, 30);

        panel_menu.setEnabled(false);
        panel_menu.setOpaque(false);
        panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btregresar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btregresar.setForeground(new java.awt.Color(255, 255, 255));
        btregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha-hacia-la-izquierda (1).png"))); // NOI18N
        btregresar.setText("<html><h3>Regresar</h3><p>De click para regresar</p></html>");
        btregresar.setBorderPainted(false);
        btregresar.setContentAreaFilled(false);
        btregresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btregresar.setFocusPainted(false);
        btregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregresarActionPerformed(evt);
            }
        });
        panel_menu.add(btregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 230, 70));

        btadm.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btadm.setForeground(new java.awt.Color(255, 255, 255));
        btadm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Personal Trainer_64px.png"))); // NOI18N
        btadm.setText("<html><h1>ADM</h1><p>Solo personal autorizado</p></html>");
        btadm.setBorderPainted(false);
        btadm.setContentAreaFilled(false);
        btadm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btadm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadmActionPerformed(evt);
            }
        });
        panel_menu.add(btadm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 160, 130));

        btpagar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btpagar.setForeground(new java.awt.Color(255, 255, 255));
        btpagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cash in Hand_64px.png"))); // NOI18N
        btpagar.setText("<html><h1>PAGAR</h1><p>Ejecute el pago del boleto</p></html>");
        btpagar.setBorderPainted(false);
        btpagar.setContentAreaFilled(false);
        btpagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(btpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, 130));

        btticket.setBackground(new java.awt.Color(51, 51, 255));
        btticket.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btticket.setForeground(new java.awt.Color(255, 255, 255));
        btticket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Barcode Scanner 2_64px.png"))); // NOI18N
        btticket.setText("<html><h1>TICKET<p>Realice su boleto para su viaje</p></h1></html>");
        btticket.setContentAreaFilled(false);
        btticket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btticketActionPerformed(evt);
            }
        });
        panel_menu.add(btticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Banel.png"))); // NOI18N
        panel_menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 225, 635));

        jPanel1.add(panel_menu);
        panel_menu.setBounds(-230, 50, 230, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    //Se invoca cuando cambia el tamaño del componente
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        backImage = Ajustes.Aplicacion.getThemeItem( "partada", evt.getComponent().getWidth(), evt.getComponent().getHeight() );
    }//GEN-LAST:event_formComponentResized

    private void panel_redesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_redesMouseExited
        if(!redes_sociales)
        Animacion.Animacion.mover_derecha(950, 1010, 1, 2, panel_redes);
    }//GEN-LAST:event_panel_redesMouseExited

    private void panel_redesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_redesMouseEntered
        if(!redes_sociales)
        Animacion.Animacion.mover_izquierda(1010, 950, 1, 2, panel_redes);
    }//GEN-LAST:event_panel_redesMouseEntered

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Ajustes.Aplicacion.callMainOption(new busqueda_avanzada());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_jButton6MouseClicked

    private void btboletosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btboletosMouseExited
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btboletosMouseExited

    private void btboletosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btboletosMouseEntered
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btboletosMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Ajustes.Aplicacion.callMainOption(new registrar_usuario());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_jButton2MouseEntered

    private void btticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btticketActionPerformed
        if(!boletos_der){
            Animacion.Animacion.mover_izquierda(257, -230, 5, 5, panel_menu);
            Ajustes.Aplicacion.callMainOption(new boletos());
        }
        
    }//GEN-LAST:event_btticketActionPerformed

    private void btadmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadmActionPerformed
        if(!boletos_der)
            Animacion.Animacion.mover_izquierda(257, -230, 5,5, panel_menu);
        Ajustes.Aplicacion.callMainOption(new adm_boletos());
    }//GEN-LAST:event_btadmActionPerformed

    private void btregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresarActionPerformed
        if(!boletos_der)
            Animacion.Animacion.mover_izquierda(257, -230, 5,5, panel_menu);
    }//GEN-LAST:event_btregresarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btboletosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btboletosMouseReleased
        int posicion = panel_menu.getX();
        if(posicion > 0){
            Animacion.Animacion.mover_izquierda(257, -230, 5, 5, panel_menu);
            
        }else{
            Animacion.Animacion.mover_derecha(-230, 257, 2, 2, panel_menu);
        } 
    }//GEN-LAST:event_btboletosMouseReleased

    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Files/logo.png"));


        return retValue;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadm;
    private javax.swing.JButton btboletos;
    private javax.swing.JButton btpagar;
    private javax.swing.JButton btregresar;
    private javax.swing.JButton btticket;
    private javax.swing.JButton btusuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbusuario;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JLabel panel_redes;
    // End of variables declaration//GEN-END:variables

}
