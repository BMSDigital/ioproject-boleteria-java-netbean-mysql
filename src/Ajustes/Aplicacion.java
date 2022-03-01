/*
 * FRAIBERT ANTHONY BRACHO BRACHO
 * 0251-8865576
 * SISTEMFRAI
 */
package Ajustes;


/**
 *FRAIBERT ANTHONY BRACHO BRACHO
 */
public class Aplicacion {

    static private Presentacion.MenuPrincipal screen;
    static private Presentacion.Login usuario;

    /* Init */
    public static void start()
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                loadUser(); 
            }
        });
    }

    private static void loadUser()
    {
        usuario = new Presentacion.Login();
        usuario.setVisible(true);
    }
  
    public static void loadScreen()
    {
        screen = new Presentacion.MenuPrincipal();
        screen.setVisible(true);
    }
    
    
     /* Manejo de la pantalla */
    public static void callMainOption( javax.swing.JPanel n_content )
    {
        javax.swing.JPanel content = new javax.swing.JPanel()
        {
            private java.awt.Image backImage;
            
            @Override
            public void paintComponent( java.awt.Graphics g )
            {
                super.paintComponent(g);

                if( backImage != null )
                    g.drawImage(backImage, 0, 0, this);
                else
                    backImage = Egoist.Swing.Image.setAlpha(Ajustes.Aplicacion.getThemeItem("panel_menu", getPreferredSize().width, getPreferredSize().height ), 200 );
            }
        };
        
        if(n_content != null)
        {
            content.setSize(n_content.getSize());
            content.setMaximumSize(n_content.getMaximumSize());
            content.setOpaque(false);
            content.setPreferredSize(n_content.getPreferredSize());
            content.add(n_content);
            screen.setContent(content);
        }
        else
            screen.setContent(null);
    }
   
    
    public static void repaintScreen()
    {
        if(screen!=null)
            screen.repaint();
    }
    
    
      public static Presentacion.MenuPrincipal getScreen()
    {
        return((Presentacion.MenuPrincipal)screen);
    }
    public static  java.awt.Image getImage( String imagepath, int width, int height )
    {
        java.awt.Image image = new javax.swing.ImageIcon(Aplicacion.class.getResource( "/Background/" + imagepath + ".png" )).getImage();
        return( Egoist.Swing.Image.resize( image, width, height ) );
    }
    public static  java.awt.Image geTImage( String imagepath, int width, int height )
    {
        java.awt.Image image = new javax.swing.ImageIcon(Aplicacion.class.getResource( "/Recursos/" + imagepath + ".png" )).getImage();
        return( Egoist.Swing.Image.resize( image, width, height ) );
    }
    
    public static String getTheme()
    {
        return("Ligth");
    }
    public static java.awt.Image getThemeItem( String item, int width, int height )
    {
        return(Ajustes.Aplicacion.getImage("Temas/" + Ajustes.Aplicacion.getTheme() + "/" + item, width, height));
    }
    
/* Message Dialog */
   
    public static int showMessageDialog( String msgTitle )
    {
        return(showMessageDialog( "", msgTitle, 1, new String[]{"Aceptar"}, new String[]{"accept"} ));
    }
    public static <T> int showMessageDialog( String msgTitle, String msgStr, int msgColor, String[] buttons, String[] buttonsUrl )
    {
        screen.setContentVisible(false);
        // Eligiendo el color de fondo
        java.awt.Color color;
        switch( msgColor )
        {
            default:
            {
                color = new java.awt.Color( 0, 0, 0, 0 );
            }break;
        }
        
        // Oscureciendo el fondo de la pantalla
        Egoist.Swing.JPanel backColor = new Egoist.Swing.JPanel()
        {
            @Override
            public void paintComponent( java.awt.Graphics g )
            {
                if( ((Presentacion.MenuPrincipal)screen).getBackImage() != null )
                    g.drawImage(((Presentacion.MenuPrincipal)screen).getBackImage(), 0, 0, this);
                
                super.paintComponent(g); 
            }  
        };
        backColor.setSize(screen.getSize());
        backColor.setBackground( new java.awt.Color( 0, 0, 0, 0 ) );
        backColor.setScreen(screen);
        backColor.setVisible(false);
        
        screen.getContentPane().add(backColor);
        screen.pack();
        
        Egoist.Swing.Animator animator = Egoist.Swing.Animator.build(Egoist.Swing.Animator.ANIMATION.Fading).init( 175, 30, 3000, Egoist.Swing.Animator.BEHAVIOUR.AccelDown, backColor);
        animator.start();

        // Creando el dialog y agregando el panel de opciones
        javax.swing.JDialog dialog = new javax.swing.JDialog( screen, "", true );
        
        dialog.dispose();
        dialog.setUndecorated(true);

        Presentacion.Message msg = new Presentacion.Message(dialog);
        
        // Estableciendo los valores del mensaje
        msg.setMessage( msgTitle, msgStr, buttons, buttonsUrl );
        
        backColor.setVisible(true);
        
        // Mostrando el mensaje
        msg.showTime();
        
        // Limpiando pantalla
        animator.finish();
        
        screen.getContentPane().remove(backColor);
        screen.pack();
        screen.setContentVisible(true);
        
        return(msg.getValue());
    }
    
}
