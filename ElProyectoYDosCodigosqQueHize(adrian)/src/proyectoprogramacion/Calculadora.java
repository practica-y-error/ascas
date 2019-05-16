/*
 La siguiente clase contiene la logica para la calculadora
Cada funcion aqui lleva a cabo una funcion de la propia calculadora
Por el momento solo lleva a cabo funciones de una calculadora sencilla
 */
package proyectoprogramacion;

/**
 *
 * @author Iraham G
 */
public class Calculadora {
    
    //Esta funcion hace una suma con los numeros dados.
    public static int calcSuma(int n1, int n2){
    int calcSuma;
    calcSuma = n1 + n2;
    
    return calcSuma;
    } 
    
    //Esta funcion realiza una resta con los numeros dados
    public static int calcResta(int n1, int n2){
        int calcResta;
        calcResta = n1 - n2;
        
        return calcResta;
    }
    
    //Esta funcion realiza una multiplicacion con los numeros dados
    public static int calcMulti(int n1, int n2){
        int calcMulti;
        calcMulti = n1 * n2;
        
        return calcMulti;
    }
    
    //Esta funcion realiza una division con los numeros dados
    public static float calcDivi(float n1, float n2){
        float calcDivi;
        calcDivi = n1 / n2;
        
        return calcDivi;
    }
}
