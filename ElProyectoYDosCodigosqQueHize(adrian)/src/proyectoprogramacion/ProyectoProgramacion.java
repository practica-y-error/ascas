/*
Este es la clase principal de la aplicacion multifuncion Mark I
A partir de aqui se controla que se elije y se redirecciona a la clase correspondiente.
Cualquier duda consultar el README o el Maual del usuario
 */
package proyectoprogramacion;

import javax.swing.JOptionPane;
public class ProyectoProgramacion {

    
    public static void main(String[] args) {
        //Se declaran las variables que se utilizarán a lo largo del programa
        int opcion, optCalc, optJueg, num1, num2, optZodi, optInv;
            //Muestra el mensaje de bienvenida
            JOptionPane.showMessageDialog(null, "Bienvenido a la aplicacion multifuncion Mark I");
            
            //Aqui comienza la CONDICION para el menu principal
            do{ 
            //Ventana que muestra las opciones - El swuitch mantiene un control sobre lo que elija el usuario
            opcion = JOptionPane.showOptionDialog(null, "Seleccione lo que quiere hacer:", "Aplicacion multifuncion Mark I", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Calculadora", "Minijuego", "Zodiaco", "Inversor", "Adivina el animal","Transformar temperatura", "Salir"}, "Calculadora");
            switch(opcion){
                
                //En caso de elejir la primer opcion, se piden dos numeros y se pasa el programa a la clase de Calculadora
                case 0:             
                    num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor:"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo valor:"));
                 
                    //Se da un resultado diferente para cada tipo de operacion, se coloca otro do/while para el control
                    do{
                    optCalc = JOptionPane.showOptionDialog(null, "Seleccione la operacion que desea hacer:", "Calculadora", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Suma", "Resta", "Multiplicacion", "Division", "Regresar"}, "Suma");                   
                    switch (optCalc){
                        //En cada caso, los numeros anteriores se llaman como argumentos de las funciones de la clase Calculadora
                        case 0:
                            JOptionPane.showMessageDialog(null, "El resultado es: " + Calculadora.calcSuma(num1, num2));
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "El resultado es: " + Calculadora.calcResta(num1, num2));
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "El resultado es: " + Calculadora.calcMulti(num1, num2));
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "El resultado es: " + Calculadora.calcDivi(num1, num2));
                            break;
                        default:
                            break;
                        }                   
                    } while (optCalc != 4);
                    break;
                
                //Para el segundo caso, se pasa el programa a la clase de adivinaelNumero
                case 1:              
                    do{   
                        optJueg = JOptionPane.showOptionDialog(null, "¿Desea jugar: Adivina el numero?", "Adivina el numero", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Sí", "No, regresar"}, "Sí");
                        switch(optJueg){
                            case 0:
                            adivinaelNumero.game();
                            break;
                            default:
                                break;
                        }        
                    } while (optJueg != 1);
                    break;
                //Para el tercer caso, se pasa el programa a la clase de calculadoraZodiaco
                case 2:
                    do{
                      optZodi = JOptionPane.showOptionDialog(null, "¿Desea probar la calculadroa del Zodiaco?", "Calculadora del zodiaco", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No, regresar"}, "Si"); 
                      switch(optZodi){
                          case 0:
                              calculadoraZodiaco.calendar();
                              break;
                          default:
                              break;
                      }
                    } while (optZodi != 1);
                    break;
                //Para el cuarto caso, se pasa el programa a la clase de inversor de palabras
                case 3:
                    do{
                      optInv = JOptionPane.showOptionDialog(null, "¿Desea entrar al inversor de palabras?", "Inversor de palabras", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No, regresar"}, "Si"); 
                      switch(optInv){
                          case 0:
                              invertirPalabra.inversor();
                              break;
                          default:
                              break;
                      }
                    } while (optInv != 1);
                    break;
                     case 4:
                    do{
                      optInv = JOptionPane.showOptionDialog(null, "¿Desea jugar adivinar el animal?", "Adivina El Animal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No, regresar"}, "Si"); 
                      switch(optInv){
                          case 0:
                              AdivinaElAnimal.animal();
                              break;
                          default:
                              break;
                      }
                    } while (optInv != 1);
                    break;
                         case 5:
                    do{
                      optInv = JOptionPane.showOptionDialog(null, "Transformar temperatura", "Temperatura", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No, regresar"}, "Si"); 
                      switch(optInv){
                          case 0:
                              Temperatura.temperatura();
                              break;
                          default:
                              break;
                      }
                    } while (optInv != 1);
                    break;
                default:
                    break;
                }              
            }
                while (opcion != 6);
    }}
    
