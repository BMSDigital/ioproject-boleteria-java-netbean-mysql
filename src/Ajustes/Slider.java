
package Ajustes;

import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Slider {
    int contador;
    
    public void cambiarimagen(JLabel slider){ // cambias las imagenes del menu
         int velocidad=2; // velocidad de cambio
        javax.swing.Timer timer;
        TimerTask tarea; // variable tipo timer que controla el evento
        int velmil=velocidad*1000; // tiempo que duarara cada imagen
        String path=null;

        
      tarea=new TimerTask() {
          
            public void run() {
               Icon icono;
               
               switch(contador){
                   case 0:
                       contador=1;
                       icono=new ImageIcon(getClass().getResource("/Slider/IFE 1.png")); // 
                       slider.setIcon(icono);
                       
                       
                       
                       break;
                   case 1:
                         contador=2;
                       icono=new ImageIcon(getClass().getResource("/Slider/IFE 2.png"));
                       slider.setIcon(icono);
                       break;
                   case 2:
                       
                         contador=3;
                       icono=new ImageIcon(getClass().getResource("/Slider/IFE 3.png"));// ruta de la imagen
                       slider.setIcon(icono);
                       break;
                   
                   // imagenes que mostrara esto a traves de un switch
                  case 3:
                       
                         contador=4;
                       icono=new ImageIcon(getClass().getResource("/Slider/IFE 4.png"));// ruta de la imagen
                       slider.setIcon(icono);
                       break;
                       
                  case 4:
                       
                         contador=0;
                       icono=new ImageIcon(getClass().getResource("/Slider/IFE 5.png"));// ruta de la imagen
                       slider.setIcon(icono);
                       break;
                       
                  case 5:
                       
                         contador=0;
                       icono=new ImageIcon(getClass().getResource("/Slider/IFE 6.png"));// ruta de la imagen
                       slider.setIcon(icono);
                       break;
                       
                  case 6:
                       
                         contador=0;
                       icono=new ImageIcon(getClass().getResource("/Slider/IFE 7.png"));// ruta de la imagen
                       slider.setIcon(icono);
                       break;
               }
               
            }
        };
        
       java.util.Timer kimer = new java.util.Timer(); 
       
       kimer.scheduleAtFixedRate(tarea, velmil, velmil); // timer con la funcion que ejecutara y el tiempo que llevara
       
     }
}
