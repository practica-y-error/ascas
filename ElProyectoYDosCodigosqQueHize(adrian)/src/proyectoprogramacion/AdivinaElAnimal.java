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
public class AdivinaElAnimal {
    static void animal(){
        String palabra;
        int mayor, cambio;
        int errores=0, ganar=0;
        int i=0,j=0;
        int []aleatorio=new int [1];
        int[]arreglo = new int[1];
        arreglo[i]=(int)(Math.random()*2);
        aleatorio[j]=(int)(Math.random()*3);
        mayor=arreglo[i];
        cambio=aleatorio[j];
        do{
            switch(mayor){
                case 0:
            String animal = "perro";
            switch(cambio){
                case 0:
                palabra= JOptionPane.showInputDialog(null, "el ainmal ladra");
                    if(animal.equals(palabra)){
                    JOptionPane.showMessageDialog(null,"le has atinado");
                    ganar= ganar+1;
             }
                else{
                    errores = errores+1;
                    JOptionPane.showMessageDialog(null,"Prueva otra vez, numero de intentos"+errores+"de 5");
                    aleatorio[j]=(int)(Math.random()*2);
                    cambio=aleatorio[j];
                }
                break;
                case 1:
                     palabra= JOptionPane.showInputDialog(null, "tiene 4 patas");
                      if(animal.equals(palabra)){
                    JOptionPane.showMessageDialog(null,"le has atinado");
                    ganar= ganar+1;
             }
                else{
                    errores = errores+1;
                    JOptionPane.showMessageDialog(null,"Prueva otra vez, numero de intentos"+errores+"de 5");
                    aleatorio[j]=(int)(Math.random()*2);
                    cambio=aleatorio[j];
                }
                break;
                    case 2:
                     palabra= JOptionPane.showInputDialog(null, "es el mejor amigo del hombre");
                      if(animal.equals(palabra)){
                    JOptionPane.showMessageDialog(null,"le has atinado");
                    ganar= ganar+1;
             }
                else{
                    errores = errores+1;
                    JOptionPane.showMessageDialog(null,"Prueva otra vez, numero de intentos"+errores+"de 5");
                    aleatorio[j]=(int)(Math.random()*2);
                    cambio=aleatorio[j];
                }
                break;          
            }
                case 1:
            String mascota = "gato";
            switch(cambio){
                case 0:
                palabra= JOptionPane.showInputDialog(null, "el ainmal maulla");
                    if(mascota.equals(palabra)){
                    JOptionPane.showMessageDialog(null,"le has atinado");
                    ganar= ganar+1;
             }
                else{
                    errores = errores+1;
                    JOptionPane.showMessageDialog(null,"Prueva otra vez, numero de intentos"+errores+"de 5");
                    aleatorio[j]=(int)(Math.random()*2);
                    cambio=aleatorio[j];
                }
                break;
                case 1:
                     palabra= JOptionPane.showInputDialog(null, "tiene 4 patas");
                      if(mascota.equals(palabra)){
                    JOptionPane.showMessageDialog(null,"le has atinado");
                    ganar= ganar+1;
             }
                else{
                    errores = errores+1;
                    JOptionPane.showMessageDialog(null,"Prueva otra vez, numero de intentos"+errores+"de 5");
                    aleatorio[j]=(int)(Math.random()*2);
                    cambio=aleatorio[j];
                }
                break;
                    case 2:
                     palabra= JOptionPane.showInputDialog(null, "le gusta dormir en laptops");
                      if(mascota.equals(palabra)){
                    JOptionPane.showMessageDialog(null,"le has atinado");
                    ganar= ganar+1;
             }
                else{
                    errores = errores+1;
                    JOptionPane.showMessageDialog(null,"Prueva otra vez, numero de intentos"+errores+"de 5");
                    aleatorio[j]=(int)(Math.random()*2);
                    cambio=aleatorio[j];
                }
                break;          
            }
            
           break;
                default:
                    break;
            }
    }while(ganar==0&&errores!=5);
        if(ganar==1){
           JOptionPane.showMessageDialog(null,"has ganado"); 
        }
        if(errores==5){
            JOptionPane.showMessageDialog(null,"has fallado");
        }
    }
}
    

