/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Shack'Alehm
 */
public class Temperatura {
    static void temperatura(){
        int opcion;
        double cel, far;
        do{
           opcion = JOptionPane.showOptionDialog(null, "seleccione la transformacion que desee:", "Aplicacion multifuncion Mark I", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Celsius a farenheit","Farenheit a Celsius", "Salir"}, "Calculadora");
           switch(opcion){
               case 0:
                   cel=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los grados Celsius que desee transformar"));
                   far=(cel*1.8)+32;
                   JOptionPane.showMessageDialog(null, "los grados celcius: "+cel+" son en Farenheit igual a: "+far);
                   break;
                   case 1:
                   far=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los grados Farenheit que desee transformar"));
                   cel=(far-32)/1.8;
                   JOptionPane.showMessageDialog(null, "los grados Farenheit: "+far+" son en Celcius igual a: "+cel);
                   break;
                   default:
                       break;
           }
        }while(opcion!=2);
    
}    
}
