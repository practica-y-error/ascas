package proyectoprogramacion;

/*
A continuacion está la logica para la calculadora del Zodiaco.
El usuario coloca su fecha de nacimiento y se le retorna su signo zodiacal y su elemento.
Cambios a realizar: Generar imagenes o iconos de los elementos/signos.
 */


import javax.swing.JOptionPane;

public class calculadoraZodiaco {
    static void calendar(){
        /*
        Se establecen las variables para la fecha de nacimiento del usuario.
        Mes y dia en numeros
        */
        int diaNacimiento;
        int mesNacimiento;
        
        JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora Zodiacal");
        
        //El usuario ingresa el dato y se almacena en las variables
        mesNacimiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor introduzca el numero de su mes de nacimiento"));
        JOptionPane.showMessageDialog(null, "Procesando...");
        
        diaNacimiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor introduzca el dia de su nacimiento"));
        JOptionPane.showMessageDialog(null, "Procesando...");
        
        /*
        Se compara el numero de mes, al entrar en un caso del switch se compara la fecha con
        dos intervalos de dias, esto para los dos signos zodiacales que coinciden por mes.
        */
       switch(mesNacimiento){
           case 1:
               if(diaNacimiento >= 1 && diaNacimiento <= 19){
                   JOptionPane.showMessageDialog(null, "Su signo es Capricornio y su elemento es Tierra");
               } else if (diaNacimiento >= 20 && diaNacimiento <= 31){
                   JOptionPane.showMessageDialog(null, "Su signo es: Acuario y su elemento es Aire");
               }
               break;
           case 2:
               if (diaNacimiento >= 1 && diaNacimiento <= 19){
                   JOptionPane.showMessageDialog(null, "Su signo es Acuario y su elemento es Aire");
               } else if(diaNacimiento >= 20 && diaNacimiento <= 29){
                   JOptionPane.showMessageDialog(null, "Su signo es: Piscis y su elemento es Agua");
               }
               break;
           case 3:
               if (diaNacimiento >= 1 && diaNacimiento <= 20){
                   JOptionPane.showMessageDialog(null, "Su signo es Piscis y su elemento es Agua");
               } else if(diaNacimiento >= 21 && diaNacimiento <= 31){
                   JOptionPane.showMessageDialog(null, "Su signo es Aries y su elemento es Fuego");
               }
               break;
           case 4:
               if (diaNacimiento >= 1 && diaNacimiento <= 20){
                   JOptionPane.showMessageDialog(null, "Su signo es Aries y su elemento es Fuego");
               } else if(diaNacimiento >= 21 && diaNacimiento <= 30){
                   JOptionPane.showMessageDialog(null, "Su signo es Tauro y su elemento es Tierra");
               }
               break;
           case 5:
               if (diaNacimiento >= 1 && diaNacimiento <= 20){
                   JOptionPane.showMessageDialog(null, "Su signo es Tauro y su elemento es Tierra");
               } else if(diaNacimiento >= 21 && diaNacimiento <= 31){
                   JOptionPane.showMessageDialog(null, "Su signo es Géminis y su elemento es Aire");
               }
               break;
           case 6:
               if (diaNacimiento >= 1 && diaNacimiento <= 21){
                   JOptionPane.showMessageDialog(null, "Su signo es Géminis y su elemento es Aire");
               } else if(diaNacimiento >= 22 && diaNacimiento <= 30){
                   JOptionPane.showMessageDialog(null, "Su signo es Cáncer y su elemento es Agua");
               }
               break;
           case 7:
               if (diaNacimiento >= 1 && diaNacimiento <= 22){
                   JOptionPane.showMessageDialog(null, "Su signo es Cáncer y su elemento es Agua");
               } else if(diaNacimiento >= 23 && diaNacimiento <= 31){
                   JOptionPane.showMessageDialog(null, "Su signo es Leo y su elemento es Fuego");
               }
               break;
           case 8:
               if (diaNacimiento >= 1 && diaNacimiento <= 23){
                   JOptionPane.showMessageDialog(null, "Su signo es Leo y su elemento es Fuego");
               } else if(diaNacimiento >= 24 && diaNacimiento <= 31){
                   JOptionPane.showMessageDialog(null, "Su signo es Virgo y su elemento es Tierra");
               }
               break;
           case 9:
               if (diaNacimiento >= 1 && diaNacimiento <= 23){
                   JOptionPane.showMessageDialog(null, "Su signo es Virgo y su elemento es Tierra");
               } else if(diaNacimiento >= 24 && diaNacimiento <= 30){
                   JOptionPane.showMessageDialog(null, "Su signo es Libra y su elemento es Aire");
               }
               break;
           case 10:
               if (diaNacimiento >= 1 && diaNacimiento <= 22){
                   JOptionPane.showMessageDialog(null, "Su signo es Libra y su elemento es Aire");
               } else if(diaNacimiento >= 23 && diaNacimiento <= 31){
                   JOptionPane.showMessageDialog(null, "Su signo es Escorpio y su elemento es Agua");
               }
               break;
           case 11:
               if (diaNacimiento >= 1 && diaNacimiento <= 21){
                   JOptionPane.showMessageDialog(null, "Su signo es Escorpio y su elemento es Agua");
               } else if(diaNacimiento >= 22 && diaNacimiento <= 30){
                   JOptionPane.showMessageDialog(null, "Su signo es Sagitario y su elemento es Fuego");
               }
               break;
           case 12:
               if (diaNacimiento >= 1 && diaNacimiento <= 21){
                   JOptionPane.showMessageDialog(null, "Su signo es Sagitario y su elemento es Fuego");
               } else if(diaNacimiento >= 22 && diaNacimiento <= 31){
                   JOptionPane.showMessageDialog(null, "Su signo es Capricornio y su elemento es Tierra");
               }
               break;
       }
    }
}
