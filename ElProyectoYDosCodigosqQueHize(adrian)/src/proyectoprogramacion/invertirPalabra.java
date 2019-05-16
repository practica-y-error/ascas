/*
A continuacion esta la logica para invertir una palabra.
El usuario ingresa una palabra y se retorna la misma pero con los caracteres invertidos de posicion.
 */
package proyectoprogramacion;

import javax.swing.JOptionPane;

public class invertirPalabra {
    static void inversor(){
        
        String palabrainvertida = "";
        String palabra= JOptionPane.showInputDialog(null, "Ingrese una palabra");
        JOptionPane.showMessageDialog(null, "Procesando...");      
            for (int i=palabra.length()-1;i>=0;i--){
            palabrainvertida +=palabra.charAt(i);
          }
        JOptionPane.showMessageDialog(null, "Su palabra invertida es: " + palabrainvertida);

    }
}
