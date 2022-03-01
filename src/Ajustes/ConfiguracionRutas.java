
package Ajustes;

import javax.swing.JTextField;

public class ConfiguracionRutas {
    public String [] getHoras(String estaciones, String destino, String horas){
       String[] horasTramos = new String[2];
       //BARQUISIMETO 
       
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("5:00")){
           horasTramos[0] = "5:06";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("5:30")){
           horasTramos[1] = "5:36";
       }
       /*if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("6:30")){
           horasTramos[2] = "6:36";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("7:00")){
           horasTramos[3] = "7:06";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("7:30")){
           horasTramos[4] = "7:36";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("8:00")){
           horasTramos[5] = "8:06";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("8:30")){
           horasTramos[6] = "8:36";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("9:00")){
           horasTramos[7] = "9:06";
       }
       
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("5:00")){
           horasTramos[8] = "5:36";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("5:30")){
           horasTramos[9] = "6:06";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("6:30")){
           horasTramos[10] = "7:06";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("7:00")){
           horasTramos[11] = "7:36";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("7:30")){
           horasTramos[12] = "8:06";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("8:00")){
           horasTramos[13] = "8:36";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("8:30")){
           horasTramos[14] = "9:06";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("9:00")){
           horasTramos[15] = "9:36";
       }

       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("5:00")){
           horasTramos[16] = "5:49";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("5:30")){
           horasTramos[17] = "6:19";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("6:30")){
           horasTramos[18] = "7:19";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("7:00")){
           horasTramos[19] = "7:49";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("7:30")){
           horasTramos[20] = "8:19";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("8:00")){
           horasTramos[21] = "8:49";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("8:30")){
           horasTramos[22] = "9:19";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("9:00")){
           horasTramos[23] = "9:49";
       }
       
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("5:00")){
           horasTramos[24] = "5:49";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("5:30")){
           horasTramos[25] = "6:19";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("6:30")){
           horasTramos[26] = "7:19";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("7:00")){
           horasTramos[27] = "7:49";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("7:30")){
           horasTramos[28] = "8:19";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("8:00")){
           horasTramos[29] = "8:49";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("8:30")){
           horasTramos[30] = "9:19";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("9:00")){
           horasTramos[31] = "9:49";
       }
       
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("5:00")){
           horasTramos[32] = "6:06";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("5:30")){
           horasTramos[33] = "6:36";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("6:30")){
           horasTramos[34] = "7:36";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("7:00")){
           horasTramos[35] = "8:06";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("7:30")){
           horasTramos[36] = "8:36";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("8:00")){
           horasTramos[37] = "8:06";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("8:30")){
           horasTramos[38] = "9:36";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("9:00")){
           horasTramos[39] = "10:06";
       }
       
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("5:00")){
           horasTramos[40] = "6:25";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("5:30")){
           horasTramos[41] = "7:05";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("6:30")){
           horasTramos[42] = "8:05";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("7:00")){
           horasTramos[43] = "8:25";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("7:30")){
           horasTramos[44] = "9:05";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("8:00")){
           horasTramos[45] = "9:25";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("8:30")){
           horasTramos[46] = "10:05";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("9:00")){
           horasTramos[47] = "10:25";
       }
       
       
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("5:00")){
           horasTramos[48] = "6:25";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("5:30")){
           horasTramos[49] = "7:05";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("6:30")){
           horasTramos[50] = "8:05";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("7:00")){
           horasTramos[51] = "8:25";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("7:30")){
           horasTramos[52] = "9:05";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("8:00")){
           horasTramos[53] = "9:25";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("8:30")){
           horasTramos[54] = "10:05";
       }
       if(estaciones.equalsIgnoreCase("BARQUISIMETO") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("9:00")){
           horasTramos[55] = "10:25";
       }
       
        // SAN JACINTO - BARQUSIMETO
     
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("BARQUSIMETO") && horas.equalsIgnoreCase("5:00")){
           horasTramos[56] = "5:06";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("BARQUISIMETO") && horas.equalsIgnoreCase("5:30")){
           horasTramos[57] = "5:36";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("BARQUSIMETO") && horas.equalsIgnoreCase("6:30")){
           horasTramos[58] = "6:36";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("BARQUISIMETO") && horas.equalsIgnoreCase("7:00")){
           horasTramos[59] = "7:06";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("BARQUISIMETO") && horas.equalsIgnoreCase("7:30")){
           horasTramos[60] = "7:36";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("BARQUISIMETO") && horas.equalsIgnoreCase("8:00")){
           horasTramos[61] = "8:06";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("BARQUISIMETO") && horas.equalsIgnoreCase("8:30")){
           horasTramos[62] = "8:36";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("BARQUISIMETO") && horas.equalsIgnoreCase("9:00")){
           horasTramos[63] = "9:06";
       }
       
       // SAN JACINTO - YARITAGUA
     
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("5:00")){
           horasTramos[64] = "5:30";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("5:30")){
            horasTramos[65] = "6:00";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("6:30")){
           horasTramos[66] = "7:00";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("7:00")){
           horasTramos[67] = "7:30";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("7:30")){
           horasTramos[68] = "8:00";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("8:00")){
           horasTramos[69] = "8:30";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("8:30")){
           horasTramos[70] = "9:00";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("9:00")){
           horasTramos[71] = "9:30";
       }
       
       // SAN JACINTO - AP.SP
           
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("5:00")){
           horasTramos[72] = "5:43";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("5:30")){
            horasTramos[73] = "6:13";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("6:30")){
           horasTramos[74] = "7:13";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("7:00")){
           horasTramos[75] = "7:43";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("7:30")){
           horasTramos[76] = "8:13";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("8:00")){
           horasTramos[77] = "8:43";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("8:30")){
           horasTramos[78] = "9:13";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("9:00")){
           horasTramos[79] = "9:43";  
       } 
       
       // SAN JACINTO - CHIVACOA
           
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("5:00")){
           horasTramos[80] = "6:00";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("5:30")){
            horasTramos[81] = "6:30";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("6:30")){
           horasTramos[82] = "7:30";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("7:00")){
           horasTramos[83] = "8:00";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("7:30")){
           horasTramos[84] = "8:30";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("8:00")){
           horasTramos[85] = "9:00";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("8:30")){
           horasTramos[86] = "9:30";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("9:00")){
           horasTramos[87] = "10:00"; 
       }
       
       // SAN JACINTO - SAN FELIPE
           
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("5:00")){
           horasTramos[88] = "6:29";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("5:30")){
            horasTramos[89] = "6:59";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("6:30")){
           horasTramos[90] = "7:59";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("7:00")){
           horasTramos[91] = "8:29";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("7:30")){
           horasTramos[92] = "8:59";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("8:00")){
           horasTramos[93] = "9:29";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("8:30")){
           horasTramos[94] = "9:59";
       }
       if(estaciones.equalsIgnoreCase("AP.SJ") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("9:00")){
           horasTramos[95] = "10:29"; 
       }
       
       // SAN JACINTO - YARITAGUA
   
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("5:00")){
           horasTramos[96] = "5:30";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("5:30")){
            horasTramos[97] = "6:00";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("6:30")){
           horasTramos[98] = "7:00";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("7:00")){
           horasTramos[99] = "7:30";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("7:30")){
           horasTramos[100] = "8:00";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("8:00")){
           horasTramos[101] = "8:30";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("8:30")){
           horasTramos[102] = "9:00";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("9:00")){
           horasTramos[103] = "9:30";
       }
        
       // SAN JACINTO - AP.SP
           
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("5:00")){
           horasTramos[104] = "5:43";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("5:30")){
            horasTramos[105] = "6:13";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("6:30")){
           horasTramos[106] = "7:13";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("7:00")){
           horasTramos[107] = "7:43";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("7:30")){
           horasTramos[108] = "8:13";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("8:00")){
           horasTramos[109] = "8:43";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("8:30")){
           horasTramos[110] = "9:13";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("9:00")){
           horasTramos[111] = "9:43";  
       }
           
       // SAN JACINTO - CHIVACOA
           
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("5:00")){
           horasTramos[112] = "6:00";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("5:30")){
            horasTramos[113] = "6:30";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("6:30")){
           horasTramos[114] = "7:30";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("7:00")){
           horasTramos[115] = "8:00";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("7:30")){
           horasTramos[116] = "8:30";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("8:00")){
           horasTramos[117] = "9:00";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("8:30")){
           horasTramos[118] = "9:30";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("9:00")){
           horasTramos[119] = "10:00"; 
       }
       
           
        // SAN JACINTO - SAN FELIPE
           
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("5:00")){
           horasTramos[120] = "6:29";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("5:30")){
            horasTramos[121] = "6:59";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("6:30")){
           horasTramos[122] = "7:59";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("7:00")){
           horasTramos[123] = "8:29";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("7:30")){
           horasTramos[124] = "8:59";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("8:00")){
           horasTramos[125] = "9:29";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("8:30")){
           horasTramos[126] = "9:59";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SJ") && horas.equalsIgnoreCase("9:00")){
           horasTramos[127] = "10:29";
       }
           
      
      // YARITAGUA - AP.SP
      
        if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("5:00")){
           horasTramos[128] = "5:13";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("5:30")){
            horasTramos[129] = "5:43";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("6:30")){
           horasTramos[130] = "6:43";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("7:00")){
           horasTramos[131] = "7:13";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("7:30")){
           horasTramos[132] = "7:43";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("8:00")){
           horasTramos[133] = "8:13";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("8:30")){
           horasTramos[134] = "8:43";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("9:00")){
           horasTramos[135] = "9:13";
       }
           
      //YARITAGUA - CHIVACOA
      
        if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("5:00")){
           horasTramos[136] = "5:30";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("5:30")){
            horasTramos[137] = "6:00";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("6:30")){
           horasTramos[138] = "7:00";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("7:00")){
           horasTramos[139] = "7:30";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("7:30")){
           horasTramos[140] = "8:00";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("8:00")){
           horasTramos[141] = "8:30";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("8:30")){
           horasTramos[142] = "9:00";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("9:00")){
           horasTramos[143] = "9:30";
       }
      
       // YARITAGUA - SAN FELIPE
       
        if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("5:00")){
           horasTramos[144] = "5:59";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("5:30")){
            horasTramos[145] = "6:29";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("6:30")){
           horasTramos[146] = "7:29";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("7:00")){
           horasTramos[147] = "7:59";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("7:30")){
           horasTramos[148] = "8:29";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("8:00")){
           horasTramos[149] = "8:59";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("8:30")){
           horasTramos[150] = "9:29";
       }
       if(estaciones.equalsIgnoreCase("YARITAGUA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("9:00")){
           horasTramos[151] = "9:59";
       }
           
        //AP.SP -CHIVACOA
        if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("5:00")){
            horasTramos[152] = "5:17";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("5:30")){
            horasTramos[152] = "5:47";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("6:30")){
           horasTramos[153] = "6:47";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("7:00")){
           horasTramos[154] = "7:17";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("7:30")){
           horasTramos[155] = "7:47";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("8:00")){
           horasTramos[156] = "8:17";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("8:30")){
           horasTramos[157] = "8:47";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("9:00")){
           horasTramos[158] = "9:17";
       }
           
     // AP.SP - SAN FELIPE      
        if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("5:00")){
            horasTramos[159] = "5:46";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("5:30")){
            horasTramos[160] = "6:16";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("6:30")){
           horasTramos[161] = "7:16";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("7:00")){
           horasTramos[162] = "7:46";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("7:30")){
           horasTramos[163] = "8:16";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("8:00")){
           horasTramos[164] = "8:46";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("8:30")){
           horasTramos[165] = "9:16";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("9:00")){
           horasTramos[166] = "9:46";
       }
       
     //CHIVACOA - SAN FELIPE
           if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("5:00")){
            horasTramos[167] = "5:29";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("5:30")){
            horasTramos[168] = "5:59";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("6:30")){
           horasTramos[169] = "6:59";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("7:00")){
           horasTramos[170] = "7:29";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("7:30")){
           horasTramos[171] = "7:59";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("8:00")){
           horasTramos[172] = "8:29";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("8:30")){
           horasTramos[173] = "8:59";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("SAN FELIPE") && horas.equalsIgnoreCase("9:00")){
           horasTramos[174] = "9:29";  
       }
        
     // AL CONTRARIO
        
      // - AP.SP - YARITAGUA
      
        if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("5:00")){
           horasTramos[175] = "5:13";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("5:30")){
            horasTramos[176] = "5:43";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("6:30")){
           horasTramos[177] = "6:43";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("7:00")){
           horasTramos[178] = "7:13";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("7:30")){
           horasTramos[179] = "7:43";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("8:00")){
           horasTramos[180] = "8:13";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("8:30")){
           horasTramos[181] = "8:43";
       }
       if(estaciones.equalsIgnoreCase("AP.SP") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("9:00")){
           horasTramos[182] = "9:13";
       }
           
      // CHIVACOA - YARITAGUA
      
        if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("5:00")){
           horasTramos[183] = "5:30";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("5:30")){
            horasTramos[184] = "6:00";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("6:30")){
           horasTramos[185] = "7:00";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("7:00")){
           horasTramos[186] = "7:30";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("7:30")){
           horasTramos[187] = "8:00";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("8:00")){
           horasTramos[188] = "8:30";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("8:30")){
           horasTramos[189] = "9:00";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("9:00")){
           horasTramos[190] = "9:30";
       }
      
       //  SAN FELIPE -YARITAGUA 
       
        if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("5:00")){
           horasTramos[191] = "5:59";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("5:30")){
            horasTramos[192] = "6:29";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("6:30")){
           horasTramos[193] = "7:29";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("7:00")){
           horasTramos[194] = "7:59";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("7:30")){
           horasTramos[195] = "8:29";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("8:00")){
           horasTramos[196] = "8:59";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("8:30")){
           horasTramos[197] = "9:29";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("YARITAGUA") && horas.equalsIgnoreCase("9:00")){
           horasTramos[198] = "9:59";
       }
           
        //CHIVACOA- AP.SP 
        if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("5:00")){
            horasTramos[199] = "5:17";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("5:30")){
            horasTramos[200] = "5:47";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("6:30")){
           horasTramos[201] = "6:47";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("7:00")){
           horasTramos[202] = "7:17";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("7:30")){
           horasTramos[203] = "7:47";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("8:00")){
           horasTramos[204] = "8:17";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("8:30")){
           horasTramos[205] = "8:47";
       }
       if(estaciones.equalsIgnoreCase("CHIVACOA") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("9:00")){
           horasTramos[206] = "9:17";
       }
           
     //  SAN FELIPE - AP.SP       
        if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("5:00")){
            horasTramos[207] = "5:46";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("5:30")){
            horasTramos[208] = "6:16";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("6:30")){
           horasTramos[209] = "7:16";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("7:00")){
           horasTramos[210] = "7:46";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("7:30")){
           horasTramos[211] = "8:16";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("8:00")){
           horasTramos[212] = "8:46";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("8:30")){
           horasTramos[213] = "9:16";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("AP.SP") && horas.equalsIgnoreCase("9:00")){
           horasTramos[214] = "9:46";
       }
       
     //CHIVACOA - SAN FELIPE
           if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("5:00")){
            horasTramos[215] = "5:29";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("5:30")){
            horasTramos[216] = "5:59";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("6:30")){
           horasTramos[217] = "6:59";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("7:00")){
           horasTramos[218] = "7:29";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("7:30")){
           horasTramos[219] = "7:59";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("8:00")){
           horasTramos[220] = "8:29";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("8:30")){
           horasTramos[221] = "8:59";
       }
       if(estaciones.equalsIgnoreCase("SAN FELIPE") && destino.equalsIgnoreCase("CHIVACOA") && horas.equalsIgnoreCase("9:00")){
           horasTramos[222] = "9:29"; 
       }*/
       return horasTramos;
    }
    public String [] getCiudades(String estaciones){
        String[] ciudades = new String[13];
        
        if(estaciones.equalsIgnoreCase("BARQUISIMETO"))
        {
           ciudades[0] = "AP.SJ";
           ciudades[1] = "YARITAGUA";
           ciudades[2] = "AP.SP";
           ciudades[3] = "CHIVACOA";
           ciudades[4] = "AP.TAR";
           ciudades[5] = "AP.BO";
           ciudades[6] = "SAN FELIPE";
           ciudades[7] = "AP.TA";
           ciudades[8] = "URAMA";
           ciudades[9] = "AP.AL";
           ciudades[10] = "MORON";
           ciudades[11] = "AP.EP";
           ciudades[12] = "PUERTO CABELLO";
                    
        }
        if(estaciones.equalsIgnoreCase("AP.SJ"))
        {
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "YARITAGUA";
           ciudades[2] = "AP.SP";
           ciudades[3] = "CHIVACOA";
           ciudades[4] = "AP.TAR";
           ciudades[5] = "AP.BO";
           ciudades[6] = "SAN FELIPE";
           ciudades[7] = "AP.TA";
           ciudades[8] = "URAMA";
           ciudades[9] = "AP.AL";
           ciudades[10] = "MORON";
           ciudades[11] = "AP.EP";
           ciudades[12] = "PUERTO CABELLO";
        }
        if(estaciones.equalsIgnoreCase("YARITAGUA")){
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "AP.SJ";
           ciudades[2] = "AP.SP";
           ciudades[3] = "CHIVACOA";
           ciudades[4] = "AP.TAR";
           ciudades[5] = "AP.BO";
           ciudades[6] = "SAN FELIPE";
           ciudades[7] = "AP.TA";
           ciudades[8] = "URAMA";
           ciudades[9] = "AP.AL";
           ciudades[10] = "MORON";
           ciudades[11] = "AP.EP";
           ciudades[12] = "PUERTO CABELLO";
        }
        if(estaciones.equalsIgnoreCase("AP.SP")){
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "AP.SJ";
           ciudades[2] = "YARITAGUA";
           ciudades[3] = "CHIVACOA";
           ciudades[4] = "AP.TAR";
           ciudades[5] = "AP.BO";
           ciudades[6] = "SAN FELIPE";
           ciudades[7] = "AP.TA";
           ciudades[8] = "URAMA";
           ciudades[9] = "AP.AL";
           ciudades[10] = "MORON";
           ciudades[11] = "AP.EP";
           ciudades[12] = "PUERTO CABELLO";
        }
        if(estaciones.equalsIgnoreCase("CHIVACOA")){
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "AP.SJ";
           ciudades[2] = "YARITAGUA";
           ciudades[3] = "AP.SP";
           ciudades[4] = "AP.TAR";
           ciudades[5] = "AP.BO";
           ciudades[6] = "SAN FELIPE";
           ciudades[7] = "AP.TA";
           ciudades[8] = "URAMA";
           ciudades[9] = "AP.AL";
           ciudades[10] = "MORON";
           ciudades[11] = "AP.EP";
           ciudades[12] = "PUERTO CABELLO";
        }
        if(estaciones.equalsIgnoreCase("AP.TAR")){
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "AP.SJ";
           ciudades[2] = "YARITAGUA";
           ciudades[3] = "AP.SP";
           ciudades[4] = "CHIVACOA";
           ciudades[5] = "AP.BO";
           ciudades[6] = "SAN FELIPE";
           ciudades[7] = "AP.TA";
           ciudades[8] = "URAMA";
           ciudades[9] = "AP.AL";
           ciudades[10] = "MORON";
           ciudades[11] = "AP.EP";
           ciudades[12] = "PUERTO CABELLO";
        }
        if(estaciones.equalsIgnoreCase("AP.BO")){
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "AP.SJ";
           ciudades[2] = "YARITAGUA";
           ciudades[3] = "AP.SP";
           ciudades[4] = "CHIVACOA";
           ciudades[5] = "AP.TAR";
           ciudades[6] = "SAN FELIPE";
           ciudades[7] = "AP.TA";
           ciudades[8] = "URAMA";
           ciudades[9] = "AP.AL";
           ciudades[10] = "MORON";
           ciudades[11] = "AP.EP";
           ciudades[12] = "PUERTO CABELLO";
        }
        if(estaciones.equalsIgnoreCase("SAN FELIPE")){
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "AP.SJ";
           ciudades[2] = "YARITAGUA";
           ciudades[3] = "AP.SP";
           ciudades[4] = "CHIVACOA";
           ciudades[5] = "AP.TAR";
           ciudades[6] = "AP.BO";
           ciudades[7] = "AP.TA";
           ciudades[8] = "URAMA";
           ciudades[9] = "AP.AL";
           ciudades[10] = "MORON";
           ciudades[11] = "AP.EP";
           ciudades[12] = "PUERTO CABELLO";
        }
        if(estaciones.equalsIgnoreCase("AP.TA")){
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "AP.SJ";
           ciudades[2] = "YARITAGUA";
           ciudades[3] = "AP.SP";
           ciudades[4] = "CHIVACOA";
           ciudades[5] = "AP.TAR";
           ciudades[6] = "AP.BO";
           ciudades[7] = "SAN FELIPE";
           ciudades[8] = "URAMA";
           ciudades[9] = "AP.AL";
           ciudades[10] = "MORON";
           ciudades[11] = "AP.EP";
           ciudades[12] = "PUERTO CABELLO";
        }
        if(estaciones.equalsIgnoreCase("URAMA")){
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "AP.SJ";
           ciudades[2] = "YARITAGUA";
           ciudades[3] = "AP.SP";
           ciudades[4] = "CHIVACOA";
           ciudades[5] = "AP.TAR";
           ciudades[6] = "AP.BO";
           ciudades[7] = "SAN FELIPE";
           ciudades[8] = "AP.TA";
           ciudades[9] = "AP.AL";
           ciudades[10] = "MORON";
           ciudades[11] = "AP.EP";
           ciudades[12] = "PUERTO CABELLO";
        }
        if(estaciones.equalsIgnoreCase("AP.AL")){
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "AP.SJ";
           ciudades[2] = "YARITAGUA";
           ciudades[3] = "AP.SP";
           ciudades[4] = "CHIVACOA";
           ciudades[5] = "AP.TAR";
           ciudades[6] = "AP.BO";
           ciudades[7] = "SAN FELIPE";
           ciudades[8] = "AP.TA";
           ciudades[9] = "URAMA";
           ciudades[10] = "MORON";
           ciudades[11] = "AP.EP";
           ciudades[12] = "PUERTO CABELLO";
        }
        if(estaciones.equalsIgnoreCase("MORON")){
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "AP.SJ";
           ciudades[2] = "YARITAGUA";
           ciudades[3] = "AP.SP";
           ciudades[4] = "CHIVACOA";
           ciudades[5] = "AP.TAR";
           ciudades[6] = "AP.BO";
           ciudades[7] = "SAN FELIPE";
           ciudades[8] = "AP.TA";
           ciudades[9] = "URAMA";
           ciudades[10] = "AP.AL";
           ciudades[11] = "AP.EP";
           ciudades[12] = "PUERTO CABELLO";
        }
        if(estaciones.equalsIgnoreCase("AP.EP")){
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "AP.SJ";
           ciudades[2] = "YARITAGUA";
           ciudades[3] = "AP.SP";
           ciudades[4] = "CHIVACOA";
           ciudades[5] = "AP.TAR";
           ciudades[6] = "AP.BO";
           ciudades[7] = "SAN FELIPE";
           ciudades[8] = "AP.TA";
           ciudades[9] = "URAMA";
           ciudades[10] = "AP.AL";
           ciudades[11] = "MORON";
           ciudades[12] = "PUERTO CABELLO";
        }
        if(estaciones.equalsIgnoreCase("PUERTO CABELLO")){
           ciudades[0] = "BARQUISIMETO";
           ciudades[1] = "AP.SJ";
           ciudades[2] = "YARITAGUA";
           ciudades[3] = "AP.SP";
           ciudades[4] = "CHIVACOA";
           ciudades[5] = "AP.TAR";
           ciudades[6] = "AP.BO";
           ciudades[7] = "SAN FELIPE";
           ciudades[8] = "AP.TA";
           ciudades[9] = "URAMA";
           ciudades[10] = "AP.AL";
           ciudades[11] = "MORON";
           ciudades[12] = "AP.EP";
        }
        return ciudades;
    }
    
    public String [] getDestino(String destino )
    {
        String[] ciudades = new String[3]; 
        
        if(destino.equalsIgnoreCase("CHIVACOA"))
        {
           ciudades[0] = "AP.SJ";
           ciudades[1] = "YARITAGUA";
           ciudades[2] = "AP.SP";           
        }
        return ciudades;
    }
    
    
}
