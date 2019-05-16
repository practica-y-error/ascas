package proyectoprogramacion;

/*
 Esta logica lleva a cabo el minijuego de Adivinar el numero.
El usuario puede establecer los limites y luego adivinar un numero generado aleatoriamente.
El usuario posteriormente ingresa numeros para intentar adivinar el numero.
Un puntaje lleva el conteo de intentos utilizados.
 */

import javax.swing.JOptionPane;
public class adivinaelNumero {
    
    //Se establece la funcion
    static void game(){
        
        /*
        Se esttablecen las variables por utilizar
        y se genera el numero aleatorio en un rango
        de 1 a 50
        */
         int adiv;   
         int puntaje = 0;
         int maxim;
         int minim;
         
         //Ventanas de bienvenida
         JOptionPane.showMessageDialog(null, "Bienvenido a Adivina el numero");     
         maxim = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el limite maximo de los posibles numeros"));
         minim = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el limite minimo de los posibles numeros"));
         JOptionPane.showMessageDialog(null, "Generando numero...");
         
         double numeroRandom = Math.random();
         numeroRandom = numeroRandom * maxim + minim;
         int randomInt = (int)(numeroRandom);
         //Mientras la opcion sea incorrecta, el juego seguira corriendo
         do{
             //Pide al usuario un numero que almacenará en adiv
             adiv = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
             //Compara adiv con el numero generado al azar y se señala si se acerca por detras o por delante
             if(adiv == randomInt){
                 JOptionPane.showMessageDialog(null, "Has adivinado el numero!");
                 JOptionPane.showMessageDialog(null, "Lo has logrado en: " + puntaje + " intentos");
             } else {
                 if(adiv > randomInt){
                     JOptionPane.showMessageDialog(null, "Te pasaste");
                     puntaje++;
                 } else {
                     JOptionPane.showMessageDialog(null, "Te falta");
                     puntaje++;
                 }              
             }
         } while(adiv != randomInt);
          
    }
}
